package com.example;

import io.micronaut.http.annotation.*;

@Controller("/micronautOathTest")
public class MicronautOathTestController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}