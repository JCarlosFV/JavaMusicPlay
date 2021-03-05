package Application;

import Utils.Artista;
import Utils.Cancion;
import Utils.Cliente;


public class App {
    public static void main(String[] args){

        //CREAMOS AL ARTISTA
        Artista artista1 = new Artista("Alex Zurdo", "Alexis Vélez Alberio", 38, "Puerto Rico");
        Artista artista2 = new Artista("Julio Melgar","Julio Melgar",47,"Guatemala");
        Artista artista3 = new Artista("Alan Walker","Alan Olav Walker",23,"Reino Unido");

        //CREAMOS LAS CANCIONES
        Cancion cancion1 = new Cancion("Creo en Ti","Julio Melgar (feat Marcela Gandara)",2012,"6:25","Cristiana");
        Cancion cancion2 = new Cancion("Tus Cuerdas de Amor","Julio Melgar", 2001,"4:45","Cristiana");
        Cancion cancion3 = new Cancion("Eres mi Bendicion","Alex Zurdo (feat Funky)",2015,"3:47","Cristiana");
        Cancion cancion4 = new Cancion("Darkside", "Alan Walker (feat. Au/Ra and Tomine Harket)",2018,"4:00","Electronica");
        Cancion cancion5 = new Cancion("Faded","Alan Walker",2015,"3:33","Electronica");
        Cancion cancion6 = new Cancion("No Tengas Temor","Alex Zurdo",2012,"4:21","Cristiana");
        Cancion cancion7 = new Cancion("Te Busco","Alex Zurdo",2016,"3:47","Cristiana");
        Cancion cancion8 = new Cancion("Sin Ti","Alex Zurdo",2018,"4:40","Cristiana");
        Cancion cancion9 = new Cancion("No Cuenten Conmigo","Alex Zurdo",2018,"3:50","Cristiana");
        Cancion cancion10 = new Cancion("Fue por Mi","Alex Zurdo",2012,"4:27","Cristiana");
        Cancion cancion11 = new Cancion("A Pesar de Mi","Alex Zurdo (feat Redimi2, Funky, Un Corazon, Indiomar, Abby Valdez)",2021,"5:20","Cristiana");
        Cancion cancion12 = new Cancion("Ganas de Vivir","Alex Zurdo (feat Kike Pavon, Manny Montez)",2017,"4:46","Cristiana");
        Cancion cancion13 = new Cancion("Acá Entre Nos","Alex Zurdo (feat Funky, Redimi2)",2021,"4:20","Cristiana");
        Cancion cancion14 = new Cancion("Tengo Victoria","Alex Zurdo",2014,"3:08","Cristiana");

        //CREAMOS AL CLIENTE
        Cliente cliente1 = new Cliente("Juan Carlos","JCarlos1906","jcfunez14@gmail.com","Honduras",19);

        //ALBUM ARTISTA 1
        artista1.anadir_album(cancion3);
        artista1.anadir_album(cancion6);
        artista1.anadir_album(cancion7);
        artista1.anadir_album(cancion8);
        artista1.anadir_album(cancion9);
        artista1.anadir_album(cancion10);
        artista1.anadir_album(cancion11);
        artista1.anadir_album(cancion12);
        artista1.anadir_album(cancion13);
        artista1.anadir_album(cancion14);

        //INDIVIDUALES ARTISTA 1
        artista1.anadir_individuales(cancion6);
        artista1.anadir_individuales(cancion7);
        artista1.anadir_individuales(cancion8);
        artista1.anadir_individuales(cancion9);
        artista1.anadir_individuales(cancion10);
        artista1.anadir_individuales(cancion14);

        //COLABORACIONES ARTISTA 1
        artista1.anadir_colaboraciones(cancion3);
        artista1.anadir_colaboraciones(cancion11);
        artista1.anadir_colaboraciones(cancion12);
        artista1.anadir_colaboraciones(cancion13);

        //SUSCRIPCION DEL CLIENTE
        cliente1.suscribirse_colaboraciones(artista1);
        cliente1.suscribirse_individuales(artista1);

        cliente1.anadir_cancion(cancion1);
        cliente1.anadir_cancion(cancion4);
        cliente1.anadir_cancion(cancion5);

        artista1.mostrar_albumes();

        cliente1.Mi_Playlist();




    }
}
