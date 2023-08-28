
function loadWidget(url, selector) {

	fetch(url)
		.then(response => response.text())
		.then(data => {
			const parser = new DOMParser();
			let doc = parser.parseFromString(data, 'text/html');
			let body = doc.querySelector('body').innerHTML;
			// console.log(body)
			document.querySelector(selector).innerHTML = body;
		});
}

function prismPublisherName(name, selector='.prism-widget') {

	let url = "https://widget.doabooks.org/prism/html/publisher?name=" + name;
	loadWidget(url)
};

function prismPublisherId(id, selector='.prism-widget') {

	let url = "https://widget.doabooks.org/prism/html/publisher?id=" + id;
	loadWidget(url)
};

function prismTitleDOI(doi, selector='.prism-widget') {

	let url = "https://widget.doabooks.org/prism/html/title?doi=" + doi;
	loadWidget(url)
};

function prismTitleISBN(isbn, selector='.prism-widget') {

	let url = "https://widget.doabooks.org/prism/html/title?isbn=" + isbn;
	loadWidget(url)
};

