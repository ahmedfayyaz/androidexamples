package com.example.welcome.intentactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button =null;
    private Button button2= null;
    private static final String EXTRA_MESSAGE= "com.example.welcome.intentactivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button.setOnClickListener(listener);

    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent =new Intent(getApplicationContext(),SecondActivity.class);
            intent.putExtra(EXTRA_MESSAGE,"Hello Fayyaz");
            startActivity(intent);
        }
    };
}
