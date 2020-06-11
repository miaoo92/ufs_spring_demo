package com.ufs.data.ufsdata.controller;

import com.ufs.data.ufsdata.dao.UserMapper;
import com.ufs.data.ufsdata.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Winston.xu
 * @date 2020/6/11
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @PostMapping
    public ResponseEntity addUser(@RequestBody  User user){
        int insert = userMapper.insert(user);
        return ResponseEntity.ok(user);
    }
}
