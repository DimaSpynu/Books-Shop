package com.example.BooksShop.service;

import com.example.BooksShop.dao.UserRepository;
import com.example.BooksShop.domain.ChildUser;
import com.example.BooksShop.domain.User;
import com.example.BooksShop.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Data
@Service
@AllArgsConstructor

public class UserServiceImpl {


    @Autowired
    private final UserRepository userRepository;

    public User createUser(UserDTO dto) {
        //Валидация входящего запроса.
        validation(dto);
        //Сохранить пользователя в базе данных
        //Вернуть созданного пользователя как результат выполнения метода

        return userRepository.save(User.builder()
                .name(dto.getName())
                .age(dto.getAge())
                .email(dto.getEmail())
                .build());
    }

    private void validation(UserDTO dto) {
        if (dto.getName() == null || dto.getName().isEmpty()) {
            throw new IllegalArgumentException("Error: Username is a required field!");
        }
        if (!isValidEmailAddress(dto.getEmail())) {
            throw new IllegalArgumentException("Error: Invalid email address!");
        }
    }

    private boolean isValidEmailAddress(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public List<User> readAll() {
        return userRepository.findAll();
    }

    public User update(User user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public User createdUser(User user) {
        User createdUser = new User();
        return user;
    }


}