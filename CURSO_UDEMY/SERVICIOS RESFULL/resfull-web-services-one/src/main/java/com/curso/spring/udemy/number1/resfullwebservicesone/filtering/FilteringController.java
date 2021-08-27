package com.curso.spring.udemy.number1.resfullwebservicesone.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public MappingJacksonValue retrieveSomeBean(){
        SomeBean someBean = new SomeBean("value 1", "value 2", "value 3");
        String[] strings = {"field1", "field2"};
        SimpleBeanPropertyFilter simpleBeanPropertyFilter =
                SimpleBeanPropertyFilter.filterOutAllExcept(strings);
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("SomeBeanFilter",simpleBeanPropertyFilter);
        MappingJacksonValue mappingJacksonValue =
                new MappingJacksonValue(someBean);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }


}
