package com.example.testingmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

//public class MainActivity extends AppCompatActivity implements View.OnClickListener{
public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imgBtn1 = findViewById(R.id.img_btn_1);
        imgBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Imagen 1", Toast.LENGTH_SHORT).show();
                MenuDesplegableActivity.opcion = 1;
                Intent intent = new Intent(getApplicationContext(), MenuDesplegableActivity.class);
                startActivity(intent);
            }
        });

        ImageButton imgBtn2 = findViewById(R.id.img_btn_2);
        imgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Imagen 2", Toast.LENGTH_SHORT).show();
                MenuDesplegableActivity.opcion = 2;
                Intent intent = new Intent(getApplicationContext(), MenuDesplegableActivity.class);
                startActivity(intent);
            }
        });

        ImageButton imgBtn3 = findViewById(R.id.img_btn_3);
        imgBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Imagen 3", Toast.LENGTH_SHORT).show();
                MenuDesplegableActivity.opcion = 3;
                Intent intent = new Intent(getApplicationContext(), MenuDesplegableActivity.class);
                startActivity(intent);
            }
        });

        ImageButton imgBtn4 = findViewById(R.id.img_btn_4);
        imgBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Imagen 4", Toast.LENGTH_SHORT).show();
                MenuDesplegableActivity.opcion = 4;
                Intent intent = new Intent(getApplicationContext(), MenuDesplegableActivity.class);
                startActivity(intent);
            }
        });
    }
}
