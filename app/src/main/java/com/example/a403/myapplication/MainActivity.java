package com.example.a403.myapplication;

import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;

import static com.example.a403.myapplication.R.id.calendarView;
import static com.example.a403.myapplication.R.id.editText3;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("놀이동산 예약시스템");

        final Chronometer chro;
        TextView txtView1,txtView2,txtView3,txtView4,txtView5,txtView6;
        Switch swi;
        Button btn1,btn2,btn3,btn4,btn5,btn6;
        final EditText edtText1;
        final EditText edtText2;
        final EditText edtText3;
        RadioButton rdo1,rdo2,rdo3,rdo4,rdo5;
        final ImageView imgView;
        int num;
        final double dbnum;
        String str1,str2,str3;
        final LinearLayout linearLayout1;
        final LinearLayout linearlayout2;
        final CalendarView calView;
        final TimePicker tmPicker;

        chro = (Chronometer)findViewById(R.id.chronometer2);
        swi = (Switch)findViewById(R.id.switch1);
        txtView1 = (TextView)findViewById(R.id.textView);
        rdo1 = (RadioButton)findViewById(R.id.radioButton);
        rdo2 = (RadioButton)findViewById(R.id.radioButton2);
        rdo3 = (RadioButton)findViewById(R.id.radioButton3);
        rdo4 = (RadioButton)findViewById(R.id.radioButton4);
        rdo5 = (RadioButton)findViewById(R.id.radioButton5);
        edtText1 = (EditText)findViewById(R.id.editText);
        edtText2 = (EditText)findViewById(R.id.editText2);
        edtText3 = (EditText)findViewById(R.id.editText3);
        linearLayout1 = (LinearLayout)findViewById(R.id.linearlayout1);
        imgView = (ImageView)findViewById(R.id.imageView);
        btn5 = (Button)findViewById(R.id.button5);
        btn6 = (Button)findViewById(R.id.button6);
        linearlayout2 = (LinearLayout)findViewById(R.id.linearlayout2);
        calView = (CalendarView)findViewById(R.id.calendarView);
        tmPicker = (TimePicker)findViewById(R.id.timePicker);













        swi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout1.setVisibility(View.VISIBLE);
                chro.setBase(SystemClock.elapsedRealtime());
                chro.start();
                chro.setTextColor(Color.BLUE);
            }
        });

        rdo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // str1 = edtText1.getText().toString();
               // str2 = edtText2.getText().toString();
               // str3 = edtText3.getText().toString();
              //  imgView.setImageResource(R.drawble.one);

            }
        });
        rdo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  imgView.setImageResource(R.drawble.two);

            }
        });
        rdo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //imgView.setImageResource(R.drawble.three);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   (str1.isEmpty() || str2.isEmpty() || str3.isEmpty())
                Toast.makeText(getApplicationContext(),"인원을 입력하세요",Toast.LENGTH_SHORT).show();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearlayout2.setVisibility(View.VISIBLE);
            }
        });

        rdo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calView.setVisibility(View.VISIBLE);
            }
        });

        rdo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmPicker.setVisibility(View.VISIBLE);
            }
        });




    }
}
