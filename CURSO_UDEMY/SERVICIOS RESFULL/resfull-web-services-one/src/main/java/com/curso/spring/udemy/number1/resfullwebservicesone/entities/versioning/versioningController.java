package com.curso.spring.udemy.number1.resfullwebservicesone.entities.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class versioningController {

    @GetMapping(path = "/v1/name")
    public PersonV1 getNameV1_route(){
        return new PersonV1("Juan Pineda");
    }

    @GetMapping(path = "/v2/name")
    public PersonV2 getNameV2_route(){
        return new PersonV2(new Name("Juan", "Pineda"));
    }

    @GetMapping(value = "/version/name", params = "version=1")
    public PersonV1 getNameV1(){
        return new PersonV1("Juan Pineda");
    }

    @GetMapping(path = "/version/name", params = "version=2")
    public PersonV2 getNameV2(){
        return new PersonV2(new Name("Juan", "Pineda"));
    }

    @GetMapping(value = "/headers/name", headers = "API-VERSION=1")
    public PersonV1 getNameV1_headers(){
        return new PersonV1("Juan Pineda");
    }

    @GetMapping(path = "/headers/name", headers = "API-VERSION=2")
    public PersonV2 getNameV2_headers(){
        return new PersonV2(new Name("Juan", "Pineda"));
    }
}
