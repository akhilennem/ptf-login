package com.crud.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1")
public class UserController {

 int verify = 921313232;

    @Autowired
    UserRepository userRepository;
    User user;


//    Scanner scanner = new Scanner(System.in);
//    int valid = scanner.nextInt();

    @PutMapping("/add-user")
    private User validation( User user) {
        if (verify==(user.confirmation_code)) {
            System.out.println("verified and attendance marked");
            return userRepository.save(user);


        } else {
            System.out.println("Confirmation code is wrong");
        }
        return null;
    }





    @DeleteMapping("/delete-user")
    public String deleteUser(@RequestParam int id) {
        userRepository.deleteById(id);
        return "Deleted";
    }

    @GetMapping("/find-by-email")
    public Iterable<User> getUser(@RequestParam String email )
    {
    return userRepository.findByEmail(email);


    }

    @GetMapping("/get-users")
    public Iterable<User> getUsers()
    {
   return userRepository.findAll();
    }

    @GetMapping("/find-by-name")

    public Iterable<User> getByName(@RequestParam String name)
    {
        System.out.println(name);


        return userRepository.findByName(name);


    }
    @GetMapping("/find-by-date")

    public Iterable<User> getByDate(@RequestParam String date )
    {



        return userRepository.findAllByDate(LocalDate.parse(date));


    }

/*
    @PutMapping("/absent")
    private User absent( User user) {

            System.out.println("Leave marked Successfully");
            return userRepository.save(user);

    }
*/


}



