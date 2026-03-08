/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoveiculos_project.mavenproject1;

/**
 *
 * @author Veronica
 */
public class Carga extends Veiculo implements Calcular{

    int cargaMax;
    int tara;

    public Carga() {
        this.cargaMax = 0;
        this.tara = 0;
    }

    public Carga(int cargaMax, int tara) {
        this.cargaMax = cargaMax;
        this.tara = tara;
    }
    
    // getters and setters
    public int getCargaMax (){
        return cargaMax;
    }
    public int getTara (){
        return tara;
    }
    public void setCargaMax (int cargaMax){
        this.cargaMax = cargaMax;
    }
    public void setTara (int tara){
        this.tara = tara;
    }
    
    // 1 kilometer/hour = 100000 centimeter/hour
    @Override
    public float calcVel(float velocMax) {
        return velocMax * 100000;
    }
    
    //retornará a soma de todos os valores contidos nos atributos numéricos. 
    @Override
    public int calcular() {
        int soma = 0;
        soma += cargaMax;
        soma += tara;
        soma += (int)getVelocMax();
        soma += getQtdRodas();
        soma += getMotor().getPotencia();
        soma += getMotor().getQtdPist();
        return soma;
    }
}