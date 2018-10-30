package com.alizalang.opt.Controller;


import com.alizalang.opt.Model.User;
import com.alizalang.opt.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/{id}")
    public User readUserById(@PathVariable("id") long id) {
        return userRepository.getOne(id);
    }

    @PutMapping
    public void updateUser(@RequestBody User user){
        userRepository.save(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestBody User user){
        userRepository.delete(user);
    }

}
