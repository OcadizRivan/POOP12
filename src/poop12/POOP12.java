/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 * Clase principal POOP12.
 * Esta clase contiene el método main que inicia la ejecución de varios hilos creados utilizando
 * las clases Hilo y HiloR.
 *
 * @author Ivan Ocadiz
 */
public class POOP12 {

    /**
     * Método principal main.
     * Este método crea instancias de hilos personalizados utilizando las clases Hilo y HiloR.
     * Luego inicia los hilos para demostrar el comportamiento concurrente.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        
        // Creando hilos utilizando la clase Hilo
        Hilo hilo1 = new Hilo("Hilo 1");
        Hilo hilo2 = new Hilo("Hilo 2");
        Hilo hilo3 = new Hilo("Hilo 3");

        // Iniciando los hilos creados y poniéndolos a competir
        hilo1.start();
        hilo2.start();
        hilo3.start();

        // Creando e iniciando hilos adicionales directamente
        new Hilo("Hilo 4").start();
        new Hilo("Hilo 5").start();
        

        // Creando e iniciando hilos utilizando la clase HiloR y la interfaz Runnable
        new Thread(new HiloR(), "Hilo R1").start();
        new Thread(new HiloR(), "Hilo R2").start();
        new Thread(new HiloR(), "Hilo R3").start();
    }
}
