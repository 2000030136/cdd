package com.klef.jfsd.springboot.repository;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query("from User where user_email=?1")
	public List<User> findByEMAIL(String email);
	
	@Query("from User where user_email=?1 and user_pass=?2")
	public User findByUsernamePassword(String username,String password);

}
