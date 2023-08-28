package org.doabooks.api.prism.controller;

import java.io.IOException;

import org.doabooks.api.prism.service.PrismError;
import org.doabooks.api.prism.service.PrismPublisher;
import org.doabooks.api.prism.service.PrismService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping(value = "/prism/html")
public class HtmlController {
	
	@Autowired
	private PrismService prismService;
	
	@GetMapping(path = "/publisher")
	public ModelAndView getPublisherHtml(
			@RequestParam( value="name", required=false ) String name,
			@RequestParam( value="id", required=false  ) String id
		) throws IOException {
		
		PrismPublisher prismResponse = null;
		
		if (name != null) 
			prismResponse = prismService.getByPublisherName(name); // Facultad de Ciencias Jurídicas y Políticas - Universidad Nacional del Altiplano de Puno
		else if (id != null) 
			prismResponse = prismService.getByPublisherId(id); // 1139
		else 
			throw new BadRequestException("Missing argument: name OR id");
		
		return new ModelAndView("prismwidget/publisher")
			.addObject("prismResponse", prismResponse);
	}

	
	@GetMapping(path = "/title")
	public ModelAndView getTitleHtml(
			@RequestParam( value="doi", required=false ) String doi,
			@RequestParam( value="isbn", required=false  ) String isbn
		) throws IOException {
		
		PrismPublisher prismResponse = null;
		
		if (doi != null) 
			prismResponse = prismService.getByDoi(doi); // 10.3998/tfcp.13240726.0001.001
		else if (isbn != null) 
			prismResponse = prismService.getByIsbn(isbn); // 9780472036165
		else 
			throw new BadRequestException("Missing argument: doi OR isbn");
		
		return new ModelAndView("prismwidget/title")
			.addObject("prismResponse", prismResponse);
	}
	
	
	@GetMapping(path = "/**")
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ModelAndView generateNotFoundException() {
		
		PrismError error = new PrismError(404, "Resource not found");
		
		return new ModelAndView("prismwidget/error").addObject(error);
	}
	
	
	@ExceptionHandler(BadRequestException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ModelAndView handleBadRequestException(BadRequestException exception) {
		
		PrismError error = new PrismError(400, exception.getMessage());
		
		return new ModelAndView("prismwidget/error").addObject(error);
	}	

	@ExceptionHandler(IOException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ModelAndView handleIOException(IOException exception) {
		
		PrismError error = new PrismError(500, "No data could be retrieved (" + exception.getMessage() + ")");
		
		return new ModelAndView("prismwidget/error").addObject(error);
	}	
	
	
}
