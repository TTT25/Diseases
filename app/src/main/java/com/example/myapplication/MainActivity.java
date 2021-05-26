package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.chip.Chip;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button chek;
    TextView showData;
    CheckBox tired;
    CheckBox hurt;
    CheckBox body;
    CheckBox breath;
    CheckBox anorexia;
    CheckBox LostWight;
    CheckBox digesting;
    CheckBox skin;
    CheckBox pregnacy;
    byte tired_data=0;
    byte hurt_data=0;
    byte body_data=0;
    byte breath_data=0;
    byte anorexia_data=0;
    byte LostWight_data=0;
    byte digesting_data=0;
    byte skin_data=0;
    byte pregnacy_data=0;

    ArrayList<Diseases> list= new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        Diseases Dermatology = new Diseases("Dermatology",0,1,0,0,0,0,0,1,0);
        Diseases Dentomaxillofacial = new Diseases("Dermatology",0,1,0,0,0,0,0,0,0);
        Diseases Ear_Nose_Throat = new Diseases("Ear-Nose-Throat",0,1,0,0,1,0,0,0,0);
        Diseases Eyes = new Diseases("Eyes",0,1,1,0,0,0,0,0,0);
        Diseases Respiratory = new Diseases("Respiratory",1,1,0,1,0,0,0,1,0);
        Diseases Heart = new Diseases("Heart",1,1,0,1,1,0,0,0,0);
        Diseases Digest = new Diseases("Digest",1,0,0,0,1,1,1,0,0);
        Diseases Liver_Bile_Marrow = new Diseases("Liver_Bile_Marrow",0,1,0,0,1,0,0,1,0);
        Diseases Kidney = new Diseases("Kidney",1,0,0,0,1,1,1,0,0);
        Diseases Nutrition =new Diseases("Nutrition",1,0,1,0,1,1,1,1,0);



        list.add(Dermatology);
        list.add(Dentomaxillofacial);
        list.add(Ear_Nose_Throat);
        list.add(Eyes);
        list.add(Respiratory);
        list.add(Heart);
        list.add(Digest);
        list.add(Liver_Bile_Marrow);
        list.add(Kidney);
        list.add(Nutrition);




        tired.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked == true)
                    tired_data=1;

            }
        });
        hurt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true)
                    hurt_data=1;

            }
        });
        body.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true)
                    body_data=1;

            }
        });
        breath.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true)
                    breath_data=1;

            }
        });
        anorexia.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true)
                    anorexia_data=1;

            }
        });
        LostWight.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true)
                    LostWight_data=1;

            }
        });
        digesting.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true)
                    digesting_data=1;

            }
        });
        skin.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true)
                    skin_data=1;

            }
        });
        pregnacy.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true)
                    pregnacy_data=1;

            }
        });
        Diseases A = new Diseases( tired_data,  hurt_data,  body_data,  breath_data,  anorexia_data,  LostWight_data,  digesting_data,  skin_data,  pregnacy_data);


        chek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showData.setText(checkD(list,A));
            }
        });















    }
    String checkD (ArrayList<Diseases> list , Diseases data)
    {
     Diseases maxData = new Diseases();
        int dem = 0;
        int max =0;
        for ( int i =0 ; i<list.toArray().length ;i++ )
        {
            if ( list.get(i).getAnorexia()==data.getAnorexia())
            {
                dem++;
            }
            if(list.get(i).getTired()==data.getTired())
            {
                dem++;
            }
            if(list.get(i).getHurt()==data.getHurt())
            {
                dem++;
            }
            if(list.get(i).getBody()==data.getBody())
            {
                dem++;
            }
            if(list.get(i).getBreath()==data.getBreath())
            {
                dem++;
            }
            if(list.get(i).getLostWight()==data.getLostWight())
            {
                dem++;
            }
            if(list.get(i).getDigesting()==data.getDigesting())
            {
                dem++;
            }
            if(list.get(i).getSkin()==data.getSkin())
            {
                dem++;
            }
            if(list.get(i).getPregnacy()==data.getPregnacy())
            {
                dem++;
            }
            if (dem > max)
            {
                max =dem;
                maxData = list.get(i);
            }


        }
        if(max==0)
            return "No Data";

        return maxData.getNameDiag();
    }

    void anhxa(){
        tired=findViewById(R.id.check_tired);
        hurt=findViewById(R.id.check_Hurt);
        body = findViewById(R.id.check_body);
        breath = findViewById(R.id.check_breath);
        anorexia= findViewById(R.id.check_anorexia);
        LostWight = findViewById(R.id.check_LW);
        digesting =findViewById(R.id.check_digesting);
        skin = findViewById(R.id.check_skin);
        pregnacy = findViewById(R.id.check_pregnacy);
        showData=findViewById(R.id.txt_Diseases);
        chek=findViewById(R.id.btn_Ok);

    }
}

