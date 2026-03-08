/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoveiculos_project.mavenproject1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Veronica
 */
public class BDVeiculos {
    private static BDVeiculos instance;
    
    private List<Passeio> passeios = new ArrayList<>();
    private List<Carga> cargas = new ArrayList<>();

    // getters and setters
    public List<Passeio> getListaPasseio() {
        return passeios;
    }
    public static BDVeiculos getInstance() {
        if (instance == null) {
            instance = new BDVeiculos();
        }
        return instance;
    }
    
    public List<Carga> getListaCarga() {
        return cargas;
    }

    public void setListaPasseio(List<Passeio> listaPasseio) {
        this.passeios = listaPasseio;
    }
    
    public void limparListaPasseio() {
        this.passeios = new ArrayList<>();
    }
    
    public void setListaCarga(List<Carga> listaCarga) {
        this.cargas = listaCarga;
    }
    
    public void limparListaCarga() {
        this.cargas = new ArrayList<>();
    }
}
