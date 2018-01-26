
/**
 * The test class MonedasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MonedasTest2
{
    /**
     * Default constructor for test class MonedasTest
     */
    public MonedasTest2()
    {
    }

    public void test1()
    {
        Monedas moneda1 = new Monedas();
        System.out.println("### Creamos un objeto moneda...");
        System.out.println("\n### Añadimos 4 monedas...");
        moneda1.addMoneda("Euros", 2, 1995);
        moneda1.addMoneda("Euros", 2, 2000);
        moneda1.addMoneda("Libras", 10, 2015);
        moneda1.addMoneda("Pesos", 1, 2000);

        System.out.println("\n### Mostramos todas las monedas...");
        moneda1.mostrarColeccion();

        System.out.println("\n### Eliminamos las monedas que tengan un año anterior al pasado por parametro...");
        moneda1.eliminaPorAnno(2000);        
        System.out.println("\n### Comprobamos que ha funcionado, y ha dado el resultado esperado...");
        moneda1.mostrarColeccion();

        System.out.println("Vemos las monedas que tenemos en este momento");
        moneda1.mostrarColeccion();
        System.out.println("Vamos a cambiar el tipo de moneda!");
        moneda1.cambiaElTipoDeMoneda(1, "Euros");

    }

}