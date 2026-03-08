/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoveiculos_project.mavenproject1;

/**
 *
 * @author Veronica
 */
public class Passeio extends Veiculo implements Calcular {

    int qtdPassageiros;

    public Passeio() {
        this.qtdPassageiros = 0;
    }

    public Passeio(int qtdPassageiros, float velocMax) {
        this.qtdPassageiros = qtdPassageiros;
    }

    // getters and setters
    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    // 1 kilometer/hour = 1000 meter/hour
    @Override
    public float calcVel(float velocMax) {
        return velocMax * 1000;
    }
    
    // retornará a soma das quantidades de letras existentes em todos os atributos do tipo String.
    @Override
    public int calcular() {
        int soma = 0;
        soma += getPlaca().length();
        soma += getMarca().length();
        soma += getModelo().length();
        soma += getCor().length();
        return soma;
    }
}
