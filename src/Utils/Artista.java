package Utils;

import java.util.ArrayList;
import java.util.List;

public class Artista {
    public String seudonimo;
    public String nombre;
    public int edad;
    public String nacionalidad;
    public List<Cancion> album;
    public List<Cancion> individuales;
    public List<Cancion> colaboracion;

    public Artista(String seudonimo, String nombre, int edad, String nacionalidad){
        this.seudonimo = seudonimo;
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.album = new ArrayList<Cancion>();
        this.individuales = new ArrayList<Cancion>();
        this.colaboracion = new ArrayList<Cancion>();
    }

    public void anadir_album (Cancion anadir_cancion){
        this.album.add(anadir_cancion);
    }

    public void mostrar_canciones (){
        int x = 1;
        System.out.println("-------------------------------------------------------------------------------"+"\n"+ "Canciones de " +
                seudonimo + "\n" + "-------------------------------------------------------------------------------");
        for (Cancion c: this.album) {
            System.out.println(x+"."+c.titulo +" " +c.duracion + "\n"+ c.artista +"\n");
            x += 1;
        }
    }

    public void anadir_individuales (Cancion anadir_a_individuales){
        this.individuales.add(anadir_a_individuales);
    }

    public void mostrar_individuales (){
        int y = 1;
        System.out.println("-------------------------------------------------------------------------------"+"\n"+ "Canciones Individuales de " +
                seudonimo + "\n" + "-------------------------------------------------------------------------------");
        for (Cancion c: this.individuales) {
            System.out.println(y+"."+c.titulo +" " +c.duracion + "\n"+ c.artista +"\n");
            y += 1;
        }
    }

    public void anadir_colaboraciones (Cancion anadir_a_colaboracioes){
        this.colaboracion.add(anadir_a_colaboracioes);
    }

    public void mostrar_colaboraciones (){
        int z = 1;
        System.out.println("-------------------------------------------------------------------------------"+"\n"+ "Colaboraciones de " +
                seudonimo + "\n" + "-------------------------------------------------------------------------------");
        for (Cancion c: this.colaboracion) {
            System.out.println(z+"."+c.titulo +" " +c.duracion + "\n"+ c.artista +"\n");
            z += 1;
        }
    }

    public void mostrar_albumes (){
        mostrar_canciones();
        mostrar_individuales();
        mostrar_colaboraciones();
    }
}
