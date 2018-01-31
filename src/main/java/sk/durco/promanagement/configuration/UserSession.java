package sk.durco.promanagement.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

@Configuration
public class UserSession implements Serializable{
    private static final long serialVersionUID = 1L;
    private String username;
    private Set<String> roles;




    public void setUserSession() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Set<String> roleSet = authentication.getAuthorities().stream().map(r -> r.getAuthority()).collect(Collectors.toSet());
        this.setRoles(roleSet);
        this.setUsername(authentication.getName());
    }
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public String getStringRoles() {
        String helpRole = "";
        Iterator<String> iterator = roles.iterator();
        while(iterator.hasNext()) {
            helpRole += iterator.next() + ", ";
        }
        return helpRole;
    }

    @Override
    public String toString() {
        return "User{ username: " + getUsername() + "; "
                +"rola(e): "+ getStringRoles()
                + '}';
    }
}
