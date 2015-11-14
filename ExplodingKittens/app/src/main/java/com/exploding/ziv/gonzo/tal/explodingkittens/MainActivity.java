package com.exploding.ziv.gonzo.tal.explodingkittens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartGame(View view) {
        try {
            Intent intent = new Intent(this, MainGame.class);
            startActivity(intent);
        }
        catch (Exception e){
            Log.i("explodingLog",e.toString());
        }
    }
}
