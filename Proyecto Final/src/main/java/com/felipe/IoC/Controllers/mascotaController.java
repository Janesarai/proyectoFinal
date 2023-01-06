package com.felipe.IoC.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.felipe.IoC.Models.Mascota;


    private final UserService userService;

    @GetMapping("/mis-mascotas")
    public mascotaController(PublicacionService publicacionService, MascotaService mascotaService, UserService userService){
        this.publicacionService = publicacionService;
        this.mascotaService = mascotaService;
        this.userService = userService;

        //Ahi tu lo haces funcionar
        //Esta es una estructura basica de controladores para base de datos
        //Listar
        //Visualizar
        //Agregar
        //Modificar
        //Eliminar

        @GetMapping("")
        public String mascotasTodas(){ //GET (Mostrar todas las mascotas asociadas al usuario)
            return "home2.jsp"; 
        }

        @GetMapping("/ver/{id_mascota}") //GET (Mostrar una mascota en especifico)
        public String visualizar(){
            return "home2.jsp";
        }

        @GetMapping("/agregar") //GET (Mostrar formulario de agregar)
        public String agregar(){
            return "home2.jsp";
        }

        @PostMapping("/agregar") //POST (Agregar a base de datos)
        public String visualizar(){
            return "home2.jsp";
        }

        @GetMapping("/modificar/{id_mascota}") //GET (Desplegar formulario de modificacion)
        public String visualizar(){
            return "home2.jsp";
        }

        @PostMapping("/modificar/{id_mascota}") //POST (Modificacion de una mascota en bd)
        public String visualizar(){
            return "home2.jsp";
        }

        @PostMapping("/eliminar/{id_mascota}") //POST (Eliminacion de una mascota,tiene q apreecer una notificacioln)
        public String visualizar(){
            return "home2.jsp";
        }

}

//para crear mascota por post
    @PostMapping("/publicacion")
    public Mascota crearPublicacion(Mascota mascota){
            return mascotaService.save(mascota);
        }
    }
