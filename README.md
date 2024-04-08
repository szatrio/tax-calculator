**Tax Calculator**

## Table of Contents

-  [Introduction](#introduction)

-  [How to Build and Run](#How-to-Build-and-Run)

-  [Endpoint and Response Sample](#Endpoint-and-Response-Sample)


---

## Introduction


<p>Calculate Income Tax with details and claim options</p>

  

## How to Build and Run



    // Clone this repository
    git clone https://github.com/szatrio/tax-calculator
    
    // Move to directory where pom.xml is present
    cd tax-calculator
    
    // Run project
    mvn spring-boot:run



  

## Endpoint and Response Sample

Endpoint:

`http://localhost:8080/api/tax?annualIncome=60000`

Response JSON:



    {
    	"data": {
    		"taxAmount": 3700.0,
    		"taxSlab": {
    			"category": "E",
    			"chargeableIncome": {
    				"start": 50001.0,
    				"upTo": 70000.0
    			},
    			"taxSlabCalculations": {
    				"first": {
    					"calculations": 50000.0,
    					"taxRate": 0.0,
    					"tax": 1500.0
    				},
    				"next": {
    					"calculations": 20000.0,
    					"taxRate": 11.0,
    					"tax": 2200.0
    				}
    			}
    		},
    		"taxClaimOptions": [
    			{
    				"amount": 9000.0,
    				"individualReliefType": "Individual and dependent relatives"
    			},
    			{
    				"amount": 8000.0,
    				"individualReliefType": "Medical treatment, special needs and carer expenses for parents (Medical condition certified by medical practitioner)"
    			},
    			{
    				"amount": 6000.0,
    				"individualReliefType": "Purchase of basic supporting equipment for disabled self, spouse, child or parent"
    			},
    			{
    				"amount": 6000.0,
    				"individualReliefType": "Disabled individual"
    			},
    			{
    				"amount": 7000.0,
    				"individualReliefType": "Education fees (Self)"
    			},
    			{
    				"amount": 10000.0,
    				"individualReliefType": "Medical expenses on"
    			},
    			{
    				"amount": 2500.0,
    				"individualReliefType": "Lifestyle – Expenses for the use / benefit of self, spouse or child"
    			},
    			{
    				"amount": 500.0,
    				"individualReliefType": "Lifestyle – Additional relief for the use / benefit of self, spouse or child"
    			},
    			{
    				"amount": 1000.0,
    				"individualReliefType": "Purchase of breastfeeding equipment for own use for a child aged 2 years and below"
    			},
    			{
    				"amount": 3000.0,
    				"individualReliefType": "Child care fees to a registered child care centre / kindergarten for a child aged 6 years and below"
    			},
    			{
    				"amount": 8000.0,
    				"individualReliefType": "Net deposit in Skim Simpanan Pendidikan Nasional"
    			},
    			{
    				"amount": 4000.0,
    				"individualReliefType": "Husband / wife / payment of alimony to former wife"
    			},
    			{
    				"amount": 5000.0,
    				"individualReliefType": "Disabled husband / wife"
    			},
    			{
    				"amount": 2000.0,
    				"individualReliefType": "Each unmarried child and under the age of 18 years old"
    			},
    			{
    				"amount": 2000.0,
    				"individualReliefType": "Each unmarried child of 18 years and above who is receiving full-time education"
    			},
    			{
    				"amount": 8000.0,
    				"individualReliefType": "Each unmarried child of 18 years and above that"
    			},
    			{
    				"amount": 6000.0,
    				"individualReliefType": "Disabled child"
    			},
    			{
    				"amount": 8000.0,
    				"individualReliefType": "Additional exemption of RM8,000 disable child age 18 years old and above"
    			},
    			{
    				"amount": 7000.0,
    				"individualReliefType": "Life insurance and EPF"
    			},
    			{
    				"amount": 3000.0,
    				"individualReliefType": "Deferred Annuity and Private Retirement Scheme"
    			},
    			{
    				"amount": 3000.0,
    				"individualReliefType": "Education and medical insurance"
    			},
    			{
    				"amount": 350.0,
    				"individualReliefType": "Contribution to the Social Security Organization"
    			},
    			{
    				"amount": 2500.0,
    				"individualReliefType": "Expenses on charging facilities for Electric Vehicle"
    			}
    		]
    	},
    	"errors": null
    }






  

License

----

  

© Satrio Utomo
