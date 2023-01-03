package com.felipe.IoC.Services;

import com.felipe.IoC.Models.Personalidad;
import com.felipe.IoC.Repositories.BaseRepository;
import com.felipe.IoC.Repositories.PersonalidadRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonalidadService extends BaseService<Personalidad>{
    private final PersonalidadRepository personalidadRepository;

    public PersonalidadService(BaseRepository<Personalidad> baseRepository, PersonalidadRepository personalidadRepository) {
        super(baseRepository);
        this.personalidadRepository = personalidadRepository;
    }
}
