package com.diegodsoliveira.airbnb_clone_back.user.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diegodsoliveira.airbnb_clone_back.user.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

  Optional<User> findOneByEmail(String email);

  Optional<User> findOneByPublicId(UUID publicId);

}
