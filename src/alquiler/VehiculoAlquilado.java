/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquiler;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

/**
 *
 * @author jriosaguilar
 */
public class VehiculoAlquilado {
    

    private Cliente cliente;
    private Vehiculo vehiculo;
    private int diaAlquiler;
    private Month mesAlquiler;
    private int anioAlquiler;
    private int totalDiasAlquiler;
    

    public VehiculoAlquilado(Cliente cliente, Vehiculo vehiculo,int diaAlquiler, Month mesAlquiler, int anioAlquiler, int totalDiasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.anioAlquiler = anioAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }
    


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDiaAlquiler() {
        return diaAlquiler;
    }

    public void setDiaAlquiler(int diaAlquiler) {
        this.diaAlquiler = diaAlquiler;
    }

    public Month getMesAlquiler() {
        return mesAlquiler;
    }

    public void setMesAlquiler(Month mesAlquiler) {
        this.mesAlquiler = mesAlquiler;
    }

    public int getAnioAlquiler() {
        return anioAlquiler;
    }

    public void setAnioAlquiler(int anioAlquiler) {
        this.anioAlquiler = anioAlquiler;
    }



    public int getTotalDiasAlquiler() {
        return totalDiasAlquiler;
    }

    public void setTotalDiasAlquiler(int totalDiasAlquiler) {
        this.totalDiasAlquiler = totalDiasAlquiler;
    }
    
}
