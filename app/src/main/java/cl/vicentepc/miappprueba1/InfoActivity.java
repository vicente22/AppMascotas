package cl.vicentepc.miappprueba1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private TextView textViewPetTitle;
    private TextView textViewResultInfoPet;

    private TextView textViewInfoPetHeightMale;
    private TextView textViewInfoPetHeightFemale;
    private TextView textViewInfoPetWeightMale;
    private TextView textViewInfoPetWeightFemale;
    private TextView textViewInfoPetChar;

    private ImageView imageViewInfoPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        textViewPetTitle = findViewById(R.id.textViewPetTitle);
        textViewResultInfoPet = findViewById(R.id.textViewResultInfoPet);

        textViewInfoPetHeightMale = findViewById(R.id.textViewInfoPetHeightMale);
        textViewInfoPetHeightFemale = findViewById(R.id.textViewInfoPetHeightFemale);
        textViewInfoPetWeightMale = findViewById(R.id.textViewInfoPetWeightMale);
        textViewInfoPetWeightFemale = findViewById(R.id.textViewInfoPetWeightFemale);
        textViewInfoPetChar = findViewById(R.id.textViewInfoPetChar);

        imageViewInfoPet = findViewById(R.id.imageViewInfoPet);

        Pets petInfo = new Pets();

        int petImage = getIntent().getIntExtra("petImage", -1);
        String title="";
        String info = "";

        switch (petImage){
            case R.mipmap.beagle:
                title = "Beagle";
                info = getString(R.string.infoBeagle);
                imageViewInfoPet.setImageResource(R.mipmap.beagle);
                petInfo.setPetHeightMale("36-41 cm");
                petInfo.setPetHeightFemale("33-38 cm");
                petInfo.setPetWeightMale("10-11 kg");
                petInfo.setPetWeightFemale("9 - 10kg");
                petInfo.setPetChar("Amistoso, Determinado, Inteligente, Excitable, Gentil, Apacible");
                break;
            case R.mipmap.boxer:
                title= "Boxer";
                info = getString(R.string.infoBoxer);
                imageViewInfoPet.setImageResource(R.mipmap.boxer);
                petInfo.setPetHeightMale("57-63 cm");
                petInfo.setPetHeightFemale("53-60 cm");
                petInfo.setPetWeightMale("27-32 kg");
                petInfo.setPetWeightFemale("25-29 kg");
                petInfo.setPetChar("Devoto, Energético, Amigable, Leal, Intrépido, Juguetón, Alegre, Confiado");
                break;
            case R.mipmap.bulldog:
                title= "Bulldog";
                info = getString(R.string.infoBulldog);
                imageViewInfoPet.setImageResource(R.mipmap.bulldog);
                petInfo.setPetHeightMale("31-40 cm");
                petInfo.setPetHeightFemale("31-30 cm");
                petInfo.setPetWeightMale("23-25 kg");
                petInfo.setPetWeightFemale("18-23 kg");
                petInfo.setPetChar("Gregario, Voluntarioso, Dócil, Amigable");
                break;
            case R.mipmap.bullterrier:
                title= "Bullterrier";
                info = getString(R.string.infoBullTerrier);
                imageViewInfoPet.setImageResource(R.mipmap.bullterrier);
                petInfo.setPetHeightMale("53-55 cm");
                petInfo.setPetHeightFemale("53-55 cm");
                petInfo.setPetWeightMale("22-30 kg");
                petInfo.setPetWeightFemale("22-30 kg");
                petInfo.setPetChar("Entrenable, Afable, Protector, Estusiasta");
                break;
            case R.mipmap.caballo:
                title= "Caballo";
                info = getString(R.string.infoHorse);
                imageViewInfoPet.setImageResource(R.mipmap.caballo);
                petInfo.setPetHeightMale("1.4-1.8 m");
                petInfo.setPetHeightFemale("1.4-1.8 m");
                petInfo.setPetWeightMale("380-550 kg");
                petInfo.setPetWeightFemale("380-550 kg");
                petInfo.setPetChar("Transparente, Impaciente, Necio, Esquemático");
                break;
            case R.mipmap.cocker:
                title= "Cocker";
                info = getString(R.string.infoCocker);
                imageViewInfoPet.setImageResource(R.mipmap.cocker);
                petInfo.setPetHeightMale("38-43 cm");
                petInfo.setPetHeightFemale("36-41 cm");
                petInfo.setPetWeightMale("12-15 kg");
                petInfo.setPetWeightFemale("13-16 kg");
                petInfo.setPetChar("Entrenable, Cariñoso, Amigable, Juguetón");
                break;
            case R.mipmap.collie:
                title= "Collie";
                info = getString(R.string.infoCollie);
                imageViewInfoPet.setImageResource(R.mipmap.collie);
                petInfo.setPetHeightMale("48-56 cm");
                petInfo.setPetHeightFemale("48-56 cm");
                petInfo.setPetWeightMale("20-29 kg");
                petInfo.setPetWeightFemale("18-25 kg");
                petInfo.setPetChar("Amigable, Gentil, Leal, Inteligente");
                break;
            case R.mipmap.dalmata:
                title= "Dalmata";
                info = getString(R.string.infoDalmata);
                imageViewInfoPet.setImageResource(R.mipmap.dalmata);
                petInfo.setPetHeightMale("58-61 cm");
                petInfo.setPetHeightFemale("56-58 cm");
                petInfo.setPetWeightMale("15-32 kg");
                petInfo.setPetWeightFemale("16-24 kg");
                petInfo.setPetChar("Extrovertido, Jueguetón, Amigable, Sensible, Enérgico, Inteligente");
                break;
            case R.mipmap.doberman:
                title= "Doberman";
                info = getString(R.string.infoDoberman);
                imageViewInfoPet.setImageResource(R.mipmap.doberman);
                petInfo.setPetHeightMale("66-72 cm");
                petInfo.setPetHeightFemale("61-68 cm");
                petInfo.setPetWeightMale("40-45 kg");
                petInfo.setPetWeightFemale("32-35 kg");
                petInfo.setPetChar("Intrépido, Alerta, Enérgico, Obediente, Leal, Confiado");
                break;
            case R.mipmap.gatosiames:
                title= "Gato Siamés";
                info = getString(R.string.infoSiameseCat);
                imageViewInfoPet.setImageResource(R.mipmap.gatosiames);
                petInfo.setPetHeightMale("25-30 cm");
                petInfo.setPetHeightFemale("25-30 cm");
                petInfo.setPetWeightMale("3 kg");
                petInfo.setPetWeightFemale("3 kg");
                petInfo.setPetChar("Afectuoso, Positivo, Devoto");
                break;
            case R.mipmap.gatoangora:
                title= "Gato Angora";
                info = getString(R.string.infoGatoAngora);
                imageViewInfoPet.setImageResource(R.mipmap.gatoangora);
                petInfo.setPetHeightMale("25-30 cm");
                petInfo.setPetHeightFemale("25-30 cm");
                petInfo.setPetWeightMale("3-5,5 kg");
                petInfo.setPetWeightFemale("3-5,5 kg");
                petInfo.setPetChar("Afectuoso, Elegante, Fiel, Tranquilo");
                break;
            case R.mipmap.gatopersa:
                title= "Gato Persa";
                info = getString(R.string.infoPersianCat);
                imageViewInfoPet.setImageResource(R.mipmap.gatopersa);
                petInfo.setPetHeightMale("25-30 cm");
                petInfo.setPetHeightFemale("25-30 cm");
                petInfo.setPetWeightMale("3,5-7 kg");
                petInfo.setPetWeightFemale("3,5-7 kg");
                petInfo.setPetChar("Tranquilo, Sosegado, Cariñoso, Afable");
                break;
            case R.mipmap.grandanes:
                title= "Gran Danés";
                info = getString(R.string.infoGreatDanish);
                imageViewInfoPet.setImageResource(R.mipmap.grandanes);
                petInfo.setPetHeightMale("76-86 cm");
                petInfo.setPetHeightFemale("71-81 cm");
                petInfo.setPetWeightMale("54-90 kg");
                petInfo.setPetWeightFemale("45-59 kg");
                petInfo.setPetChar("Amigable, Reservado, Devoto, Gentil");
                break;
            case R.mipmap.huron:
                title= "Hurón";
                info = getString(R.string.infoHuron);
                imageViewInfoPet.setImageResource(R.mipmap.huron);
                petInfo.setPetHeightMale("45 cm");
                petInfo.setPetHeightFemale("35 cm");
                petInfo.setPetWeightMale("1,6-2,5 kg");
                petInfo.setPetWeightFemale("0,8-1,3 cm");
                petInfo.setPetChar("Sociables, Juguetónes, Se  les debe dedicar tiempo");
                break;
            case R.mipmap.pastoraleman:
                title= "Pastor Alemán";
                info = getString(R.string.infoGermanShepard);
                imageViewInfoPet.setImageResource(R.mipmap.pastoraleman);
                petInfo.setPetHeightMale("60-65 cm");
                petInfo.setPetHeightFemale("55-60 cm");
                petInfo.setPetWeightMale("30-40 kg");
                petInfo.setPetWeightFemale("22-32 kg");
                petInfo.setPetChar("Curioso, Obediente, Leal Confiado, Alerta, Inteligente");
                break;
            case R.mipmap.sanbernardo:
                title= "San Bernardo";
                info = getString(R.string.infoSaintBernard);
                imageViewInfoPet.setImageResource(R.mipmap.sanbernardo);
                petInfo.setPetHeightMale("78-86 cm");
                petInfo.setPetHeightFemale("70-82 cm");
                petInfo.setPetWeightMale("55-90 kg");
                petInfo.setPetWeightFemale("55-90 kg");
                petInfo.setPetChar("Amigable, Gentil, Vivaz, Vigilante");
                break;
            case R.mipmap.setterirlandes:
                title= "Setter Irlandés";
                info = getString(R.string.infoIrishSetter);
                imageViewInfoPet.setImageResource(R.mipmap.setterirlandes);
                petInfo.setPetHeightMale("58-67 cm");
                petInfo.setPetHeightFemale("55-62 cm");
                petInfo.setPetWeightMale("27-32 kg");
                petInfo.setPetWeightFemale("24-29 kg");
                petInfo.setPetChar("Cariñoso, Vivaz, Energético, Independiente");
                break;
            case R.mipmap.terrier:
                title= "Yorkshire Terrier";
                info = getString(R.string.infoTerrier);
                imageViewInfoPet.setImageResource(R.mipmap.terrier);
                petInfo.setPetHeightMale("17 cm");
                petInfo.setPetHeightFemale("17 cm");
                petInfo.setPetWeightMale("5-8 kg");
                petInfo.setPetWeightFemale("4-7 kg");
                petInfo.setPetChar("Animados, Independientes, Nerviosos");
                break;
            case R.mipmap.weimaraner:
                title= "Weimaraner";
                info = getString(R.string.infoWeimaraner);
                imageViewInfoPet.setImageResource(R.mipmap.weimaraner);
                petInfo.setPetHeightMale("62-67 cm");
                petInfo.setPetHeightFemale("59-63 cm");
                petInfo.setPetWeightMale("30-40 kg");
                petInfo.setPetWeightFemale("25-35 kg");
                petInfo.setPetChar("Firme, Enérgico, Reservado, Alerta, Obstinado, Inteligente");
                break;
            case R.mipmap.zebra:
                title= "Weimaraner";
                info = getString(R.string.infoZebra);
                imageViewInfoPet.setImageResource(R.mipmap.zebra);
                petInfo.setPetHeightMale("1,3 m");
                petInfo.setPetHeightFemale("1,3 m");
                petInfo.setPetWeightMale("240-320 kg");
                petInfo.setPetWeightFemale("240-320 kg");
                petInfo.setPetChar("Vive en grupos, Mamífero Gregario");
                break;
        }

        textViewPetTitle.setText(title);
        textViewResultInfoPet.setText(info);

        textViewInfoPetHeightMale.setText(petInfo.getPetHeightMale());
        textViewInfoPetHeightFemale.setText(petInfo.getPetHeightFemale());
        textViewInfoPetWeightMale.setText(petInfo.getPetWeightMale());
        textViewInfoPetWeightFemale.setText(petInfo.getPetWeightFemale());
        textViewInfoPetChar.setText(petInfo.getPetChar());

    }
}
