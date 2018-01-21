package com.esgueva.esguevaordonezrodrigo_inmobiliaria.Vista;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.esgueva.esguevaordonezrodrigo_inmobiliaria.R;

public class Contacto extends AppCompatActivity {

    private String direccion, poblacion, web, email;
    private int telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        direccion = Main.inmobiliaria.getDireccion();
        poblacion = Main.inmobiliaria.getPoblacion();
        web = Main.inmobiliaria.getWeb();
        email = Main.inmobiliaria.getEmail();
        telefono = Main.inmobiliaria.getTelefono();

        TextView txtDireccion = findViewById(R.id.txtDireccion);
        TextView txtpoblacion = findViewById(R.id.txtCiudad);
        txtDireccion.setText(direccion);
        txtpoblacion.setText(poblacion);

        Button btnTelefono = findViewById(R.id.btnTelefono);
        Button btnMail = findViewById(R.id.btnMail);
        Button btnUrl = findViewById(R.id.btnWeb);

        btnTelefono.setOnClickListener(click);
        btnMail.setOnClickListener(click);
        btnUrl.setOnClickListener(click);
    }

    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {

                case R.id.btnWeb:
                    Uri uriUrl = Uri.parse(web);
                    Intent intentWeb = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(intentWeb);
                    break;

                case R.id.btnTelefono:
                    Intent intentLlamada = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", String.valueOf(telefono), null));
                    startActivity(intentLlamada);
                    break;

                case R.id.btnMail:
                    Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email));
                    emailIntent.putExtra(Intent.EXTRA_SUBJECT, "NUEVA CONSULTA");
                    emailIntent.putExtra(Intent.EXTRA_TEXT, "Buenos días, estaría interesado en que me llamen por teléfono.");
                    startActivity(Intent.createChooser(emailIntent, "Enviar Email."));
                    break;
            }
        }
    };
}
