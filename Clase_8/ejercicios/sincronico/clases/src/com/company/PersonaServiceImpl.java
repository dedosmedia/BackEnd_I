package com.company;

import java.util.ArrayList;
import java.util.List;

public class PersonaServiceImpl {

    private List<Persona> personas = new ArrayList<>();


    public void guardarPersona(Persona persona){
        if( persona.eaMayorDeEdad() && persona.getNombre().length()>4 ) {
            personas.add(persona);
        }
    }



}
