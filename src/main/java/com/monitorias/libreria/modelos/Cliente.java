package com.monitorias.libreria.modelos;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue
    @Column(name="idclientes")
    private Long id;

    @Column(name="nombres")
    private String nombres;

    @Column
    private String email;

    @Column(name="telefono")
    private String tel;


    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }



    public String getNombres(){
        return nombres;
    }

    public void setNombres(String nombres){
        this.nombres = nombres;
    }
}
