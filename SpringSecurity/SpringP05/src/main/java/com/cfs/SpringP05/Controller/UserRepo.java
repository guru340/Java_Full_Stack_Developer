package com.cfs.SpringP05.Controller;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<AppUser,Long> {
    Optional<AppUser> findbyUsername(String name);
}
