let cardItems = [];
const addToBucket = document.querySelector('.card__btn');
addToBucket.addEventListener('click', function () {
    sendRequest();
})

function sendRequest() {
    return fetch("http://localhost:8081/api/bucket/addProductToBucket", {
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