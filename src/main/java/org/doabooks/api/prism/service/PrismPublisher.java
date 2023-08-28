package org.doabooks.api.prism.service;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL) // suppress null fields in serialization
@JsonIgnoreProperties(ignoreUnknown = true)
public class PrismPublisher implements Serializable {
		
	private static final long serialVersionUID = 1;
	
	public List<PeerReview> peerReviews;
	public Publisher publisher;
	public Integer code;

	private String error;
	private Integer number;
	
	@JsonProperty("error")
	public String getError() { return error; }

	@JsonProperty("message")
	public void setError(String error) { this.error = error; }

	@JsonProperty("numberOfReviews")
	public Integer getNumberOfReviews() { return number; }

	@JsonProperty("numberOfItems")
	public void setNumberOfReviews(Integer number) { this.number = number; }

	@JsonInclude(Include.NON_NULL) // suppress null fields in serialization
	@JsonIgnoreProperties(ignoreUnknown = true)
	static class PeerReview {
		
		private String overseenBy, isPublished, conductedBy, stage, id, type, object, iconUrl, review;

		@JsonProperty("overseenBy")
		public String getOverseenBy() {	return overseenBy; }

		@JsonProperty("prOverseenBy")
		public void setOverseenBy(String overseenBy) { this.overseenBy = overseenBy;	}

		@JsonProperty("isPublished")
		public String getIsPublished() { return isPublished; }

		@JsonProperty("prPublished")
		public void setIsPublished(String isPublished) { this.isPublished = isPublished; }

		@JsonProperty("conductedBy")
		public String getConductedBy() { return conductedBy; }

		@JsonProperty("prConductedBy")
		public void setConductedBy(String conductedBy) { this.conductedBy = conductedBy; }

		@JsonProperty("stage")
		public String getStage() { return stage; }

		@JsonProperty("prStage")
		public void setStage(String stage) { this.stage = stage; }

		@JsonProperty("id")
		public String getId() { return id; }

		@JsonProperty("prId")
		public void setId(String id) { this.id = id; }

		@JsonProperty("type")
		public String getType() { return type; }

		@JsonProperty("prType")
		public void setType(String type) { this.type = type; }

		@JsonProperty("object")
		public String getObject() { return object; }

		@JsonProperty("prObject")
		public void setObject(String object) { this.object = object; }

		@JsonProperty("iconUrl")
		public String getIconUrl() { return iconUrl; }

		@JsonProperty("prIconUrl")
		public void setIconUrl(String iconUrl) { this.iconUrl = iconUrl; }

		@JsonProperty("review")
		public String getReview() { return review; }

		@JsonProperty("prReview")
		public void setReview(String review) { this.review = review; }
		
	}

	@JsonInclude(Include.NON_NULL) // suppress null fields in serialization
	@JsonIgnoreProperties(ignoreUnknown = true)
	static class Publisher {
		
		private String pId, pName;

		@JsonProperty("id")
		public String getId() { return pId; }

		@JsonProperty("pId")
		public void setId(String pId) { this.pId = pId; }

		@JsonProperty("name")
		public String getName() { return pName; }

		@JsonProperty("pName")
		public void setName(String pName) { this.pName = pName; }

	}
	
}

