
package practica1;

public class Moneda {
    
    public static String forma = "Circular";
    public static String color = "Silver";
    public double moneda;
    
    /*valor final */
    public double valor (){
    return this.moneda;
    }
    
    /*el valor que se le dara*/
    public double valorAgregado(double x){
        return this.moneda = x;
    }
    
    
}
