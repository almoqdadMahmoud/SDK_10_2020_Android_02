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

    private Spinner countrySpinner , citySpinner;
    private TextView textFillFromSpinner_1 , textFillFromSpinner_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_one);
        init();

        ArrayAdapter<CharSequence> mCountrySpinnerAdapter =
                ArrayAdapter.createFromResource(this,R.array.countries_array, android.R.layout.simple_spinner_item);

        String[] countries = {"Select Country","Jordan" , "KSA" , "US","UK","Russia"};
        String[] countries2 = {"Select Country","Jordan" , "Syria" };
        String[] jordanCities = {"Irbid","Amman","Zarqa","Jarsh"};
        String[] syriaCities = {"daraa","dimashk","halap"};

        ArrayAdapter<String> mCountrySpinnerAdapter2 = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item,countries);

        // countrySpinner.setAdapter(mCountrySpinnerAdapter);
        countrySpinner.setAdapter(mCountrySpinnerAdapter2);
        citySpinner.setEnabled(false);
        countrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                textFillFromSpinner_1.setText(parent.getSelectedItem().toString());
                // (int)parent.getSelectedItemId()for get selected id
                // parent.getSelectedItemPosition()
                // (int) id
                // position
                switch (position){
                    case 1:{
                        ArrayAdapter<String> mJordanCitySpinnerAdapter = new ArrayAdapter<String>(
                                getApplicationContext(), android.R.layout.simple_spinner_item,jordanCities);
                        citySpinner.setEnabled(true);
                        citySpinner.setAdapter(mJordanCitySpinnerAdapter);
                    }break;

                    case 2:{
                        ArrayAdapter<String> mSyriaCitySpinnerAdapter = new ArrayAdapter<String>(
                                getApplicationContext(), android.R.layout.simple_spinner_item,syriaCities);
                        citySpinner.setEnabled(true);
                        citySpinner.setAdapter(mSyriaCitySpinnerAdapter);

                    }break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                textFillFromSpinner_1.setText(parent.getSelectedItem().toString());
            }
        });

        citySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                textFillFromSpinner_2.setText(parent.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private void init(){
        countrySpinner = findViewById(R.id.spinner_counties_2);
        citySpinner = findViewById(R.id.spinner_cities);
        textFillFromSpinner_1 = findViewById(R.id.text_fill_from_spinner_1);
        textFillFromSpinner_2 = findViewById(R.id.text_fill_from_spinner_2);
    }
}