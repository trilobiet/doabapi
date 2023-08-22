# Prism widget for Directory of Open Access Books (DOAB)

Use this JSON API or widget on your web pages to show peer review process information for publishers and titles.


## Request format

The JSON API provides requested data in JSON format. This JSON data can be further processed for display in any client application or web site.      
Alternatively one can choose to request a fully formatted and styled HTML widget.


### Request for publisher

Requests for publisher peer review data can be done using one of two request parameters {id,name} 

#### By id

    https://api.doabooks.org/prism/[rest|html]/publisher?id=[id]

examples:
    
    https://api.doabooks.org/prism/rest/publisher?id=1139
    https://api.doabooks.org/prism/html/publisher?id=1139    
    
#### By name
        
    https://localhost:8080/prism/[rest|html]/publisher?name=[name]
    
examples:
    
    https://localhost:8080/prism/rest/publisher?name=Facultad de Ciencias Jurídicas y Políticas - Universidad Nacional del Altiplano de Puno
    https://localhost:8080/prism/html/publisher?name=Facultad de Ciencias Jurídicas y Políticas - Universidad Nacional del Altiplano de Puno
    
    
### JSON Response for publisher

JSON responses for publisher typically have the following form (example):

	{
	  "peerReviews": [
	    {
	      "overseenBy": "Publisher",
	      "isPublished": "No",
	      "conductedBy": "Internal editor;Editorial board member;External peer reviewer",
	      "stage": "Pre-publication",
	      "id": "69c73b4c-a9f2-40c3-9b02-0817a702a087",
	      "type": "Double-anonymised",
	      "object": "Full text",
	      "iconUrl": "https://directory.doabooks.org/themes/Mirage2/images/prCertificate.png"
	    },
	    {
	      "overseenBy": "Publisher",
	      "isPublished": "No",
	      "conductedBy": "Internal editor;Editorial board member",
	      "stage": "Pre-publication",
	      "id": "030dc504-786c-4e82-8496-b213583f861f",
	      "type": "Single-anonymised",
	      "object": "Full text",
	      "iconUrl": "https://directory.doabooks.org/themes/Mirage2/images/prCertificate.png"
	    }
	  ],
	  "publisher": {
	    "name": "Facultad de Ciencias Jurídicas y Políticas - Universidad Nacional del Altiplano de Puno"
	  },
	  "numberOfReviews": 2
	}


#### HTML Response for publisher



	<div class="prsm">
	
		<h1 class="prsm-hdr">
			<span class="prsm-hdr-text">Peer Review Information</span> 
			<span class="prsm-hdr-for">for</span>
			<span class="prsm-hdr-publisher">University of Michigan Press</span>
		</h1>
	
		<h2 class="prsm-hdr-sub">
			The publisher has registered with DOAB Prism the Peer Review Process for
			<span>3</span> 
			Peer Review types:
		</h2> 	
		
		<ol class="prsm-prs">
		
			<li class="prsm-pr">
			
				<dl class="prsm-pr-fields">
				
					<dt class="prsm-pr-field fld-what">What</dt>
					<dt class="prsm-pr-field-desc fld-what">What is being reviewed?</dt> 
					<dd class="prsm-pr-field-value fld-what">Full text</dd>
    
					<dt class="prsm-pr-field fld-who">Who</dt> 
					<dt class="prsm-pr-field-desc fld-who">Who conducts the peer review?</dt> 
					<dd class="prsm-pr-field-value fld-who">External peer reviewer</dd>
    
					<dt class="prsm-pr-field fld-how">How</dt>
					<dt class="prsm-pr-field-desc fld-how">What is the level of anonymity?</dt> 
					<dd class="prsm-pr-field-value fld-how">Double-blind</dd>
    
					<dt class="prsm-pr-field fld-when">When</dt>
					<dt class="prsm-pr-field-desc fld-when">At what stage is the peer review being conducted?</dt> 
					<dd class="prsm-pr-field-value fld-when">Pre-publication</dd>
    
					<dt class="prsm-pr-field-desc fld-overseen">Peer review is overseen by:</dt>
					<dd class="prsm-pr-field-value fld-overseen">Scientific or Editorial Board</dd>
					
				</dl>
				
			</li>
		
			<li class="prsm-pr">
			
				<dl class="prsm-pr-fields">
				
					<dt class="prsm-pr-field fld-what">What</dt>
					<dt class="prsm-pr-field-desc fld-what">What is being reviewed?</dt> 
					<dd class="prsm-pr-field-value fld-what">Proposal</dd>
    
					<dt class="prsm-pr-field fld-who">Who</dt> 
					<dt class="prsm-pr-field-desc fld-who">Who conducts the peer review?</dt> 
					<dd class="prsm-pr-field-value fld-who">External peer reviewer</dd>
     
					<dt class="prsm-pr-field fld-how">How</dt>
					<dt class="prsm-pr-field-desc fld-how">What is the level of anonymity?</dt> 
					<dd class="prsm-pr-field-value fld-how">Double-blind</dd>
    
					<dt class="prsm-pr-field fld-when">When</dt>
					<dt class="prsm-pr-field-desc fld-when">At what stage is the peer review being conducted?</dt> 
					<dd class="prsm-pr-field-value fld-when">Pre-publication</dd>
    
					<dt class="prsm-pr-field-desc fld-overseen">Peer review is overseen by:</dt>
					<dd class="prsm-pr-field-value fld-overseen">Publisher</dd>
					
				</dl>
				
			</li>
		
			<li class="prsm-pr">
			
				<dl class="prsm-pr-fields">
				
					<dt class="prsm-pr-field fld-what">What</dt>
					<dt class="prsm-pr-field-desc fld-what">What is being reviewed?</dt> 
					<dd class="prsm-pr-field-value fld-what">Proposal</dd>
    
					<dt class="prsm-pr-field fld-who">Who</dt> 
					<dt class="prsm-pr-field-desc fld-who">Who conducts the peer review?</dt> 
					<dd class="prsm-pr-field-value fld-who">Internal editor</dd>
    
					<dt class="prsm-pr-field fld-how">How</dt>
					<dt class="prsm-pr-field-desc fld-how">What is the level of anonymity?</dt> 
					<dd class="prsm-pr-field-value fld-how">All identities known</dd>
    
					<dt class="prsm-pr-field fld-when">When</dt>
					<dt class="prsm-pr-field-desc fld-when">At what stage is the peer review being conducted?</dt> 
					<dd class="prsm-pr-field-value fld-when">Pre-publication</dd>
    
					<dt class="prsm-pr-field-desc fld-overseen">Peer review is overseen by:</dt>
					<dd class="prsm-pr-field-value fld-overseen">Books or series editor</dd>
					
				</dl>
				
			</li>
		
		</ol>
	
	</div>


