package com.zmitserkoskinen.webapp.cucumber.stepdefs;

import com.zmitserkoskinen.webapp.LinksApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = LinksApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
