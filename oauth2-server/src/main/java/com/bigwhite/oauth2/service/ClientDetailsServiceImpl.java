package com.bigwhite.oauth2.service;

import com.bigwhite.oauth2.details.ClientDetailsImpl;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ClientDetailsServiceImpl implements ClientDetailsService {

    List<ClientDetailsImpl> clientDetails;

    @PostConstruct
    public void initData() {
        this.clientDetails=new ArrayList<>();

        Set<String> scope=new HashSet<>();
        scope.add("all");

        Set<String> authorizedGrantTypes=new HashSet<>();
        authorizedGrantTypes.add("authorization_code");
        authorizedGrantTypes.add("password");
        authorizedGrantTypes.add("refresh_token");

        Set<String> registeredRedirectUri=new HashSet<>();
        registeredRedirectUri.add("http://www.baidu.com");

        ClientDetailsImpl clientDetail = new ClientDetailsImpl("admin", new BCryptPasswordEncoder().encode("123456"),registeredRedirectUri,authorizedGrantTypes,scope);

        this.clientDetails.add(clientDetail);
    }

    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        for(ClientDetailsImpl clientDetail:clientDetails){
            if(clientDetail.getClientId().equals(clientId))
                return clientDetail;
        }
        throw new RuntimeException("can't find this client:"+clientId);
    }
}
