package com.esgueva.esguevaordonezrodrigo_inmobiliaria.Vista;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.esgueva.esguevaordonezrodrigo_inmobiliaria.Controlador.AdaptadorInmueble;
import com.esgueva.esguevaordonezrodrigo_inmobiliaria.Controlador.OnItemClickListener;
import com.esgueva.esguevaordonezrodrigo_inmobiliaria.R;

public class FragmentoLista extends Fragment implements OnItemClickListener {

    private OnFragmentInteractionListener mListener;
    RecyclerView reciclado;

    public FragmentoLista() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmento_lista, container, false);
        reciclado = v.findViewById(R.id.reciclador);
        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        LinearLayoutManager l = new LinearLayoutManager(getActivity());
        l.setOrientation(LinearLayoutManager.VERTICAL);
        reciclado.setLayoutManager(l);
        reciclado.setAdapter(new AdaptadorInmueble(Main.inmobiliaria.getInmuebles(), this));
    }

    public void onClick(RecyclerView.ViewHolder viewHolder, int pos) {
        if (mListener != null) {
            mListener.onFragmentInteraction(pos);
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(int pos);
    }
}
