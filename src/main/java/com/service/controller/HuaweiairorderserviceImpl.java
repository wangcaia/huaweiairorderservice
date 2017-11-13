package com.service.controller;

import com.service.model.Person;

import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringCodegen", date = "2017-11-13T09:46:50.284Z")

@RestSchema(schemaId = "huaweiairorderservice")
@RequestMapping(path = "/huaweiairorderservice", produces = MediaType.APPLICATION_JSON)
public class HuaweiairorderserviceImpl {

    @Autowired
    private HuaweiairorderserviceDelegate userHuaweiairorderserviceDelegate;


    @RequestMapping(value = "/add",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public Integer add( @RequestParam(value = "a", required = true) Integer a, @RequestParam(value = "b", required = true) Integer b){

        return userHuaweiairorderserviceDelegate.add(a, b);
    }


    @RequestMapping(value = "/sayhei",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String sayHei( @RequestHeader(value="name", required=true) String name){

        return userHuaweiairorderserviceDelegate.sayHei(name);
    }


    @RequestMapping(value = "/sayhello/{name}",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    public String sayHello( @PathVariable("name") String name){

        return userHuaweiairorderserviceDelegate.sayHello(name);
    }


    @RequestMapping(value = "/sayhi",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String sayHi( @RequestParam(value = "name", required = true) String name){

        return userHuaweiairorderserviceDelegate.sayHi(name);
    }


    @RequestMapping(value = "/saysomething",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    public String saySomething( @RequestParam(value = "prefix", required = true) String prefix, @RequestBody Person user){

        return userHuaweiairorderserviceDelegate.saySomething(prefix, user);
    }

}
