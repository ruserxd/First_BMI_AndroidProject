package com.example.first_application;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText edHeight;
    private EditText edWeight;
    private Button button;
    private TextView txtresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //創建物件
        edHeight = findViewById(R.id.edHeight);
        edWeight = findViewById(R.id.edWeight);
        button = findViewById(R.id.button);
        txtresult = findViewById(R.id.result2);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View view) {
                double weight = Double.parseDouble(edWeight.getText().toString());
                double height = Double.parseDouble(edHeight.getText().toString());
                height /= 100;
                double BMI = weight/(height*height);
                txtresult.setText(String.format("%.2f",BMI));
            }
        });
    }
}