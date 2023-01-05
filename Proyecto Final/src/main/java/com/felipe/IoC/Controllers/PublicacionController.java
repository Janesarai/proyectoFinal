package com.felipe.IoC.Controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.felipe.IoC.Models.Mascota;
import com.felipe.IoC.Models.Publicacion;
import com.felipe.IoC.Models.User;
import com.felipe.IoC.Services.MascotaService;
import com.felipe.IoC.Services.PublicacionService;
import com.felipe.IoC.Services.UserService;


@Controller
public class PublicacionController{
    private final PublicacionService publicacionService;
    private final MascotaService mascotaService;
    private final UserService userService;

    public PublicacionController(PublicacionService publicacionService, MascotaService mascotaService, UserService userService){
        this.publicacionService = publicacionService;
        this.mascotaService = mascotaService;
        this.userService = userService;
    }
    

    // para ver el crear publicacion get
    @GetMapping("/publicacion")
    public String vercreaPublicacion(@ModelAttribute("publicacion") Publicacion publicacion){
        return "publicacionver.jsp";
    }
    //para crear publicacion mascota por post
    @PostMapping("/publucacion/nueva")
    public String crearPublicacion(@Valid @ModelAttribute("publicacion")Publicacion publicacion, BindingResult result, HttpSession session){
        if (result.hasErrors()) {
            return "publicacionver.jsp";
        }else{
            Long mascotaId = (Long)session.getAttribute("mascotauId");
            Mascota mascota = mascotaService.findById(mascotaId);
            publicacion.setMascota(null);
            publicacionService.save(publicacion);
            return "redirect:/";
        }
    }
    //para crear usuario publicacion por post
    // @PostMapping("/publucacion/nueva")
    // public String crearPublicacionu(@Valid @ModelAttribute("publicacion")Publicacion publicacion, BindingResult result, HttpSession session){
    //     if (result.hasErrors()) {
    //         return "publicacionver.jsp";
    //     }else{
    //         Long userId = (Long)session.getAttribute("userNamId");
    //         User user = userService.findById(userId)
    //         publicacion.setMascota(null);
    //         publicacionService.save(publicacion);
    //         return "redirect:/";
    //     }
    
    //para borrar la publicacion
    @GetMapping("/publicacion/{id}/delete")
    public String deletePublic(@PathVariable("id")Long id){
        publicacionService.delete(id);
        return "redirect:/SecondChance";
    }
}
