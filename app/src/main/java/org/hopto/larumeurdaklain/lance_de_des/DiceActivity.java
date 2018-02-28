package org.hopto.larumeurdaklain.lance_de_des;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.SecureRandom;

public class DiceActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textResult;
    private int maximum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        maximum = getIntent().getIntExtra("maximum", 0);

        TextView textTitre = findViewById(R.id.textTitre);
        String titre = "Dé de " + maximum;
        textTitre.setText(titre);

        textResult = findViewById(R.id.textResultat);
        textResult.setText("");

        Button buttonLancer = findViewById(R.id.buttonLancer);
        buttonLancer.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        SecureRandom random = new SecureRandom();
        int result = random.nextInt(maximum) + 1;
        textResult.setText(String.valueOf(result));
    }
}
