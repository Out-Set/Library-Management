package com.sawanlibrary.projectlibrarymanagement.Service;

import com.sawanlibrary.projectlibrarymanagement.Entity.Book;
import com.sawanlibrary.projectlibrarymanagement.Entity.User;
import com.sawanlibrary.projectlibrarymanagement.Repository.IssuedBookRepository;
import com.sawanlibrary.projectlibrarymanagement.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Register a User
    public User regUser(User user){
        return userRepository.save(user);
    }

    // Register a List of Users
    public List<User> regUsers(List<User> users){
        return userRepository.saveAll(users);
    }

    // Get all Users
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    // Get a User by Id
    public User getUserById(int id){
        return userRepository.findById(id);
    }

    // Update a User
    public User updateUser(User user){
        User existingUser;
        existingUser = userRepository.findById(user.getId());

        existingUser.setEmail(user.getEmail());
        existingUser.setMobileNo(user.getMobileNo());
        existingUser.setName(user.getName());

        return userRepository.save(existingUser);
    }

    // Delete a User
    public String deleteById(int id){
        userRepository.deleteById(id);
        return "Record Deleted";
    }
}
