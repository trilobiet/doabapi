# Prism widget for Directory of Open Access Books (DOAB)

Use this widget on your web pages to show peer review process information for publishers and titles.

-----

#### Table of Contents
* [Response format JSON or HTML](#response-format-json-or-html)
* [Publisher data](#publisher-data)   
* [Title Data](#title-data)   
* [Widget implementation in HTML](#widget-implementation-in-html)    

-----


## Response format JSON or HTML

The JSON Widget API provides requested data in JSON format. This JSON data can be further processed for display in any client application or web site.
      
Alternatively one can choose to request a fully formatted and styled HTML widget.


## Publisher data

### Request for publisher

Requests for publisher peer review data can be done using one of two request parameters {id,name} 

#### By id
```
https://widget.doabooks.org/prism/[rest|html]/publisher?id=[id]
```

##### examples:
    
```
https://widget.doabooks.org/prism/rest/publisher?id=1139
```
```    
https://widget.doabooks.org/prism/html/publisher?id=1139
```
    
#### By name
```        
https://widget.doabooks.org/prism/[rest|html]/publisher?name=[name]
```
    
##### examples:

```    
https://widget.doabooks.org/prism/rest/publisher?name=Facultad de Ciencias Jurídicas y Políticas - Universidad Nacional del Altiplano de Puno
```
```    
https://widget.doabooks.org/prism/html/publisher?name=Facultad de Ciencias Jurídicas y Políticas - Universidad Nacional del Altiplano de Puno
```
    
### Response for publisher

#### JSON Response

JSON responses for publisher typically have the following form (example):

```json
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
```

### HTML Response

```html
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
```

## Title Data

### Request for title

Requests for title peer review data can be done using one of two request parameters {doi,isbn} 

#### By doi

```
https://widget.doabooks.org/prism/[rest|html]/title?doi=[doi]
```

##### examples:
    
```
https://widget.doabooks.org/prism/rest/title?doi=10.3998/tfcp.13240726.0001.001
```
```    
https://widget.doabooks.org/prism/html/title?doi=10.3998/tfcp.13240726.0001.001
```
    
#### By isbn

```
https://widget.doabooks.org/prism/[rest|html]/title?isbn=[isbn]
```
    
##### examples:
    
```
https://widget.doabooks.org/prism/rest/title?isbn=9780472036165
```
```
https://widget.doabooks.org/prism/html/title?isbn=9780472036165
```
    
### Response for title

#### JSON Response

JSON responses for title typically have the following form (example):

```json    
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
```

#### HTML Response

```html
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
```


## Widget implementation in HTML

Using the REST API `https://widget.doabooks.org/prism/rest/...` JSON data can be requested to display PRISM data in your web sites' content in any way you want, applying any layout and styling of your own making.

To keep things a bit more simple though, a script is available that renders HTML output `https://widget.doabooks.org/prism/html/...` in your web sites' DOM using a standardized layout. Three ways of including the widget are described here.


### 1: PRISM data in a modal popup

A modal popup shows the requested PRISM data in an overlay window after the site visitor performs some action, like clicking a link, a button or an image. A modal popup does not interfere with your sites' layout, though it requires an action to be initiated by the visitor to show the data. 

#### Steps to follow for installation:

1. Copy the prism-widget.js script tag to the HTML head tag just before the closing tag `<\head>`:   
    
   ```html
   <script src="https://widget.doabooks.org/resources/js/prism-widget.js"></script>
   ```

3. Create one or more elements with an onClick event:
    
   ```html
   <button onclick="prismPublisher({id:'1139',modal:true})">PRISM Peer Review Information</button>
   ```
    
   For an overview of available functions and their arguments, see below. 


### 2: PRISM data as inline loaded HTML

Inline loaded HTML directly shows the requested PRISM data in the web page, without the need for any user action. Inline loaded HTML changes the page layout by inserting extra content. Already at the sites' level available CSS styling will be applied to the inserted PRISM content as well. Two extra style sheets can be included to control layout and typeface of the inserted data, which you can choose to override with your own styles, or leave out entirely.

#### Steps to follow for installation:

1. Copy the prism-widget.js script tag to the HTML head tag just before the closing tag `<\head>`:
 
   ```html 
   <script src="https://widget.doabooks.org/resources/js/prism-widget.js"></script>
   ```

1. Copy the layout.css and typeface.css link tags to the HTML head tag:   
   *This step is optional, you may choose to provide your own CSS styling*

    ```html
    <link rel="stylesheet" href="https://widget.doabooks.org/resources/css/layout.css"></link>    
    <link rel="stylesheet" href="https://widget.doabooks.org/resources/css/typeface.css"></link>    
    ```

2. Create one or more elements that serve as regions for inserted PRISM data:

   ```html 
   ...   
   <div id="p1139"></div>
   ...   
   ...   
   <div id="p1140"></div> 
   ...
   ```   
 
3. Include a script just before the closing `</body>` tag to populate the defined regions:

   ```javascript
   <script>
      prismTitle({ isbn:'9780472036165', modal:false, selector:'#p1139' })    
      prismTitle({ isbn:'9780472036165', modal:false, selector:'#p1140' })
   </script>
   ```
    
   For an overview of available functions and their arguments, see below. 


### 3: PRISM data in an iframe

Ultimately you can choose to statically include an iframe on your web page, with its `src` attribute set to the appropriate url.

```html
<iframe src="https://widget.doabooks.org/prism/html/publisher?id=1139" width="100%" height="600"></iframe>
```
Of course there is always the possibility to hide and show the iframe in a modal or popup window using any custom javascript or javascript framework of your own choice.

## Function reference for prism-widget.js 

### Function `prismPublisher`

Request and show PRISM data for a publisher.

```javascript
function prismPublisher({
   name : "",     
   id : "",       
   selector : "", 
   modal : true    
})
```

| parameter    |  type   | optional |  default value  |
| ------------ | ------- | -------- | --------------- |
| name         | String  |   yes*   |       ""        |
| id           | String  |   yes*   |       ""        | 
| selector**   | String  |   yes    | ".prism-widget" |
| modal        | Boolean |   yes    |       true      |

\* One of `name` and `id` must be present. When both are present, `id` is ignored. When none is present `id` is set "".   
\** Argument `selector` is ignored when `modal` is `true`.

#### Example usage

```javascript
prismPublisher({
   id:   "1139"
});
````
Peer Review data for publisher with id `1139` is rendered as a modal popup (default behaviour). An HTML element is needed to open the modal popup, e.g.:

```html
<button onclick="prismPublisher({ id:'1139' })" style="color:blue">Prism Peer Review Information</button>
```

```javascript
prismPublisher({
   id:   "1139"
   modal: false
});
````
Peer Review data for publisher with id `1139` is rendered inline in elements with class `prism-widget` (default value) 

```javascript
prismPublisher({
   id:       "1139"
   selector: "#mySelector"
   modal:    false
});
````
Peer Review data for publisher with id `1139` is rendered inline in the element with id `mySelector` 


### Function `prismTitle`

Request and show PRISM data for a title.

```javascript
function prismTitle({
   doi,
   isbn,
   selector,
   modal
})
```

| parameter    |  type   | optional |  default value  |
| ------------ | ------- | -------- | --------------- |
| doi          | String  |   yes*   |       ""        |
| isbn         | String  |   yes*   |       ""        | 
| selector**   | String  |   yes    | ".prism-widget" |
| modal        | Boolean |   yes    |       true      |

\* One of `doi` and `isbn` must be present. When both are present, `isbn` is ignored. When none is present `isbn` is set "".   
\** Argument `selector` is ignored when `modal` is `true`.
 
#### Example usage

```javascript
prismTitle({
   isbn:     "1234567890"
});
````
Peer Review data for title with isbn `1234567890` is rendered as a modal popup (default behaviour). An HTML element is needed to open the modal popup, e.g.:

```html
<button onclick="prismTitle({ isbn:'1139' })" style="color:blue">Prism Peer Review Information</button>
```

```javascript
prismTitle({
   doi:   "abc/123/456/"
   modal: false
});
````
Peer Review data for title with doi `abc/123/456/` is rendered inline in elements with class `prism-widget` (default value) 

```javascript
prismTitle({
   isbn:     "1234567890"
   selector: "#mySelector"
   modal:    false
});
````
Peer Review data for title with isbn `1234567890` is rendered inline in the element with id `mySelector` 


    