package com.felipe.IoC.Models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "personalidad")
public class Personalidad extends Base{
    

    private String tipo_personalidad;

    private String nivel_energia;

    @OneToMany(mappedBy="personalidad", fetch = FetchType.LAZY)
    private List<Animal> animales;
    
}
