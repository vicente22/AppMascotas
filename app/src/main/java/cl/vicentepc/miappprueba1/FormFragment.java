package cl.vicentepc.miappprueba1;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FormFragment extends Fragment {

    //RadioGroup
    private RadioGroup radioGroupGender;

    //EditText
    private EditText editTextCompleteName;
    private EditText editTextYears;
    //Spinner
    private Spinner spinnerPersonality;
    private Spinner spinnerHome;
    private Spinner spinnerZodiac;
    //SeekBar
    private SeekBar seekBarAge;

    //RadioButton
    private RadioButton radioBtnMale;
    private RadioButton radioBtnFemale;
    //Button
    private Button btnEnviarDatos;

    public FormFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_form, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //EditText
        editTextCompleteName = view.findViewById(R.id.editTextCompleteName);
        editTextYears = view.findViewById(R.id.editTextYears);

        //Spinners
        spinnerPersonality = view.findViewById(R.id.spinnerPersonality);
        spinnerHome = view.findViewById(R.id.spinnerCasa);
        spinnerZodiac = view.findViewById(R.id.spinnerZodiac);

        //RadioButtons
        radioBtnMale = view.findViewById(R.id.radioBtnMale);
        radioBtnFemale = view.findViewById(R.id.radioBtnFemale);

        //RadioGrupoButton
        radioGroupGender = view.findViewById(R.id.radioGroupGender);

        //SeekBars
        seekBarAge = view.findViewById(R.id.seekBarAge);

        //Buttons
        btnEnviarDatos = view.findViewById(R.id.btnSendData);

        seekBarAge.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                editTextYears.setText(progress + " años");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        btnEnviarDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Validaciones con IF
                if(editTextCompleteName.getText().toString().trim().length() <= 0) {

                    Toast.makeText(getActivity(), "No agregaste tu NOMBRE, favor agregar.", Toast.LENGTH_LONG).show();

                }else if(spinnerPersonality.getSelectedItem().toString().trim().equals("Sin seleccionar...")) {

                    Toast.makeText(getActivity(), "No seleccionaste tu PERSONALIDAD", Toast.LENGTH_LONG).show();

                }else if(spinnerHome.getSelectedItem().toString().trim().equals("Sin seleccionar...")) {

                    Toast.makeText(getActivity(), "No seleccionaste tu tipo de CASA", Toast.LENGTH_LONG).show();

                }else if(spinnerZodiac.getSelectedItem().toString().trim().equals("Sin seleccionar...")) {

                        Toast.makeText(getActivity(), "No seleccionaste tu SIGNO ZODIACAL", Toast.LENGTH_LONG).show();

                }else if(editTextYears.getText().toString().trim().length() <= 0) {

                    Toast.makeText(getActivity(), "No seleccionaste tu EDAD", Toast.LENGTH_LONG).show();

                }else if(editTextYears.getText().toString().trim().equals("0 años")){

                    Toast.makeText(getActivity(), "No seleccionaste un AÑO", Toast.LENGTH_LONG).show();

                }else if(radioGroupGender.getCheckedRadioButtonId() == -1){

                    Toast.makeText(getActivity(), "No seleccionaste tu SEXO", Toast.LENGTH_LONG).show();

                }else{

                    Toast.makeText(getActivity(), "Formulario completado", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getActivity(), ResultActivity.class);
                    intent.putExtra("editTextCompleteName", editTextCompleteName.getText().toString());
                    intent.putExtra("spinnerPersonality", spinnerPersonality.getSelectedItem().toString());
                    intent.putExtra("spinnerHome", spinnerHome.getSelectedItem().toString());
                    intent.putExtra("spinnerZodiac", spinnerZodiac.getSelectedItem().toString());
                    intent.putExtra("editTextYears",editTextYears.getText().toString());
                    if(radioBtnMale.isChecked()){
                        intent.putExtra("radioGroupGender", "M");
                    }else{
                        intent.putExtra("radioGroupGender", "F");
                    }
                    startActivity(intent);

                }

            }
        });


    }

}
