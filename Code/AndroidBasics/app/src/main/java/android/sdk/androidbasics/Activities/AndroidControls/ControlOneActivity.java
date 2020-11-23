package android.sdk.androidbasics.Activities.AndroidControls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.sdk.androidbasics.R;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class ControlOneActivity extends AppCompatActivity {

    private Spinner countrySpinner;
    private TextView textFillFromSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_one);
        init();

        ArrayAdapter<CharSequence> mCountrySpinnerAdapter =
                ArrayAdapter.createFromResource(this,R.array.countries_array, android.R.layout.simple_spinner_item);

        countrySpinner.setAdapter(mCountrySpinnerAdapter);

        countrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                textFillFromSpinner.setText(parent.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                textFillFromSpinner.setText(parent.getSelectedItem().toString());
            }
        });





    }


    private void init(){
        countrySpinner = findViewById(R.id.spinner_counties_2);
        textFillFromSpinner = findViewById(R.id.text_fill_from_spinner);
    }
}