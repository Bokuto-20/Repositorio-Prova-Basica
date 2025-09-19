package br.com.ProjetoMaven.Aramnda_269;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager UserManager(){
        UserDetails user = User.withUsername("Beta")
        .password("{noop}123")
        .roles("USER")
        .build();

        UserDetails admin = User.withUsername("Alpha")
        .password("{noop}456")
        .roles("ADMIN")
        .build();

        return new InMemoryUserDetailsManager(user, admin);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
        .csrf(csrf -> csrf.disable())
        .authorizeHttpRequests(auth -> auth
        .requestMatchers("/leads/**").hasAnyRole("USER", "ADMIN")
        .requestMatchers("/admin/**").hasRole("ADMIN")
        .anyRequest().authenticated()
        )
        .httpBasic();
        return http.build();
    }
}
    
