package ua.java_training.springboot_initial_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ua.java_training.springboot_initial_project.entity.User;
import ua.java_training.springboot_initial_project.entity.UserDetailsImpl;
import ua.java_training.springboot_initial_project.repository.UserRepository;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByLogin(login);

        user.orElseThrow(() -> new UsernameNotFoundException("Login " + login + " not found."));

        return user.map(UserDetailsImpl::new).get();
    }
}
