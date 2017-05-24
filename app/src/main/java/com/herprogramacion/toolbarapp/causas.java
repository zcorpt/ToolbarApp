package com.herprogramacion.toolbarapp;

/**
 * Created by Omar on 23/05/2017.
 */

public class causas {
    /*AQUÍ VAN LAS CAUSAS Y SÍNTOMAS DE DE LA ENFERMEDAD*/

    static String causas1[] = {
/*Acné*/
            "Principalmente aparecen la adolescencia afectando el 80% debido a una interacción entre hormonas, sebo y bacterias que viven sobre la piel o dentro de ella y también en el cabello. \n" + "\n" +
                    "SINTOMAS\n" + "\n" +
                    "Se puede manifestar con varios tipos de lesiones pueden ser inflamatorias y no inflamatorias. \n" +
                    "Inflamatorias \n" +
                    "•\tPápulas rojizas \n" +
                    "•\tPústulas \n" +
                    "•\tNodulos \n" +
                    "•\tQuistes \n" +
                    "No inflamatorias \n" +
                    "•\tComedones cerrados y abiertos \n" +
                    "•\tPuntos negros \n" + "\n",
/*Bronquitis*/
            "En la mayoría de los casos, la bronquitis aguda surge a causa de una infección vírica.\n" +
                    "En ocasiones, puede surgir por una infección bacteriana.\n" +
                    "\nSÍNTOMAS\n" +
                    "La bronquitis aguda puede causar lo siguiente:\n" +
                    "•\tTos, con o sin esputo.\n" +
                    "•\tAumento de la producción de esputo.\n" +
                    "•\tDificultad para respirar.\n" +
                    "•\tTSibilancia.\n" +
                    "•\tTambién puede haber otros síntomas de gripe o de resfriado, como fiebre baja, dolor de garganta y congestión nasa.\n"+"Los factores que pueden aumentar el riesgo de contraer bronquitis aguda incluyen lo siguiente:\n" +
                    "•\tTener unresfriadoogripe.\n" +
                    "•\tEstar en contacto con personas que tengan una infección respiratoria vírica o bacteriana.\n" +
                    "•\tSer fumador pasivo.\n" +
                    "•\tTabaquismo.\n" +
                    "•\tAsma.\n" +
                    "•\tExposición a inhalantes respiratorios en el trabajo.\n"

    };

    public static String getCausas(int id) {
        return causas1[id];
    }
}
