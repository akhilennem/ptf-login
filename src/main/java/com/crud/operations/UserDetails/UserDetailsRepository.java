package com.crud.operations.UserDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {

    @Override
    Optional<UserDetails> findById(Integer integer);
@Query("select u from UserDetails u where u.email = ?1")
UserDetails getByEmail(String email);
   @Transactional
   @Modifying
   @Query("delete from UserDetails u where u.email = ?1")
   int deleteByEmail(String email);
}
