package com.retrieve.transaction.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.retrieve.transaction.dto.CurrentDTO;
import com.retrieve.transaction.entity.Response;

@FeignClient("RETRIEVE-CURRENT-SERVICE")
@RequestMapping("api/")
public interface CurrentClient {
	
	@PostMapping("/retrieve-current-information")
	public Response postRetrieveRequest(@RequestBody  CurrentDTO currentDTO);
	
}
