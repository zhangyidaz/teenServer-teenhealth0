package teenhealth.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


public interface MyUserDetailsService extends UserDetailsService {
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
