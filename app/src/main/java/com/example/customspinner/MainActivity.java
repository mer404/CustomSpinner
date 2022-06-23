package com.example.customspinner;

import android.os.Bundle;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    String[] cityList = {"Python", "Java", "PHP", "Javascript"};
    int[] image = {R.drawable.python, R.drawable.java, R.drawable.php, R.drawable.javascript};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        spinner = findViewById(R.id.spinner);

        CustomSpinner adapter = new CustomSpinner(cityList, image, MainActivity.this);
        spinner.setAdapter(adapter);

    }
}