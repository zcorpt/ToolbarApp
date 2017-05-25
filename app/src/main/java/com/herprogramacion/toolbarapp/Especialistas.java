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
            "Neumólogo: \n" +
                    "Es el médico especialista en diagnosticar y tratar los padecimientos del aparato respiratorio, principalmente aquellas que se originan en los bronquios, pulmones y pleura, membrana que recubre a los pulmones.",

//Brucelosis
            "Infectologo: \n" +
                    "Trata las infecciones, incluidas las de origen tropical \\n\" +\n" +
                    "Neurólogo: \\n\" +\n" +
                    "Trata los trastornos del sistema nervioso \n" + "\n" +
                    "Médico de atención primaria: \n" +"\n" +
                    "Previene, diagnostica y trata enfermedades.\n" +"\n" +
                     "\n" +
                    "Fuente: MedlinePlus, Vega C. y colaboradores.",

//CASPA//
            "•Dermatólogo: \n" +
                    "Es especialista en las enfermedades de la piel, las uñas y el pelo.",

//Cirrosis
            "•\tHepatólogo\n" +
                    "Es especialista en los trastornos del hígado.\n" +
                    "•\tGastroenterólogo\n" +
                    "Especialista en el aparato digestivo\n" +
                    "•\tMédico de atención primaria \n" +
                    "Previene, diagnostica y trata enfermedades.\n" +
                    "•\tNutriólogo \n" +
                    "Especialista en alimentación y nutrición\n" +
                    "•\tEspecialista en medicina de urgencias \n" +
                    "Trata los pacientes de urgencias.\n" +
                    "\n" + "Fuente: NIH y MedlinePlus.",

//DEPRESION//
            "psiquiatra: \n" +
            "Se encarga de diagnosticar y tratar las enfermedades mentales abordándolos prioritariamente desde su parte fisiológica ya sea prescribiendo medicación u otro tipo de intervención médica que sea necesaria a fin de equilibrar la bioquímica del cerebro y reparar o compensar la fisiología que este deteriorada, teniendo siempre en cuenta las variables psicológicas que hay que abordar para el completo restablecimiento del paciente."
            + "\n" +
                    "El Psicólogo: \n"+
                    "se encarga de evaluar y tratar las enfermedades y los desordenes mentales abordándolos desde la rehabilitación psicológica, es decir interviniendo de forma externa para modificar ciertos funcionamientos cerebrales disfuncionales.",

//HIPERTENSION ARTERIAL
            "Cardiólogo: \n" +
                    "Especialista en trastornos cardiacos \n" +
                    "Médico de atención primaria: \n" +"\n" +
                    "Previene, diagnostica y trata enfermedades.\n" +"\n" +
                    "Nutriólogo: \n" +"\n" +
                    "Especialista en la alimentación y nutrición.  \n"+ "\n" +
                    "Fuente: MedlinePlus.",



    };

    public static String getEspecialstas(int id) {
        return especialista[id];
    }
}
