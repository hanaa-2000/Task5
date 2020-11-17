package com.example.task51;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private  static final String[]Country=new String[]{
        "Palestine" ,"Saudi Arabia", "Libya", "Egypt" , "Bahrain", "Oman", "Algeria", "Iraq" ,"Tunisia",
        "Morocco", "Qatar"
};
AutoCompleteTextView auto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auto=findViewById(R.id.auto1);

        String[]Countries=getResources().getStringArray(R.array.Countries);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.
                simple_list_item_1,Countries);
        auto.setAdapter(adapter);
        auto.setThreshold(1);
        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= auto.getText().toString();
                Toast.makeText(getBaseContext(),"# "+s,Toast.LENGTH_LONG).show();
            }
        });


    }

}