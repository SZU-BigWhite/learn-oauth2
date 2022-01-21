package com.bigwhite.oauth2.details;

import lombok.Data;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Data
@ToString
public class ClientDetailsImpl implements ClientDetails {

    String clientId;

    Set<String> resourceIds;

    boolean secretRequired;

    String clientSecret;

    boolean scoped;

    Set<String> scope;

    Set<String> authorizedGrantTypes;

    Set<String> registeredRedirectUri;

    Collection<GrantedAuthority> authorities;

    Integer accessTokenValiditySeconds;

    Integer refreshTokenValiditySeconds;

    Map<String, Object> additionalInformation;

    @Override
    public boolean isAutoApprove(String scope) {
        return false;
    }

    public ClientDetailsImpl(String clientId, String clientSecret, Set<String> registeredRedirectUri, Set<String> authorizedGrantTypes, Set<String> scope) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.registeredRedirectUri = registeredRedirectUri;
        this.authorizedGrantTypes = authorizedGrantTypes;
        this.scope = scope;
        // authorities can't be null
        authorities = new HashSet<>();
    }

    @Override
    public String getClientSecret() {
        return clientSecret;
    }

    public ClientDetailsImpl() {
    }
}
