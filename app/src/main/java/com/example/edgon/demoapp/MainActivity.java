package com.example.edgon.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button calcular;
    EditText editText;
    RadioButton rB1, rB2, rB3;

    double monto;
    double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = (EditText) findViewById(R.id.editText);
        calcular = (Button) findViewById(R.id.button);

        rB1 = (RadioButton) findViewById(R.id.diez);
        rB2 = (RadioButton) findViewById(R.id.quince);
        rB3 = (RadioButton) findViewById(R.id.veinte);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //asignar a monto el valor del editText
                monto = Double.parseDouble(editText.getText().toString());

                //obtenr el valor del radioButon
                if (rB1.isChecked() == true){
                    total = monto * 0.10;
                }else
                    if (rB2.isChecked() == true){
                    total = monto * 0.15;
                }else
                    if (rB3.isChecked() == true){
                        total = monto * .20;
                    }


                Toast toast = Toast.makeText(getApplicationContext(), "su descuento es: " + total, Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }
}
