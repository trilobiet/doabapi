
document.addEventListener('DOMContentLoaded', () => {
	
	document.head.appendChild(_cssLink("modal.css"));
	//document.head.appendChild(_cssLink("layout.css"));
	//document.head.appendChild(_cssLink("typeface.css"));
	
	var html = `
	  <div>
	    <span class="prism-modal-close" onclick=\"prismHideModal()\">&times;</span>
	    <iframe id="prism-iframe" src="" frameborder="0" width="100%" height="400px"></iframe> 
	  </div>
	`;
	
	var divmodal = document.createElement('div');
	divmodal.id = "prism-modal";
	document.body.appendChild(divmodal);
	divmodal.innerHTML = html;
	
	window.onclick = function(event) { 
		if (event.target == divmodal) { 
			prismHideModal(); 
		}
	}	
})	

function _cssLink(file) {
	
	var node = document.createElement('link');
		node.href = "https://widget.doabooks.org/resources/css/" + file;
        node.type = 'text/css';
        node.rel = 'stylesheet'; 
	
	return node;
}

function prismPublisher({
	name = "",
	id = "0",
	selector='.prism-widget',
	modal = true,
}) {
	
	if (name != "") url = "https://widget.doabooks.org/prism/html/publisher?name=" + name;
	else url = "https://widget.doabooks.org/prism/html/publisher?id=" + id;
	prismWidget(url, selector, modal)
}
	
function prismTitle({
	doi = "",
	isbn = "0",
	selector='.prism-widget',
	modal = true,
}) {
	
	if (doi != "") url = "https://widget.doabooks.org/prism/html/title?doi=" + doi;
	else url = "https://widget.doabooks.org/prism/html/title?isbn=" + isbn;
	prismWidget(url, selector, modal)
}

function prismWidget(url, selector, isModal=false) {
	
	if (isModal) prismShowModal(url)	
	else prismWriteInline(url, selector)
}

function prismShowModal(url) {
	
	if (document.getElementById('prism-modal')) {
		document.getElementById("prism-iframe").src = url;
		document.getElementById("prism-modal").style.display = 'block';
	}	
}

function prismHideModal() {
	
	if (document.getElementById('prism-modal')) {
		document.getElementById("prism-iframe").src = "about:blank";
		document.getElementById("prism-modal").style.display = 'none';
	}	
}

function prismWriteInline(url, selector) {
	
	fetch(url)
		.then(response => response.text())
		.then(data => {
			const parser = new DOMParser();
			let doc = parser.parseFromString(data, 'text/html');
			let body = doc.querySelector('body').innerHTML;
			document.querySelector(selector).innerHTML = body;
		});
}

