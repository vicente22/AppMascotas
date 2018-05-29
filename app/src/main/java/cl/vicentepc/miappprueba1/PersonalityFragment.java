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

        imageViewInfoPet = view.findViewById(R.id.imageViewInfoPet);

        Pets petInfo = new Pets();

        int petImage = getActivity().getIntent().getIntExtra("petImage", -1);

        String title="";

        switch (petImage){
            case R.mipmap.beagle:
                title = "Beagle";
                imageViewInfoPet.setImageResource(R.mipmap.beagle);
                petInfo.setPetChar("Amistoso, Determinado, Inteligente, Excitable, Gentil, Apacible");
                break;
            case R.mipmap.boxer:
                title= "Boxer";
                imageViewInfoPet.setImageResource(R.mipmap.boxer);
                petInfo.setPetChar("Devoto, Energético, Amigable, Leal, Intrépido, Juguetón, Alegre, Confiado");
                break;
            case R.mipmap.bulldog:
                title= "Bulldog";
                imageViewInfoPet.setImageResource(R.mipmap.bulldog);
                petInfo.setPetChar("Gregario, Voluntarioso, Dócil, Amigable");
                break;
            case R.mipmap.bullterrier:
                title= "Bullterrier";
                imageViewInfoPet.setImageResource(R.mipmap.bullterrier);
                petInfo.setPetChar("Entrenable, Afable, Protector, Estusiasta");
                break;
            case R.mipmap.caballo:
                title= "Caballo";
                imageViewInfoPet.setImageResource(R.mipmap.caballo);
                petInfo.setPetChar("Transparente, Impaciente, Necio, Esquemático");
                break;
            case R.mipmap.cocker:
                title= "Cocker";
                imageViewInfoPet.setImageResource(R.mipmap.cocker);
                petInfo.setPetChar("Entrenable, Cariñoso, Amigable, Juguetón");
                break;
            case R.mipmap.collie:
                title= "Collie";
                imageViewInfoPet.setImageResource(R.mipmap.collie);
                petInfo.setPetChar("Amigable, Gentil, Leal, Inteligente");
                break;
            case R.mipmap.dalmata:
                title= "Dalmata";
                imageViewInfoPet.setImageResource(R.mipmap.dalmata);
                petInfo.setPetChar("Extrovertido, Jueguetón, Amigable, Sensible, Enérgico, Inteligente");
                break;
            case R.mipmap.doberman:
                title= "Doberman";
                imageViewInfoPet.setImageResource(R.mipmap.doberman);
                petInfo.setPetChar("Intrépido, Alerta, Enérgico, Obediente, Leal, Confiado");
                break;
            case R.mipmap.gatosiames:
                title= "Gato Siamés";
                imageViewInfoPet.setImageResource(R.mipmap.gatosiames);
                petInfo.setPetChar("Afectuoso, Positivo, Devoto");
                break;
            case R.mipmap.gatoangora:
                title= "Gato Angora";
                imageViewInfoPet.setImageResource(R.mipmap.gatoangora);
                petInfo.setPetChar("Afectuoso, Elegante, Fiel, Tranquilo");
                break;
            case R.mipmap.gatopersa:
                title= "Gato Persa";
                imageViewInfoPet.setImageResource(R.mipmap.gatopersa);
                petInfo.setPetChar("Tranquilo, Sosegado, Cariñoso, Afable");
                break;
            case R.mipmap.grandanes:
                title= "Gran Danés";
                imageViewInfoPet.setImageResource(R.mipmap.grandanes);
                petInfo.setPetChar("Amigable, Reservado, Devoto, Gentil");
                break;
            case R.mipmap.huron:
                title= "Hurón";
                imageViewInfoPet.setImageResource(R.mipmap.huron);
                petInfo.setPetChar("Sociables, Juguetónes, Se  les debe dedicar tiempo");
                break;
            case R.mipmap.pastoraleman:
                title= "Pastor Alemán";
                imageViewInfoPet.setImageResource(R.mipmap.pastoraleman);
                petInfo.setPetChar("Curioso, Obediente, Leal Confiado, Alerta, Inteligente");
                break;
            case R.mipmap.sanbernardo:
                title= "San Bernardo";
                imageViewInfoPet.setImageResource(R.mipmap.sanbernardo);
                petInfo.setPetChar("Amigable, Gentil, Vivaz, Vigilante");
                break;
            case R.mipmap.setterirlandes:
                title= "Setter Irlandés";
                imageViewInfoPet.setImageResource(R.mipmap.setterirlandes);
                petInfo.setPetChar("Cariñoso, Vivaz, Energético, Independiente");
                break;
            case R.mipmap.terrier:
                title= "Yorkshire Terrier";
                imageViewInfoPet.setImageResource(R.mipmap.terrier);
                petInfo.setPetChar("Animados, Independientes, Nerviosos");
                break;
            case R.mipmap.weimaraner:
                title= "Weimaraner";
                imageViewInfoPet.setImageResource(R.mipmap.weimaraner);
                petInfo.setPetChar("Firme, Enérgico, Reservado, Alerta, Obstinado, Inteligente");
                break;
            case R.mipmap.zebra:
                title= "Weimaraner";
                imageViewInfoPet.setImageResource(R.mipmap.zebra);
                petInfo.setPetChar("Vive en grupos, Mamífero Gregario");
                break;
        }

        textViewPetTitle.setText(title);

        textViewInfoPetChar.setText(petInfo.getPetChar());

    }

}