package org.institutoserpis.cronometro_version_sencilla;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    Button Contar, Pausa;
    Chronometer Crono;
    long Timr=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Crono = (Chronometer)findViewById(R.id.Cronometro);
        Contar = (Button)findViewById(R.id.Contar);
        Pausa = (Button)findViewById(R.id.Pausa);

        Contar.setEnabled(true);
        Pausa.setEnabled(false);

        Contar.setOnClickListener( new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                Contar.setEnabled(false);
                Pausa.setEnabled(true);
                Crono.setBase(SystemClock.elapsedRealtime());
                Crono.start();
            }
        });
        Pausa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contar.setEnabled(true);
                Pausa.setEnabled(false);
                Crono.stop();
            }
        });
    }
}
