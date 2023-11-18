import static com.example.conversor.R.*;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class divisas extends AppCompatActivity {

    private EditText divisaacambiar;
    private Spinner elegirtipodecambio = findViewById(id.elegirtipodecambio);
    private TextView resultado;
    private Button calcular;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        divisaacambiar = this.<EditText>findViewById(id.divisaacambiar);
        resultado = findViewById(id.resultado);
        calcular = this.<Button>findViewById(id.calcular);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                array.Divisas, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        elegirtipodecambio.setAdapter(adapter);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertirDivisa();
            }
        });
    }

    private void convertirDivisa() {
        String divisa = divisaacambiar.getText().toString();
        String tipoCambio = elegirtipodecambio.getSelectedItem().toString();

        private void convertirDivisa() {
            String elegirtipodecambio = this.elegirtipodecambio.getSelectedItem().toString();
            String divisaacambiar = this.divisaacambiar.getText().toString();

            if (divisa.isEmpty()) {
                Toast.makeText(this, "Ingrese una cantidad", Toast.LENGTH_SHORT).show();
                return;
            }

            double cantidad = Double.parseDouble(divisa);
            double resultadoConversion = 0;

            final double COP_TO_USD = 0.00026;
            final double USD_TO_COP = 3825.14;
            final double MXN_TO_USD = 0.049;
            final double USD_TO_MXN = 20.48;

            switch (elegirtipodecambio) {
                case "COP a USD":
                    resultadoConversion = cantidad * COP_TO_USD;
                    break;
                case "USD a COP":
                    resultadoConversion = cantidad * USD_TO_COP;
                    break;
                case "MXN a USD":
                    resultadoConversion = cantidad * MXN_TO_USD;
                    break;
                case "USD a MXN":
                    resultadoConversion = cantidad * USD_TO_MXN;
                    break;
                case "MXN a COP":
                    // Convertir MXN a USD y luego USD a COP
                    double mxnToUsd = cantidad * MXN_TO_USD;
                    resultadoConversion = mxnToUsd * USD_TO_COP;
                    break;
                case "COP a MXN":
                    // Convertir COP a USD y luego USD a MXN
                    double copToUsd = cantidad * COP_TO_USD;
                    resultadoConversion = copToUsd * USD_TO_MXN;
                    break;
            }

            resultado.setText("resultado: " + resultado);
        }

