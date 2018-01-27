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
public abstract class Shape {
   //Atributes
    protected String color;
    protected boolean filled;
    //Metodos
    public Shape(){
        color="";
        filled=false;
    }
    public Shape (String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public abstract double getArea();
    public abstract double getPerimetro();
    public abstract String toString();
}
