function addToCart(productId) {
    $.ajax({
        type: 'POST',
        url: '/api/bucket/addProductToBucket',
        data: {
            productId: productId
        },
        success: function(response) {
            console.log('Товар успешно добавлен в корзину');
            // При необходимости можно выполнять другие действия после добавления товара в корзину, например, обновление интерфейса корзины
        },
        error: function(xhr, status, error) {
            console.error('Ошибка добавления товара в корзину:', error);
        }
    });
}