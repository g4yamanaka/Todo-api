package com.yamanaka.todo.todoapi.service;

import com.yamanaka.todo.todoapi.domain.Users;
import com.yamanaka.todo.todoapi.domain.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UsersRepository usersRepository;

    public Optional<Users> findById(Long user_id) {
        return usersRepository.findById(user_id);
    }
}
