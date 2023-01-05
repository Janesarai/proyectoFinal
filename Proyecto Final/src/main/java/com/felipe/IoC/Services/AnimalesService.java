package com.felipe.IoC.Services;

import org.springframework.stereotype.Service;

import com.felipe.IoC.Models.Animal;
import com.felipe.IoC.Repositories.AnimalesRepository;
import com.felipe.IoC.Repositories.BaseRepository;

@Service
public class AnimalesService extends BaseService<Animal>{

    private final AnimalesRepository animalesRepository;

    public AnimalesService(BaseRepository<Animal> baseRepository, AnimalesRepository animalesRepository) {
        super(baseRepository);
        this.animalesRepository = animalesRepository;
    }

    

    
}
