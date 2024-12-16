package sn.cisse410.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Ce champs est obligatoire")
    @Size(min = 2, message = "Saisir au minimum 2 caracteres")
    @Column(name = "first_name")
    private String firstName;

    @NotEmpty(message = "Ce champs est obligatoire")
    @Size(min = 2, message = "Saisir au minimum 2 caracteres")
    @Column(name = "last_name")
    private String lastName;

    @NotEmpty(message = "Ce champ est obligatoire")
    @Email(message = "Saisir um mail valide")
    private String email;
    private String phone;
}
