package com.example.ejemploradiobroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

package paquete.ejemplos;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View;

public class EjAndroidNuevosActivity extends Activity {
    private TextView tv1;
    private RadioButton r1,r2,r3,r4;
    private RadioGroup rg;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tv1=(TextView)findViewById(R.id.textView1);
        r1=(RadioButton)findViewById(R.id.rdbAmarillo);
        r2=(RadioButton)findViewById(R.id.rdbAzul);
        r3=(RadioButton)findViewById(R.id.rdbRojo);
        r4=(RadioButton)findViewById(R.id.rdbVerde);
        rg=(RadioGroup)findViewById(R.id.radioGroup1);
        //Seleccionar por defecto el radio Rojo
        rg.check(R.id.rdbRojo);

    }

    public void mostrarColor(View view) {

        int radioseleccionado=rg.getCheckedRadioButtonId();

        switch (radioseleccionado) {
            case R.id.rdbAmarillo:
            tv1.setTextColor(Color.YELLOW);
            break;
            case R.id.rdbAzul:
            tv1.setTextColor(Color.BLUE);
            break;
            case R.id.rdbRojo:
            tv1.setTextColor(Color.RED);
            break;
            case R.id.rdbVerde:
            tv1.setTextColor(Color.GREEN);
            break;
            default:
            break;
        }

    }

}
