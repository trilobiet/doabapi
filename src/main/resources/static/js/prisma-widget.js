//fetch('https://directory.doabooks.org/rest/peerReviews?doi=10.3998/tfcp.13240726.0001.001')
//    .then((response) => response.json())
//    .then((json) => console.log(json));
    
document.addEventListener('DOMContentLoaded', () => {
  if (document.querySelector('.changelog')) {
        function file_get_contents(filename) {
            fetch(filename).then((resp) => resp.text()).then(data => {
                // Optional, replace the H1 heading with nothing,
                // as I do not need it on my static website
                data = data.replace(/<h1>(.*?)<\/h1>/ig, "");

                // Initialize the document parser
                const parser = new DOMParser();
                let doc = parser.parseFromString(data, 'text/html');

                // Get the <body> element content
                let body = doc.querySelector('body').innerHTML;

                // Replace my empty element with the retrieved content
                document.querySelector('.changelog').innerHTML = body;
            });
        }

        // Call the function and point it to my GitHub Pages page
        file_get_contents('https://www.gov.uk/bank-holidays.json');
    }
});
