package com.greencity.software.development.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greencity.software.development.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
