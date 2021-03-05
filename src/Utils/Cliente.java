package Utils;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public String nombre;
    public String usuario;
    public String correo;
    public String pais;
    public int edad;
    public List<Cancion> canciones;

    public Cliente (String nombre, String usuario, String correo, String pais, int edad){
        this.nombre = nombre;
        this.usuario = usuario;
        this.correo = correo;
        this.pais = pais;
        this.edad = edad;
        this.canciones = new ArrayList<Cancion>();
    }

    public void suscribirse_album (Artista artista){
        System.out.println("- Te haz suscrito al album de "+ artista.seudonimo + "\n");
        this.canciones.addAll(artista.album);
    }

    public void suscribirse_individuales (Artista artista){
        System.out.println("- Te haz suscrito al album de canciones individuales de "+ artista.seudonimo + "\n");
        this.canciones.addAll(artista.individuales);
    }

    public void suscribirse_colaboraciones (Artista artista){
        System.out.println("- Te haz suscrito al album canciones colaborativas de "+ artista.seudonimo + "\n");
        this.canciones.addAll(artista.colaboracion);
    }

    public void anadir_cancion (Cancion cancion){
        System.out.println("- Haz añadido a tu PlayList la cancion: " + cancion.titulo + "\n");
        this.canciones.add(cancion);
    }

    public void Mi_Playlist (){
        int i = 1;
        System.out.println("-------------------------------------------------------------------------------"+"\n"+ "PlayList de " +
                usuario + "\n" + "-------------------------------------------------------------------------------");

        for (Cancion c: this.canciones) {
            System.out.println(i+"."+c.titulo +" " +c.duracion + "\n"+ c.artista + " " + c.genero +" "+"\n");
            i+=1;
        }
    }
}
