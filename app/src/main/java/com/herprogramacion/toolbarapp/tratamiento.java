package com.herprogramacion.toolbarapp;

/**
 * Created by Omar on 23/05/2017.
 */

public class tratamiento {

    static String tratamiento1[] = {
            "Inducción de cremas, productos de limpieza, así como antibióticos y alimentación. \n" + "\n" +
                    "Medicamentos\n" + "\n" +

                    "•\tAntiinflamatorios: \n" +
                    "Previene o contrarresta la hinchazón (inflamación) en las articulaciones y los tejidos.\n" + "\n"
                    +				"•\tAntibiótico:\n" +
                    "Detiene el crecimiento de microorganismos en la piel que pueden causar una infección.\n" + "\n"+
                    "•\tAntiséptico tópico \n" +
                    "Destruye o proviene el crecimiento de microorganismos en la piel que pueden causar una infección \n" + "\n"+
                    "Cuidado personal \n" + "\n"+
                    "•\tPeróxido de benzoilo, ácido salicílico: \n" +
                    "Medicamento de uso tópico que reduce las bacterias que causan el acné y dañan la piel. \n" + "\n"+
                    "•\tJabón antibacteriano:\n" +
                    "Limpia la piel y reduce el riesgo de infección \n" + "\n" +
                    "Alimentación\n" + "\n" +
                    "Aunque una determinada dieta no va eliminar el problema, lo más aconsejable es llevar una dieta equilibrada, sin abusar de alimentos grasos, procesados o refinados. \n" + "\n"+
                    "•\tVitamina A:\n" +
                    "Ayuda al alto poder antinflamatorio es un remedio contra las bacterias que causan el acné.\n" + "\n"+
                    "•\tBeta caroteno, vitamina c y vitamina E: \n" +
                    "Mantiene la piel sana por su alto contenido de antioxidantes. \n" + "\n",
/*Bronquitis*/
            "Para ayudar a reducir las probabilidades de contraer bronquitis aguda, tome las siguientes medidas:\n" +
                    "•\tMantenga una buena higiene de las manos, en especial si está en contacto con alguien que está enfermo.\n" +
                    "•\tEvite el contacto con personas que padezcan infecciones respiratorias víricas o bacterianas.\n" +
                    "•\tSi fuma, hable con su médico sobre cómo puede dejar de hacerlo. El humo disminuye la resistencia de los pulmones a las infecciones y extiende el tiempo de recuperación.\n"
    };

    public static String getTratamiento(int id) {
        return tratamiento1[id];
    }
}