### Request for title

Requests for title peer review data can be done using one of two request parameters {doi,isbn} 

#### By doi

    https://api.doabooks.org/prism/[rest|html]/title?doi=[doi]

examples:
    
    https://api.doabooks.org/prism/rest/title?doi=10.3998/tfcp.13240726.0001.001
    https://api.doabooks.org/prism/html/title?doi=10.3998/tfcp.13240726.0001.001    
    
#### By isbn
        
    https://localhost:8080/prism/[rest|html]/title?isbn=[isbn]
    
examples:
    
    https://localhost:8080/prism/rest/title?isbn=9780472036165
    https://localhost:8080/prism/html/title?isbn=9780472036165
    
    
### JSON Response for title

JSON responses for title typically have the following form (example):
    
	{
	  "peerReviews": [
	    {
	      "overseenBy": "Scientific or Editorial Board",
	      "isPublished": "No",
	      "conductedBy": "External peer reviewer",
	      "stage": "Pre-publication",
	      "id": "d98bf225-990a-4ac4-acf4-fd7bf0dfb00c",
	      "type": "Double-anonymised",
	      "object": "Full text",
	      "iconUrl": "https://directory.doabooks.org/themes/Mirage2/images/prCertificate.png",
	      "review": "The proposal was selected by the acquisitions editor who invited a full manuscript. The full manuscript was reviewed by two external readers using a double-blind process. Based on the acquisitions editor recommendation, the external reviews, and their own analysis, the Executive Committee (Editorial Board) of U-M Press approved the project for publication."
	    }
	  ],
	  "publisher": {
	    "name": "University of Michigan Press",
	    "id": "b7359529-e5f7-4510-a59f-d7dafa1d4d17"
	  },
	  "book": {
	    "isbn": [
	      "9780472036165"
	    ],
	    "doi": "10.3998/tfcp.13240726.0001.001",
	    "title": "A Heart Beating Hard",
	    "url": null
	  },
	  "numberOfReviews": 1
	}


### HTML Response for title


	<div class="prsm">
	
		<h1 class="prsm-hdr">
			<span class="prsm-hdr-text">Peer Review Information</span> 
			<span class="prsm-hdr-for">for</span>
			<span class="prsm-hdr-title">A Heart Beating Hard</span>
		</h1>
	
		<h2 class="prsm-hdr-sub">
			The publisher has registered with DOAB Prism the Peer Review Process for
			<span>1</span> 
			Peer Review type:
		</h2> 	
		
		<ol class="prsm-prs">
		
			<li class="prsm-pr">
			
				<dl class="prsm-pr-fields">
				
					<dt class="prsm-pr-field fld-comments">Review Comments</dt>
					<dd class="prsm-pr-field-value fld-comments">The proposal was selected by the acquisitions editor who invited a full manuscript. The full manuscript was reviewed by two external readers using a double-blind process. Based on the acquisitions editor recommendation, the external reviews, and their own analysis, the Executive Committee (Editorial Board) of U-M Press approved the project for publication.</dd>
				
					<dt class="prsm-pr-field fld-what">What</dt>
					<dt class="prsm-pr-field-desc fld-what">What is being reviewed?</dt> 
					<dd class="prsm-pr-field-value fld-what">Full text</dd>
    
					<dt class="prsm-pr-field fld-who">Who</dt> 
					<dt class="prsm-pr-field-desc fld-who">Who conducts the peer review?</dt> 
					<dd class="prsm-pr-field-value fld-who">External peer reviewer</dd>
    
					<dt class="prsm-pr-field fld-how">How</dt>
					<dt class="prsm-pr-field-desc fld-how">What is the level of anonymity?</dt> 
					<dd class="prsm-pr-field-value fld-how">Double-anonymised</dd>
    
					<dt class="prsm-pr-field fld-when">When</dt>
					<dt class="prsm-pr-field-desc fld-when">At what stage is the peer review being conducted?</dt> 
					<dd class="prsm-pr-field-value fld-when">Pre-publication</dd>
    
					<dt class="prsm-pr-field-desc fld-overseen">Peer review is overseen by:</dt>
					<dd class="prsm-pr-field-value fld-overseen">Scientific or Editorial Board</dd>
					
				</dl>
				
			</li>
		
		</ol>
    
	</div>
        
    