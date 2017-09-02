package com.example.eafdecision11.exercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class OptionsFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_form);

        Spinner blocos = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> blocosAdapter = ArrayAdapter.createFromResource(this, R.array.blocos_array, android.R.layout.simple_spinner_item);
        blocosAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        blocos.setAdapter(blocosAdapter);

    }
}
