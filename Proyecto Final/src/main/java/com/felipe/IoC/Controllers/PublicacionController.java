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

    private final AnimalesService animalService;

    private final TipoAnimalService tipoAnimalService;

    private final VacunaService vacunaService;

    private final PersonalidadService personalidadService;


    public PublicacionController(PublicacionService publicacionService, UserService userService,
                                 AnimalesService animalService, TipoAnimalService tipoAnimalService,
                                 VacunaService vacunaService, PersonalidadService personalidadService) {
        this.publicacionService = publicacionService;
        this.userService = userService;
        this.animalService = animalService;
        this.tipoAnimalService = tipoAnimalService;
        this.vacunaService = vacunaService;
        this.personalidadService = personalidadService;
    }

    // para mostrar publicacion get
    @GetMapping("/publicacion")
    public String crearPublicacion(@ModelAttribute("publicacion") Publicacion publicacion){
        return "publicacionver";
    }
    //para crear por post
    @PostMapping("/publicacion")
    public String crearPublicacionn(@Valid @ModelAttribute("publicacion") Publicacion publicacion,BindingResult result, HttpSession session){
        if (result.hasErrors()) {
            return "publicacionver";
        }
        Long id = (Long) session.getAttribute("userId");
        User user = userService.findById(id);
        publicacion.setUser(user);
        publicacionService.save(publicacion);
        return "redirect:/home";
    }

    // @PostMapping("/publicacion/new")
    // public String createPublicaaa(@Valid @ModelAttribute("publicacion") Publicacion publicacion, BindingResult result, HttpSession session){
    //     if(result.hasErrors()){
    //         return "publicacionver.jsp";
    //     } else {
    //         Long id = (Long) session.getAttribute("userId");
    //         User user = userService.findById(id);
    //         publicacionService.save(publicacion);
    //         return "redirect:/";
    //     }
    //para mostrar todas en lista
    //@GetMapping("/verPublicaciones")
    //public String verPublicaciones(@ModelAttribute("publicacion")Publicacion publicacion,Model model){
    //    List<Publicacion> publicacionn = publicacionService.mostrarPublicaciones();
    //    model.addAttribute("publicacion", publicacionn);
    //    return "home.jsp";
    //}
    //para borrar la publicacion
    @GetMapping("/publicacion/{id}/delete")
    public String deletePublic(@PathVariable("id")Long id){
        publicacionService.delete(id);
        return "redirect:/SecondChance";
    }

    //@GetMapping("/home")
    //public String mostrarPublicacion(Model model, HttpSession session){
    //    Long userId = (Long) session.getAttribute("userId");
    //    User user = userService.findById(userId);
   //     List<Animal> animales = animalService.findAll();
   //     model.addAttribute("user", user);
   //     model.addAttribute("animalesItems", animales);
   //     return "home";
   // }

    @GetMapping("/")
    public String home(@ModelAttribute ("user")User user, Model model){
        List<Mascota> publicaciones = animalService.findAll();
        model.addAttribute("animalesItems", publicaciones);
        return "home.jsp";
    }

}


