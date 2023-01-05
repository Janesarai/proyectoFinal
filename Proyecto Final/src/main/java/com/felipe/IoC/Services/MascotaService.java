package com.felipe.IoC.Services;

import org.springframework.stereotype.Service;

import com.felipe.IoC.Models.Mascota;
import com.felipe.IoC.Repositories.MascotaRepository;
import com.felipe.IoC.Repositories.BaseRepository;

@Service
public class MascotaService extends BaseService<Mascota>{

    private final MascotaRepository animalesRepository;

    public MascotaService(BaseRepository<Mascota> baseRepository, MascotaRepository animalesRepository) {
        super(baseRepository);
        this.animalesRepository = animalesRepository;
    }

    

    
}
