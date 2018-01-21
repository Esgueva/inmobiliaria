package com.esgueva.esguevaordonezrodrigo_inmobiliaria.Modelo;

import com.esgueva.esguevaordonezrodrigo_inmobiliaria.R;

import java.util.ArrayList;

public class Inmobiliaria {

    private String direccion, poblacion, email, web;
    private int telefono;

    private ArrayList<Inmueble> inmuebles;

    public Inmobiliaria() {
        this.direccion = "C/ Leganés, 1";
        this.poblacion = "28945 Fuenlabrada Madrid";
        this.email = "info@1000-casas.es";
        this.web = "http://www.1000-casas.es";
        this.telefono = 627754790;
        this.inmuebles = new ArrayList<>();
        inicializarInmubles();
    }

    private void inicializarInmubles() {
        inmuebles.add(new Inmueble(R.drawable.piso1, "La Cueva", "Avenida de los Andes", "La Avanzada", 4, 1, "No", "Si", 105, "A Reformar", "300"));
        inmuebles.add(new Inmueble(R.drawable.piso2, "La Fuente", "Calle de Gazaperas", "El Arroyo", 3, 1, "Si", "Si", 81, "A Reformar", "324"));
        inmuebles.add(new Inmueble(R.drawable.piso3, "La Lima", "Venta Calle de Lima", "Centro", 3, 1, "No", "No", 85, "A Reformar", "295"));
        inmuebles.add(new Inmueble(R.drawable.piso4, "La Serna", "Calle valladolid", "La Serna", 3, 1, "No", "Si", 90, "A Reformar", "35000"));
        inmuebles.add(new Inmueble(R.drawable.piso5, "El Molino", "Paseo del Pireo", "Fuenlabrada II", 3, 1, "Si", "No", 87, "Buen Estado", "266"));
        inmuebles.add(new Inmueble(R.drawable.piso6, "La Avenida", "Avenida de las naciones", "Fuenlabrada II", 3, 1, "Si", "Si", 80, "A Reformar", "341"));
        inmuebles.add(new Inmueble(R.drawable.piso7, "La Lima", "Venta Calle de Lima", "Centro", 3, 1, "Si", "Si", 97, "A Reformar", "325"));
    }

    public String getDireccion() {
        return direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getEmail() {
        return email;
    }

    public String getWeb() {
        return web;
    }

    public int getTelefono() {
        return telefono;
    }

    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

}
