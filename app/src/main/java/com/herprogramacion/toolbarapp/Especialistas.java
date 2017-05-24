package com.herprogramacion.toolbarapp;

/**
 * Created by Omar on 23/05/2017.
 */

public class Especialistas {
/*AQUÍ VAN LOS ESPECIALISTAS QUE TRATAN LAS ENFERMEDADES Y LAS FUENTES DE DONDE SE OBTUVO LA INFORMACIÓN*/

    static String especialista[] ={
            "•Pediatra: \n" +
                    "Brinda atención médica a los bebés, niños y adolescentes \n" +"\n" +
                    "•Medico de atención primaria:\n" +"\n" +
                    "Previene, diagnostica y trata enfermedades \n" + "\n" +
                    "•Dermatólogo: \n" +"\n" +
                    "Es especialista en las enfermedades de la piel, las uñas y el pelo.\n" + "\n"+
                    "•Nutriólogo: \n" +"\n" +
                    "Especialista en alimentación y nutrición \n" +"\n" +"\n" +
                    "•Fuente: CCM salud, Luque, A. y Marnet.",
/*Bronquitis*/
            ""
    };

    public static String getEspecialstas(int id) {
        return especialista[id];
    }
}
