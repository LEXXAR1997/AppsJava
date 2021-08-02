package com.current.transaction.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.current.transaction.dto.CurrentDTO;
import com.current.transaction.entity.Response;
import com.current.transaction.entity.Transaction;
import com.current.transaction.repository.TransactionRepositoryInterface;

@RestController
@RequestMapping("api/")
public class CurrentController {
	
	@Autowired
	TransactionRepositoryInterface transactionRepositoryInterface; 
	
	@PostMapping("/retrieve-current-information")
	public Response postRetrieveRequest(@RequestBody  CurrentDTO currentDTO) {
		List<Transaction> list = transactionRepositoryInterface.findAll();
		
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate parsedDateStart = LocalDate.parse(currentDTO.getTransactionDateStart(), formatoFecha);
		LocalDate parsedDateEnd = LocalDate.parse(currentDTO.getTransactionDateEnd(), formatoFecha);
		
		List<Transaction> listFilter = list.stream().filter(
				elemento -> 
					parsedDateStart.isBefore(LocalDate.parse(elemento.getDate(), formatoFecha)) &&
					parsedDateEnd.isAfter(LocalDate.parse(elemento.getDate(), formatoFecha)) &&
					elemento.getCustomerId() == currentDTO.getCustomerId()
				).collect(Collectors.toList());
		
		
		return new Response(listFilter);
		
	}
	
}
