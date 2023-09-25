//Создание пользователя:

$.ajax({
    url: '/user/addUser',
    type: 'POST',
    contentType: 'application/json',
    data: JSON.stringify({
        name: 'Dima', age: 28, email: 'dmitriy.spynu@list.ru'
    }),

    success: function (response) {
        console.log(response);
    },
    error: function (error) {
        console.log(error);
    }
});

//Получение списка всех пользователей:

$.ajax({
    url: '/user/getUserList',
    type: 'GET',
    success: function (response) {
        console.log(response);
    },
    error: function (error) {
        console.log(error);
    }
});

// Обновление пользователя:

$.ajax({
    url: '/user/updateUser',
    type: 'PUT',
    contentType: 'application/json',
    data: JSON.stringify({
        id: 1, name: 'Dima', password: 'admin',
        gender: 'male', age: 28, email: 'dmitriy.spynu@list.ru', role: 'ADMIN',
    }),
    success: function (response) {
        console.log(response);
    },
    error: function (error) {
        console.log(error);
    }
});

// Удаление пользователя:

$.ajax({
    url: '/user/1',
    type: 'DELETE',
    success: function (response) {
        console.log(response);
    },
    error: function (error) {
        console.log(error);
    }
});