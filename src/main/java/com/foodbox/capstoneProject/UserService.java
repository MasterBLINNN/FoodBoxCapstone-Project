package com.foodbox.capstoneProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

        @Autowired
         private UserRepository userRepository;



        public User GetUserByName(String name) {
        	User user = userRepository.findByName(name);
        	if (user == null) {
        		throw new RuntimeException("User Not Found!");
        	}
        	return user;
        }
         
        public boolean ConfirmUserPassword(User user, String password) {
        	return(user.getPassword().equals(password));
        }
        
        public Iterable<User> GetAllUsers()
        {
            return userRepository.findAll();
        }

        
        public User RegisterUser(User user) {
        	
        	//TODO: Not doing any error checking
        	      	
        	
        	return userRepository.save(user);
        }
        
        

}