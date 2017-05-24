package com.herprogramacion.toolbarapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Envoltura para generar una lista de ejemplo
 */
public class Girls {

    public static final String[] girlsNamesDummy = {
            "Acné", "Bronquitis", "Brucelosis", "Caspa", "Cirrosis",
            "Depresión", "Diabetes Tipo 2", "Esclerosis Multiple", "Faringitis", "Gastritis", "Gripe",
            "Hepatitis B", "Hipertensión Arterial", "Insomnio", "Leucemia", "Malaria", "Migraña",
            "Neuropatía", "Orzuelo", "Paperas", "Pancreatitis", "Quistes Ovaricos", "Resfriado", "VIH / SIDA",
            "Tracoma", "Urticaria", "Varicela"
    };

    /**
     * Genera una lista de objetos {@link Girl} con un tamaño determinado
     *
     * @param count Tamaño
     * @return Lista aleatoria
     */
    public static List<Girl> randomList(int count) {
        Random random = new Random();
        List<Girl> items = new ArrayList<>();

        // Restricción de tamaño
        count = Math.min(count, girlsNamesDummy.length);

        for (int i =0 ;i < count; i++) {//agrega el texto del array de arriba en el orden del index con "count"
            items.add(new Girl(girlsNamesDummy[i],i));
        }

        return new ArrayList<>(items);
    }
}
