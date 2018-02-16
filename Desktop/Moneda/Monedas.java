import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Write a description of class Monedas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Monedas
{
    //Aqui es donde se almacenaran mis monedas
    private ArrayList<Moneda> coleccionMonedas;
    // Este campo nos va servir de contador para que a cada objeto se le asigne por defecto un identificador. 
    private int id;

    /**
     * Constructor for objects of class Monedas
     */
    public Monedas(String lista)
    {
        // inicializacion de mi nuevo objecto
        coleccionMonedas = new ArrayList<Moneda>();
        id = 1;

        try {
            File dato = new File("lista.txt");
            Scanner sc = new Scanner(dato);
            while (sc.hasNextLine()) {
                String c = sc.nextLine();
                String[] cadena = (c.split(" # "));
                addMoneda((cadena[0]), Integer.parseInt(cadena[1]),Integer.parseInt(cadena[2]));
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * Metodo para añadir monedas a nuestra coleccion.
     */
    public void addMoneda(String nombre, int cantidad, int anno)
    {
        // Aqui añado mis monedas
        coleccionMonedas.add(new Moneda(nombre, cantidad, anno, id));
        id++;
    }

    /**
     * Muestra por pantalla todas las monedas que hay en la colección
     */
    public void mostrarColeccion()
    {
        int indice = 0;
        while(coleccionMonedas.size() > indice){
            System.out.println(coleccionMonedas.get(indice).getDetalles());
            indice++;
        }
    }

    /**
     * Metodo que elimina las monedas anteriores pasadas por parametro.
     */
    public void eliminaPorAnno(int annoMinimo)
    {
        Iterator<Moneda> ite = coleccionMonedas.iterator();
        while(ite.hasNext()){
            if(ite.next().getAnno() < annoMinimo) {
                ite.remove();
            }
        }
    }

    /**
     * Este metodo lo que hace es cambiar el tipo de moneda donde le indiquemenos en el indice
     */
    public void cambiaElTipoDeMoneda(int indice, String cambiarTipo)
    {
        if(coleccionMonedas.size() > 0){
            coleccionMonedas.get(indice).setNombre(cambiarTipo);
        }
    }

    /**
     * Ordenar alfabeticamente por tipo de moneda.
     *
    public void ordenarSegunTipo()
    {
    ArrayList<Moneda> copiaColeccion = (ArrayList<Moneda>) coleccionMonedas.clone();
    int contador = 0;
    while(copiaColeccion.size() != 0){
    Moneda primera = copiaColeccion.get(0);
    while(contador < copiaColeccion.size())
    {
    Moneda monedaActual = copiaColeccion.get(contador);
    if(monedaActual.getNombre().compareTo(primera.getNombre()) > 0)
    {
    primera = monedaActual;
    }
    contador++;
    }
    System.out.println(primera.getDetalles());
    //Eliminamos el objeto que hemos imprimido.
    coleccionMonedas.remove(primera);
    }
    }*/

}

