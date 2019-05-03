package com.danieldev.api.service;

import java.util.List;

import com.danieldev.api.models.Role;

public interface RoleService {

	public List<Role> findAll();
	public Role create(Role role);
	public Boolean delete(Long id);
}
