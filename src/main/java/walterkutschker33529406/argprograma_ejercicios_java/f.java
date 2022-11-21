package walterkutschker33529406.argprograma_ejercicios_java;

public class f {

    public static void cls(){
        
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static int max(int[] vector){
      
        int numero_maximo = 0;
        
        for (int i = 0; i < 15; i++) {
        
            if (vector[i] >= numero_maximo) {
                
                numero_maximo=vector[i];
                
            }
            
        }
        
        return numero_maximo;
        
    }
    
    public static int min(int[] vector){
      
        int numero_minimo = 99;
        
        for (int i = 0; i < 15; i++) {
            
         
            if (vector[i] <= numero_minimo) {
                
                numero_minimo=vector[i];
            }
            
        }
        
        return numero_minimo;
       
    }
    
    



}
