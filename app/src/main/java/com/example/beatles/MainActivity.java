package com.example.beatles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
static boolean veces =true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText mEdit = (EditText) findViewById(R.id.article);
        mEdit.setEnabled(false);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(v -> {

                    if (veces){
                        mEdit.setEnabled(true);
                        veces = false;
                    }
                    else {
                        mEdit.setEnabled(false);
                        veces=true;
                    }


        });

    }

}