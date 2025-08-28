package br.com.edukacode.api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table (name = "lead")
@Entity(name = "Lead")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Lead {
    //import jakarta.persistence.*; - (Caso não queira importar um por um; mas pesa a memoria)
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private String telefone;

}