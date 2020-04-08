package com.melchior.helpdesk.api.security.jwt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.melchior.helpdesk.api.security.entity.User;
import com.melchior.helpdesk.api.security.enums.ProfileEnum;

public class JwtUserFactory {
	
	private JwtUserFactory() {
    }

    public static JwtUser create(User user) {
        return new JwtUser(
                user.getId(),
                user.getEmail(),
                user.getPassword(),
                mapToGrantedAuthorities(user.getProfile())
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(ProfileEnum profileEnum) {
    		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>(); 
    		authorities.add(new SimpleGrantedAuthority(profileEnum.toString())); 
    		return   authorities ;
    }
}
