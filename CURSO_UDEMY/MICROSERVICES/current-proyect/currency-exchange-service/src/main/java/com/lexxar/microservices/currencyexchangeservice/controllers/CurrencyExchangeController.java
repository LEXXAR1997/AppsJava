package com.lexxar.microservices.currencyexchangeservice.controllers;

import com.lexxar.microservices.currencyexchangeservice.Entities.CurrencyExchange;
import com.lexxar.microservices.currencyexchangeservice.repositories.CurrencyExchangeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CurrencyExchangeController {

	@Autowired
	private CurrencyExchangeRepository repository;
	
    @Autowired
    private Environment environment;

    @GetMapping(path = "/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange RetrieveExchangeValue(
            @PathVariable String from, @PathVariable String to){
        
    	CurrencyExchange currencyExchange = repository.findByFromAndTo(from, to);

		if(currencyExchange ==null) {
			throw new RuntimeException
				("Unable to Find data for " + from + " to " + to);
		}
		
		String port = environment.getProperty("local.server.port");
		
		currencyExchange.setEnvironment(port);
		
		return currencyExchange;
    }

}
