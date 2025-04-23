public class Entrada {
    //Atributos
    String evento;
    double precio;
}

//constructor, mismo nombre de la clase y no tipo de regreso, recibe el evento y precio
public Entrada(String evento, double precio){
    this.evento = evento;
    this.precio = precio;
}

 //Método publico para mostrar los datos

public void mostrarInformacion() {
    System.out.println("Evento: " + evento + " | Precio: $" + precio);
      }
 }