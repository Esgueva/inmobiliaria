package com.esgueva.esguevaordonezrodrigo_inmobiliaria.Modelo;

public class Inmueble {
    private int image;
    private String nombre, ubicacion, localizacion;
    private int numeroHab, numeroAseos;
    private String garaje, trastero;
    private double metros;
    private String antiguedad;
    private String precio;

    Inmueble(int image, String nombre, String ubicacion, String localizacion,
             int numeroHab, int numeroAseos, String garaje, String trastero,
             double metros, String antiguedad, String precio) {
        this.image = image;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.localizacion = localizacion;
        this.numeroHab = numeroHab;
        this.numeroAseos = numeroAseos;
        this.garaje = garaje;
        this.trastero = trastero;
        this.metros = metros;
        this.antiguedad = antiguedad;
        this.precio = precio;
    }

    public int getImage() {
        return image;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public int getNumeroHab() {
        return numeroHab;
    }

    public int getNumeroAseos() {
        return numeroAseos;
    }

    public String getGaraje() {
        return garaje;
    }

    public String getTrastero() {
        return trastero;
    }

    public double getMetros() {
        return metros;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public String getPrecio() {
        return precio;
    }

}
