package com.yamanaka.todo.todoapi.controller;

import com.yamanaka.todo.todoapi.domain.Users;
import com.yamanaka.todo.todoapi.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UsersController {

    private final UsersService usersService;

    @GetMapping("/{user_id}")
    public ResponseEntity<Users> findById(@PathVariable Long user_id) {
        Optional<Users> users = usersService.findById(user_id);
        return new ResponseEntity<>(users.get(), HttpStatus.OK);
    }
}
