package com.sampleMail.sampleMail.Repository;

import com.sampleMail.sampleMail.Bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDAO extends JpaRepository<User,String> {

    @Override
    Optional<User> findById(String s);
}
