package com.felipe.IoC.Controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.felipe.IoC.Models.Mascota;
import com.felipe.IoC.Services.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.felipe.IoC.Models.Publicacion;
import com.felipe.IoC.Models.User;

@Controller
public class PublicacionController {

    private final PublicacionService publicacionService;

    private final UserService userService;

    private final MascotaService mascotaService;

    private final TipoAnimalService tipoAnimalService;

    private final VacunaService vacunaService;



    public PublicacionController(PublicacionService publicacionService){
        this.publicacionService = publicacionService;
    }

    // para mostrar publicacion get
    @GetMapping("/publicacion")
    public String verPublicacion(@ModelAttribute("publicacion") Publicacion publicacion){
        return "publicacionver.jsp";
    }
    //para crear por post
    @PostMapping("/publicacion")
    public String crearPublicacionn(@Valid @ModelAttribute("publicacion") Publicacion publicacion,BindingResult result, HttpSession session){
        if (result.hasErrors()) {
            return "publicacionver.jsp";
        }
        Long id = (Long) session.getAttribute("publicacionId");
        Mascota mascota= MascotaService.getId
        publicacion.setUser(user);
        publicacionService.save(publicacion);
        return "redirect:/home";
    }

    //para borrar la publicacion
    @GetMapping("/publicacion/{id}/delete")
    public String deletePublic(@PathVariable("id")Long id){
        publicacionService.delete(id);
        return "redirect:/SecondChance";
    }

}


