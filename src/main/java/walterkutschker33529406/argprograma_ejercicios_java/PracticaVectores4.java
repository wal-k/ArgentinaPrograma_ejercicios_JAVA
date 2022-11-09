package walterkutschker33529406.argprograma_ejercicios_java;

import java.util.Arrays;

/**
 *
 * @author Walter Kutschker
 * 
 * @consigna: 4.En un vector de 23 posiciones se tienen las temperaturas máximas de las capitales de las 23 provincias argentinas en el último mes.
 * A partir de esta información, un noticiero desea determinar el top 5 de las temperaturas más altas para poder mostrar en la pantalla de su programa,
 *  para ello se necesita un programa que sea capaz de recorrer el vector de temperaturas, 
 *  determinar las 5 más altas y copiarlas en un nuevo vector de 5 posicionesea capaz de determinar cuál es la mayor edad y cuál es la menor edad que se encuentra entre los estudiantes.
 * 
 */
  


public class PracticaVectores4 {


    public static int[] nMax(int[] vector, int n) {

        int[] vec_maximos = new int[n];
        int[] vec_i_max = new int[n];

        for (int i = 0; i < n; i++) {
            vec_i_max[i] = -1;
        }

        int max_registrados = 0;
        int maximo_movible = vector[0];

        for (int i = 0; i < vector.length; i++) {
            
            if (vector[i] > maximo_movible){

                if (vec_i_max[max_registrados] != -1){

                    maximo_movible = f.max(vector);
                    
                    vec_i_max[max_registrados]=i;
                    
                    vec_maximos[max_registrados]=maximo_movible;
                    max_registrados +=1;


                }
            
                if (max_registrados == 5){

                return vec_maximos;
              
                }
       
            }
            
        }


        return vector;


    }



    public static void run () {
        
        System.out.println("EJERCICIO VECTORES 4");
        System.out.println(" ");

        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(nMax(nums,5)));



    }



    
}
