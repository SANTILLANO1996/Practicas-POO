/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

/**
 *
 * @author Luis Fernando Martínez Santillano    #18550371
 */
public class Automóvil {
    public  String marca, placa, gasolina, transmision, motor;
   public   double precio, kilometraje;
   public int cambios,año, llanrepu; 

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getGasolina() {
        return gasolina;
    }

    public void setGasolina(String gasolina) {
        this.gasolina = gasolina;
    }

    public String getAues() {
        return transmision;
    }

    public void setAues(String transmision) {
        this.transmision = transmision;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getLlanrepu() {
        return llanrepu;
    }

    public void setLlanrepu(int llanrepu) {
        this.llanrepu = llanrepu;
    }
}
