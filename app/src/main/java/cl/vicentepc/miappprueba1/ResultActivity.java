package cl.vicentepc.miappprueba1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textViewPet1;
    private TextView textViewPet2;
    private TextView textViewPet3;
    private ImageView imageViewPet1;
    private ImageView imageViewPet2;
    private ImageView imageViewPet3;
    private TextView textViewResultName;
    private TextView textViewSpinnerPersonality;
    private TextView textViewSpinnerHome;
    private TextView textViewSpinnerZodiac;
    private TextView textViewSeekBarAge;
    private TextView textViewGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //TextViews
        textViewPet1 = findViewById(R.id.textViewPet1);
        textViewPet2 = findViewById(R.id.textViewPet2);
        textViewPet3 = findViewById(R.id.textViewPet3);
        textViewResultName = findViewById(R.id.textViewNameResult);
        textViewSpinnerPersonality = findViewById(R.id.textViewSpinnerPersonality);
        textViewSpinnerHome = findViewById(R.id.textViewSpinnerHome);
        textViewSpinnerZodiac = findViewById(R.id.textViewSpinnerZodiac);
        textViewSeekBarAge = findViewById(R.id.textoViewSeekBarAge);
        textViewGender = findViewById(R.id.textViewGender);

        //ImageViews
        imageViewPet1 = findViewById(R.id.imageViewPet1);
        imageViewPet2 = findViewById(R.id.imageViewPet2);
        imageViewPet3 = findViewById(R.id.imageViewPet3);

        //Igualamos a los putExtra
        String editTextCompleteName = getIntent().getStringExtra("editTextCompleteName");
        String spinnerPersonality = getIntent().getStringExtra("spinnerPersonality");
        String spinnerHome = getIntent().getStringExtra("spinnerHome");
        String spinnerZodiac = getIntent().getStringExtra("spinnerZodiac");
        String editTextYears = getIntent().getStringExtra("editTextYears");
        String radioGroupGender = getIntent().getStringExtra("radioGroupGender");

        textViewResultName.setText("Hola " + editTextCompleteName + ", tú resultado fue el siguiente: ");

        textViewSpinnerPersonality.setText("Eres " + spinnerPersonality);
        textViewSpinnerHome.setText("Vives en " + spinnerHome);
        textViewSpinnerZodiac.setText("Eres del signo: " + spinnerZodiac);

        textViewSeekBarAge.setText("Tienes " + editTextYears);

        if (radioGroupGender.equals("M")) {
            textViewGender.setText("Eres Hombre");
        } else {
            textViewGender.setText("Eres Mujer");
        }

        int[] pets = new Pets().get(spinnerPersonality, spinnerHome, spinnerZodiac, radioGroupGender);

        int pet1 = pets[0];
        int pet2 = pets[1];
        int pet3 = pets[2];

        imageViewPet1.setImageResource(pet1);
        imageViewPet1.setTag(pet1);
        imageViewPet2.setImageResource(pet2);
        imageViewPet2.setTag(pet2);
        imageViewPet3.setImageResource(pet3);
        imageViewPet3.setTag(pet3);

        if (pet1 == R.mipmap.boxer) {
            textViewPet1.setText("Boxer");
        } else if (pet1 == R.mipmap.caballo) {
            textViewPet1.setText("Caballo negro");
        } else if (pet1 == R.mipmap.beagle) {
            textViewPet1.setText("Beagle");
        } else if (pet1 == R.mipmap.bulldog) {
            textViewPet1.setText("Bulldog");
        } else if (pet1 == R.mipmap.bullterrier) {
            textViewPet1.setText("Bull Terrier");
        } else if (pet1 == R.mipmap.zebra) {
            textViewPet1.setText("Zebra");
        } else if (pet1 == R.mipmap.gatoangora) {
            textViewPet1.setText("Gato Angora");
        } else if (pet1 == R.mipmap.cocker) {
            textViewPet1.setText("Cocker");
        } else if (pet1 == R.mipmap.collie) {
            textViewPet1.setText("Collie");
        } else if (pet1 == R.mipmap.dalmata) {
            textViewPet1.setText("Dalmata");
        } else if (pet1 == R.mipmap.doberman) {
            textViewPet1.setText("Doberman");
        } else if (pet1 == R.mipmap.gatosiames) {
            textViewPet1.setText("Gato Siamés");
        } else if (pet1 == R.mipmap.gatopersa) {
            textViewPet1.setText("Gato Persa");
        } else if (pet1 == R.mipmap.grandanes) {
            textViewPet1.setText("Gran Danés");
        } else if (pet1 == R.mipmap.pastoraleman) {
            textViewPet1.setText("Pastor Alemán");
        } else if (pet1 == R.mipmap.sanbernardo) {
            textViewPet1.setText("San Bernardo");
        } else if (pet1 == R.mipmap.setterirlandes) {
            textViewPet1.setText("Setter irlandes");
        } else if (pet1 == R.mipmap.terrier) {
            textViewPet1.setText("Terrier");
        } else if (pet1 == R.mipmap.weimaraner) {
            textViewPet1.setText("Weimaraner");
        } else if (pet1 == R.mipmap.no_disponible) {
            textViewPet1.setText("SIN RESULTADO");
        } else {
            textViewPet1.setText("RESULTADO NO DISPONIBLE");
        }

        if (pet2 == R.mipmap.boxer) {
            textViewPet2.setText("Boxer");
        } else if (pet2 == R.mipmap.caballo) {
            textViewPet2.setText("Caballo negro");
        } else if (pet2 == R.mipmap.beagle) {
            textViewPet2.setText("Beagle");
        } else if (pet2 == R.mipmap.bulldog) {
            textViewPet2.setText("Bulldog");
        } else if (pet1 == R.mipmap.bullterrier) {
            textViewPet1.setText("Bull Terrier");
        } else if (pet1 == R.mipmap.zebra) {
            textViewPet1.setText("Zebra");
        } else if (pet1 == R.mipmap.gatoangora) {
            textViewPet1.setText("Gato Angora");
        } else if (pet2 == R.mipmap.gatoangora) {
            textViewPet2.setText("Cocker");
        } else if (pet2 == R.mipmap.collie) {
            textViewPet2.setText("Collie");
        } else if (pet2 == R.mipmap.dalmata) {
            textViewPet2.setText("Dalmata");
        } else if (pet2 == R.mipmap.doberman) {
            textViewPet2.setText("Doberman");
        } else if (pet2 == R.mipmap.gatosiames) {
            textViewPet2.setText("Gato Siamés");
        } else if (pet2 == R.mipmap.gatopersa) {
            textViewPet2.setText("Gato Persa");
        } else if (pet2 == R.mipmap.grandanes) {
            textViewPet2.setText("Gran Danés");
        } else if (pet2 == R.mipmap.pastoraleman) {
            textViewPet2.setText("Pastor Alemán");
        } else if (pet2 == R.mipmap.setterirlandes) {
            textViewPet2.setText("Setter Irlandés");
        } else if (pet2 == R.mipmap.sanbernardo) {
            textViewPet2.setText("San Bernardo");
        } else if (pet2 == R.mipmap.terrier) {
            textViewPet2.setText("Doberman");
        } else if (pet2 == R.mipmap.weimaraner) {
            textViewPet2.setText("Weimaraner");
        } else if (pet2 == R.mipmap.no_disponible) {
            textViewPet2.setText("SIN RESULTADO");
        } else {
            textViewPet2.setText("RESULTADO NO DISPONIBLE");
        }
        if (pet3 == R.mipmap.boxer) {
            textViewPet3.setText("Boxer");
        } else if (pet3 == R.mipmap.caballo) {
            textViewPet3.setText("Caballo negro");
        } else if (pet3 == R.mipmap.beagle) {
            textViewPet3.setText("Beagle");
        } else if (pet3 == R.mipmap.bulldog) {
            textViewPet3.setText("Bulldog");
        } else if (pet1 == R.mipmap.bullterrier) {
            textViewPet1.setText("Bull Terrier");
        } else if (pet1 == R.mipmap.zebra) {
            textViewPet1.setText("Zebra");
        } else if (pet1 == R.mipmap.gatoangora) {
            textViewPet1.setText("Gato Angora");
        } else if (pet3 == R.mipmap.cocker) {
            textViewPet3.setText("Cocker");
        } else if (pet3 == R.mipmap.collie) {
            textViewPet3.setText("Collie");
        } else if (pet3 == R.mipmap.dalmata) {
            textViewPet3.setText("Dalmata");
        } else if (pet3 == R.mipmap.doberman) {
            textViewPet3.setText("Doberman");
        } else if (pet3 == R.mipmap.gatosiames) {
            textViewPet3.setText("Gato Siamés");
        } else if (pet3 == R.mipmap.gatopersa) {
            textViewPet3.setText("Gato Persa");
        } else if (pet3 == R.mipmap.grandanes) {
            textViewPet3.setText("Gran Danés");
        } else if (pet3 == R.mipmap.pastoraleman) {
            textViewPet3.setText("Pastor Alemán");
        } else if (pet3 == R.mipmap.setterirlandes) {
            textViewPet3.setText("Setter Islandés");
        } else if (pet3 == R.mipmap.sanbernardo) {
            textViewPet3.setText("San Bernardo");
        } else if (pet3 == R.mipmap.terrier) {
            textViewPet3.setText("Doberman");
        } else if (pet3 == R.mipmap.weimaraner) {
            textViewPet3.setText("Weimaraner");
        } else if (pet3 == R.mipmap.no_disponible) {
            textViewPet3.setText("SIN RESULTADO");
        } else {
            textViewPet3.setText("RESULTADO NO DISPONIBLE");
        }


        imageViewPet1.setOnClickListener(this);
        imageViewPet2.setOnClickListener(this);
        imageViewPet3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int resource = (int) v.getTag();
        Intent intent3 = new Intent(ResultActivity.this, InfoActivity.class);
        intent3.putExtra("petImage", resource);
        startActivity(intent3);
    }
}
