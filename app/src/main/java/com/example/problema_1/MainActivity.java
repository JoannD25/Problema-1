package com.example.problema_1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumeroA;
    private EditText editTextNumeroB;
    private TextView textViewResultado;
    private Button buttonDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumeroA = findViewById(R.id.editTextNumeroA);
        editTextNumeroB = findViewById(R.id.editTextNumeroB);
        textViewResultado = findViewById(R.id.textViewResultado);
        buttonDividir = findViewById(R.id.buttonDividir);

        buttonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numeroA = editTextNumeroA.getText().toString();
                String numeroB = editTextNumeroB.getText().toString();

                try {
                    NumeroEntero numA = new NumeroEntero(numeroA);
                    NumeroEntero numB = new NumeroEntero(numeroB);

                    NumeroEntero resultado = numA.dividir(numB);

                    textViewResultado.setText(resultado.getValor().toString());
                } catch (ArithmeticException e) {
                    textViewResultado.setText("Error: " + e.getMessage());
                }
            }
        });
    }
}