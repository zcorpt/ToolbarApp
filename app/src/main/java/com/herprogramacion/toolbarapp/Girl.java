package com.herprogramacion.toolbarapp;

import java.util.Random;

/**
 * POJO de las chicas
 */
public class Girl {

    private String name;
    private int idDrawable;
    public int index;



    public Girl(String name,int index) {
        this.name = name;//texto que aparece enfrente de la imagen
        this.index = index;//posición del arreglo para regresar las imágenes en el orden del arreglo
        this.idDrawable = getRandomGirlDrawable();// regresa las imágenes en el orden del arreglo
    }

    public String getName() {
        return name;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    /**
     * Asigna un drawable en forma aleatoria
     *
     * @return id del drawable
     */
    private int getRandomGirlDrawable() {
        Random rnd = new Random();

        ArrayImg aI = new ArrayImg();
        //int array[] = aI.getNewArray();





        switch (index) {
            default:
            case 0:
                return R.drawable.acne;
            case 1:
                return R.drawable.im_bonquitis;
            case 2:
                return R.drawable.brucelosi;
            case 3:
                return R.drawable.im_caspa;
            case 4:
                return R.drawable.cirrosis;
            case 5:
                return R.drawable.im_depresion;
            case 6:
                return R.drawable.esquema_diabetes2;
            case 7:
                return R.drawable.ex;
            case 8:
                return R.drawable.faringitis;
            case 9:
                return R.drawable.gastritis3;
            case 10:
                return R.drawable.gripe;
            case 11:
                return R.drawable.im_hepatitis;
            case 12:
                return R.drawable.hipertension;
            case 13:
                return R.drawable.im_insomnio;
            case 14:
                return R.drawable.leucemia_1;
            case 15:
                return R.drawable.malaria_1;
            case 16:
                return R.drawable.im_migra_a;
            case 17:
                return R.drawable.im_neuropatia;
            case 18:
                return R.drawable.orzuelo;
            case 19:
                return R.drawable.paperas;
            case 20:
                return R.drawable.im_pancreatitis;
            case 21:
                return R.drawable.quistes_ovaricos;
            case 22:
                return R.drawable.resfriado;
            case 23:
                return R.drawable.sida;
            case 24:
                return R.drawable.tacoma;
            case 25:
                return R.drawable.urticaria;
            case 26:
                return R.drawable.varicela;

        }

    }


    class ArrayImg{
        public int getNewArray(){
            int arrayImg[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
            int x=0, result=0;
            for (int i = 0; i < arrayImg.length; i++) {

                result = arrayImg[x];
                x++;
            }
            return result;
        }
        /*public int nextInt(){
            ArrayImg aI = new ArrayImg();
            int array[] = aI.getNewArray();
            int i, result=0;
            for (i = 0; i < array.length; i++) {
                result = array[i];

            }
            return result;
        }*/
    }
}


