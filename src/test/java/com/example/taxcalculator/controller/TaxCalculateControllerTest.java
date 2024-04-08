package com.example.taxcalculator.controller;

import com.example.taxcalculator.model.TaxCalculateResponse;
import com.example.taxcalculator.model.WebResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.MockMvcBuilder.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@SpringBootTest
@AutoConfigureMockMvc
class TaxCalculateControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testAnnualIncomeNull() throws Exception{
        mockMvc.perform(
                get("/api/tax")
                        .accept(MediaType.APPLICATION_JSON_VALUE)
        ).andExpectAll(
                status().isBadRequest()
        ).andDo(result -> {
            WebResponse<TaxCalculateResponse> response = objectMapper.readValue(result.getResponse().getContentAsString(), new TypeReference<>() {
            });

            assertNotNull(response.getErrors());
        });
    }

    @Test
    void testAnnualIncomeNotValid() throws Exception{
        mockMvc.perform(
                get("/api/tax?annualIncome=stringss")
                        .accept(MediaType.APPLICATION_JSON_VALUE)
        ).andExpectAll(
                status().isBadRequest()
        ).andDo(result -> {
            WebResponse<TaxCalculateResponse> response = objectMapper.readValue(result.getResponse().getContentAsString(), new TypeReference<>() {
            });

            assertNotNull(response.getErrors());
        });
    }

    @Test
    void tesCategoryA() throws Exception{
        mockMvc.perform(
                get("/api/tax?annualIncome=1000")
                        .accept(MediaType.APPLICATION_JSON_VALUE)
        ).andExpectAll(
                status().isOk()
        ).andDo(result -> {
            WebResponse<TaxCalculateResponse> response = objectMapper.readValue(result.getResponse().getContentAsString(), new TypeReference<>() {
            });

            assertEquals(0.0, response.getData().getTaxAmount());
            assertEquals('A', response.getData().getTaxSlab().getCategory());
        });
    }

    @Test
    void tesCategoryE() throws Exception{
        mockMvc.perform(
                get("/api/tax?annualIncome=60000")
                        .accept(MediaType.APPLICATION_JSON_VALUE)
        ).andExpectAll(
                status().isOk()
        ).andDo(result -> {
            WebResponse<TaxCalculateResponse> response = objectMapper.readValue(result.getResponse().getContentAsString(), new TypeReference<>() {
            });

            assertEquals(3700.0, response.getData().getTaxAmount());
            assertEquals('E', response.getData().getTaxSlab().getCategory());
        });
    }

    @Test
    void tesCategoryJ() throws Exception{
        mockMvc.perform(
                get("/api/tax?annualIncome=90000000")
                        .accept(MediaType.APPLICATION_JSON_VALUE)
        ).andExpectAll(
                status().isOk()
        ).andDo(result -> {
            WebResponse<TaxCalculateResponse> response = objectMapper.readValue(result.getResponse().getContentAsString(), new TypeReference<>() {
            });

            assertEquals(528400.0, response.getData().getTaxAmount());
            assertEquals('J', response.getData().getTaxSlab().getCategory());
        });
    }
}