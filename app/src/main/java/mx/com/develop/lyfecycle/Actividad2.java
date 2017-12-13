package mx.com.develop.lyfecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        Toast.makeText(this, "onCreate() de Actividad2", Toast.LENGTH_LONG).show();

        Button btn_finalizar_actividad;
        btn_finalizar_actividad = (Button) findViewById(R.id.btn_finalizar_actividad);
        btn_finalizar_actividad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Actividad2.this.finish();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart() de Actividad2", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume() de Actividad2", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause() de Actividad2", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop() de Actividad2", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart() de Actividad2", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy() de Actividad2", Toast.LENGTH_LONG).show();
    }
}
