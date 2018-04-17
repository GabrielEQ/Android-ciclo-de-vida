package br.com.fiap.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Ciclo", "Passei pelo ciclo onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CICLO", "Passei pelo ciclo onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CICLO", "Passei pelo ciclo onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("CICLO", "Passei pelo ciclo onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CICLO","Passei pelo ciclo onDestroy");
    }
}
