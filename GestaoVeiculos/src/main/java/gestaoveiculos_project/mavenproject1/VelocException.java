/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoveiculos_project.mavenproject1;

/**
 *
 * @author Veronica
 */

public class VelocException extends Exception {
    public VelocException() {
        System.out.println("A velocidade maxima esta fora dos limites brasileiros.");
    }
}