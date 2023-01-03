package com.felipe.IoC.Services;

import com.felipe.IoC.Models.Formulario;
import com.felipe.IoC.Repositories.FormularioRepository;

public class FormularioService extends BaseService<Formulario> {
    private final FormularioRepository formularioRepository;

    public FormularioService(FormularioRepository formularioRepository) {
        super(formularioRepository);
        this.formularioRepository = formularioRepository;
    }
}
