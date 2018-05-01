package com.example.welcome.intentactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button button3= null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(listener);
    }


    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent sendIntent = new Intent(Intent.ACTION_SEND);
            String title = getResources().getString(R.string.chooser_title);
            Intent chooser = Intent.createChooser(sendIntent, title);
            if (sendIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(chooser);
            }
        }
    };
}
