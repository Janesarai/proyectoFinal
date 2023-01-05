package com.felipe.IoC.Models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "publicacion")
public class Publicacion extends Base{

    @NotBlank
    @Size(message = "tu publicacion necesita un titulo")
    private String titulo;

    @NotBlank
    @Size(message = "falta agregar una descripcion")
    private String descripcion;


    @OneToOne(mappedBy="publicacion", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private Animal animales;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ciudad_id")
    private Ciudad ciudad;


    @OneToMany(mappedBy="publicacion", fetch = FetchType.LAZY)
    private List<Formulario> formularios;
    
}
