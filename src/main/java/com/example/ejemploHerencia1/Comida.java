package com.example.ejemploHerencia1;

import lombok.*;
import lombok.experimental.SuperBuilder;
import net.bytebuddy.implementation.bind.annotation.Super;

import javax.persistence.Entity;

@Entity
@SuperBuilder
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Comida extends Producto{

    private boolean esFrio;

    private String tipo;

}
