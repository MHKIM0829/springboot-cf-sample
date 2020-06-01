package com.istn.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class DemoMainController {

    @RequestMapping(value = "/{param1}/{param2}", method = RequestMethod.GET)
    public String hello(@PathVariable("param1") String param1,
        @PathVariable("param2") String param2) {

        return String.format("{\"message\":\"Hello %s %s\"}", param1, param2);
    }
}