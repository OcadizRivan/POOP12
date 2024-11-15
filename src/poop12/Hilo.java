/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 * Clase Hilo que extiende la clase Thread.
 * Esta clase representa un hilo personalizado que imprime iteraciones numeradas junto con el nombre del hilo.
 *
 * @author Ivan Ocadiz
 */
public class Hilo extends Thread {

    /**
     * Constructor de la clase Hilo.
     * Inicializa el hilo con un nombre específico.
     *
     * @param name El nombre del hilo.
     */
    public Hilo(String name) {
        super(name);
    }

    /**
     * Método run() que contiene la lógica a ejecutarse en el hilo.
     * Este método se ejecuta cuando el hilo es iniciado. Imprime iteraciones del 0 al 9 junto con
     * el nombre del hilo y finaliza indicando que el hilo ha terminado.
     */
    @Override
    public void run() {
        // Itera de 0 a 9
        for (int i = 0; i < 10; i++) {
            // Imprime la iteración actual y el nombre del hilo en ejecución
            System.out.println("Iteración " + i + " hilo" + getName());
        }
        // Indica que el hilo actual ha terminado su ejecución
        System.out.println("Termina " + getName());
    }
}
