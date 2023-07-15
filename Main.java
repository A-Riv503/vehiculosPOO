import javax.swing.*;
import java.util.Arrays;


public class Main {
    /*construir un programa que dada una serie de vehiculos caracterisados por su marca, modelo y precio, imprima las propiedades del vehiculo mas barato
     * para ello, se deberan leer por teclado las caracteristicas de cada vehiculo y crear una clase que represente a cada uno de ellos*/
    public static int carroBarato(Carro vehiculo[]){
        float precio;
        int indicador=0;

        precio=vehiculo[0].getPrecio();
        for(int i=1; i<vehiculo.length;i++){
            if(vehiculo[i].getPrecio()<precio){
                precio=vehiculo[i].getPrecio();
                indicador=i;
            }

        }
        return indicador;

    }
   public static void main(String[] args) {
           int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Cuantos carros desea comparar"));
           String modelo;
           String marca;
           float precio;
           int carroBarato;
           Carro vehiculo[]=new Carro[cantidad];

           for(int i=0; i<cantidad; i++) {
               modelo = JOptionPane.showInputDialog("INGRESE EL MODELO DEL VEHICULO " + i);
               marca = JOptionPane.showInputDialog("INGRESE LA MARCA DEL VEHICULO " + i);
               precio = Float.parseFloat(JOptionPane.showInputDialog("INGRESE EL PRECIO DEL VEHICULO " + i));
               vehiculo[i] = new Carro(modelo, marca, precio);

           }

          carroBarato = carroBarato(vehiculo);
          System.out.println(vehiculo[carroBarato].mostrarResultado());




   }
}