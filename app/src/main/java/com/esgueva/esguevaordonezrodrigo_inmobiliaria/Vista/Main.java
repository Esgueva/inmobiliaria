package com.esgueva.esguevaordonezrodrigo_inmobiliaria.Vista;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.esgueva.esguevaordonezrodrigo_inmobiliaria.Modelo.Inmobiliaria;
import com.esgueva.esguevaordonezrodrigo_inmobiliaria.R;

public class Main extends AppCompatActivity implements FragmentoLista.OnFragmentInteractionListener {

    public static Inmobiliaria inmobiliaria = new Inmobiliaria();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.fragmento_Contenedor) != null && savedInstanceState == null) {
            FragmentoLista lista = new FragmentoLista();
            getSupportFragmentManager().beginTransaction().add(R.id.fragmento_Contenedor, lista).commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_contacto) {
            Intent intent = new Intent(Main.this, Contacto.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onFragmentInteraction(int posicion) {
        FragmentoDetalle detalleFragment = (FragmentoDetalle) getSupportFragmentManager().findFragmentById(R.id.fragmento_detalle);
        if (detalleFragment != null) {
            detalleFragment.cambio(posicion);
        } else {
            FragmentoDetalle nuevo = new FragmentoDetalle();
            Bundle args = new Bundle();
            args.putInt("pos", posicion);
            nuevo.setArguments(args);
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragmento_Contenedor, nuevo)
                    .addToBackStack(null).commit();
        }
    }
}
