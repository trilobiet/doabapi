# Prism widget for Directory of Open Access Books (DOAB)

Use this widget on your web pages to show [PRISM Peer Review Information](https://www.doabooks.org/en/article/prism) for publishers and titles.

-----

### TLDR

If you just want to implement the widget on your website, head over to [Widget implementation in HTML](#widget-implementation-in-html).    

#### Table of Contents
* [Response format JSON or HTML](#response-format-json-or-html)
* [Publisher data](#publisher-data)   
* [Title Data](#title-data)   
* [Widget implementation in HTML](#widget-implementation-in-html)    
* [Function reference for prism-widget.js](#function-reference-for-prism-widgetjs)


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
<div class="prism">

   <h1 class="prism-hdr">
      <span class="prism-hdr-text">Peer Review Information</span> 
      <span class="prism-hdr-for">for</span>
      <span class="prism-hdr-publisher">University of Michigan Press</span>
   </h1>

   <h2 class="prism-hdr-sub">
      The publisher has registered with DOAB Prism the Peer Review Process for
      <span>3</span> 
      Peer Review types:
   </h2>    
   
   <ol class="prism-prs">
   
      <li class="prism-pr">
      
         <dl class="prism-pr-fields">
         
            <dt class="prism-pr-field fld-what">What</dt>
            <dt class="prism-pr-field-desc fld-what">What is being reviewed?</dt> 
            <dd class="prism-pr-field-value fld-what">Full text</dd>

            <dt class="prism-pr-field fld-who">Who</dt> 
            <dt class="prism-pr-field-desc fld-who">Who conducts the peer review?</dt> 
            <dd class="prism-pr-field-value fld-who">External peer reviewer</dd>

            <dt class="prism-pr-field fld-how">How</dt>
            <dt class="prism-pr-field-desc fld-how">What is the level of anonymity?</dt> 
            <dd class="prism-pr-field-value fld-how">Double-blind</dd>

            <dt class="prism-pr-field fld-when">When</dt>
            <dt class="prism-pr-field-desc fld-when">At what stage is the peer review being conducted?</dt> 
            <dd class="prism-pr-field-value fld-when">Pre-publication</dd>

            <dt class="prism-pr-field-desc fld-overseen">Peer review is overseen by:</dt>
            <dd class="prism-pr-field-value fld-overseen">Scientific or Editorial Board</dd>
            
         </dl>
         
      </li>
   
      <li class="prism-pr">
      
         <dl class="prism-pr-fields">
         
            <dt class="prism-pr-field fld-what">What</dt>
            <dt class="prism-pr-field-desc fld-what">What is being reviewed?</dt> 
            <dd class="prism-pr-field-value fld-what">Proposal</dd>

            <dt class="prism-pr-field fld-who">Who</dt> 
            <dt class="prism-pr-field-desc fld-who">Who conducts the peer review?</dt> 
            <dd class="prism-pr-field-value fld-who">External peer reviewer</dd>
 
            <dt class="prism-pr-field fld-how">How</dt>
            <dt class="prism-pr-field-desc fld-how">What is the level of anonymity?</dt> 
            <dd class="prism-pr-field-value fld-how">Double-blind</dd>

            <dt class="prism-pr-field fld-when">When</dt>
            <dt class="prism-pr-field-desc fld-when">At what stage is the peer review being conducted?</dt> 
            <dd class="prism-pr-field-value fld-when">Pre-publication</dd>

            <dt class="prism-pr-field-desc fld-overseen">Peer review is overseen by:</dt>
            <dd class="prism-pr-field-value fld-overseen">Publisher</dd>
            
         </dl>
         
      </li>
   
      <li class="prism-pr">
      
         <dl class="prism-pr-fields">
         
            <dt class="prism-pr-field fld-what">What</dt>
            <dt class="prism-pr-field-desc fld-what">What is being reviewed?</dt> 
            <dd class="prism-pr-field-value fld-what">Proposal</dd>

            <dt class="prism-pr-field fld-who">Who</dt> 
            <dt class="prism-pr-field-desc fld-who">Who conducts the peer review?</dt> 
            <dd class="prism-pr-field-value fld-who">Internal editor</dd>

            <dt class="prism-pr-field fld-how">How</dt>
            <dt class="prism-pr-field-desc fld-how">What is the level of anonymity?</dt> 
            <dd class="prism-pr-field-value fld-how">All identities known</dd>

            <dt class="prism-pr-field fld-when">When</dt>
            <dt class="prism-pr-field-desc fld-when">At what stage is the peer review being conducted?</dt> 
            <dd class="prism-pr-field-value fld-when">Pre-publication</dd>

            <dt class="prism-pr-field-desc fld-overseen">Peer review is overseen by:</dt>
            <dd class="prism-pr-field-value fld-overseen">Books or series editor</dd>
            
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
<div class="prism">

   <h1 class="prism-hdr">
      <span class="prism-hdr-text">Peer Review Information</span> 
      <span class="prism-hdr-for">for</span>
      <span class="prism-hdr-title">A Heart Beating Hard</span>
   </h1>

   <h2 class="prism-hdr-sub">
      The publisher has registered with DOAB Prism the Peer Review Process for
      <span>1</span> 
      Peer Review type:
   </h2>    
   
   <ol class="prism-prs">
   
      <li class="prism-pr">
      
         <dl class="prism-pr-fields">
         
            <dt class="prism-pr-field fld-comments">Review Comments</dt>
            <dd class="prism-pr-field-value fld-comments">The proposal was selected by the acquisitions editor who invited a full manuscript. The full manuscript was reviewed by two external readers using a double-blind process. Based on the acquisitions editor recommendation, the external reviews, and their own analysis, the Executive Committee (Editorial Board) of U-M Press approved the project for publication.</dd>
         
            <dt class="prism-pr-field fld-what">What</dt>
            <dt class="prism-pr-field-desc fld-what">What is being reviewed?</dt> 
            <dd class="prism-pr-field-value fld-what">Full text</dd>

            <dt class="prism-pr-field fld-who">Who</dt> 
            <dt class="prism-pr-field-desc fld-who">Who conducts the peer review?</dt> 
            <dd class="prism-pr-field-value fld-who">External peer reviewer</dd>

            <dt class="prism-pr-field fld-how">How</dt>
            <dt class="prism-pr-field-desc fld-how">What is the level of anonymity?</dt> 
            <dd class="prism-pr-field-value fld-how">Double-anonymised</dd>

            <dt class="prism-pr-field fld-when">When</dt>
            <dt class="prism-pr-field-desc fld-when">At what stage is the peer review being conducted?</dt> 
            <dd class="prism-pr-field-value fld-when">Pre-publication</dd>

            <dt class="prism-pr-field-desc fld-overseen">Peer review is overseen by:</dt>
            <dd class="prism-pr-field-value fld-overseen">Scientific or Editorial Board</dd>
            
         </dl>
         
      </li>
   
   </ol>

</div>
```


## Widget implementation in HTML

Using the REST API at `https://widget.doabooks.org/prism/rest/` JSON data can be requested to display PRISM data in your web sites' content in any way you want, applying any layout and styling of your own making.

To keep things a bit simpler though, a script is available that renders HTML output from `https://widget.doabooks.org/prism/html/...` in your web sites' DOM using a standardized layout. Three ways of including the widget are described here.


### 1: PRISM data in a modal popup

A modal popup shows the requested PRISM data in an overlay window after the site visitor performs some action, like clicking a link, a button or an image. A modal popup does not interfere with your sites' layout, though it requires an action to be initiated by the visitor to show the data. 

<p align="center">
  <img width="400" height="auto" alt="PRISM modal widget"
     src="https://raw.githubusercontent.com/trilobiet/prism-widget/main/readme-pix/prism-modal-01.png">
  <img width="400" height="auto" alt="PRISM modal widget revealed"
     src="https://raw.githubusercontent.com/trilobiet/prism-widget/main/readme-pix/prism-modal-02.png">
</p>


#### Steps to follow for installation:

1. Copy the prism-widget.js script tag to the HTML head tag just before the closing tag `<\head>`:   
    
   ```html
   <script src="https://widget.doabooks.org/resources/js/prism-widget.js"></script>
   ```

3. Create one or more elements with an onClick event. These elements can then be clicked to open a modal popup:
    
   ```html
   <button onclick="prismPublisher({id:'1139',modal:true})">
      PRISM Peer Review Information
   </button>
   ```
    
   For an overview of available functions and their arguments, see below at [Function reference for prism-widget.js](#function-reference-for-prism-widgetjs).


#### Displaying a list of modal widgets for multiple titles

The example images below show a page with multiple buttons for modal display of PRISM data. Clicking a button toggles the visibility of the appropriate data.

<p align="center">
  <img width="400" height="auto" alt="PRISM list of modal widgets"
     src="https://raw.githubusercontent.com/trilobiet/prism-widget/main/readme-pix/prism-modal-list-01.png">
  <img width="400" height="auto" alt="PRISM list of modal widgets, modal revealed"
     src="https://raw.githubusercontent.com/trilobiet/prism-widget/main/readme-pix/prism-modal-list-02.png">
</p>


### 2: PRISM data as inline loaded HTML

Inline loaded HTML directly shows the requested PRISM data in the web page, without the need for any user action. Inline loaded HTML changes the page layout by inserting extra content. Already at the sites' level available CSS styling will be applied to the inserted PRISM content as well. Two extra style sheets can be included to control layout and typeface of the inserted data, which you can choose to override with your own styles, or leave out entirely.

<p align="center">
  <img width="500" height="auto" alt="PRISM widget in an iframe"
     src="https://raw.githubusercontent.com/trilobiet/prism-widget/main/readme-pix/prism-inline-01.png">
</p>

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

2. Create one or more elements that serve as regions for PRISM data to be inserted:

   ```html 
   ...   
   <div id="p1139"></div>
   ...   
   ...   
   <div id="p1140"></div> 
   ...
   ```   
 
3. Include a script just before the closing `</body>` tag to populate the regions defined at step 2:

   ```javascript
   <script>
      prismTitle({ isbn:'9780123456789', modal:false, selector:'#p1139' })    
      prismTitle({ isbn:'9780123456789', modal:false, selector:'#p1140' })
   </script>
   ```
    
   For an overview of available functions and their arguments, see below at [Function reference for prism-widget.js](#function-reference-for-prism-widgetjs).


#### Displaying a list of inline widgets for multiple titles

In the example image below the regions are populated inline, but have default style `display:hidden`. Clicking a button or link toggles visibility.

<p align="center">
  <img width="500" height="auto" alt="PRISM list of widgets inline"
     src="https://raw.githubusercontent.com/trilobiet/prism-widget/main/readme-pix/prism-inline-list-01.png">
</p>


### 3: PRISM data in an iframe

Ultimately you can choose to statically include an iframe on your web page, with its `src` attribute set to the appropriate url.

```html
<iframe src="https://widget.doabooks.org/prism/html/publisher?id=1139" 
   width="100%" height="600"></iframe>
```
Of course there is always the possibility to hide and show the iframe in a modal or popup window using any custom javascript or javascript framework of your own choice.

<p align="center">
  <img width="500" height="auto" alt="PRISM widget in an iframe"
     src="https://raw.githubusercontent.com/trilobiet/prism-widget/main/readme-pix/prism-iframe-01.png">
</p>

## Function reference for prism-widget.js 

### Function `prismPublisher`

Request and show PRISM data for a publisher.

```javascript
function prismPublisher({
   name     = "",     
   id       = "",       
   selector = ".prism-widget", 
   modal    = true    
})
```

| parameter              |  type   | optional            | default value   |
| ---------------------- | ------- | ------------------- | --------------- |
| name                   | String  | yes<sup>1</sup>     |       ""        |
| id                     | String  | yes<sup>1</sup>     |       ""        | 
| selector<sup>2</sup>   | String  | yes                 | ".prism-widget" |
| modal                  | Boolean | yes                 |       true      |

<small>
  <sup>1</sup> One of `name` and `id` must be present. When both are present, `id` is ignored. When none is present `id` is set "".   
  <sup>2</sup> `selector` is ignored when `modal` is `true`.
</small>

#### Example usage

```javascript
prismPublisher({
   id: "1139"
});
````
Peer Review data for publisher with id `1139` is rendered as a modal popup (default behaviour). An HTML element is needed to open the modal popup, e.g.:

```html
<button onclick="prismPublisher({ id:'1139' })">
   Prism Peer Review Information
</button>
```

```javascript
prismPublisher({
   id:    "1139",
   modal: false
});
````
Peer Review data for publisher with id `1139` is rendered inline in elements with class `prism-widget` (default value) 

```javascript
prismPublisher({
   id:       "1139",
   selector: "#mySelector",
   modal:    false
});
````
Peer Review data for publisher with id `1139` is rendered inline in the element with id `mySelector` 


### Function `prismTitle`

Request and show PRISM data for a title.

```javascript
function prismTitle({
   doi      = "",
   isbn     = "",
   selector = ".prism-widget",
   modal    = true 
})
```

| parameter              |  type   | optional            |  default value  |
| ---------------------- | ------- | ------------------- | --------------- |
| doi                    | String  | yes<sup>1</sup>     |       ""        |
| isbn                   | String  | yes<sup>1</sup>     |       ""        | 
| selector<sup>1</sup>   | String  | yes                 | ".prism-widget" |
| modal                  | Boolean | yes                 |       true      |

<small>
  <sup>1</sup> One of `doi` and `isbn` must be present. When both are present, `isbn` is ignored. When none is present `isbn` is set "".   
  <sup>2</sup> `selector` is ignored when `modal` is `true`.
</small>
 
#### Example usage

```javascript
prismTitle({
   isbn: "9780123456789"
});
````
Peer Review data for title with isbn `9780123456789` is rendered as a modal popup (default behaviour). An HTML element is needed to open the modal popup, e.g.:

```html
<button onclick="prismTitle({ isbn:'9780123456789' })">
   Prism Peer Review Information
</button>
```

```javascript
prismTitle({
   doi:   "10.1000/abcd.2000.1234",
   modal: false
});
````
Peer Review data for title with doi `10.1000/abcd.2000.1234` is rendered inline in elements with class `prism-widget` (default value) 

```javascript
prismTitle({
   isbn:     "9780123456789",
   selector: "#mySelector",
   modal:    false
});
````
Peer Review data for title with isbn `9780123456789` is rendered inline in the element with id `mySelector` 


    