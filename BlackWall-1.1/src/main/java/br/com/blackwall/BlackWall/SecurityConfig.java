package br.com.blackwall.BlackWall;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableMethodSecurity
@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
        UserDetails admin = User.builder()
                .username("admin")
                .password(encoder.encode("1234"))
                .roles("ADMIN")
                .build();

        UserDetails operador = User.builder()
                .username("operador")
                .password(encoder.encode("1234"))
                .roles("OPERADOR")
                .build();

        return new InMemoryUserDetailsManager(admin, operador);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // desabilita CSRF para testes com POST/PUT via Postman
                .authorizeHttpRequests(auth -> auth
                .requestMatchers("/publico/**").permitAll() // rota liberada
                .requestMatchers("/admin/**").hasRole("ADMIN") // rota só admin
                .requestMatchers("/operador/**").hasRole("OPERADOR") // rota só operador
                .anyRequest().authenticated()
                )
                .formLogin(form -> form.permitAll()) // habilita login via formulário
                .httpBasic(); // habilita autenticação básica

        return http.build();
    }

}
