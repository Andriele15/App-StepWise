package br.ulbra.stepwise;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editTextPassos;
    private RadioGroup radioGroupTamanho;
    private CheckBox checkBoxCorrendo;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPassos = findViewById(R.id.editTextPassos);
        radioGroupTamanho = findViewById(R.id.radioGroupTamanho);
        checkBoxCorrendo = findViewById(R.id.checkBoxCorrendo);
        textViewResultado = findViewById(R.id.textViewResultado);
        Button buttonCalcular = findViewById(R.id.buttonCalcular);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularDistancia();
            }
        });
    }

    private void calcularDistancia() {
        String passosStr = editTextPassos.getText().toString();
        if (passosStr.isEmpty()) {
            textViewResultado.setText("Por favor, insira a quantidade de passos.");
            return;
        }

        int passos = Integer.parseInt(passosStr);
        double tamanhoPasso = 0.75; // valor padrão para médio

        if (radioGroupTamanho.getCheckedRadioButtonId() == R.id.radioCurto) {
            tamanhoPasso = 0.5;
        } else if (radioGroupTamanho.getCheckedRadioButtonId() == R.id.radioLongo) {
            tamanhoPasso = 1.0;
        }

        double distancia = passos * tamanhoPasso;

        // Aumenta a distância se estiver correndo
        if (checkBoxCorrendo.isChecked()) {
            distancia *= 1.2; // Aumenta em 20%
        }

        textViewResultado.setText(String.format("Distância estimada: %.2f metros", distancia));
    }
}