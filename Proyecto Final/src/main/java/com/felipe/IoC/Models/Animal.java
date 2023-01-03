package com.felipe.IoC.Models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
@Entity
@Table(name = "animales")
public class Animal extends Base{

    @NotBlank
    @Size(min = 2 )
    private String nombre_mascota;

    @NotBlank
    private String tamano_mascota;

    @PastOrPresent
    private Date edad;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="publicacion_id")
    private Publicacion publicacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="personalidad_id")
    private Personalidad personalidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tipodeanimal_id")
    private TipoAnimal tipoDeAnimal;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "vacunas_animales", 
        joinColumns = @JoinColumn(name = "animal_id"), 
        inverseJoinColumns = @JoinColumn(name = "vacunas_id")
    )
    private List<Vacuna> vacunas;

    public Animal() {
    }

    public Animal(String nombre_mascota,String tamano_mascota,Date edad) {
        this.nombre_mascota = nombre_mascota;
        this.tamano_mascota = tamano_mascota;
        this.edad = edad;
    }


}
