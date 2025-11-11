package com.freq.arvand.springsecurity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long> {
    @Query("select e from UserEntity e where e.userName = :userName")
    UserEntity findByUsername(@Param("userName") String username)throws Exception;
    UserEntity findByUserId(Long userId);
}
