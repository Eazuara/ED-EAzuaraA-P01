/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.blanco.p01;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author eazuara
 */
class Sala <S extends Pelicula>{
    int num;
    ArrayList<Pelicula>P = new ArrayList<Pelicula>();

    public Sala(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    
    void addFuncion(String nombre){//Metodo que se usara para añadir una Funcion a la Sala
        if(P.contains(nombre)){ // IF para ver si la pelicula ya se encuentra en el Arreglo
            System.out.println("La Pelicula"+nombre+"ya esta en una sala");
        }else P.add(new Pelicula(nombre));//Se Añade
    
}
 
    int Fetch(String nombre ){ // Clase de busqueda
        for(int i=0;i<P.size();i++){
            if(P.get(i).getNombre()==nombre){
                return i;
            }
        }
        return -1;
    }
    String mostViewed(){//Clase para sacar la pelicula mas vista
       Collections.sort(P);
       return P.get(0).getNombre();
    }
    
    int getVisitas(){ // Metodo para recivir el NUMERO de visitas 
        return P.get(0).getVisitas();
    }
    
    

    
}
