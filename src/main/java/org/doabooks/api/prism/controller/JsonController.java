package org.doabooks.api.prism.controller;

import java.io.IOException;

import org.doabooks.api.prism.service.PrismBook;
import org.doabooks.api.prism.service.PrismError;
import org.doabooks.api.prism.service.PrismPublisher;
import org.doabooks.api.prism.service.PrismService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/prism/rest")
public class JsonController {
	
	@Autowired
	private PrismService prismService;
	
	@GetMapping(path = "/publisher", produces = MediaType.APPLICATION_JSON_VALUE)
	public PrismPublisher getJsonForPublisher(
			@RequestParam( value="name", required=false ) String name,
			@RequestParam( value="id", required=false  ) String id
		) throws IOException {
		
		if (name != null) 
			return prismService.getByPublisherName(name); // Facultad de Ciencias Jurídicas y Políticas - Universidad Nacional del Altiplano de Puno
		else if (id != null) 
			return prismService.getByPublisherId(id); // 1139
		else 
			throw new BadRequestException("Missing argument: name OR id");
		
	}

	
	@GetMapping(path = "/title", produces = MediaType.APPLICATION_JSON_VALUE)
	public PrismBook getJsonForTitle(
			@RequestParam( value="doi", required=false ) String doi,
			@RequestParam( value="isbn", required=false  ) String isbn
		) throws IOException {
		
		if (doi != null) 
			return prismService.getByDoi(doi); // 10.3998/tfcp.13240726.0001.001
		else if (isbn != null) 
			return prismService.getByIsbn(isbn); // 9780472036165
		else 
			throw new BadRequestException("Missing argument: doi OR isbn");
		
	}

	
	@GetMapping(path = "/**")
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public PrismError generateNotFoundException() {
		return new PrismError(404, "Resource not found");
	}
	
	
	@ExceptionHandler(BadRequestException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public PrismError handleBadRequestException(BadRequestException exception) {
		
		return new PrismError(400, exception.getMessage());
	}	

	@ExceptionHandler(IOException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public PrismError handleIOException(IOException exception) {
		
		return new PrismError(500, "No data could be retrieved (" + exception.getMessage() + ")");
	}	
	
	
}




