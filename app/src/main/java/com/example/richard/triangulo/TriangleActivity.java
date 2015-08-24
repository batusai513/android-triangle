package com.example.richard.triangulo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TriangleActivity extends Activity {
    Triangulo triangulo = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_triangle, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void calcular(View view){
        //obtener los catetos
        EditText textCatetoAdyacente    = (EditText) findViewById(R.id.cateto_adyacente);
        EditText textCatetoOpuesto      = (EditText) findViewById(R.id.cateto_opuesto);

        Double catetoAdyacente          = Double.valueOf(textCatetoAdyacente.getText().toString());
        Double catetoOpuesto            = Double.valueOf(textCatetoAdyacente.getText().toString());

        triangulo = new Triangulo(catetoAdyacente, catetoOpuesto);
        this.mostrarResultados();
    }

    private void mostrarResultados(){
        TextView resultadoHipotenusa    = (TextView) findViewById(R.id.resultado_hipotenusa);
        TextView resultadoPerimetro     = (TextView) findViewById(R.id.resultado_perimetro);
        TextView resultadoArea          = (TextView) findViewById(R.id.resultado_area);
        TextView resultadoAngulos       = (TextView) findViewById(R.id.resultado_angulos);
        resultadoHipotenusa.setText(String.format("Hipotenusa: %s", triangulo.hipotenusa()));
        resultadoPerimetro.setText(String.format("Perimetro: %s", triangulo.perimetro()));
        resultadoArea.setText(String.format("Area: %s", triangulo.area()));
        resultadoAngulos.setText(String.format("Angulo: %s, Angulo opuesto: %s", Math.toDegrees(triangulo.angulo()), Math.toDegrees(triangulo.anguloOpuesto())));
    }
}
