package sg.edu.rp.c346.id20006757.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //Step 1 Handles
    TextView tvDisplay;
    Button btnClickMe;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;
    RadioButton radioM;
    RadioButton radioF;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Step 2 bridge UI with controller
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnClickMe = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.rgGender);
        radioM = findViewById(R.id.rbMale);
        radioF = findViewById(R.id.rbFemale);


        //3 set event listener

        /*btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String value =etInput.getText().toString();
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);


            }
        }); */

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                if (tbtn.isChecked()){
                    etInput.setEnabled(true);

                }else{
                    etInput.setEnabled(false);
                }







            }
        });

        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                if (tbtn.isChecked() == true) {
                    String stringResponse = etInput.getText().toString();
                    int checkedRadioId = rgGender.getCheckedRadioButtonId();

                    if (checkedRadioId == R.id.rbMale) {
                        // Write the code when male selected


                        tvDisplay.setText("He says " + stringResponse);

                    } else {
                        // Write the code when female selected
                        tvDisplay.setText("She says " + stringResponse);
                    }

                }
            }
        });}}

