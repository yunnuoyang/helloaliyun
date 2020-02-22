package com.joinx.controller;

import com.joinx.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
//   @CrossOrigin(origins = "http://localhost:8081", maxAge = 3600)
   @GetMapping("/hello")
   public String hello( User user){
      System.out.println("user = " + user);
//      System.out.println("id = " + id);
//      System.out.println("username = " + username);
      return "hello,aliyun";
   }
   @PostMapping("/post")
   public String post( User user){
      System.out.println("user = " + user);
//      System.out.println("id = " + id);
//      System.out.println("username = " + username);
      return "hello,aliyun+post";
   }
   @PutMapping("/put")
   public String put(User user){
      System.out.println("user  :put = " + user);
      return "hello.put";
   }
   @DeleteMapping("/delete")
   public String delete(User user){
      System.out.println("user  :delete = " + user);
      return "hello.delete";
   }
}
