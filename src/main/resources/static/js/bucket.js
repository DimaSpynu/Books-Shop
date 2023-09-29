let cartItems = [];// Массив для хранения товаров в корзине

// Функция для отображения товаров в корзине
function renderCartItems() {
    const cartItemsContainer = document.getElementById('cart-items');
    cartItemsContainer.innerHTML = '';

    cartItems.forEach((item, index) => {
        const cartItem = document.createElement('div');
        cartItem.classList.add('cart-item');

        const itemImg = document.createElement('img');
        itemImg.src = item.image;
        itemImg.alt = item.name;

        const itemName = document.createElement('span');
        itemName.innerText = item.name;

        const itemPrice = document.createElement('span');
        itemPrice.innerText = '$' + item.price.toFixed(2);

        const removeBtn = document.createElement('button');
        removeBtn.innerText = 'Удалить';
        removeBtn.addEventListener('click', () => removeFromCart(index));

        cartItem.appendChild(itemImg);
        cartItem.appendChild(itemName);
        cartItem.appendChild(itemPrice);
        cartItem.appendChild(removeBtn);


        cartItemsContainer.appendChild(cartItem);
    });
}

// Функция для обновления общей суммы заказа
function updateTotal() {
    const totalAmount = document.getElementById('total-amount');
    const totalPrice = cartItems.reduce((total, item) => total + item.price, 0);
    totalAmount.innerText = totalPrice.toFixed(2);
}

// Функция для добавления товара в корзину
function addToCart(item) {
    cartItems.push(item);
    renderCartItems();
    updateTotal();
}

// Функция для удаления товара из корзины
function removeFromCart(index) {
    cartItems.splice(index, 1);
    renderCartItems();
    updateTotal();
}

// Пример инициализации корзины и товаров
const book1 = { name: 'Книга 1', price: 9.99, image: 'img/1.png' };
const book2 = { name: 'Книга 2', price: 14.99, image: 'img/2.png' };

addToCart(book1);
addToCart(book2);

