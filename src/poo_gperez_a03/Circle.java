/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_gperez_a03;

/**
 *
 * @author gusar
 */
public class Circle extends Shape {
 //Atributos
    protected double radious;
    //Metodos
    //Constructores
    public Circle(){
        super();
        this.radious=0.0;
    }
    public Circle (String color, boolean filled, double radious){
    super(color,filled);
    this.radious=radious;
}
    public double getRadious(){
        return this.radious;
    }
    @Override
    public double getArea(){
        return 3.1416 * radious;
    }
    @Override
    public String toString(){
        String relleno;
        if(this.filled)relleno=" esta relleno\n"; else relleno=" no esta relleno\n";
        return "El círculo es color" + this.color + relleno;
    }    

    @Override
    public double getPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}