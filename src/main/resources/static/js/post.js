const addToWishlistBtn = document.querySelector('.card-btn');
addToWishlistBtn.addEventListener('click', function () {
    // Выполнение функции при клике на кнопку
    sendRequest();
});

function sendRequest() {
    return fetch("http://localhost:63342/api/bucket/addProductToBucket", {
        method: "POST",
        body: JSON.stringify({
            userId: 1,
            title: "Fix my bugs",
            completed: false
        }),
        headers: {
            "Content-type": "application/json; charset=UTF-8"
        }
    })
        .then((response) => response.json());
}

// fetch("http://localhost:63342/api/bucket/addProductToBucket", {
//     method: "POST",
//     body: JSON.stringify({
//         userId: 1,
//         title: "Fix my bugs",
//         completed: false
//     }),
//     headers: {
//         "Content-type": "application/json; charset=UTF-8"
//     }
// })
//     .then((response) => response.json())
//     .then((json) => console.log(json));
//
// const body = {
//     userId: 1,
//     title: "Fix my bugs",
//     completed: false
// };
// $.post("http://localhost:63342/api/bucket/addProductToBucket", body, (data, status) => {
//     console.log(data);
// });