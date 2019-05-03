
package practica1;

public class Practica1 {

    public static void main(String[] args) {
       
        Moneda p = new Moneda();
        p.valorAgregado(67);
        System.out.println("Valor: " + p.valor());
        System.out.println("Color: " + Moneda.color);
        System.out.println("Forma: " + Moneda.forma);
    }
    
}
