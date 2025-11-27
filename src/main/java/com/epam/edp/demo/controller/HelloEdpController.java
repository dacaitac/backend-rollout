package com.epam.edp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pavlo_Yemelianov
 */
@RestController
public class HelloEdpController {

    String hostname = System.getenv("HOSTNAME");

    @GetMapping(value = "/api/hello")
    public String hello() {
        return "Hello, KubeRocketCI v2 from " + hostname;
    }
}
