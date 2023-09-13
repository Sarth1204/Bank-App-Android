package com.example.bank_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class allpeople extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allpeople);

        Button btn1 = (Button) findViewById(R.id.one);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(allpeople.this,one.class));
            }
        });

        Button btn2 = (Button) findViewById(R.id.two);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(allpeople.this,two.class));
            }
        });


        Button btn3 = (Button) findViewById(R.id.three);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(allpeople.this,three.class));
            }
        });

        Button btn4 = (Button) findViewById(R.id.four);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(allpeople.this,four.class));
            }
        });


        Button btn5 = (Button) findViewById(R.id.five);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(allpeople.this,five.class));
            }
        });


        Button btn6 = (Button) findViewById(R.id.six);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(allpeople.this,six.class));
            }
        });

        Button btn7 = (Button) findViewById(R.id.seven);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(allpeople.this,seven.class));
            }
        });

        Button btn8 = (Button) findViewById(R.id.eight);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(allpeople.this,eight.class));
            }
        });


        Button btn9 = (Button) findViewById(R.id.nine);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(allpeople.this,nine.class));
            }
        });


        Button btn10 = (Button) findViewById(R.id.ten);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(allpeople.this,ten.class));
            }
        });


        Button btn11 = (Button) findViewById(R.id.eleven);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(allpeople.this,eleven.class));
            }
        });


        Button btn12 = (Button) findViewById(R.id.twelve);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(allpeople.this,twelve.class));
            }
        });

        Button btn13 = (Button) findViewById(R.id.thirteen);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(allpeople.this,thirteen.class));
            }
        });

        Button btn14 = (Button) findViewById(R.id.fourteen);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(allpeople.this,fourteen.class));
            }
        });
    }
}