package com.example.ejemploHerencia1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@SuperBuilder
@Getter @Setter
@MappedSuperclass
@NoArgsConstructor @AllArgsConstructor
public class Producto {

    @Id
    @GeneratedValue //No podremos usarlo como un id de producto, pero ambas tendrán un atributo id
    private Long id;

    private String nombre;
    private float precio;
}
