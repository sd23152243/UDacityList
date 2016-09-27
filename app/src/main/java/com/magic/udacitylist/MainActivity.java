package com.magic.udacitylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View v){
        Button button = (Button) v;
        String name = button.getText().toString();
        Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();
    }
}
