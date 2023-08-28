package org.doabooks.api.prism.service;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL) // suppress null fields in serialization
@JsonIgnoreProperties(ignoreUnknown = true)
public class PrismBook extends PrismPublisher {
	
	private static final long serialVersionUID = 1;
	
	public Book book;
	
	static class Book {
		
		private List<String> bIsbn;
		private String bDoi, bTitle, bUrl;
		
		@JsonProperty("isbn")
		public List<String> getIsbn() { return bIsbn; }
		
		@JsonProperty("bIsbn")
		public void setIsbn(List<String> bIsbn) { this.bIsbn = bIsbn; }
		
		@JsonProperty("doi")
		public String getDoi() { return bDoi; }
		
		@JsonProperty("bDoi")
		public void setDoi(String bDoi) { this.bDoi = bDoi; }
		
		@JsonProperty("title")
		public String getTitle() { return bTitle; }
		
		@JsonProperty("bTitle")
		public void setTitle(String bTitle) { this.bTitle = bTitle; }
		
		@JsonProperty("url")
		public String getUrl() { return bUrl; }
		
		@JsonProperty("bUrl")
		public void setUrl(String bUrl) { this.bUrl = bUrl; }
	}
	
}
