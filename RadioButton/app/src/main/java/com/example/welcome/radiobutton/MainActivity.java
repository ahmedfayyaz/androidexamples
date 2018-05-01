package com.example.welcome.radiobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_pirates:
                if (checked)
                    // Pirates
                    Toast.makeText(this, "you clicked pirates", Toast.LENGTH_LONG).show();
                break;
            case R.id.radio_ninjas:
                if (checked)
                    // Ninjas rule
                    Toast.makeText(this, "you clicked ninja", Toast.LENGTH_LONG).show();
                break;
        }
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkbox_meat:
                if (checked) {
                    // Put some meat on the sandwich
                } else {
                    // Remove the meat
                }
                break;
            case R.id.checkbox_cheese:
                if (checked) {

                }
                // Cheese me
                else {

                }
                // I'm lactose intolerant
                break;
            // TODO: Veggie sandwich
        }
    }
}
