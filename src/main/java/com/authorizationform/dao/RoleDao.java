package com.authorizationform.dao;

import com.authorizationform.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ruslan on 31.03.17.
 */
public interface RoleDao extends JpaRepository<Role, Long>{
}
