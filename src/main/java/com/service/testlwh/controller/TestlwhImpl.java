package com.service.testlwh.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-21T03:40:07.260Z")

@RestSchema(schemaId = "testlwh")
@RequestMapping(path = "/testlwh", produces = MediaType.APPLICATION_JSON)
public class TestlwhImpl {

    @Autowired
    private TestlwhDelegate userTestlwhDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTestlwhDelegate.helloworld(name);
    }

}
