package com.bharadwaj.rwqrcode;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button  btnScanBarcode,gcode,inter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnScanBarcode = findViewById(R.id.btnScanBarcode);
        gcode = findViewById(R.id.gcode);
        inter = findViewById(R.id.inter);

        btnScanBarcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ScannedBarcodeActivity.class));
            }
        });
        gcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, GenerateQRcode.class));
            }
        });
        inter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Interpreter.class));
            }
        });
    }
}