package com.example.project4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    CheckBox chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoDog, rdoCat, rdoRabbit;
    Button btnOK, btnEnd, btnRestart;
    ImageView imgPet;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
        setTitle("애완동물 사진보기");

        text1 = (TextView)findViewById(R.id.Text1);
        chkAgree = (CheckBox)findViewById(R.id.ChkAgree);

        text2 = (TextView)findViewById(R.id.Text2);
        rGroup1 = (RadioGroup)findViewById(R.id.Rgroup1);
        rdoDog = (RadioButton)findViewById(R.id.RdoDog);
        rdoCat = (RadioButton)findViewById(R.id.RdoCat);
        rdoRabbit = (RadioButton)findViewById(R.id.RdoRabbit);

        btnOK = (Button)findViewById(R.id.BtnOK);
        imgPet = (ImageView)findViewById(R.id.ImgPet);

        btnEnd = (Button)findViewById(R.id.BtnEnd);
        btnRestart = (Button)findViewById(R.id.BtnRestart);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chkAgree.isChecked() == true){
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnOK.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                    btnEnd.setVisibility(View.VISIBLE);
                    btnRestart.setVisibility(View.VISIBLE);
                } else {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnOK.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                    btnEnd.setVisibility(View.INVISIBLE);
                    btnRestart.setVisibility(View.INVISIBLE);
                }
            }
        });
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (rGroup1.getCheckedRadioButtonId()){
                    case R.id.RdoDog:
                        imgPet.setImageResource(R.drawable.dog);
                        break;
                    case R.id.RdoCat:
                        imgPet.setImageResource(R.drawable.cat);
                        break;
                    case R.id.RdoRabbit:
                        imgPet.setImageResource(R.drawable.rabbit);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "동물 먼저 선택하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chkAgree.setChecked(false);
                text2.setVisibility(View.INVISIBLE);
                rGroup1.setVisibility(View.INVISIBLE);
                btnOK.setVisibility(View.INVISIBLE);
                imgPet.setVisibility(View.INVISIBLE);
                btnEnd.setVisibility(View.INVISIBLE);
                btnRestart.setVisibility(View.INVISIBLE);
            }
        });
    }
}
