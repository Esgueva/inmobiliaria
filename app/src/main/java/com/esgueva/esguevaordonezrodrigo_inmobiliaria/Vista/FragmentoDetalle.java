package com.esgueva.esguevaordonezrodrigo_inmobiliaria.Vista;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.esgueva.esguevaordonezrodrigo_inmobiliaria.R;

public class FragmentoDetalle extends Fragment {

    TextView txtNombre, txtUbicacion, txtLocalizacion, txtNumHab, txtNumAseos, txtGaraje, txtTrastero, txtMetros, txtAntiguedad, txtPrecio;
    ImageView logo;

    public FragmentoDetalle() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmento_detalle, container, false);
        Bundle args = getArguments();

        if (args != null) {
            int pos = args.getInt("pos");
            actualizar(pos, v);
        } else {
            actualizar(0, v);
        }
        return v;
    }

    public void cambio(int pos) {
        actualizar(pos, getView());
    }

    private void actualizar(Integer posicion, View v) {

        logo = v.findViewById(R.id.imgLogo);
        txtNombre = v.findViewById(R.id.txtNombre);
        txtUbicacion = v.findViewById(R.id.txtUbicacion);
        txtLocalizacion = v.findViewById(R.id.txtLocalizacion);
        txtNumHab = v.findViewById(R.id.txtNumHab);
        txtNumAseos = v.findViewById(R.id.txtNumAseos);
        txtGaraje = v.findViewById(R.id.txtGaraje);
        txtTrastero = v.findViewById(R.id.txtTrastero);
        txtMetros = v.findViewById(R.id.txtMetros);
        txtAntiguedad = v.findViewById(R.id.txtAntiguedad);
        txtPrecio = (v.findViewById(R.id.txtPrecio));

        logo.setImageResource(Main.inmobiliaria.getInmuebles().get(posicion).getImage());
        txtNombre.setText(Main.inmobiliaria.getInmuebles().get(posicion).getNombre());
        txtUbicacion.setText(getString(R.string.direccion) + " " + Main.inmobiliaria.getInmuebles().get(posicion).getUbicacion());
        txtLocalizacion.setText(getString(R.string.poblacion) + " " + Main.inmobiliaria.getInmuebles().get(posicion).getLocalizacion());
        txtNumHab.setText(getString(R.string.habitaciones) + " " + String.valueOf(Main.inmobiliaria.getInmuebles().get(posicion).getNumeroHab()) + " " + getString(R.string.hab));
        txtNumAseos.setText(getString(R.string.aseos) + " " + String.valueOf(Main.inmobiliaria.getInmuebles().get(posicion).getNumeroAseos()) + " " + getString(R.string.wc));
        txtGaraje.setText(getString(R.string.garaje) + " " + Main.inmobiliaria.getInmuebles().get(posicion).getGaraje());
        txtTrastero.setText(getString(R.string.trastero) + " " + Main.inmobiliaria.getInmuebles().get(posicion).getTrastero());
        txtMetros.setText(getString(R.string.superficie) + " " + String.valueOf(Main.inmobiliaria.getInmuebles().get(posicion).getMetros()) + " " + " m2");
        txtAntiguedad.setText(getString(R.string.estado) + " " + Main.inmobiliaria.getInmuebles().get(posicion).getAntiguedad());
        txtPrecio.setText(getString(R.string.coste) + " " + Main.inmobiliaria.getInmuebles().get(posicion).getPrecio() + " " + getString(R.string.mes));
    }
}
