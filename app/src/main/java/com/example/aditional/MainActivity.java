package com.example.aditional;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button boton;
    private EditText texto;
    private TextView tview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = findViewById(R.id.comentario);
        texto = findViewById(R.id.tcoment);
        tview = findViewById(R.id.articulo);
    }

    public void AñadirComentario(View view) {
        boton.setText("Send");
        texto.setVisibility(view.VISIBLE);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (boton.getText() == "Send") {
                    String oldText = tview.getText().toString();
                    String comment = texto.getText().toString();

                    tview.setText(oldText + "\n" + "\n" + "Comment" + " : " + comment + "\n");
                    boton.setText("Añadir comentario");
                    texto.setVisibility(view.INVISIBLE);
                } else {
                    texto.setVisibility(View.VISIBLE);
                    boton.setText("Send");
                }
            }
        });
    }
}