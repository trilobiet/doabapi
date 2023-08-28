package org.doabooks.api.prism.config;

import org.doabooks.api.prism.service.PrismService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan (
	basePackages = {"org.doabooks.api"},
	excludeFilters = {
			@Filter( type=FilterType.ANNOTATION, value=EnableWebMvc.class ) 
	}
)
public class ApiRootConfiguration {
	
	@Autowired
	public Environment env;	

	@Bean(name="prismService") 
	public PrismService prismService() {
		return new PrismService(env.getProperty("url_prism_api"));
	}

}

