package com.example.ejemploHerencia1;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private ComidaRepository repository;

    @PostConstruct
    public void test(){

        repository.save(Comida.builder()
                        .nombre("Tostá")
                        .esFrio(false)
                        .tipo("Desayuno")
                        .precio(1.3f)
                        .build()); //Tenemos que ver cómo hacer que coja la herencia
    }
}
