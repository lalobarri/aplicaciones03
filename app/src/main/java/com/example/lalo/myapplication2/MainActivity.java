package com.example.lalo.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double est, peso, imc;
    private EditText txtEst, txtPeso;
    private TextView lblResul;
    private Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se adaptan los datos al componente determinado
        this.txtEst=(EditText)findViewById(R.id.editText);
        this.txtPeso=(EditText)findViewById(R.id.editText2);
        this.lblResul=(TextView)findViewById(R.id.textView3);
        this.btnCalc=(Button)findViewById(R.id.button);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                est=Double.parseDouble(txtEst.getText().toString());
                peso=Double.parseDouble(txtPeso.getText().toString());
                imc=peso/(est*est);
                lblResul.setText(Double.toString(imc));
            }
        });
    }
}
