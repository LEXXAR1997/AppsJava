package com.retrieve.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retrieve.transaction.client.CurrentClient;
import com.retrieve.transaction.config.exception.BadRequestException;
import com.retrieve.transaction.dto.CurrentDTO;
import com.retrieve.transaction.dto.RetrieveDTO;
import com.retrieve.transaction.entity.Response;

@RestController
@RequestMapping("api/")
public class RetrieveController {
	
	@Autowired
	CurrentClient currentClient;
	
	@PostMapping("/retrieve-transaction-user")
	public Response postRetrieveRequest(@RequestBody  RetrieveDTO retrieveDTO) {
		if(retrieveDTO.getTransactionDateStart() == null || retrieveDTO.getTransactionDateStart().isEmpty() ||
		   retrieveDTO.getTransactionDateEnd() == null || retrieveDTO.getTransactionDateEnd().isEmpty() ||
		   retrieveDTO.getAccountId() == 0 || retrieveDTO.getBranchId() == 0 || String.valueOf(retrieveDTO.getAccountId()).length() < 3 ||
			String.valueOf(retrieveDTO.getBranchId()).length() < 3) {
			throw new BadRequestException("Type: BadRequestException; Code: 400; Location: "+RetrieveController.class.getName()+"; More Info: Invalid syntax");
		}
		
		
		CurrentDTO currentDTO = new CurrentDTO(
				Integer.parseInt(String.valueOf(retrieveDTO.getAccountId()).substring(0,3) + 
				String.valueOf(retrieveDTO.getBranchId()).substring(0,3)), 
				retrieveDTO.getTransactionDateStart(),retrieveDTO.getTransactionDateEnd());
		
		return currentClient.postRetrieveRequest(currentDTO);
	}
	
}

