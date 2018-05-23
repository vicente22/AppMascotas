package cl.vicentepc.miappprueba1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private TextView textViewPetTitle;
    private TextView textViewResultInfoPet;

    private ImageView imageViewInfoPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        textViewPetTitle = findViewById(R.id.textViewPetTitle);
        textViewResultInfoPet = findViewById(R.id.textViewResultInfoPet);

        imageViewInfoPet = findViewById(R.id.imageViewInfoPet);

        int petImage = getIntent().getIntExtra("petImage", -1);
        String title="";
        String info = "";

        switch (petImage){
            case R.mipmap.beagle:
                title = "Beagle";
                info = getString(R.string.infoBeagle);
                imageViewInfoPet.setImageResource(R.mipmap.beagle);
                break;
            case R.mipmap.boxer:
                title= "Boxer";
                info = getString(R.string.infoBoxer);
                imageViewInfoPet.setImageResource(R.mipmap.boxer);
                break;
            case R.mipmap.bulldog:
                title= "Bulldog";
                info = getString(R.string.infoBulldog);
                imageViewInfoPet.setImageResource(R.mipmap.bulldog);
                break;
            case R.mipmap.bullterrier:
                title= "Bullterrier";
                info = getString(R.string.infoBullTerrier);
                imageViewInfoPet.setImageResource(R.mipmap.bullterrier);
                break;
            case R.mipmap.caballo:
                title= "Caballo";
                info = getString(R.string.infoHorse);
                imageViewInfoPet.setImageResource(R.mipmap.caballo);
                break;
            case R.mipmap.cocker:
                title= "Cocker";
                info = getString(R.string.infoCocker);
                imageViewInfoPet.setImageResource(R.mipmap.cocker);
                break;
            case R.mipmap.collie:
                title= "Collie";
                info = getString(R.string.infoCollie);
                imageViewInfoPet.setImageResource(R.mipmap.collie);
                break;
            case R.mipmap.dalmata:
                title= "Dalmata";
                info = getString(R.string.infoDalmata);
                imageViewInfoPet.setImageResource(R.mipmap.dalmata);
                break;
            case R.mipmap.doberman:
                title= "Doberman";
                info = getString(R.string.infoDoberman);
                imageViewInfoPet.setImageResource(R.mipmap.doberman);
                break;
            case R.mipmap.gatosiames:
                title= "Gato Siamés";
                info = getString(R.string.infoSiameseCat);
                imageViewInfoPet.setImageResource(R.mipmap.gatosiames);
                break;
            case R.mipmap.gatoangora:
                title= "Gato Angora";
                info = getString(R.string.infoGatoAngora);
                imageViewInfoPet.setImageResource(R.mipmap.gatoangora);
                break;
            case R.mipmap.gatopersa:
                title= "Gato Persa";
                info = getString(R.string.infoPersianCat);
                imageViewInfoPet.setImageResource(R.mipmap.gatopersa);
                break;
            case R.mipmap.grandanes:
                title= "Gran Danés";
                info = getString(R.string.infoGreatDanish);
                imageViewInfoPet.setImageResource(R.mipmap.grandanes);
                break;
            case R.mipmap.huron:
                title= "Bulldog";
                info = getString(R.string.infoHuron);
                imageViewInfoPet.setImageResource(R.mipmap.huron);
                break;
            case R.mipmap.pastoraleman:
                title= "Pastor Alemán";
                info = getString(R.string.infoGermanShepard);
                imageViewInfoPet.setImageResource(R.mipmap.pastoraleman);
                break;
            case R.mipmap.sanbernardo:
                title= "San Bernardo";
                info = getString(R.string.infoSaintBernard);
                imageViewInfoPet.setImageResource(R.mipmap.sanbernardo);
                break;
            case R.mipmap.setterirlandes:
                title= "Setter Irlandés";
                info = getString(R.string.infoIrishSetter);
                imageViewInfoPet.setImageResource(R.mipmap.setterirlandes);
                break;
            case R.mipmap.terrier:
                title= "Terrier";
                info = getString(R.string.infoTerrier);
                imageViewInfoPet.setImageResource(R.mipmap.terrier);
                break;
            case R.mipmap.weimaraner:
                title= "Weimaraner";
                info = getString(R.string.infoWeimaraner);
                imageViewInfoPet.setImageResource(R.mipmap.weimaraner);
                break;
            case R.mipmap.zebra:
                title= "Weimaraner";
                info = getString(R.string.infoZebra);
                imageViewInfoPet.setImageResource(R.mipmap.zebra);
                break;
        }

        textViewPetTitle.setText(title);
        textViewResultInfoPet.setText(info);

    }
}
