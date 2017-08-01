package com.controlderuta.guardianroute.Model;

/**
 * Created by eduin on 1/08/2017.
 */

public class AutoData {


    private String id;
    private String matricula;
    private String marca;
    private String modelo;


    public AutoData(String id, String matricula, String marca, String modelo) {
        this.id = id;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public AutoData() {
    }
}
