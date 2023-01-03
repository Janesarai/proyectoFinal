package com.felipe.IoC.Services;

import com.felipe.IoC.Models.Contacto;
import com.felipe.IoC.Repositories.ContactoRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactoService extends BaseService<Contacto> {

    private final ContactoRepository contactoRepository;

    public ContactoService(ContactoRepository contactoRepository) {
        super(contactoRepository);
        this.contactoRepository = contactoRepository;
    }
}
