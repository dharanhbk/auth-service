package com.digitalhut.auth.service;

import com.digitalhut.auth.dao.RoleDao;
import com.digitalhut.auth.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
