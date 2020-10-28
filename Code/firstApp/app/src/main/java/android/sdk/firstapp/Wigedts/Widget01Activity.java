package android.sdk.firstapp.Wigedts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.sdk.firstapp.R;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Widget01Activity extends AppCompatActivity {

    private Button changeTextBtn;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wigedt01);
        init();

        changeTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("Button Changed the Text");
            }
        });
    }

    private void init(){
        changeTextBtn = findViewById(R.id.change_txt_btn);
        text = findViewById(R.id.some_text_text_view);
    }


}