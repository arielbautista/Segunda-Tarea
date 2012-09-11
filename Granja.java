public class Granja{
     public static void main(String[] args)
     {

     System.out.println("\n\n La Granja Leon Jaramillo...\n");

 
     Gato  gat   = new Gato();
     Perro per   = new Perro();
     Gallina gal = new Gallina();

     System.out.println("\t soy "+gat.decirQuienSoy());
     System.out.println("\t soy "+per.decirQuienSoy());
     System.out.println("\t soy "+gal.decirQuienSoy());
     }
}