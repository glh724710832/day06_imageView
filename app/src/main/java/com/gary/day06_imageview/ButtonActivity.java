package com.gary.day06_imageview;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ButtonActivity extends AppCompatActivity {
    private Switch sw;
    TextView rg;
    private RadioGroup one;
    private RadioButton rb_chose1;
    private RadioButton rb_chose2;
    RelativeLayout act;
    TextView rb;
    CheckBox box_kill;
    CheckBox box_all;
    CheckBox box2;
    CheckBox box3;
    CheckBox box4;
    ToggleButton tb_style;
    Button bt_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_layout);
        view();
    }

    void view() {
        act = findViewById(R.id.act);
        sw = findViewById(R.id.sw);
        box_kill = findViewById(R.id.box_kill);
        box_all = findViewById(R.id.box_all);
        box2 = findViewById(R.id.box2);
        box3 = findViewById(R.id.box3);
        box4 = findViewById(R.id.box4);
        tb_style = findViewById(R.id.tb_style);
        one = findViewById(R.id.one);
        rg = findViewById(R.id.rg);
        rb_chose1 = findViewById(R.id.rb_chose1);
        rb_chose2 = findViewById(R.id.rb_chose2);
        bt_login = findViewById(R.id.bt_login);



        tb_style.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    act.setBackgroundColor(000000);

                } else {

//                    act.setBackgroundColor(160171116);
                    int first = (int) (Math.random() * 255 + 1);
                    int second = (int) (Math.random() * 255 + 1);
                    int third = (int) (Math.random() * 255 + 1);

                    act.setBackgroundColor(Color.rgb(first, second, third));
                    System.out.println(first+","+second+","+third);


                }
            }
        });

        box_kill.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    box_all.setVisibility(View.GONE);
                    box2.setVisibility(View.GONE);
                    box3.setVisibility(View.GONE);
                    box4.setVisibility(View.GONE);
                }else{
                    box_kill.setVisibility(View.VISIBLE);
                    box_all.setVisibility(View.VISIBLE);
                    box2.setVisibility(View.VISIBLE);
                    box3.setVisibility(View.VISIBLE);
                    box4.setVisibility(View.VISIBLE);

                }
            }
        });

        box_all.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    box2.setChecked(true);
                    box3.setChecked(true);
                    box4.setChecked(true);


                } else {
                    box2.setChecked(false);
                    box3.setChecked(false);
                    box4.setChecked(false);
                }
            }
        });

        rb_chose1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    System.out.println(one.getCheckedRadioButtonId());
                }
            }
        });

        rb_chose2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    System.out.println(one.getCheckedRadioButtonId());
                    rb_chose2.setVisibility(View.GONE);
                    rb_chose1.setVisibility(View.GONE);
                    rg.setVisibility(View.GONE);

                }
            }
        });

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent intent = new Intent(ButtonActivity.this,BarTestActivity.class);
                        startActivity(intent);
            }
        });

    }
}
