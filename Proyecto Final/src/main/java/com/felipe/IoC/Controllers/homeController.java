package com.felipe.IoC.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.felipe.IoC.Services.MascotaService;
import com.felipe.IoC.Services.PublicacionService;
import com.felipe.IoC.Services.UserService;

@Controller
public class homeController {
    private final PublicacionService publicacionService;
    private final MascotaService mascotaService;
    private final UserService userService;

    public homeController(PublicacionService publicacionService, MascotaService mascotaService, UserService userService){
        this.publicacionService = publicacionService;
        this.mascotaService = mascotaService;
        this.userService = userService;
    }
    
    @GetMapping("/home2")
    public String home2(){
        return "home2.jsp";
    }
}
