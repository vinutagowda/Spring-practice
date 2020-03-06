package com.waq.training.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

//	List<UserP> users = new ArrayList<>(Arrays.asList(
//			new UserP("waq", "Srinagar", "male", "1"),
//			new UserP("umer", "Srinagar", "male", "2"),
//			new UserP("saba", "Srinagar", "female", "31"),
//			new UserP("Gargi", "Bangalore", "male", "4")
//			));
	
	@Autowired
	UserRepository userRepository;
	
	//Get: For returning all users
	List<UserP> getAllUsers(){
		
		return (List<UserP>)userRepository.findAll();
		
		//return users;
	}
	
	//Get : for returning a single user by id
	Optional<UserP> getUser(String id) {
		
		return userRepository.findById(id);
		
		//return users.stream().filter(ref -> ref.getUserId().equals(id)).findFirst().get();
	}

	//For adding the new user to List<User>
	public void addUser(UserP user) {
		
		userRepository.save(user);
		
		//users.add(user);
	}

	public void updateUser(UserP user, String id) {
		
		userRepository.save(user);
		
		
//		for(UserP u : users) {
//			if(u.getUserId().equals(id)) {
//				users.set(users.indexOf(u), user);
//			}
//		}
		
	}

	public void deleteUser(String id) {
		
		userRepository.deleteById(id);
		
//		for(UserP u : users) {
//			if(u.getUserId().equals(id)) {
//				users.remove(users.indexOf(u));
//				System.out.println(users.size());
//			}
//		}
		
	}
}
