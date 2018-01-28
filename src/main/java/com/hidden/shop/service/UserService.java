package com.hidden.shop.service;



import com.hidden.shop.dto.UserDTO;
import com.hidden.shop.entity.User;

import java.util.Optional;

public interface UserService extends org.springframework.security.core.userdetails.UserDetailsService {

    User update(User user, UserDTO params);
    Optional<User> findUser(Long id);
    User createUser(UserDTO userDTO);

}