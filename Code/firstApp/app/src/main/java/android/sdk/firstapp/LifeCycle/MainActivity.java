package android.sdk.firstapp.LifeCycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.sdk.firstapp.R;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button goToMain2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Tag","onCreate");

        goToMain2 = findViewById(R.id.go_to_main_2);
        goToMain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Tag","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Tag","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Tag","onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Tag","onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Tag","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Tag","onDestroy");
    }
}