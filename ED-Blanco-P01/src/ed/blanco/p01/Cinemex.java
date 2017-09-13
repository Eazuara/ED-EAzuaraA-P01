/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.blanco.p01;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eazuara
 * @param <S>
 */
public class Cinemex  {
 
   ArrayList<Sala> S=new ArrayList<Sala>();
   
     public void registrar(){
        Scanner R = new Scanner(System.in);
        
        
        String pelicula = null;
        ffor(int j = 0; j<7; j++) S.add(new Sala(j + 1));
        for(int i = 0; i<2; i++){
          System.out.println("Ingrese el nombre de la película.");
            String movie = R.next();
     }
        for(int j=0; j<7;j++){
            System.out.println("Introduzca el nombre de la pelicula");
         
            for(int i=0; i<7 ; i++){
            S.get(i).addFuncion(pelicula);//Se introduce la pelicula al array
            int x = S.get(i).Fetch(pelicula);
            System.out.println("Introduzca el numero de personas que visito esta pelicula en la sala no."+(i+1));
            int visitas = R.nextInt();//Depues se pide el numero de visitas
            S.get(i).P.get(x).setVisitas(visitas);
     }
        }
     }
     
     void combinacion(){//Metodo para sacar la Relacion Pelicula-Visitas
         for(Sala sala:S){
             System.out.println("La pelicula mas vista en la sala" + sala.getNum() + "es" + sala.mostViewed() + "con" + sala.getVisitas() + "Visitas");
         }
     }
}
    
    

