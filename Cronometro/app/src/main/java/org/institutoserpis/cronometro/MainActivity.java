package org.institutoserpis.cronometro;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTVTime;
    private EditText mEtLaps;
    private Button mBtnStart;
    private Button mBtnLap;
    private Button mBtnStop;
    private ScrollView mSvLaps;

    private Context mContext;
    private Chronometer mChronometer;
    private Thread mThreadChrono;

    private int mLaps=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext=this;

        mTVTime= (TextView) findViewById(R.id.tv_time);
        mEtLaps=(EditText) findViewById(R.id.et_laps);
        mSvLaps=(ScrollView) findViewById(R.id.sv_laps);
        mBtnStart=(Button) findViewById(R.id.Btn_Start);
        mBtnLap= (Button) findViewById(R.id.btn_lap);
        mBtnStop= (Button) findViewById(R.id.btn_stop);

        mBtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //El boton Start ha sido presionado
                //mTVTime.setText("Boton Start");
                if(mChronometer==null){
                    mChronometer=new Chronometer(mContext);
                    mThreadChrono=new Thread(mChronometer);
                    mThreadChrono.start();
                    mChronometer.start();

                    mLaps=1;
                    mEtLaps.setText("");
                }
            }
        });

        mBtnStop.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                        if(mChronometer!=null){
                            mChronometer.stop();
                            mThreadChrono.interrupt();
                            mThreadChrono=null;

                            mChronometer=null;
                        }
            }
        });

    }
    public void updateTimerText(final String time){
        runOnUiThread(new Runnable(){
            @Override
            public void run(){
                mTVTime.setText(time);
            }
        });

        mBtnLap.setOnClickListener(new View.OnClickListener(){
             @Override
            public void onClick(View v){

                 if(mChronometer==null){
                     return;
                 }

                 mEtLaps.append("Vuelta "+String.valueOf(mLaps)+" "
                         +String.valueOf(mTVTime)+"\n");

                 mSvLaps.post(new Runnable() {
                     @Override
                     public void run() {
                         mSvLaps.smoothScrollTo(0,mEtLaps.getBottom());
                     }
                 });

             }
        });
    }
}
