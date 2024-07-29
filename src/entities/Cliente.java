package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
    private String nome;
    private String email;
    private LocalDate aniversario;
    
    
    //Constructor
    public Cliente(String nome, String email, LocalDate aniversario) {
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    
    //Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getAniversario() {
        return aniversario;
    }
    public void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }


    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", email=" + email + ", aniversario=" + aniversario + "]";
    }

    

    
}
