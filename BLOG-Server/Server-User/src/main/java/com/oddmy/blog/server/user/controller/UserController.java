package com.oddmy.blog.server.user.controller;

import com.oddmy.blog.server.user.pojo.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO description
 *
 * @author fish
 * @date 2019/10/29 9:37
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping
    public ResponseEntity<User> getUserInfo() {
        User user = new User();
        user.setName("xiaoyu");
        return ResponseEntity.ok().body(user);
    }

}
