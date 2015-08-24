package com.example.richard.triangulo;

/**
 * Created by Richard on 8/23/2015.
 */
public class Triangulo {
    private double catetoOpuesto;
    private double catetoAdyacente;
    private double hipotenusa;

    public Triangulo(Double catetoAdyacente, Double catetoOpuesto) {
        this.catetoAdyacente = catetoAdyacente;
        this.catetoOpuesto = catetoOpuesto;
    }

    public double getCatetoAdyacente() {
        return catetoAdyacente;
    }

    public void setCatetoAdyacente(double catetoAdyacente) {
        this.catetoAdyacente = catetoAdyacente;
    }

    public double getCatetoOpuesto() {
        return catetoOpuesto;
    }

    public void setCatetoOpuesto(double catetoOpuesto) {
        this.catetoOpuesto = catetoOpuesto;
    }

    public double hipotenusa(){
        double hipotenusa = Math.sqrt((this.catetoAdyacente * this.catetoAdyacente) + (this.catetoOpuesto * this.catetoOpuesto));
        this.hipotenusa = hipotenusa;
        return hipotenusa;
    }

    public double perimetro(){
        return this.hipotenusa + this.catetoAdyacente + this.catetoOpuesto;
    }

    public double area(){
        return (this.catetoOpuesto + this.catetoAdyacente) / 2;
    }

    public double angulo(){
        return Math.round(Math.atan(Math.sin(this.catetoOpuesto / this.hipotenusa)));
    }

    public double anguloOpuesto(){
        return Math.round((Math.PI / 2) - this.angulo());
    }
}
