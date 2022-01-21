package com.bigwhite.oauth2.controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;
import org.springframework.web.filter.DelegatingFilterProxy;

public class TestBeanController {
    public void SecurityMainObjectAndMainArchitecture() {
        DelegatingFilterProxy delegatingFilterProxy;
        FilterChainProxy filterChainProxy;
        SecurityFilterChain securityFilterChain;
    }

    public void AuthenticationMainObject() {
        SecurityContext securityContext = SecurityContextHolder.createEmptyContext();
        SecurityContextHolder securityContextHolder;
        Authentication authentication; // new UsernamePasswordAuthenticationToken(obj,obj);
        AuthenticationManager authenticationManager;
        UserDetails userDetails;
        GrantedAuthority grantedAuthority;
        UserDetailsService userDetailsService;
        ProviderManager providerManager;
        AuthenticationProvider authenticationProvider;
        DaoAuthenticationProvider daoAuthenticationProvider;
        AuthenticationEntryPoint authenticationEntryPoint;
        LoginUrlAuthenticationEntryPoint loginUrlAuthenticationEntryPoint;
        AbstractAuthenticationProcessingFilter abstractAuthenticationProcessingFilter;

    }
}
