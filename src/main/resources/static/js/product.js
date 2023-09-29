const getProductListAll = document.querySelector('link');
getProductListAll.addEventListener('click', function () {
    getProductList();
})

function getProductList() {
    return fetch("/api/product/getProductList")
        .then((response) => response.json())
        .then((json) => console.log("получен ответ", json));
}


// const requestURL = '/api/bucket/addProductToBucket';
// const addToWishlistBtn = document.querySelector('.card-btn');
//
// // Добавление обработчика события клика на кнопку
// addToWishlistBtn.addEventListener('click', function() {
//     // Выполнение функции при клике на кнопку
//     const productId = this.dataset.productId;
//     const body = {
//         productId: productId
//     };
//
//
// function sendRequest(method, url, body = null) {
//     return new Promise((resolve, reject) => {
//         const xhr = new XMLHttpRequest();
//
//         xhr.open(method, url);
//
//         xhr.responseType = 'json';
//
//         xhr.setRequestHeader('Content-Type', 'application/json');
//
//         xhr.onload = () => {
//             if (xhr.status >= 400) {
//                 reject(xhr.response);
//             } else {
//                 resolve(xhr.response);
//             }
//         };
//         xhr.onerror = () => {
//             reject(xhr.response);
//         };
//         xhr.send(JSON.stringify(body));
//     });
// }
//     return sendRequest('POST', requestURL, body)
//         .then(data => console.log(data))
//         .catch(err => console.log(err));
// })

// sendRequest('GET', requestURL)
//     .then(data => console.log(data))
//     .catch(err => console.log(err))


const getProductById = document.querySelector('.product-thumb');
const requestURL = '/api/product/getProductById';
getProductById.addEventListener('click', function () {
    //
    const productId = this.dataset.productId;
    const requestBody = {
        productId: productId
    };
    sendRequest('GET', requestURL, requestBody)
        .then(data => console.log(window.location.href = 'card.html', data))
        .catch(err => console.log(err));
})


// const addToCartBtns = document.querySelectorAll('.card-btn');
// const requestURL = '/api/bucket/addProductToBucket';
// let cartItems = [];
//
// // Добавление обработчика события клика на все кнопки card-btn
// addToCartBtns.forEach(btn => {
//     btn.addEventListener('click', function () {
//         const productContainer = this.closest('.product-container');
//         const productId = productContainer.dataset.productId;
//         const productName = productContainer.querySelector('.product-name').textContent;
//         const productPrice = productContainer.querySelector('.price').textContent.replace('$', '');
//
//         const product = {
//             productId: productId,
//             name: productName,
//             price: parseFloat(productPrice)
//         };
//
//         cartItems.push(product);
//
//         const requestBody = {
//             productId: productId
//         };
//
//         sendRequest('POST', requestURL, requestBody)
//             .then(data => console.log("Товар успешно добавлен в корзину", data))
//             .catch(err => console.log("Произошла ошибка при попытке добавить товар в корзину", err));
//     });
// });
//
// function sendRequest(method, url, body = null) {
//     return new Promise((resolve, reject) => {
//         const xhr = new XMLHttpRequest();
//
//         xhr.open(method, url);
//
//         xhr.responseType = 'json';
//
//         xhr.setRequestHeader('Content-Type', 'application/json');
//         xhr.setRequestHeader('Accept', 'application/json');
//
//         xhr.onload = () => {
//             if (xhr.status >= 400) {
//                 reject(xhr.response);
//             } else {
//                 resolve(xhr.response);
//             }
//         };
//         xhr.onerror = () => {
//             reject(xhr.response);
//         };
//         xhr.send(JSON.stringify(body));
//     });
// }


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


// const requestURL = '/api/bucket/addProductToBucket';
// const addToCartBtns = document.querySelectorAll('.card-btn');
//
// function sendRequest(method, url, body = null) {
//     const headers = {
//         'Content-Type': 'application/json'
//     }
//     return fetch(url, {
//         method: method,
//         body: JSON.stringify(body),
//         headers: headers
//     }).then(response => {
//         return response.json()
//     })
// }
//
//
// // sendRequest('GET', requestURL)
// //     .then(data => console.log(data))
// //     .catch(err => console.log(err))
//
// const body = {
//     name: 'John',
//     age: 30
// }
//
// sendRequest('POST', requestURL, body)
//     .then(data => console.log(data))
//     .catch(err => console.log(err))


// const addButton = document.querySelector('.card-btn');
//
// function addToBucket() {
//     fetch('/api/bucket/addProductToBucket', {
//         method: 'POST',
//         body: JSON.stringify({productId: 1-20}),
//         headers: {
//             'Content-Type': 'application/json'
//         }
//     })
//         .then(response => response.json())
//         .then(data => {
//             console.log(data);
//             alert('Товар успешно добавлен в корзину!');
//         })
//         .catch(error => {
//             console.error('Ошибка:', error);
//             alert('Произошла ошибка при добавлении товара в корзину!');
//         });
// }
// addButton.addEventListener('click', addToBucket);

// POST метод для добавления товара в корзину
app.post('/api/bucket/addProductToBucket', (req, res) => {
    // Получаем данные из тела запроса
    const { productId } = req.body;

    // Получаем товар из базы данных или другого источника данных
    const product = getProductById(productId);

    // Проверяем, существует ли такой товар
    if (!product) {
        return res.status(404).json({ error: 'Товар не найден' });
    }

    // Добавляем товар в корзину
    bucket.push(product);

    // Возвращаем обновленную корзину в ответе
    res.json({ success: true, bucket });
});

// GET метод для получения данных корзины
app.get('/api/bucket', (req, res) => {
    // Возвращаем текущую корзину в ответе
    res.json(bucket);
});

// Получаем кнопку с классом "card-btn"
const addButton = document.querySelector('.card-btn');

// Функция для добавления товара в корзину
function addToBucket() {
    // Отправляем запрос на сервер с помощью метода fetch
    fetch('/api/bucket/addProductToBucket', {
        method: 'POST',
        body: JSON.stringify({ productId: 1 }), // Замените "1" на фактический идентификатор товара
        headers: {
            'Content-Type': 'application/json'
        }
    })
        .then(response => response.json())
        .then(data => {
            // Обработка ответа от сервера после успешного добавления товара в корзину
            console.log(data);
            alert('Товар успешно добавлен в корзину!');

            // Можете выполнять другие действия с корзиной, например, обновление отображения корзины
            updateBucket();
        })
        .catch(error => {
            // Обработка ошибок при выполнении запроса
            console.error('Ошибка:', error);
            alert('Произошла ошибка при добавлении товара в корзину!');
        });
}

// Функция для обновления отображения корзины
function updateBucket() {
    // Отправляем запрос на сервер для получения данных корзины
    fetch('/api/bucket')
        .then(response => response.json())
        .then(bucketData => {
            // Обработка данных корзины
            console.log(bucketData);
            // Можете обновить отображение корзины на странице, используя полученные данные
        })
        .catch(error => {
            // Обработка ошибок при выполнении запроса
            console.error('Ошибка:', error);
            alert('Произошла ошибка при обновлении корзины!');
        });
}

// Назначаем обработчик события "click" для кнопки
addButton.addEventListener('click', addToBucket);

// Вызовите функцию updateBucket() при загрузке страницы, чтобы получить данные текущей корзины и обновить ее отображение
window.addEventListener('load', updateBucket);