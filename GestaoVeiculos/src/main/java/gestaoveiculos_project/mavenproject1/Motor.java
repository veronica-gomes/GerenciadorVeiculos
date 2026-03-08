/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoveiculos_project.mavenproject1;

/**
 *
 * @author Veronica
 */
public class Motor {

    public int qtdPist; //pistões
    public int potencia;

    public Motor() {
        this.qtdPist = 0;
        this.potencia = 0;
    }

    public Motor(int qtdPist, int potencia) {
        this.qtdPist = qtdPist;
        this.potencia = potencia;
    }

    // getters and setters
    public int getQtdPist() {
        return qtdPist;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setQtdPist(int qtdPist) {
        this.qtdPist = qtdPist;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}