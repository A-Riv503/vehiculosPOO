import org.w3c.dom.ls.LSOutput;

public class Carro {

    String marca;
    String modelo;
    float precio;


    public  Carro(String modelo, String marca, float precio){
        this.modelo=modelo;
        this.marca=marca;
        this.precio=precio;


    }

    public float getPrecio(){
        return precio;
    }

    public String mostrarResultado(){
        return "la vehiculo mas barato es: Marca: "+marca+" modelo: "+modelo+ " precio: $"+precio;
    }






}
