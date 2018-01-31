package sk.durco.promanagement.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()
//                .antMatchers("/login").permitAll()
//                .antMatchers("/resource/**").permitAll()
//                .antMatchers("/home").hasAnyRole("PM", "VEDUCI", "BOSS")
                .anyRequest().permitAll()
                /*
                .and()

                .formLogin()
                .loginPage("/login")
                .failureUrl("/login?error")
                .successForwardUrl("/login_success")
                .passwordParameter("password")
                .usernameParameter("username")
                .and()

                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login?logout")
                .invalidateHttpSession(true)
                .deleteCookies("JSESSIONID")
                */
                ;


    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        //hierarchia
        //BOSS->PM->VEDUCI
        auth
                .inMemoryAuthentication()
                .withUser("tomasm").password("tomasm").roles("PM", "VEDUCI", "BOSS");
        auth
                .inMemoryAuthentication()
                .withUser("jurajbo").password("jurajbo").roles("VEDUCI");
        auth
                .inMemoryAuthentication()
                .withUser("bucek").password("bucek").roles("VEDUCI", "PM");

    }
}
