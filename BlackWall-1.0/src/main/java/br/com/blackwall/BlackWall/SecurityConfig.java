package br.com.blackwall.BlackWall;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import br.com.blackwall.BlackWall.BlackWall_DTO.Operador.OPGet;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailService() {
        PasswordEncoder encoder = passwordEncoder();
        UserDetails admin = User.withUsername("admin")
                .password(encoder.encode("123"))
                .roles("ADMIN")
                .build();

        UserDetails user = User.withUsername("user")
                .password(encoder.encode("456"))
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(admin, user);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                //só USER e ADMIN podem ver e criar
                .requestMatchers(HttpMethod.GET, "/blackwall/**").hasAnyRole("USER", "ADMIN")
                .requestMatchers(HttpMethod.POST, "/blackwall/**").hasAnyRole("USER", "ADMIN")
                //sÓ ADMIN poder alterar ou deletar
                .requestMatchers(HttpMethod.PUT, "/blackwall/**").hasRole("ADMIN")
                .requestMatchers(HttpMethod.DELETE, "/blackwall/**").hasRole("ADMIN")
                .anyRequest().authenticated()
                )
                .httpBasic();

        return http.build();
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
