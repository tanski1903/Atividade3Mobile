package br.ulbra.trocadetelasdt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btTelaPrincipal, btTela2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CarregarTelaPrincipal();
    }
    public void CarregarTelaPrincipal() {
        setContentView(R.layout.activity_main);
        btTela2 = (Button) findViewById(R.id.bttela2);
        btTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregarTela2();
            }
        });
    }
    public void CarregarTela2() {
        setContentView(R.layout.tela2);
        btTelaPrincipal = (Button) findViewById (R.id.bttela1);
        btTelaPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaPrincipal();
            }
        });
    }
}
