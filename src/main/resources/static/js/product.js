function getProductList() {
    return fetch("http://localhost:63342/api/product/getProductList")
        .then((response) => response.json())
        .then((json) => console.log(json));
}
getProductList({});


// const requestURL = 'http://localhost:63342/api/bucket/addProductToBucket';
// const addToWishlistBtn = document.querySelector('.card-btn');
//
// // Добавление обработчика события клика на кнопку
// addToWishlistBtn.addEventListener('click', function() {
//     // Выполнение функции при клике на кнопку
//     sendRequest();
// });
//
// function sendRequest(method, url, body = null) {
//     return new Promise((resolve, reject) => {
//         const xhr = new XMLHttpRequest()
//
//         xhr.open(method, url)
//
//         xhr.responseType = 'json'
//
//         xhr.setRequestHeader('Content-Type', 'application/json')
//
//         xhr.onload = () => {
//             if (xhr.status >= 400) {
//                 reject(xhr.response)
//             } else {
//                 resolve(xhr.response)
//             }
//         }
//         xhr.onerror = () => {
//             reject(xhr.response)
//         }
//         xhr.send(JSON.stringify(body))
//     })
// }
// sendRequest('POST', requestURL, body)
//     .then(data => console.log(data))
//     .catch(err => console.log(err))
//
// // sendRequest('GET', requestURL)
// //     .then(data => console.log(data))
// //     .catch(err => console.log(err))
//
//
//
//
//
//
























// function fetchProducts() {
//     fetch('/api/product/getProductList')
//         .then(response => response.json())
//         .then(products => {
//             const productList = document.getElementById('productList');
//
//             productList.innerHTML = '';
//
//             products.forEach(product => {
//                 const listItem = document.createElement('li');
//                 listItem.textContent = product.name;
//                 productList.appendChild(listItem);
//             });
//         })
//         .catch(error => {
//             console.error(error);
//         });
// }
//
// function addProduct(event) {
//     event.preventDefault();
//
//     const productName = document.getElementById('productName').value;
//     const productCategory = document.getElementById('productCategory').value;
//
//     fetch('/addProduct', {
//         method: 'POST',
//         headers: {
//             'Content-Type': 'application/json'
//         },
//         body: JSON.stringify({
//             name: productName,
//             category: productCategory
//         })
//     })
//         .then(response => response.json())
//         .then(newProduct => {
//             const productList = document.getElementById('productList');
//             const listItem = document.createElement('li');
//             listItem.textContent = newProduct.name;
//             productList.appendChild(listItem);
//
//             document.getElementById('productName').value = '';
//             document.getElementById('productCategory').value = '';
//
//             alert('Product added successfully!');
//         })
//         .catch(error => {
//             console.error(error);
//         });
// }
//
// document.getElementById('addProductForm').addEventListener('submit', addProduct);
// fetchProducts();



