const productContainers = [...document.querySelectorAll('.product-container')];
const nxtBtn = [...document.querySelectorAll('.nxt-btn')];
const preBtn = [...document.querySelectorAll('.pre-btn')];

// Прокрутка карточек
productContainers.forEach((item, i) => {
    let containerDimension = item.getBoundingClientRect();
    let containerWidth = containerDimension.width;

    nxtBtn[i].addEventListener('click', () => {
        item.scrollLeft += containerWidth;
    })

    preBtn[i].addEventListener('click', () => {
        item.scrollLeft -= containerWidth;
    })
})

// Получение кнопки по классу
var addToWishlistBtn = document.querySelector('.card-btn');

// Добавление обработчика события клика на кнопку
addToWishlistBtn.addEventListener('click', function() {
    // Выполнение функции при клике на кнопку
    addToBucket();
});

// Функция для добавления в корзину
function addToBucket() {
    // Создание экземпляра объекта XMLHttpRequest
    var xhr = new XMLHttpRequest();

    // Определение метода и URL для запроса
    xhr.open('POST', 'http://localhost:63342/api/bucket/addProductToBucket', true);

    // Добавление заголовка Content-Type
    xhr.setRequestHeader('Content-Type', 'application/json');

    // Отправка запроса
    xhr.send();

    // Обработка ответа
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4 && xhr.status === 200) {
            console.log('Товар успешно добавлен в корзину');
        }
    };
}







