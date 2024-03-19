package com.example.projeto1.service;

import com.example.projeto1.entity.Pessoa;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    public Pessoa buscarPessoa(){
        Pessoa p = new Pessoa(1L,"Iury Rodrigues","A-");
        p.setId(1L);
        p.setNome("Iury Rodrigues");

        return p;
    }
}
