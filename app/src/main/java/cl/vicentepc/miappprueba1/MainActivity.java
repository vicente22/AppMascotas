package cl.vicentepc.miappprueba1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewAppTitle;
    private TextView textViewCompleteForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        textViewAppTitle = findViewById(R.id.textViewAppTitle);
        textViewCompleteForm = findViewById(R.id.textViewCompleteForm);


    }

}
