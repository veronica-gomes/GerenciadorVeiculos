/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoveiculos_project.mavenproject1;

/**
 *
 * @author Veronica
 */
public class VeicExistException extends Exception {

    public VeicExistException() {
        System.out.println("Ja existe um veiculo cadastrado com essa placa");
    }

}
