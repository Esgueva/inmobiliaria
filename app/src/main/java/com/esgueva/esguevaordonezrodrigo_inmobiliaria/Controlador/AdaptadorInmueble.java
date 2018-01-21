package com.esgueva.esguevaordonezrodrigo_inmobiliaria.Controlador;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.esgueva.esguevaordonezrodrigo_inmobiliaria.Modelo.Inmueble;
import com.esgueva.esguevaordonezrodrigo_inmobiliaria.R;

import java.util.ArrayList;

public class AdaptadorInmueble extends RecyclerView.Adapter<AdaptadorInmueble.DatosHolder> {

    private ArrayList<Inmueble> inmuebles;
    private OnItemClickListener escucha;

    public AdaptadorInmueble(ArrayList<Inmueble> inmuebles, OnItemClickListener escucha) {
        this.inmuebles = inmuebles;
        this.escucha = escucha;
    }

    class DatosHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView foto;
        TextView nombre;
        TextView ubicacion, poblacion;
        TextView precio;
        Button info;

        DatosHolder(View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.txtNombre);
            ubicacion = itemView.findViewById(R.id.txtUbicacion);
            poblacion = itemView.findViewById(R.id.txtPoblacion);
            precio = itemView.findViewById(R.id.txtPrecio);
            foto = itemView.findViewById(R.id.imagen);
            info = itemView.findViewById(R.id.btnInfo);
            info.setOnClickListener(this);
        }

        TextView getNombre() {
            return nombre;
        }

        TextView getUbicacion() {
            return ubicacion;
        }

        TextView getPoblacion() {
            return poblacion;
        }

        TextView getPrecio() {
            return precio;
        }

        ImageView getFoto() {
            return foto;
        }


        @Override
        public void onClick(View view) {
            escucha.onClick(this, getAdapterPosition());
        }
    }

    @Override
    public DatosHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View fila = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.fila_inmuebles, parent, false);
        return new DatosHolder(fila);
    }

    @Override
    public void onBindViewHolder(AdaptadorInmueble.DatosHolder holder, int position) {
        holder.getNombre().setText(inmuebles.get(position).getNombre());
        holder.getUbicacion().setText(inmuebles.get(position).getUbicacion());
        holder.getPoblacion().setText(inmuebles.get(position).getLocalizacion());
        holder.getPrecio().setText(inmuebles.get(position).getPrecio() + " €");
        holder.getFoto().setImageResource(inmuebles.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return inmuebles.size();
    }
}
