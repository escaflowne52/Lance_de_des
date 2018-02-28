package org.hopto.larumeurdaklain.lance_de_des;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("@string/activityTitle");

        Button myButton4 = findViewById(R.id.button4);
        myButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Lancé de Dés", "Dés de 4 lancé");
                Intent myIntent = new Intent(MainActivity.this, DiceActivity.class);
                myIntent.putExtra("maximum", 4);
                startActivity(myIntent);
            }
        });

        Button myButton6 = findViewById(R.id.button6);
        myButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Lancé de Dés", "Dés de 6 lancé");
                Intent myIntent = new Intent(MainActivity.this, DiceActivity.class);
                myIntent.putExtra("maximum", 6);
                startActivity(myIntent);
            }
        });

        Button myButton8 = findViewById(R.id.button8);
        myButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Lancé de Dés", "Dés de 8 lancé");
                Intent myIntent = new Intent(MainActivity.this, DiceActivity.class);
                myIntent.putExtra("maximum", 8);
                startActivity(myIntent);
            }
        });

        Button myButton10 = findViewById(R.id.button10);
        myButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Lancé de Dés", "Dés de 10 lancé");
                Intent myIntent = new Intent(MainActivity.this, DiceActivity.class);
                myIntent.putExtra("maximum", 10);
                startActivity(myIntent);
            }
        });

        Button myButton12 = findViewById(R.id.button12);
        myButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Lancé de Dés", "Dés de 12 lancé");
                Intent myIntent = new Intent(MainActivity.this, DiceActivity.class);
                myIntent.putExtra("maximum", 12);
                startActivity(myIntent);
            }
        });

        Button myButton16 = findViewById(R.id.button16);
        myButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Lancé de Dés", "Dés de 16 lancé");
                Intent myIntent = new Intent(MainActivity.this, DiceActivity.class);
                myIntent.putExtra("maximum", 16);
                startActivity(myIntent);
            }
        });

        Button myButton20 = findViewById(R.id.button20);
        myButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Lancé de Dés", "Dés de 20 lancé");
                Intent myIntent = new Intent(MainActivity.this, DiceActivity.class);
                myIntent.putExtra("maximum", 20);
                startActivity(myIntent);
            }
        });

        Button myButton30 = findViewById(R.id.button30);
        myButton30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Lancé de Dés", "Dés de 30 lancé");
                Intent myIntent = new Intent(MainActivity.this, DiceActivity.class);
                myIntent.putExtra("maximum", 30);
                startActivity(myIntent);
            }
        });
    }
}
