package br.com.erik.springbootjwt.controller;

import br.com.erik.springbootjwt.data.UserData;
import br.com.erik.springbootjwt.service.UserDetailServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserDetailServiceImpl userDetailsService;

    @GetMapping
    public List<UserData> listAllUsers(){
       return userDetailsService.listUsers();
   }


}
