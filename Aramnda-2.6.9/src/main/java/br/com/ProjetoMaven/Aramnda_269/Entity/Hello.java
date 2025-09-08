package br.com.ProjetoMaven.Aramnda_269.Entity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/wolrd")

public class Hello {
    @GetMapping
    public String hello() {
        return "Hello, World!";
    }
}
