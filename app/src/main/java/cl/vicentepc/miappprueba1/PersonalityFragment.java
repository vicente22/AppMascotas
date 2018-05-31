package cl.vicentepc.miappprueba1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class PersonalityFragment extends Fragment {

    private TextView textViewPetTitle;
    private TextView textViewInfoPetChar;
    private TextView textViewInfoPetPerso;

    private ImageView imageViewInfoPet;


    public PersonalityFragment() {
        // Required empty public constructor
    }

    public static PersonalityFragment newInstance(int sectionNumber) {

        return new PersonalityFragment();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_personality, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textViewPetTitle = view.findViewById(R.id.textViewPetTitle);

        textViewInfoPetChar = view.findViewById(R.id.textViewInfoPetChar);

        textViewInfoPetPerso = view.findViewById(R.id.textViewInfoPetPerso);

        imageViewInfoPet = view.findViewById(R.id.imageViewInfoPet);

        String[] petCharac = {
                "Amistoso, Determinado, Inteligente, Excitable, Gentil, Apacible",//1
                "Devoto, Energético, Amigable, Leal, Intrépido, Juguetón, Alegre, Confiado",//2
                "Gregario, Voluntarioso, Dócil, Amigable",//3
                "Entrenable, Afable, Protector, Estusiasta",//4
                "Transparente, Impaciente, Necio, Esquemático",//5
                "Entrenable, Cariñoso, Amigable, Juguetón",//6
                "Amigable, Gentil, Leal, Inteligente",//7
                "Extrovertido, Jueguetón, Amigable, Sensible, Enérgico, Inteligente",//8
                "Intrépido, Alerta, Enérgico, Obediente, Leal, Confiado",//9
                "Afectuoso, Positivo, Devoto",//10
                "Afectuoso, Elegante, Fiel, Tranquilo",//11
                "Tranquilo, Sosegado, Cariñoso, Afable",//12
                "Amigable, Reservado, Devoto, Gentil",//13
                "Sociables, Juguetónes, Se  les debe dedicar tiempo",//14
                "Curioso, Obediente, Leal Confiado, Alerta, Inteligente",//15
                "Amigable, Gentil, Vivaz, Vigilante",//16
                "Cariñoso, Vivaz, Energético, Independiente",//17
                "Animados, Independientes, Nerviosos",//18
                "Firme, Enérgico, Reservado, Alerta, Obstinado, Inteligente",//19
                "Vive en grupos, Mamífero Gregario"//20
        };

        Pets petInfo = new Pets();

        int petImage = getActivity().getIntent().getIntExtra("petImage", -1);

        String title="";

        switch (petImage){
            case R.mipmap.beagle:
                title = "Beagle";
                imageViewInfoPet.setImageResource(R.mipmap.beagle);
                petInfo.setPetChar(petCharac[0]);
                textViewInfoPetPerso.setText(R.string.beagleCharac);
                break;
            case R.mipmap.boxer:
                title= "Boxer";
                imageViewInfoPet.setImageResource(R.mipmap.boxer);
                petInfo.setPetChar(petCharac[1]);
                textViewInfoPetPerso.setText(R.string.boxerCharac);
                break;
            case R.mipmap.bulldog:
                title= "Bulldog";
                imageViewInfoPet.setImageResource(R.mipmap.bulldog);
                petInfo.setPetChar(petCharac[2]);
                textViewInfoPetPerso.setText(R.string.bulldogCharac);
                break;
            case R.mipmap.bullterrier:
                title= "Bullterrier";
                imageViewInfoPet.setImageResource(R.mipmap.bullterrier);
                petInfo.setPetChar(petCharac[3]);
                textViewInfoPetPerso.setText(R.string.bullterrierCharac);
                break;
            case R.mipmap.caballo:
                title= "Caballo";
                imageViewInfoPet.setImageResource(R.mipmap.caballo);
                petInfo.setPetChar(petCharac[4]);
                textViewInfoPetPerso.setText(R.string.caballoCharac);
                break;
            case R.mipmap.cocker:
                title= "Cocker";
                imageViewInfoPet.setImageResource(R.mipmap.cocker);
                petInfo.setPetChar(petCharac[5]);
                textViewInfoPetPerso.setText(R.string.cockerCharac);
                break;
            case R.mipmap.collie:
                title= "Collie";
                imageViewInfoPet.setImageResource(R.mipmap.collie);
                petInfo.setPetChar(petCharac[6]);
                textViewInfoPetPerso.setText(R.string.collieCharac);
                break;
            case R.mipmap.dalmata:
                title= "Dalmata";
                imageViewInfoPet.setImageResource(R.mipmap.dalmata);
                petInfo.setPetChar(petCharac[7]);
                textViewInfoPetPerso.setText(R.string.dalmataCharac);
                break;
            case R.mipmap.doberman:
                title= "Doberman";
                imageViewInfoPet.setImageResource(R.mipmap.doberman);
                petInfo.setPetChar(petCharac[8]);
                textViewInfoPetPerso.setText(R.string.dobermanCharac);
                break;
            case R.mipmap.gatosiames:
                title= "Gato Siamés";
                imageViewInfoPet.setImageResource(R.mipmap.gatosiames);
                petInfo.setPetChar(petCharac[9]);
                textViewInfoPetPerso.setText(R.string.gatoSiamesCharac);
                break;
            case R.mipmap.gatoangora:
                title= "Gato Angora";
                imageViewInfoPet.setImageResource(R.mipmap.gatoangora);
                petInfo.setPetChar(petCharac[10]);
                textViewInfoPetPerso.setText(R.string.gatoAngoraCharac);
                break;
            case R.mipmap.gatopersa:
                title= "Gato Persa";
                imageViewInfoPet.setImageResource(R.mipmap.gatopersa);
                petInfo.setPetChar(petCharac[11]);
                textViewInfoPetPerso.setText(R.string.gatoPersaCharac);
                break;
            case R.mipmap.grandanes:
                title= "Gran Danés";
                imageViewInfoPet.setImageResource(R.mipmap.grandanes);
                petInfo.setPetChar(petCharac[12]);
                textViewInfoPetPerso.setText(R.string.granDanesCharac);
                break;
            case R.mipmap.huron:
                title= "Hurón";
                imageViewInfoPet.setImageResource(R.mipmap.huron);
                petInfo.setPetChar(petCharac[13]);
                textViewInfoPetPerso.setText(R.string.huronCharac);
                break;
            case R.mipmap.pastoraleman:
                title= "Pastor Alemán";
                imageViewInfoPet.setImageResource(R.mipmap.pastoraleman);
                petInfo.setPetChar(petCharac[14]);
                textViewInfoPetPerso.setText(R.string.pastorAlemanCharac);
                break;
            case R.mipmap.sanbernardo:
                title= "San Bernardo";
                imageViewInfoPet.setImageResource(R.mipmap.sanbernardo);
                petInfo.setPetChar(petCharac[15]);
                textViewInfoPetPerso.setText(R.string.sanBernardoCharac);
                break;
            case R.mipmap.setterirlandes:
                title= "Setter Irlandés";
                imageViewInfoPet.setImageResource(R.mipmap.setterirlandes);
                petInfo.setPetChar(petCharac[16]);
                textViewInfoPetPerso.setText(R.string.setterIrlandesCharac);
                break;
            case R.mipmap.terrier:
                title= "Yorkshire Terrier";
                imageViewInfoPet.setImageResource(R.mipmap.terrier);
                petInfo.setPetChar(petCharac[17]);
                textViewInfoPetPerso.setText(R.string.terrierCharac);
                break;
            case R.mipmap.weimaraner:
                title= "Weimaraner";
                imageViewInfoPet.setImageResource(R.mipmap.weimaraner);
                petInfo.setPetChar(petCharac[18]);
                textViewInfoPetPerso.setText(R.string.weimaranerCharac);
                break;
            case R.mipmap.zebra:
                title= "Cebra";
                imageViewInfoPet.setImageResource(R.mipmap.zebra);
                petInfo.setPetChar(petCharac[19]);
                textViewInfoPetPerso.setText(R.string.zebraCharac);
                break;
        }

        textViewPetTitle.setText(title);
        textViewInfoPetChar.setText(petInfo.getPetChar());

    }

}