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
public class Square extends Rectangle {
    double side;
    public Square(){
        side=0;
    }
    public Square(String color, boolean filled, double side){
        this.side=side;
    }
    public double getSide(){
        return this.side;
    }
    public void setSide(double side){
        this.side=side;
    }

    @Override
    public void setWidth(double side){
        this.side=side;
    }
    @Override
    public void setLength(double side){
        this.side=side;
    }
    @Override
    public String toString(){
        String relleno;
        if(this.filled) relleno="Esta relleno\n"; else relleno="no esta relleno\n";
        return "El cuadrado es color" + this.color + relleno;
    }
}
