package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editTextName = findViewById(R.id.edtTxtName)

        
    }
    
    public void onBtnClick (View view) {
        TextView txtHello = findViewById(R.id.txtMessage);
        txtHello.setText("Hello");
    }
}
