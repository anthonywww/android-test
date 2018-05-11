package com.github.anthonywww.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setContentView(R.layout.activity_main);
        this.findViewById(R.id.startButton).setOnClickListener(new HandleButton());
    }

    private class HandleButton implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, AltActivity.class);
            startActivity(intent);
        }
    }

    public void begin() {

    }

}
