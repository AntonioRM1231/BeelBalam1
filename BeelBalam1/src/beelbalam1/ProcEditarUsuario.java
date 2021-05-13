/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beelbalam1;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Anahi SC
 */
public class ProcEditarUsuario {
    String nombre;
    String newNombre;
    String newContraseña;
    String newCorreo;
    String newCel;
    
    String oldTarjeta;
    String newNumTarjetaEU;
    int CVC;
    String primerNombre;
    String segundoNombre;
    String primerApellido;
    String segundoApellido;
    int fechaV;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNewNombre(String newNombre) {
        this.newNombre = newNombre;
    }

    public void setNewContraseña(String newContraseña) {
        this.newContraseña = newContraseña;
    }

    public void setNewCorreo(String newCorreo) {
        this.newCorreo = newCorreo;
    }

    public void setNewCel(String newCel) {
        this.newCel = newCel;
    }

    public void setNewNumTarjetaEU(String newNumTarjetaEU) {
        this.newNumTarjetaEU = newNumTarjetaEU;
    }

    public void setCVC(int CVC) {
        this.CVC = CVC;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public void setFechaV(int fechaV) {
        this.fechaV = fechaV;
    }

    public void setOldTarjeta(String oldTarjeta) {
        this.oldTarjeta = oldTarjeta;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getNewNombre() {
        return newNombre;
    }

    public String getNewContraseña() {
        return newContraseña;
    }

    public String getNewCorreo() {
        return newCorreo;
    }

    public String getNewCel() {
        return newCel;
    }

    public String getNewNumTarjetaEU() {
        return newNumTarjetaEU;
    }

    public int getCVC() {
        return CVC;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public int getFechaV() {
        return fechaV;
    }

    public String getOldTarjeta() {
        return oldTarjeta;
    }

    public void hacerConexionEditUsuario(){ //v = true -> inserta nva tarjeta // v = false->update a lo demás
        try {
        } catch (Exception e) {
            System.out.println("Ha habido un error al editar los datos del usuario");
            System.out.println(e);
        }
    }
}
