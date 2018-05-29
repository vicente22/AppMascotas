package cl.vicentepc.miappprueba1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class DataFragment extends Fragment {

    private TextView textViewPetTitle;

    private TextView textViewInfoPetHeightMale;
    private TextView textViewInfoPetHeightFemale;
    private TextView textViewInfoPetWeightMale;
    private TextView textViewInfoPetWeightFemale;

    private ImageView imageViewInfoPet;


    public DataFragment() {
        // Required empty public constructor
    }


    public static DataFragment newInstance(int sectionNumber) {

        return new DataFragment();

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_data, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textViewPetTitle = view.findViewById(R.id.textViewPetTitle);

        textViewInfoPetHeightMale = view.findViewById(R.id.textViewInfoPetHeightMale);
        textViewInfoPetHeightFemale = view.findViewById(R.id.textViewInfoPetHeightFemale);
        textViewInfoPetWeightMale = view.findViewById(R.id.textViewInfoPetWeightMale);
        textViewInfoPetWeightFemale = view.findViewById(R.id.textViewInfoPetWeightFemale);

        imageViewInfoPet = view.findViewById(R.id.imageViewInfoPet);

        int petImage = getActivity().getIntent().getIntExtra("petImage", -1);

        Pets petInfo = new Pets();

        String title="";
        String info = "";

        switch (petImage){
            case R.mipmap.beagle:
                title = "Beagle";
                imageViewInfoPet.setImageResource(R.mipmap.beagle);
                petInfo.setPetHeightMale("36-41 cm");
                petInfo.setPetHeightFemale("33-38 cm");
                petInfo.setPetWeightMale("10-11 kg");
                petInfo.setPetWeightFemale("9 - 10kg");
                break;
            case R.mipmap.boxer:
                title= "Boxer";
                imageViewInfoPet.setImageResource(R.mipmap.boxer);
                petInfo.setPetHeightMale("57-63 cm");
                petInfo.setPetHeightFemale("53-60 cm");
                petInfo.setPetWeightMale("27-32 kg");
                petInfo.setPetWeightFemale("25-29 kg");
                break;
            case R.mipmap.bulldog:
                title= "Bulldog";
                imageViewInfoPet.setImageResource(R.mipmap.bulldog);
                petInfo.setPetHeightMale("31-40 cm");
                petInfo.setPetHeightFemale("31-30 cm");
                petInfo.setPetWeightMale("23-25 kg");
                petInfo.setPetWeightFemale("18-23 kg");
                break;
            case R.mipmap.bullterrier:
                title= "Bullterrier";
                imageViewInfoPet.setImageResource(R.mipmap.bullterrier);
                petInfo.setPetHeightMale("53-55 cm");
                petInfo.setPetHeightFemale("53-55 cm");
                petInfo.setPetWeightMale("22-30 kg");
                petInfo.setPetWeightFemale("22-30 kg");
                break;
            case R.mipmap.caballo:
                title= "Caballo";
                imageViewInfoPet.setImageResource(R.mipmap.caballo);
                petInfo.setPetHeightMale("1.4-1.8 m");
                petInfo.setPetHeightFemale("1.4-1.8 m");
                petInfo.setPetWeightMale("380-550 kg");
                petInfo.setPetWeightFemale("380-550 kg");
                break;
            case R.mipmap.cocker:
                title= "Cocker";
                imageViewInfoPet.setImageResource(R.mipmap.cocker);
                petInfo.setPetHeightMale("38-43 cm");
                petInfo.setPetHeightFemale("36-41 cm");
                petInfo.setPetWeightMale("12-15 kg");
                petInfo.setPetWeightFemale("13-16 kg");
                break;
            case R.mipmap.collie:
                title= "Collie";
                imageViewInfoPet.setImageResource(R.mipmap.collie);
                petInfo.setPetHeightMale("48-56 cm");
                petInfo.setPetHeightFemale("48-56 cm");
                petInfo.setPetWeightMale("20-29 kg");
                petInfo.setPetWeightFemale("18-25 kg");
                break;
            case R.mipmap.dalmata:
                title= "Dalmata";
                imageViewInfoPet.setImageResource(R.mipmap.dalmata);
                petInfo.setPetHeightMale("58-61 cm");
                petInfo.setPetHeightFemale("56-58 cm");
                petInfo.setPetWeightMale("15-32 kg");
                petInfo.setPetWeightFemale("16-24 kg");
                break;
            case R.mipmap.doberman:
                title= "Doberman";
                imageViewInfoPet.setImageResource(R.mipmap.doberman);
                petInfo.setPetHeightMale("66-72 cm");
                petInfo.setPetHeightFemale("61-68 cm");
                petInfo.setPetWeightMale("40-45 kg");
                petInfo.setPetWeightFemale("32-35 kg");
                break;
            case R.mipmap.gatosiames:
                title= "Gato Siamés";
                imageViewInfoPet.setImageResource(R.mipmap.gatosiames);
                petInfo.setPetHeightMale("25-30 cm");
                petInfo.setPetHeightFemale("25-30 cm");
                petInfo.setPetWeightMale("3 kg");
                petInfo.setPetWeightFemale("3 kg");
                break;
            case R.mipmap.gatoangora:
                title= "Gato Angora";
                imageViewInfoPet.setImageResource(R.mipmap.gatoangora);
                petInfo.setPetHeightMale("25-30 cm");
                petInfo.setPetHeightFemale("25-30 cm");
                petInfo.setPetWeightMale("3-5,5 kg");
                petInfo.setPetWeightFemale("3-5,5 kg");
                break;
            case R.mipmap.gatopersa:
                title= "Gato Persa";
                imageViewInfoPet.setImageResource(R.mipmap.gatopersa);
                petInfo.setPetHeightMale("25-30 cm");
                petInfo.setPetHeightFemale("25-30 cm");
                petInfo.setPetWeightMale("3,5-7 kg");
                petInfo.setPetWeightFemale("3,5-7 kg");
                break;
            case R.mipmap.grandanes:
                title= "Gran Danés";
                imageViewInfoPet.setImageResource(R.mipmap.grandanes);
                petInfo.setPetHeightMale("76-86 cm");
                petInfo.setPetHeightFemale("71-81 cm");
                petInfo.setPetWeightMale("54-90 kg");
                petInfo.setPetWeightFemale("45-59 kg");
                petInfo.setPetChar("Amigable, Reservado, Devoto, Gentil");
                break;
            case R.mipmap.huron:
                title= "Hurón";
                imageViewInfoPet.setImageResource(R.mipmap.huron);
                petInfo.setPetHeightMale("45 cm");
                petInfo.setPetHeightFemale("35 cm");
                petInfo.setPetWeightMale("1,6-2,5 kg");
                petInfo.setPetWeightFemale("0,8-1,3 cm");
                break;
            case R.mipmap.pastoraleman:
                title= "Pastor Alemán";
                imageViewInfoPet.setImageResource(R.mipmap.pastoraleman);
                petInfo.setPetHeightMale("60-65 cm");
                petInfo.setPetHeightFemale("55-60 cm");
                petInfo.setPetWeightMale("30-40 kg");
                petInfo.setPetWeightFemale("22-32 kg");
                break;
            case R.mipmap.sanbernardo:
                title= "San Bernardo";
                imageViewInfoPet.setImageResource(R.mipmap.sanbernardo);
                petInfo.setPetHeightMale("78-86 cm");
                petInfo.setPetHeightFemale("70-82 cm");
                petInfo.setPetWeightMale("55-90 kg");
                petInfo.setPetWeightFemale("55-90 kg");
                break;
            case R.mipmap.setterirlandes:
                title= "Setter Irlandés";
                imageViewInfoPet.setImageResource(R.mipmap.setterirlandes);
                petInfo.setPetHeightMale("58-67 cm");
                petInfo.setPetHeightFemale("55-62 cm");
                petInfo.setPetWeightMale("27-32 kg");
                petInfo.setPetWeightFemale("24-29 kg");
                break;
            case R.mipmap.terrier:
                title= "Yorkshire Terrier";
                imageViewInfoPet.setImageResource(R.mipmap.terrier);
                petInfo.setPetHeightMale("17 cm");
                petInfo.setPetHeightFemale("17 cm");
                petInfo.setPetWeightMale("5-8 kg");
                petInfo.setPetWeightFemale("4-7 kg");
                break;
            case R.mipmap.weimaraner:
                title= "Weimaraner";
                imageViewInfoPet.setImageResource(R.mipmap.weimaraner);
                petInfo.setPetHeightMale("62-67 cm");
                petInfo.setPetHeightFemale("59-63 cm");
                petInfo.setPetWeightMale("30-40 kg");
                petInfo.setPetWeightFemale("25-35 kg");
                break;
            case R.mipmap.zebra:
                title= "Weimaraner";
                imageViewInfoPet.setImageResource(R.mipmap.zebra);
                petInfo.setPetHeightMale("1,3 m");
                petInfo.setPetHeightFemale("1,3 m");
                petInfo.setPetWeightMale("240-320 kg");
                petInfo.setPetWeightFemale("240-320 kg");
                break;
        }

        textViewPetTitle.setText(title);

        textViewInfoPetHeightMale.setText(petInfo.getPetHeightMale());
        textViewInfoPetHeightFemale.setText(petInfo.getPetHeightFemale());
        textViewInfoPetWeightMale.setText(petInfo.getPetWeightMale());
        textViewInfoPetWeightFemale.setText(petInfo.getPetWeightFemale());

    }

}