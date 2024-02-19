/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancoentornos;

/**
 *
 * @author Alumno Tarde
 */
public class CCuenta {

    double dSaldo=100;

    public static void main(String[] args) {
// Depuracion. Se detiene siempre
        CCuenta miCuenta = new CCuenta();
        System.out.println("Saldo Incial: " + miCuenta.dSaldo + "euros");
        miCuenta.ingresar(-100);
        System.out.println("Saldo Incial: " + miCuenta.dSaldo + " euros");
        miCuenta.ingresar(100);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + "euros");
        miCuenta.ingresar(200);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + "euros");
        miCuenta.ingresar(300);
        System.out.println("Saldo tras ingreso:");
        miCuenta.retirar(50);
        System.out.println("Saldo tras retirada: " + miCuenta.dSaldo + "euros");
    }

    public int ingresar(double cantidad) {
        int iCodErr;
        if (cantidad < 0) {
            System.out.println("No se puede ingresar una cantidad negativa");
            iCodErr = 1;

        } else {
            iCodErr = 0;
        }
        return iCodErr;
    }

    public void retirar(double cantidad) {

        if (cantidad <= 0) {
            System.out.println("No se puede retirar una cantidad negativa");
        } else if (dSaldo < cantidad) {
            System.out.println("No hay suficiente saldo");
        } else {
            System.out.println("Saldo Restante:" + dSaldo);
        }

    }
}
