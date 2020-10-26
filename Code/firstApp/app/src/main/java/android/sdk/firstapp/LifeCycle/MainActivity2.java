package android.sdk.firstapp.LifeCycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.sdk.firstapp.R;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.e("Tag","onCreate");
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