package com.yamanaka.todo.todoapi.controller;

import com.yamanaka.todo.todoapi.domain.Users;
import com.yamanaka.todo.todoapi.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UsersController {

    private final UsersService usersService;

    @GetMapping("/")
    public ResponseEntity<UsersResponse> findAll() {
        List<Users> users = usersService.findAll();
        UsersResponse usersResponse = UsersResponse.builder()
                .users(users)
                .build();
        return new ResponseEntity<>(usersResponse, HttpStatus.OK);
    }
}
