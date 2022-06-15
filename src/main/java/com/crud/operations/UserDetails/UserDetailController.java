package com.crud.operations.UserDetails;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2")
public class UserDetailController {

    @Autowired
    public UserDetailsRepository userDetailsRepository;
    public UserDetails userDetails;

    @PostMapping("/add-details")
    private Object details(UserDetails userDetails) {
        return userDetailsRepository.save(userDetails);
    }

    @PostMapping("/delete-by-id")
    private String updateById(@RequestParam String email) {
        userDetailsRepository.deleteByEmail(email);
        return "user details deleted successfully";
    }

    @GetMapping("/get-user-details")
    private UserDetails userdetail(String email) {
      return   userDetailsRepository.getByEmail(email);
    }

}