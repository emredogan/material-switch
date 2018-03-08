package com.emredogan.aswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.SwitchCompat;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SwitchCompat switchCompat;
    AppCompatCheckBox appCompatCheckBox;
    AppCompatRadioButton appCompatRadioButton;

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchCompat = (SwitchCompat) findViewById(R.id.switch_id);

        appCompatCheckBox = (AppCompatCheckBox) findViewById(R.id.checkbox_id);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup_id);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {
                    case R.id.RadioButton1_id:

                        Toast.makeText(MainActivity.this, "1111", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.RadioButton2_id:
                        Toast.makeText(MainActivity.this, "22222", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });



        appCompatCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b) {

                    Toast.makeText(MainActivity.this, "TRUE", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "FALSE", Toast.LENGTH_SHORT).show();

                }

            }
        });

        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                System.out.println(b);

                if(b) {

                    Toast.makeText(MainActivity.this, "TRUE", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "FALSE", Toast.LENGTH_SHORT).show();

                }

            }
        });


    }
}
