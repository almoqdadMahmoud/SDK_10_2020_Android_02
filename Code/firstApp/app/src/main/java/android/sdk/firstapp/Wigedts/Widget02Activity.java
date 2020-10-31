package android.sdk.firstapp.Wigedts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.sdk.firstapp.R;
import android.widget.TextView;

public class Widget02Activity extends AppCompatActivity {

    TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget02);
        init();

        String ExternalText = getIntent().getStringExtra("text");

        if(ExternalText != null){
            textView.setText(ExternalText);
        }
    }

    private void init() {
        textView = findViewById(R.id.textView2);
    }
}