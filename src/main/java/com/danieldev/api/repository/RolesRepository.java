package com.danieldev.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danieldev.api.models.Role;

@Repository
public interface RolesRepository extends JpaRepository<Role, Long> {

}
