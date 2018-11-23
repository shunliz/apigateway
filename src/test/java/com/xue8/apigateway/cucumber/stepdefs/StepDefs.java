package com.xue8.apigateway.cucumber.stepdefs;

import com.xue8.apigateway.ApigatewayApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ApigatewayApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
