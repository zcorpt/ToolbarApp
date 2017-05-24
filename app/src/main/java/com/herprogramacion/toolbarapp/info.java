package com.herprogramacion.toolbarapp;

/**
 * Created by Omar on 22/05/2017.
 */

public class info {

    static String info1[] = {
/*Acné*/
            "El acné es una enfermedad inflamatoria cutánea que se produce cuando los folículos pilosos se llenan de grasa y células muertas de la piel.",
/*Bronquitis*/
            "La bronquitis aguda es una infección respiratoria a corto plazo a la que se suele denominar “resfriado de pecho” \n" +
                    "Los bronquios se extienden por la tráquea, toman aire del exterior y lo envían a los pulmones. \n" +
                    "Cuando hay bronquitis, los bronquios se inflaman y producen más mucosidad.\n"+"\nTIPOS\n" +
                    "Bronquitis Aguda, Infección del tracto respiratorio inferior, Resfriado de pecho\n",
/*Brucelosis*/
            "La brucelosis es una enfermedad producida por el bacilo gram negativo del género Brucella.\n" + "\n",
/*Caspa*/
            "La dermatitis seborreica es una afección crónica de la piel que causa un sarpullido escamoso con comezón.” \n" +
                    "Se caracteriza por la presencia leve de escamas blancas o un sarpullido escamoso rojizo o grasoso y amarillento. \n" +
                    "Las zonas comúnmente afectadas son:\n+" +
                    "•\t el cuero cabelludo\n" +
                    "•\tla parte posterior y exterior de las orejas, las cejas\n"

    };


    public static  String getInfo(int id) {
        return info1[id];
    }
}
