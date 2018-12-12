package com.yamanaka.todo.todoapi.controller;

import com.yamanaka.todo.todoapi.domain.Users;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class UsersResponse {

    private List<Users> users;
}
