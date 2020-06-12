package com.ufs.data.ufsdata.controller;

import com.ufs.data.ufsdata.dao.impl.UserDaoImpl;
import com.ufs.data.ufsdata.model.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
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

    private UserDaoImpl userDao;

    @PostMapping
    @ApiOperation(value = "创建⽤户", notes = "根据User对象创建⽤户")
    @ApiImplicitParam(name = "user", value = "⽤户详细实体user", required = true, dataType = "User")
    public ResponseEntity addUser(@RequestBody User user) {
        int insert = userDao.insert(user);
        return ResponseEntity.ok(user);
    }

    @RequestMapping("/json")
    public String json() throws Exception {
        throw new Exception("发⽣错误");
    }
}
