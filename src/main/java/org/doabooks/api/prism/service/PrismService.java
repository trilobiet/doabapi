package org.doabooks.api.prisma.service;

import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import com.fasterxml.jackson.databind.ObjectMapper;

@CacheConfig(cacheNames={"prismCache"})
public class PrismService {
	
	private final String prismUrl;
	
	protected final Logger log = LogManager.getLogger(this.getClass());
	
	// TODO log requests

	/**
	 * Constructor 
	 * @param prismUrl
	 */
	public PrismService(String prismUrl) {
		this.prismUrl = prismUrl;
	}
	
	@Cacheable(key="'pubname='+#name")
	public PrismPublisher getByPublisherName(String name) throws IOException {
		
		return getPublisher("title", name);
	}
	
	@Cacheable(key="'pubid='+#id")
	public PrismPublisher getByPublisherId(String id) throws IOException {
		
		return getPublisher("pId", id);
	}

	@Cacheable(key="'doi='+#doi")
	public PrismBook getByDoi(String doi) throws IOException {
		
		return getBook("doi", doi);
	}
	
	@Cacheable(key="'isbn='+#isbn")
	public PrismBook getByIsbn(String isbn) throws IOException {
		
		return getBook("isbn", isbn);
	}
	
	
	private PrismPublisher getPublisher(String field, String value) throws IOException {
		
		URL url = new URL( buildUrl(field, value) );
	    return new ObjectMapper().readValue(url, PrismPublisher.class);
	}
	
	
	private PrismBook getBook(String field, String value) throws IOException {
		
		URL url = new URL( buildUrl(field, value) );
	    return new ObjectMapper().readValue(url, PrismBook.class);
	}
	
	
	private String buildUrl(String field, String value) {
		
		String url = prismUrl + "?" + field + "=" + URLEncoder.encode(value,Charset.defaultCharset()); 
		log.info(url);
		return url;  
	}

}
