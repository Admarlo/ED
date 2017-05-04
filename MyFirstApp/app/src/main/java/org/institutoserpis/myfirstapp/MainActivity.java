package org.institutoserpis.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String Extra_MESSAGE="org.institutoserpis.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//para que la app siga en segudo plano es espera
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view){
        //Toast.makeText(this, "Ha hecho click",Toast.LENGTH_LONG).show();
        EditText editText=(EditText) findViewById(R.id.edit_message);
        Intent intent= new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(Extra_MESSAGE, editText.getText().toString());
        startActivity(intent);

    }
}
