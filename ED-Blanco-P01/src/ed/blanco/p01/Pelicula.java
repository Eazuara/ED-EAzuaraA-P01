/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.blanco.p01;

/**
 *
 * @author eazuara
 */
public class Pelicula <S> implements Comparable<Pelicula<S>> {
    String nombre;
    int visitas;
    

    public Pelicula(String nombre, int visitas) { //Constructor de la Clase
        this.nombre = nombre;
        this.visitas= visitas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {//Setters
        this.nombre = nombre;
    }

    public int getVisitas() {//Getters
        return visitas;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }

    @Override
    public int compareTo(Pelicula<S> o) {//Metodo de compareTO para las visitas
     if(this.getVisitas()<o.getVisitas()){ 
            return 1;                           
        }
        if(this.getVisitas()>o.getVisitas()){
            return -1;
        }
        return 0; 
    }
}

  

