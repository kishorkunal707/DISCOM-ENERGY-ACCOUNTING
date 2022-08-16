package com.example.discomenergyaccounting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MeterActivity2 extends AppCompatActivity {

    private Button meter2panel_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter2);

        // OnClick for Panel Activity
        meter2panel_Button = findViewById(R.id.meter2panel_Button);
        meter2panel_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MeterActivity2.this, PanelActivity3.class));
            }
        });
    }
}