package poo_gperez_a03;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gusar
 */
public class Rectangle extends Shape {
 protected double width;
 protected double length;
  //Metodos
    //Constructores
 public Rectangle(){
    super();
     width=0;
     length=0;
 }
    public Rectangle (String color, double width, double length, boolean filled){
     this.width=width;
     this.length=length;
     this.color=color;
     
 }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double length){
        this.width=width;
    }
    public double getLength(){
        return this.length;
    }
    public void setLength(double length){
        this.length=length;
    }
    @Override
    public double getArea(){
        return width * length;
    }
    @Override
    public double getPerimetro(){
        return 2*width + 2*length; 
    }
       @Override
       public String toString(){
           String relleno;
           if (this.filled)relleno=" Esta relleno\n"; else relleno="no esta relleno\n";
       return "El Rectangulo es color" + this.color + relleno;
       }
        
}
 

