package io.getarrays.SubmissionPortal.controller;

import io.getarrays.SubmissionPortal.Entity.User;
import io.getarrays.SubmissionPortal.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class logincontroller {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        User u = userRepo.findByUsername(user.getUsername());

        if (u != null && u.getPassword().equals(user.getPassword())) {
            return u;
        }
        return null;
    }
}
