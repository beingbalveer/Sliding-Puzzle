package com.bandroid.balveer.slidingpuzzlev_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class game4 extends Activity {

    ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    TextView tv;
    String s1 = "i1";
    String s2 = "i2";
    String s3 = "i3";
    String s4 = "i4";
    String s5 = "i5";
    String s6 = "i6";
    String s7 = "i7";
    String s8 = "i8";
    String s9 = "i9";
    String s10 = "i10";
    String s11 = "i11";
    String s12 = "i12";
    String s13 = "i13";
    String s14 = "i14";
    String s15 = "i15";
    String s16 = "blank";

    Integer count = 0;
    TextView sc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game4);

        tv = (TextView)findViewById(R.id.name);
        sc = (TextView)findViewById(R.id.count);

        b1 = (ImageButton)findViewById(R.id.j1);
        b2 = (ImageButton)findViewById(R.id.j2);
        b3 = (ImageButton)findViewById(R.id.j3);
        b4 = (ImageButton)findViewById(R.id.j4);
        b5 = (ImageButton)findViewById(R.id.j5);
        b6 = (ImageButton)findViewById(R.id.j6);
        b7 = (ImageButton)findViewById(R.id.j7);
        b8 = (ImageButton)findViewById(R.id.j8);
        b9 = (ImageButton)findViewById(R.id.j9);
        b10 = (ImageButton)findViewById(R.id.j10);
        b11 = (ImageButton)findViewById(R.id.j11);
        b12 = (ImageButton)findViewById(R.id.j12);
        b13 = (ImageButton)findViewById(R.id.j13);
        b14 = (ImageButton)findViewById(R.id.j14);
        b15 = (ImageButton)findViewById(R.id.j15);
        b16 = (ImageButton)findViewById(R.id.blank);

        assignRandom();


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change1(s1,s2,s5);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change2(s2,s1,s3,s6);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change3(s3,s2,s4,s7);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change4(s4,s3,s8);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change5(s5,s1,s6,s9);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change6(s6,s2,s5,s7,s10);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change7(s7,s3,s6,s8,s11);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change8(s8,s4,s7,s12);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change9(s9,s5,s10,s13);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change10(s10,s6,s9,s11,s14);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change11(s11,s7,s10,s12,s15);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change12(s12,s8,s11,s16);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change13(s13,s9,s14);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change14(s14,s10,s13,s15);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change15(s15,s11,s14,s16);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change16(s16,s12,s15);
            }
        });



    }


    //   arrange randomely
    private void assignRandom()
    {
        int a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16;
        Random rand = new Random();

        a1 = rand.nextInt(16)+1;

        do{
            a2 = rand.nextInt(16)+1;
        }while(a2==a1);

        do{
            a3 = rand.nextInt(16)+1;
        }while(a3==a1 || a3==a2);

        do{
            a4 = rand.nextInt(16)+1;
        }while(a4==a1 || a4==a3 || a4==a2);

        do{
            a5 = rand.nextInt(16)+1;
        }while(a5==a1 || a5==a2 || a5==a3 || a5==a4);

        do{
            a6 = rand.nextInt(16)+1;
        }while(a6==a1 || a6==a2 || a6==a3 || a6==a4 || a6==a5);

        do{
            a7 = rand.nextInt(16)+1;
        }while(a7==a1 || a7==a2 || a7==a3 || a7==a4 || a7==a5 || a7==a6);

        do{
            a8 = rand.nextInt(16)+1;
        }while(a8==a1 || a8==a2 || a8==a3 || a8==a4 || a8==a5 || a8==a6 || a8==a7);

        do{
            a9 = rand.nextInt(16)+1;
        }while(a9==a1 || a9==a2 || a9==a3 || a9==a4 || a9==a5 || a9==a6 || a9==a7 || a9==a8);

        do{
            a10 = rand.nextInt(16)+1;
        }while(a10==a1 || a10==a2 || a10==a3 || a10==a4 || a10==a5 || a10==a6 || a10==a7 || a10==a8 || a10==a9);

        do{
            a11 = rand.nextInt(16)+1;
        }while(a11==a1 || a11==a2 || a11==a3 || a11==a4 || a11==a5 || a11==a6 || a11==a7 || a11==a8 || a11==a9 || a11==a10);

        do{
            a12 = rand.nextInt(16)+1;
        }while(a12==a1 || a12==a2 || a12==a3 || a12==a4 || a12==a5 || a12==a6 || a12==a7 || a12==a8 || a12==a9 || a12==a10 || a12==a11);

        do{
            a13 = rand.nextInt(16)+1;
        }while(a13==a1 || a13==a2 || a13==a3 || a13==a4 || a13==a5 || a13==a6 || a13==a7 || a13==a8 || a13==a9 || a13==a10 || a13==a11 || a13==a12);

        do{
            a14 = rand.nextInt(16)+1;
        }while(a14==a1 || a14==a2 || a14==a3 || a14==a4 || a14==a5 || a14==a6 || a14==a7 || a14==a8 || a14==a9 || a14==a10 || a14==a11 || a14==a12 || a14==a13);

        do{
            a15 = rand.nextInt(16)+1;
        }while(a15==a1 || a15==a2 || a15==a3 || a15==a4 || a15==a5 || a15==a6 || a15==a7 || a15==a8 || a15==a9 || a15==a10 || a15==a11 || a15==a12 || a15==a13 || a15==a14);

        do{
            a16 = rand.nextInt(16)+1;
        }while(a16==a1 || a16==a2 || a16==a3 || a16==a4 || a16==a5 || a16==a6 || a16==a7 || a16==a8 || a16==a9 || a16==a10 || a16==a11 || a16==a12 || a16==a13 || a16==a14 || a16==a15);


        checkInt(s1,a1);
        checkInt(s2,a2);
        checkInt(s3,a3);
        checkInt(s4,a4);
        checkInt(s5,a5);
        checkInt(s6,a6);
        checkInt(s7,a7);
        checkInt(s8,a8);
        checkInt(s9,a9);
        checkInt(s10,a10);
        checkInt(s11,a11);
        checkInt(s12,a12);
        checkInt(s13,a13);
        checkInt(s14,a14);
        checkInt(s15,a15);
        checkInt(s16,a16);


    }


    private void checkInt(String tag,int a) {

        if (tag == "i1") {
            if(a==1) {
                b1.setImageResource(R.drawable.j1);
                s1 = "i1";
            }
            else if(a==2) {
                b1.setImageResource(R.drawable.j2);
                s1 = "i2";
            }
            else if(a==3) {
                b1.setImageResource(R.drawable.j3);
                s1 = "i3";
            }
            else if(a==4) {
                b1.setImageResource(R.drawable.j4);
                s1 = "i4";
            }
            else if(a==5) {
                b1.setImageResource(R.drawable.j5);
                s1 = "i5";
            }
            else if(a==6) {
                b1.setImageResource(R.drawable.j6);
                s1 = "i6";
            }
            else if(a==7) {
                b1.setImageResource(R.drawable.j7);
                s1 = "i7";
            }
            else if(a==8) {
                b1.setImageResource(R.drawable.j8);
                s1 = "i8";
            }
            else if(a==9) {
                b1.setImageResource(R.drawable.j9);
                s1 = "i9";
            }
            else if(a==10) {
                b1.setImageResource(R.drawable.j10);
                s1 = "i10";
            }
            else if(a==11) {
                b1.setImageResource(R.drawable.j11);
                s1 = "i11";
            }
            else if(a==12) {
                b1.setImageResource(R.drawable.j12);
                s1 = "i12";
            }
            else if(a==13) {
                b1.setImageResource(R.drawable.j13);
                s1 = "i13";
            }
            else if(a==14) {
                b1.setImageResource(R.drawable.j14);
                s1 = "i14";
            }
            else if(a==15) {
                b1.setImageResource(R.drawable.j15);
                s1 = "i15";
            }
            else if(a==16) {
                b1.setImageResource(R.drawable.jblank);
                s1 = "blank";
            }

        } else if (tag == "i2") {
            if(a==1) {
                b2.setImageResource(R.drawable.j1);
                s2 = "i1";
            }
            else if(a==2) {
                b2.setImageResource(R.drawable.j2);
                s2 = "i2";
            }
            else if(a==3) {
                b2.setImageResource(R.drawable.j3);
                s2 = "i3";
            }
            else if(a==4) {
                b2.setImageResource(R.drawable.j4);
                s2 = "i4";
            }
            else if(a==5) {
                b2.setImageResource(R.drawable.j5);
                s2 = "i5";
            }
            else if(a==6) {
                b2.setImageResource(R.drawable.j6);
                s2 = "i6";
            }
            else if(a==7) {
                b2.setImageResource(R.drawable.j7);
                s2 = "i7";
            }
            else if(a==8) {
                b2.setImageResource(R.drawable.j8);
                s2 = "i8";
            }
            else if(a==9) {
                b2.setImageResource(R.drawable.j9);
                s2 = "i9";
            }
            else if(a==10) {
                b2.setImageResource(R.drawable.j10);
                s2 = "i10";
            }
            else if(a==11) {
                b2.setImageResource(R.drawable.j11);
                s2 = "i11";
            }
            else if(a==12) {
                b2.setImageResource(R.drawable.j12);
                s2 = "i12";
            }
            else if(a==13) {
                b2.setImageResource(R.drawable.j13);
                s2 = "i13";
            }
            else if(a==14) {
                b2.setImageResource(R.drawable.j14);
                s2 = "i14";
            }
            else if(a==15) {
                b2.setImageResource(R.drawable.j15);
                s2 = "i15";
            }
            else if(a==16) {
                b2.setImageResource(R.drawable.jblank);
                s2 = "blank";
            }
        }
        else if (tag == "i3") {
            if(a==1) {
                b3.setImageResource(R.drawable.j1);
                s3 = "i1";
            }
            else if(a==2) {
                b3.setImageResource(R.drawable.j2);
                s3 = "i2";
            }
            else if(a==3) {
                b3.setImageResource(R.drawable.j3);
                s3 = "i3";
            }
            else if(a==4) {
                b3.setImageResource(R.drawable.j4);
                s3 = "i4";
            }
            else if(a==5) {
                b3.setImageResource(R.drawable.j5);
                s3 = "i5";
            }
            else if(a==6) {
                b3.setImageResource(R.drawable.j6);
                s3 = "i6";
            }
            else if(a==7) {
                b3.setImageResource(R.drawable.j7);
                s3 = "i7";
            }
            else if(a==8) {
                b3.setImageResource(R.drawable.j8);
                s3 = "i8";
            }
            else if(a==9) {
                b3.setImageResource(R.drawable.j9);
                s3 = "i9";
            }
            else if(a==10) {
                b3.setImageResource(R.drawable.j10);
                s3 = "i10";
            }
            else if(a==11) {
                b3.setImageResource(R.drawable.j11);
                s3 = "i11";
            }
            else if(a==12) {
                b3.setImageResource(R.drawable.j12);
                s3 = "i12";
            }
            else if(a==13) {
                b3.setImageResource(R.drawable.j13);
                s3 = "i13";
            }
            else if(a==14) {
                b3.setImageResource(R.drawable.j14);
                s3 = "i14";
            }
            else if(a==15) {
                b3.setImageResource(R.drawable.j15);
                s3 = "i15";
            }
            else if(a==16) {
                b3.setImageResource(R.drawable.jblank);
                s3 = "blank";
            }
        }
        else if (tag == "i4") {
            if(a==1) {
                b4.setImageResource(R.drawable.j1);
                s4 = "i1";
            }
            else if(a==2) {
                b4.setImageResource(R.drawable.j2);
                s4 = "i2";
            }
            else if(a==3) {
                b4.setImageResource(R.drawable.j3);
                s4 = "i3";
            }
            else if(a==4) {
                b4.setImageResource(R.drawable.j4);
                s4 = "i4";
            }
            else if(a==5) {
                b4.setImageResource(R.drawable.j5);
                s4 = "i5";
            }
            else if(a==6) {
                b4.setImageResource(R.drawable.j6);
                s4 = "i6";
            }
            else if(a==7) {
                b4.setImageResource(R.drawable.j7);
                s4 = "i7";
            }
            else if(a==8) {
                b4.setImageResource(R.drawable.j8);
                s4 = "i8";
            }
            else if(a==9) {
                b4.setImageResource(R.drawable.j9);
                s4 = "i9";
            }
            else if(a==10) {
                b4.setImageResource(R.drawable.j10);
                s4 = "i10";
            }
            else if(a==11) {
                b4.setImageResource(R.drawable.j11);
                s4 = "i11";
            }
            else if(a==12) {
                b4.setImageResource(R.drawable.j12);
                s4 = "i12";
            }
            else if(a==13) {
                b4.setImageResource(R.drawable.j13);
                s4 = "i13";
            }
            else if(a==14) {
                b4.setImageResource(R.drawable.j14);
                s4 = "i14";
            }
            else if(a==15) {
                b4.setImageResource(R.drawable.j15);
                s4 = "i15";
            }
            else if(a==16) {
                b4.setImageResource(R.drawable.jblank);
                s4 = "blank";
            }
        }
        else if (tag == "i5") {
            if(a==1) {
                b5.setImageResource(R.drawable.j1);
                s5 = "i1";
            }
            else if(a==2) {
                b5.setImageResource(R.drawable.j2);
                s5 = "i2";
            }
            else if(a==3) {
                b5.setImageResource(R.drawable.j3);
                s5 = "i3";
            }
            else if(a==4) {
                b5.setImageResource(R.drawable.j4);
                s5 = "i4";
            }
            else if(a==5) {
                b5.setImageResource(R.drawable.j5);
                s5 = "i5";
            }
            else if(a==6) {
                b5.setImageResource(R.drawable.j6);
                s5 = "i6";
            }
            else if(a==7) {
                b5.setImageResource(R.drawable.j7);
                s5 = "i7";
            }
            else if(a==8) {
                b5.setImageResource(R.drawable.j8);
                s5 = "i8";
            }
            else if(a==9) {
                b5.setImageResource(R.drawable.j9);
                s5 = "i9";
            }
            else if(a==10) {
                b5.setImageResource(R.drawable.j10);
                s5 = "i10";
            }
            else if(a==11) {
                b5.setImageResource(R.drawable.j11);
                s5 = "i11";
            }
            else if(a==12) {
                b5.setImageResource(R.drawable.j12);
                s5 = "i12";
            }
            else if(a==13) {
                b5.setImageResource(R.drawable.j13);
                s5 = "i13";
            }
            else if(a==14) {
                b5.setImageResource(R.drawable.j14);
                s5 = "i14";
            }
            else if(a==15) {
                b5.setImageResource(R.drawable.j15);
                s5 = "i15";
            }
            else if(a==16) {
                b5.setImageResource(R.drawable.jblank);
                s5 = "blank";
            }
        }
        else if (tag == "i6") {
            if(a==1) {
                b6.setImageResource(R.drawable.j1);
                s6 = "i1";
            }
            else if(a==2) {
                b6.setImageResource(R.drawable.j2);
                s6 = "i2";
            }
            else if(a==3) {
                b6.setImageResource(R.drawable.j3);
                s6 = "i3";
            }
            else if(a==4) {
                b6.setImageResource(R.drawable.j4);
                s6 = "i4";
            }
            else if(a==5) {
                b6.setImageResource(R.drawable.j5);
                s6 = "i5";
            }
            else if(a==6) {
                b6.setImageResource(R.drawable.j6);
                s6 = "i6";
            }
            else if(a==7) {
                b6.setImageResource(R.drawable.j7);
                s6 = "i7";
            }
            else if(a==8) {
                b6.setImageResource(R.drawable.j8);
                s6 = "i8";
            }
            else if(a==9) {
                b6.setImageResource(R.drawable.j9);
                s6 = "i9";
            }
            else if(a==10) {
                b6.setImageResource(R.drawable.j10);
                s6 = "i10";
            }
            else if(a==11) {
                b6.setImageResource(R.drawable.j11);
                s6 = "i11";
            }
            else if(a==12) {
                b6.setImageResource(R.drawable.j12);
                s6 = "i12";
            }
            else if(a==13) {
                b6.setImageResource(R.drawable.j13);
                s6 = "i13";
            }
            else if(a==14) {
                b6.setImageResource(R.drawable.j14);
                s6 = "i14";
            }
            else if(a==15) {
                b6.setImageResource(R.drawable.j15);
                s6 = "i15";
            }
            else if(a==16) {
                b6.setImageResource(R.drawable.jblank);
                s6 = "blank";
            }
        }

        else if (tag == "i7") {
            if(a==1) {
                b7.setImageResource(R.drawable.j1);
                s7 = "i1";
            }
            else if(a==2) {
                b7.setImageResource(R.drawable.j2);
                s7 = "i2";
            }
            else if(a==3) {
                b7.setImageResource(R.drawable.j3);
                s7 = "i3";
            }
            else if(a==4) {
                b7.setImageResource(R.drawable.j4);
                s7 = "i4";
            }
            else if(a==5) {
                b7.setImageResource(R.drawable.j5);
                s7 = "i5";
            }
            else if(a==6) {
                b7.setImageResource(R.drawable.j6);
                s7 = "i6";
            }
            else if(a==7) {
                b7.setImageResource(R.drawable.j7);
                s7 = "i7";
            }
            else if(a==8) {
                b7.setImageResource(R.drawable.j8);
                s7 = "i8";
            }
            else if(a==9) {
                b7.setImageResource(R.drawable.j9);
                s7 = "i9";
            }
            else if(a==10) {
                b7.setImageResource(R.drawable.j10);
                s7 = "i10";
            }
            else if(a==11) {
                b7.setImageResource(R.drawable.j11);
                s7 = "i11";
            }
            else if(a==12) {
                b7.setImageResource(R.drawable.j12);
                s7 = "i12";
            }
            else if(a==13) {
                b7.setImageResource(R.drawable.j13);
                s7 = "i13";
            }
            else if(a==14) {
                b7.setImageResource(R.drawable.j14);
                s7 = "i14";
            }
            else if(a==15) {
                b7.setImageResource(R.drawable.j15);
                s7 = "i15";
            }
            else if(a==16) {
                b7.setImageResource(R.drawable.jblank);
                s7 = "blank";
            }
        }

        else if (tag == "i8") {
            if(a==1) {
                b8.setImageResource(R.drawable.j1);
                s8 = "i1";
            }
            else if(a==2) {
                b8.setImageResource(R.drawable.j2);
                s8 = "i2";
            }
            else if(a==3) {
                b8.setImageResource(R.drawable.j3);
                s8 = "i3";
            }
            else if(a==4) {
                b8.setImageResource(R.drawable.j4);
                s8 = "i4";
            }
            else if(a==5) {
                b8.setImageResource(R.drawable.j5);
                s8 = "i5";
            }
            else if(a==6) {
                b8.setImageResource(R.drawable.j6);
                s8 = "i6";
            }
            else if(a==7) {
                b8.setImageResource(R.drawable.j7);
                s8 = "i7";
            }
            else if(a==8) {
                b8.setImageResource(R.drawable.j8);
                s8 = "i8";
            }
            else if(a==9) {
                b8.setImageResource(R.drawable.j9);
                s8 = "i9";
            }
            else if(a==10) {
                b8.setImageResource(R.drawable.j10);
                s8 = "i10";
            }
            else if(a==11) {
                b8.setImageResource(R.drawable.j11);
                s8 = "i11";
            }
            else if(a==12) {
                b8.setImageResource(R.drawable.j12);
                s8 = "i12";
            }
            else if(a==13) {
                b8.setImageResource(R.drawable.j13);
                s8 = "i13";
            }
            else if(a==14) {
                b8.setImageResource(R.drawable.j14);
                s8 = "i14";
            }
            else if(a==15) {
                b8.setImageResource(R.drawable.j15);
                s8 = "i15";
            }
            else if(a==16) {
                b8.setImageResource(R.drawable.jblank);
                s8 = "blank";
            }
        }

        else if (tag == "i9") {
            if(a==1) {
                b9.setImageResource(R.drawable.j1);
                s9 = "i1";
            }
            else if(a==2) {
                b9.setImageResource(R.drawable.j2);
                s9 = "i2";
            }
            else if(a==3) {
                b9.setImageResource(R.drawable.j3);
                s9 = "i3";
            }
            else if(a==4) {
                b9.setImageResource(R.drawable.j4);
                s9 = "i4";
            }
            else if(a==5) {
                b9.setImageResource(R.drawable.j5);
                s9 = "i5";
            }
            else if(a==6) {
                b9.setImageResource(R.drawable.j6);
                s9 = "i6";
            }
            else if(a==7) {
                b9.setImageResource(R.drawable.j7);
                s9 = "i7";
            }
            else if(a==8) {
                b9.setImageResource(R.drawable.j8);
                s9 = "i8";
            }
            else if(a==9) {
                b9.setImageResource(R.drawable.j9);
                s9 = "i9";
            }
            else if(a==10) {
                b9.setImageResource(R.drawable.j10);
                s9 = "i10";
            }
            else if(a==11) {
                b9.setImageResource(R.drawable.j11);
                s9 = "i11";
            }
            else if(a==12) {
                b9.setImageResource(R.drawable.j12);
                s9 = "i12";
            }
            else if(a==13) {
                b9.setImageResource(R.drawable.j13);
                s9 = "i13";
            }
            else if(a==14) {
                b9.setImageResource(R.drawable.j14);
                s9 = "i14";
            }
            else if(a==15) {
                b9.setImageResource(R.drawable.j15);
                s9 = "i15";
            }
            else if(a==16) {
                b9.setImageResource(R.drawable.jblank);
                s9 = "blank";
            }
        }

        else if (tag == "i10") {
            if(a==1) {
                b10.setImageResource(R.drawable.j1);
                s10 = "i1";
            }
            else if(a==2) {
                b10.setImageResource(R.drawable.j2);
                s10 = "i2";
            }
            else if(a==3) {
                b10.setImageResource(R.drawable.j3);
                s10 = "i3";
            }
            else if(a==4) {
                b10.setImageResource(R.drawable.j4);
                s10 = "i4";
            }
            else if(a==5) {
                b10.setImageResource(R.drawable.j5);
                s10 = "i5";
            }
            else if(a==6) {
                b10.setImageResource(R.drawable.j6);
                s10 = "i6";
            }
            else if(a==7) {
                b10.setImageResource(R.drawable.j7);
                s10 = "i7";
            }
            else if(a==8) {
                b10.setImageResource(R.drawable.j8);
                s10 = "i8";
            }
            else if(a==9) {
                b10.setImageResource(R.drawable.j9);
                s10 = "i9";
            }
            else if(a==10) {
                b10.setImageResource(R.drawable.j10);
                s10 = "i10";
            }
            else if(a==11) {
                b10.setImageResource(R.drawable.j11);
                s10 = "i11";
            }
            else if(a==12) {
                b10.setImageResource(R.drawable.j12);
                s10 = "i12";
            }
            else if(a==13) {
                b10.setImageResource(R.drawable.j13);
                s10 = "i13";
            }
            else if(a==14) {
                b10.setImageResource(R.drawable.j14);
                s10 = "i14";
            }
            else if(a==15) {
                b10.setImageResource(R.drawable.j15);
                s10 = "i15";
            }
            else if(a==16) {
                b10.setImageResource(R.drawable.jblank);
                s10 = "blank";
            }
        }
        else if (tag == "i11") {
            if(a==1) {
                b11.setImageResource(R.drawable.j1);
                s11 = "i1";
            }
            else if(a==2) {
                b11.setImageResource(R.drawable.j2);
                s11 = "i2";
            }
            else if(a==3) {
                b11.setImageResource(R.drawable.j3);
                s11 = "i3";
            }
            else if(a==4) {
                b11.setImageResource(R.drawable.j4);
                s11 = "i4";
            }
            else if(a==5) {
                b11.setImageResource(R.drawable.j5);
                s11 = "i5";
            }
            else if(a==6) {
                b11.setImageResource(R.drawable.j6);
                s11 = "i6";
            }
            else if(a==7) {
                b11.setImageResource(R.drawable.j7);
                s11 = "i7";
            }
            else if(a==8) {
                b11.setImageResource(R.drawable.j8);
                s11 = "i8";
            }
            else if(a==9) {
                b11.setImageResource(R.drawable.j9);
                s11 = "i9";
            }
            else if(a==10) {
                b11.setImageResource(R.drawable.j10);
                s11 = "i10";
            }
            else if(a==11) {
                b11.setImageResource(R.drawable.j11);
                s11 = "i11";
            }
            else if(a==12) {
                b11.setImageResource(R.drawable.j12);
                s11 = "i12";
            }
            else if(a==13) {
                b11.setImageResource(R.drawable.j13);
                s11 = "i13";
            }
            else if(a==14) {
                b11.setImageResource(R.drawable.j14);
                s11 = "i14";
            }
            else if(a==15) {
                b11.setImageResource(R.drawable.j15);
                s11 = "i15";
            }
            else if(a==16) {
                b11.setImageResource(R.drawable.jblank);
                s11 = "blank";
            }
        }
        else if (tag == "i12") {
            if(a==1) {
                b12.setImageResource(R.drawable.j1);
                s12 = "i1";
            }
            else if(a==2) {
                b12.setImageResource(R.drawable.j2);
                s12 = "i2";
            }
            else if(a==3) {
                b12.setImageResource(R.drawable.j3);
                s12 = "i3";
            }
            else if(a==4) {
                b12.setImageResource(R.drawable.j4);
                s12 = "i4";
            }
            else if(a==5) {
                b12.setImageResource(R.drawable.j5);
                s12 = "i5";
            }
            else if(a==6) {
                b12.setImageResource(R.drawable.j6);
                s12 = "i6";
            }
            else if(a==7) {
                b12.setImageResource(R.drawable.j7);
                s12 = "i7";
            }
            else if(a==8) {
                b12.setImageResource(R.drawable.j8);
                s12 = "i8";
            }
            else if(a==9) {
                b12.setImageResource(R.drawable.j9);
                s12 = "i9";
            }
            else if(a==10) {
                b12.setImageResource(R.drawable.j10);
                s12 = "i10";
            }
            else if(a==11) {
                b12.setImageResource(R.drawable.j11);
                s12 = "i11";
            }
            else if(a==12) {
                b12.setImageResource(R.drawable.j12);
                s12 = "i12";
            }
            else if(a==13) {
                b12.setImageResource(R.drawable.j13);
                s12 = "i13";
            }
            else if(a==14) {
                b12.setImageResource(R.drawable.j14);
                s12 = "i14";
            }
            else if(a==15) {
                b12.setImageResource(R.drawable.j15);
                s12 = "i15";
            }
            else if(a==16) {
                b12.setImageResource(R.drawable.jblank);
                s12 = "blank";
            }
        }
        else if (tag == "i13") {
            if(a==1) {
                b13.setImageResource(R.drawable.j1);
                s13 = "i1";
            }
            else if(a==2) {
                b13.setImageResource(R.drawable.j2);
                s13 = "i2";
            }
            else if(a==3) {
                b13.setImageResource(R.drawable.j3);
                s13 = "i3";
            }
            else if(a==4) {
                b13.setImageResource(R.drawable.j4);
                s13 = "i4";
            }
            else if(a==5) {
                b13.setImageResource(R.drawable.j5);
                s13 = "i5";
            }
            else if(a==6) {
                b13.setImageResource(R.drawable.j6);
                s13 = "i6";
            }
            else if(a==7) {
                b13.setImageResource(R.drawable.j7);
                s13 = "i7";
            }
            else if(a==8) {
                b13.setImageResource(R.drawable.j8);
                s13 = "i8";
            }
            else if(a==9) {
                b13.setImageResource(R.drawable.j9);
                s13 = "i9";
            }
            else if(a==10) {
                b13.setImageResource(R.drawable.j10);
                s13 = "i10";
            }
            else if(a==11) {
                b13.setImageResource(R.drawable.j11);
                s13 = "i11";
            }
            else if(a==12) {
                b13.setImageResource(R.drawable.j12);
                s13 = "i12";
            }
            else if(a==13) {
                b13.setImageResource(R.drawable.j13);
                s13 = "i13";
            }
            else if(a==14) {
                b13.setImageResource(R.drawable.j14);
                s13 = "i14";
            }
            else if(a==15) {
                b13.setImageResource(R.drawable.j15);
                s13 = "i15";
            }
            else if(a==16) {
                b13.setImageResource(R.drawable.jblank);
                s13 = "blank";
            }
        }
        else if (tag == "i14") {
            if(a==1) {
                b14.setImageResource(R.drawable.j1);
                s14 = "i1";
            }
            else if(a==2) {
                b14.setImageResource(R.drawable.j2);
                s14 = "i2";
            }
            else if(a==3) {
                b14.setImageResource(R.drawable.j3);
                s14 = "i3";
            }
            else if(a==4) {
                b14.setImageResource(R.drawable.j4);
                s14 = "i4";
            }
            else if(a==5) {
                b14.setImageResource(R.drawable.j5);
                s14 = "i5";
            }
            else if(a==6) {
                b14.setImageResource(R.drawable.j6);
                s14 = "i6";
            }
            else if(a==7) {
                b14.setImageResource(R.drawable.j7);
                s14 = "i7";
            }
            else if(a==8) {
                b14.setImageResource(R.drawable.j8);
                s14 = "i8";
            }
            else if(a==9) {
                b14.setImageResource(R.drawable.j9);
                s14 = "i9";
            }
            else if(a==10) {
                b14.setImageResource(R.drawable.j10);
                s14 = "i10";
            }
            else if(a==11) {
                b14.setImageResource(R.drawable.j11);
                s14 = "i11";
            }
            else if(a==12) {
                b14.setImageResource(R.drawable.j12);
                s14 = "i12";
            }
            else if(a==13) {
                b14.setImageResource(R.drawable.j13);
                s14 = "i13";
            }
            else if(a==14) {
                b14.setImageResource(R.drawable.j14);
                s14 = "i14";
            }
            else if(a==15) {
                b14.setImageResource(R.drawable.j15);
                s14 = "i15";
            }
            else if(a==16) {
                b14.setImageResource(R.drawable.jblank);
                s14 = "blank";
            }
        }
        else if (tag == "i15") {
            if(a==1) {
                b15.setImageResource(R.drawable.j1);
                s15 = "i1";
            }
            else if(a==2) {
                b15.setImageResource(R.drawable.j2);
                s15 = "i2";
            }
            else if(a==3) {
                b15.setImageResource(R.drawable.j3);
                s15 = "i3";
            }
            else if(a==4) {
                b15.setImageResource(R.drawable.j4);
                s15 = "i4";
            }
            else if(a==5) {
                b15.setImageResource(R.drawable.j5);
                s15 = "i5";
            }
            else if(a==6) {
                b15.setImageResource(R.drawable.j6);
                s15 = "i6";
            }
            else if(a==7) {
                b15.setImageResource(R.drawable.j7);
                s15 = "i7";
            }
            else if(a==8) {
                b15.setImageResource(R.drawable.j8);
                s15 = "i8";
            }
            else if(a==9) {
                b15.setImageResource(R.drawable.j9);
                s15 = "i9";
            }
            else if(a==10) {
                b15.setImageResource(R.drawable.j10);
                s15 = "i10";
            }
            else if(a==11) {
                b15.setImageResource(R.drawable.j11);
                s15 = "i11";
            }
            else if(a==12) {
                b15.setImageResource(R.drawable.j12);
                s15 = "i12";
            }
            else if(a==13) {
                b15.setImageResource(R.drawable.j13);
                s15 = "i13";
            }
            else if(a==14) {
                b15.setImageResource(R.drawable.j14);
                s15 = "i14";
            }
            else if(a==15) {
                b15.setImageResource(R.drawable.j15);
                s15 = "i15";
            }
            else if(a==16) {
                b15.setImageResource(R.drawable.jblank);
                s15 = "blank";
            }
        }
        else if (tag == "blank") {
            if(a==1) {
                b16.setImageResource(R.drawable.j1);
                s16 = "i1";
            }
            else if(a==2) {
                b16.setImageResource(R.drawable.j2);
                s16 = "i2";
            }
            else if(a==3) {
                b16.setImageResource(R.drawable.j3);
                s16 = "i3";
            }
            else if(a==4) {
                b16.setImageResource(R.drawable.j4);
                s16 = "i4";
            }
            else if(a==5) {
                b16.setImageResource(R.drawable.j5);
                s16 = "i5";
            }
            else if(a==6) {
                b16.setImageResource(R.drawable.j6);
                s16 = "i6";
            }
            else if(a==7) {
                b16.setImageResource(R.drawable.j7);
                s16 = "i7";
            }
            else if(a==8) {
                b16.setImageResource(R.drawable.j8);
                s16 = "i8";
            }
            else if(a==9) {
                b16.setImageResource(R.drawable.j9);
                s16 = "i9";
            }
            else if(a==10) {
                b16.setImageResource(R.drawable.j10);
                s16 = "i10";
            }
            else if(a==11) {
                b16.setImageResource(R.drawable.j11);
                s16 = "i11";
            }
            else if(a==12) {
                b16.setImageResource(R.drawable.j12);
                s16 = "i12";
            }
            else if(a==13) {
                b16.setImageResource(R.drawable.j13);
                s16 = "i13";
            }
            else if(a==14) {
                b16.setImageResource(R.drawable.j14);
                s16 = "i14";
            }
            else if(a==15) {
                b16.setImageResource(R.drawable.j15);
                s16 = "i15";
            }
            else if(a==16) {
                b16.setImageResource(R.drawable.jblank);
                s16 = "blank";
            }
        }

    }



    //   change  1
    private void change1(String tag,String t1,String t2)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b2.setImageResource(R.drawable.j1);
                s2 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b2.setImageResource(R.drawable.j2);
                s2 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b2.setImageResource(R.drawable.j3);
                s2 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b2.setImageResource(R.drawable.j4);
                s2 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b2.setImageResource(R.drawable.j5);
                s2 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b2.setImageResource(R.drawable.j6);
                s2 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b2.setImageResource(R.drawable.j7);
                s2 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b2.setImageResource(R.drawable.j8);
                s2 = "i8";
            }
            else if (tag.equals("i9"))
            {
                b2.setImageResource(R.drawable.j9);
                s2 = "i9";
            }
            else if (tag.equals("i10"))
            {
                b2.setImageResource(R.drawable.j10);
                s2 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b2.setImageResource(R.drawable.j11);
                s2 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b2.setImageResource(R.drawable.j12);
                s2 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b2.setImageResource(R.drawable.j13);
                s2 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b2.setImageResource(R.drawable.j14);
                s2 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b2.setImageResource(R.drawable.j15);
                s2 = "i15";
            }

            b1.setImageResource(R.drawable.jblank);
            s1 = "blank";
            count++;
            sc.setText(count.toString());

        }
        else if(t2.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b5.setImageResource(R.drawable.j1);
                s5 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b5.setImageResource(R.drawable.j2);
                s5 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b5.setImageResource(R.drawable.j3);
                s5 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b5.setImageResource(R.drawable.j4);
                s5 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b5.setImageResource(R.drawable.j5);
                s5 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b5.setImageResource(R.drawable.j6);
                s5 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b5.setImageResource(R.drawable.j7);
                s5 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b5.setImageResource(R.drawable.j8);
                s5 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b5.setImageResource(R.drawable.j9);
                s5 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b5.setImageResource(R.drawable.j10);
                s5 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b5.setImageResource(R.drawable.j11);
                s5 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b5.setImageResource(R.drawable.j12);
                s5 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b5.setImageResource(R.drawable.j13);
                s5 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b5.setImageResource(R.drawable.j14);
                s5 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b5.setImageResource(R.drawable.j15);
                s5 = "i15";
            }

            b1.setImageResource(R.drawable.jblank);
            s1 = "blank";
            count++;
            sc.setText(count.toString());
        }

        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("i9") && s10.equals("i10") && s11.equals("i11") && s12.equals("i12") && s13.equals("i13") && s14.equals("i14") && s15.equals("i15") && s16.equals("blank") )
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }


    //   change  2
    private void change2(String tag,String t1,String t2,String t3)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b1.setImageResource(R.drawable.j1);
                s1 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b1.setImageResource(R.drawable.j2);
                s1 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b1.setImageResource(R.drawable.j3);
                s1 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b1.setImageResource(R.drawable.j4);
                s1 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b1.setImageResource(R.drawable.j5);
                s1 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b1.setImageResource(R.drawable.j6);
                s1 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b1.setImageResource(R.drawable.j7);
                s1 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b1.setImageResource(R.drawable.j8);
                s1 = "i8";
            }
            else if (tag.equals("i9"))
            {
                b1.setImageResource(R.drawable.j9);
                s1 = "i9";
            }
            else if (tag.equals("i10"))
            {
                b1.setImageResource(R.drawable.j10);
                s1 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b1.setImageResource(R.drawable.j11);
                s1 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b1.setImageResource(R.drawable.j12);
                s1 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b1.setImageResource(R.drawable.j13);
                s1 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b1.setImageResource(R.drawable.j14);
                s1 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b1.setImageResource(R.drawable.j15);
                s1 = "i15";
            }



            b2.setImageResource(R.drawable.jblank);
            s2 = "blank";
            count++;
            sc.setText(count.toString());

        }
        else if(t2.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b3.setImageResource(R.drawable.j1);
                s3 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b3.setImageResource(R.drawable.j2);
                s3 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b3.setImageResource(R.drawable.j3);
                s3 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b3.setImageResource(R.drawable.j4);
                s3 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b3.setImageResource(R.drawable.j5);
                s3 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b3.setImageResource(R.drawable.j6);
                s3 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b3.setImageResource(R.drawable.j7);
                s3 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b3.setImageResource(R.drawable.j8);
                s3 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b3.setImageResource(R.drawable.j9);
                s3 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b3.setImageResource(R.drawable.j10);
                s3 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b3.setImageResource(R.drawable.j11);
                s3 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b3.setImageResource(R.drawable.j12);
                s3 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b3.setImageResource(R.drawable.j13);
                s3 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b3.setImageResource(R.drawable.j14);
                s3 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b3.setImageResource(R.drawable.j15);
                s3 = "i15";
            }


            b2.setImageResource(R.drawable.jblank);
            s2 = "blank";
            count++;
            sc.setText(count.toString());
        }
        else if(t3.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b6.setImageResource(R.drawable.j1);
                s6 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b6.setImageResource(R.drawable.j2);
                s6 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b6.setImageResource(R.drawable.j3);
                s6 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b6.setImageResource(R.drawable.j4);
                s6 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b6.setImageResource(R.drawable.j5);
                s6 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b6.setImageResource(R.drawable.j6);
                s6 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b6.setImageResource(R.drawable.j7);
                s6 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b6.setImageResource(R.drawable.j8);
                s6 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b6.setImageResource(R.drawable.j9);
                s6 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b6.setImageResource(R.drawable.j10);
                s6 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b6.setImageResource(R.drawable.j11);
                s6 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b6.setImageResource(R.drawable.j12);
                s6 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b6.setImageResource(R.drawable.j13);
                s6 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b6.setImageResource(R.drawable.j14);
                s6 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b6.setImageResource(R.drawable.j15);
                s6 = "i15";
            }


            b2.setImageResource(R.drawable.jblank);
            s2 = "blank";
            count++;
            sc.setText(count.toString());
        }

        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("i9") && s10.equals("i10") && s11.equals("i11") && s12.equals("i12") && s13.equals("i13") && s14.equals("i14") && s15.equals("i15") && s16.equals("blank") )
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }



    //   change  3
    private void change3(String tag,String t1,String t2,String t3)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b2.setImageResource(R.drawable.j1);
                s2 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b2.setImageResource(R.drawable.j2);
                s2 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b2.setImageResource(R.drawable.j3);
                s2 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b2.setImageResource(R.drawable.j4);
                s2 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b2.setImageResource(R.drawable.j5);
                s2 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b2.setImageResource(R.drawable.j6);
                s2 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b2.setImageResource(R.drawable.j7);
                s2 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b2.setImageResource(R.drawable.j8);
                s2 = "i8";
            }
            else if (tag.equals("i9"))
            {
                b2.setImageResource(R.drawable.j9);
                s2 = "i9";
            }
            else if (tag.equals("i10"))
            {
                b2.setImageResource(R.drawable.j10);
                s2 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b2.setImageResource(R.drawable.j11);
                s2 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b2.setImageResource(R.drawable.j12);
                s2 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b2.setImageResource(R.drawable.j13);
                s2 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b2.setImageResource(R.drawable.j14);
                s2 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b2.setImageResource(R.drawable.j15);
                s2 = "i15";
            }



            b3.setImageResource(R.drawable.jblank);
            s3 = "blank";
            count++;
            sc.setText(count.toString());

        }
        else if(t2.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b4.setImageResource(R.drawable.j1);
                s4 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b4.setImageResource(R.drawable.j2);
                s4 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b4.setImageResource(R.drawable.j3);
                s4 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b4.setImageResource(R.drawable.j4);
                s4 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b4.setImageResource(R.drawable.j5);
                s4 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b4.setImageResource(R.drawable.j6);
                s4 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b4.setImageResource(R.drawable.j7);
                s4 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b4.setImageResource(R.drawable.j8);
                s4 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b4.setImageResource(R.drawable.j9);
                s4 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b4.setImageResource(R.drawable.j10);
                s4 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b4.setImageResource(R.drawable.j11);
                s4 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b4.setImageResource(R.drawable.j12);
                s4 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b4.setImageResource(R.drawable.j13);
                s4 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b4.setImageResource(R.drawable.j14);
                s4 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b4.setImageResource(R.drawable.j15);
                s4 = "i15";
            }


            b3.setImageResource(R.drawable.jblank);
            s3 = "blank";
            count++;
            sc.setText(count.toString());
        }
        else if(t3.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b7.setImageResource(R.drawable.j1);
                s7 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b7.setImageResource(R.drawable.j2);
                s7 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b7.setImageResource(R.drawable.j3);
                s7 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b7.setImageResource(R.drawable.j4);
                s7 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b7.setImageResource(R.drawable.j5);
                s7 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b7.setImageResource(R.drawable.j6);
                s7 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b7.setImageResource(R.drawable.j7);
                s7 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b7.setImageResource(R.drawable.j8);
                s7 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b7.setImageResource(R.drawable.j9);
                s7 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b7.setImageResource(R.drawable.j10);
                s7 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b7.setImageResource(R.drawable.j11);
                s7 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b7.setImageResource(R.drawable.j12);
                s7 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b7.setImageResource(R.drawable.j13);
                s7 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b7.setImageResource(R.drawable.j14);
                s7 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b7.setImageResource(R.drawable.j15);
                s7 = "i15";
            }


            b3.setImageResource(R.drawable.jblank);
            s3 = "blank";
            count++;
            sc.setText(count.toString());
        }

        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("i9") && s10.equals("i10") && s11.equals("i11") && s12.equals("i12") && s13.equals("i13") && s14.equals("i14") && s15.equals("i15") && s16.equals("blank") )
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }


    //   change  4
    private void change4(String tag,String t1,String t2)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b3.setImageResource(R.drawable.j1);
                s3 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b3.setImageResource(R.drawable.j2);
                s3 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b3.setImageResource(R.drawable.j3);
                s3 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b3.setImageResource(R.drawable.j4);
                s3 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b3.setImageResource(R.drawable.j5);
                s3 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b3.setImageResource(R.drawable.j6);
                s3 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b3.setImageResource(R.drawable.j7);
                s3 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b3.setImageResource(R.drawable.j8);
                s3 = "i8";
            }
            else if (tag.equals("i9"))
            {
                b3.setImageResource(R.drawable.j9);
                s3 = "i9";
            }
            else if (tag.equals("i10"))
            {
                b3.setImageResource(R.drawable.j10);
                s3 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b3.setImageResource(R.drawable.j11);
                s3 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b3.setImageResource(R.drawable.j12);
                s3 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b3.setImageResource(R.drawable.j13);
                s3 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b3.setImageResource(R.drawable.j14);
                s3 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b3.setImageResource(R.drawable.j15);
                s3 = "i15";
            }



            b4.setImageResource(R.drawable.jblank);
            s4 = "blank";
            count++;
            sc.setText(count.toString());

        }
        else if(t2.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b8.setImageResource(R.drawable.j1);
                s8 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b8.setImageResource(R.drawable.j2);
                s8 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b8.setImageResource(R.drawable.j3);
                s8 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b8.setImageResource(R.drawable.j4);
                s8 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b8.setImageResource(R.drawable.j5);
                s8 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b8.setImageResource(R.drawable.j6);
                s8 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b8.setImageResource(R.drawable.j7);
                s8 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b8.setImageResource(R.drawable.j8);
                s8 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b8.setImageResource(R.drawable.j9);
                s8 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b8.setImageResource(R.drawable.j10);
                s8 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b8.setImageResource(R.drawable.j11);
                s8 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b8.setImageResource(R.drawable.j12);
                s8 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b8.setImageResource(R.drawable.j13);
                s8 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b8.setImageResource(R.drawable.j14);
                s8 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b8.setImageResource(R.drawable.j15);
                s8 = "i15";
            }


            b4.setImageResource(R.drawable.jblank);
            s4 = "blank";
            count++;
            sc.setText(count.toString());
        }

        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("i9") && s10.equals("i10") && s11.equals("i11") && s12.equals("i12") && s13.equals("i13") && s14.equals("i14") && s15.equals("i15") && s16.equals("blank") )
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }


    //   change  5
    private void change5(String tag,String t1,String t2,String t3)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b1.setImageResource(R.drawable.j1);
                s1 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b1.setImageResource(R.drawable.j2);
                s1 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b1.setImageResource(R.drawable.j3);
                s1 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b1.setImageResource(R.drawable.j4);
                s1 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b1.setImageResource(R.drawable.j5);
                s1 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b1.setImageResource(R.drawable.j6);
                s1 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b1.setImageResource(R.drawable.j7);
                s1 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b1.setImageResource(R.drawable.j8);
                s1 = "i8";
            }
            else if (tag.equals("i9"))
            {
                b1.setImageResource(R.drawable.j9);
                s1 = "i9";
            }
            else if (tag.equals("i10"))
            {
                b1.setImageResource(R.drawable.j10);
                s1 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b1.setImageResource(R.drawable.j11);
                s1 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b1.setImageResource(R.drawable.j12);
                s1 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b1.setImageResource(R.drawable.j13);
                s1 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b1.setImageResource(R.drawable.j14);
                s1 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b1.setImageResource(R.drawable.j15);
                s1 = "i15";
            }



            b5.setImageResource(R.drawable.jblank);
            s5 = "blank";
            count++;
            sc.setText(count.toString());

        }
        else if(t2.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b6.setImageResource(R.drawable.j1);
                s6 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b6.setImageResource(R.drawable.j2);
                s6 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b6.setImageResource(R.drawable.j3);
                s6 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b6.setImageResource(R.drawable.j4);
                s6 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b6.setImageResource(R.drawable.j5);
                s6 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b6.setImageResource(R.drawable.j6);
                s6 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b6.setImageResource(R.drawable.j7);
                s6 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b6.setImageResource(R.drawable.j8);
                s6 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b6.setImageResource(R.drawable.j9);
                s6 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b6.setImageResource(R.drawable.j10);
                s6 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b6.setImageResource(R.drawable.j11);
                s6 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b6.setImageResource(R.drawable.j12);
                s6 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b6.setImageResource(R.drawable.j13);
                s6 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b6.setImageResource(R.drawable.j14);
                s6 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b6.setImageResource(R.drawable.j15);
                s6 = "i15";
            }


            b5.setImageResource(R.drawable.jblank);
            s5 = "blank";
            count++;
            sc.setText(count.toString());
        }
        else if(t3.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b9.setImageResource(R.drawable.j1);
                s9 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b9.setImageResource(R.drawable.j2);
                s9 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b9.setImageResource(R.drawable.j3);
                s9 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b9.setImageResource(R.drawable.j4);
                s9 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b9.setImageResource(R.drawable.j5);
                s9 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b9.setImageResource(R.drawable.j6);
                s9 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b9.setImageResource(R.drawable.j7);
                s9 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b9.setImageResource(R.drawable.j8);
                s9 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b9.setImageResource(R.drawable.j9);
                s9 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b9.setImageResource(R.drawable.j10);
                s9 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b9.setImageResource(R.drawable.j11);
                s9 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b9.setImageResource(R.drawable.j12);
                s9 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b9.setImageResource(R.drawable.j13);
                s9 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b9.setImageResource(R.drawable.j14);
                s9 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b9.setImageResource(R.drawable.j15);
                s9 = "i15";
            }


            b5.setImageResource(R.drawable.jblank);
            s5 = "blank";
            count++;
            sc.setText(count.toString());
        }

        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("i9") && s10.equals("i10") && s11.equals("i11") && s12.equals("i12") && s13.equals("i13") && s14.equals("i14") && s15.equals("i15") && s16.equals("blank") )
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }


    //   change  6
    private void change6(String tag,String t1,String t2,String t3,String t4)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b2.setImageResource(R.drawable.j1);
                s2 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b2.setImageResource(R.drawable.j2);
                s2 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b2.setImageResource(R.drawable.j3);
                s2 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b2.setImageResource(R.drawable.j4);
                s2 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b2.setImageResource(R.drawable.j5);
                s2 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b2.setImageResource(R.drawable.j6);
                s2 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b2.setImageResource(R.drawable.j7);
                s2 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b2.setImageResource(R.drawable.j8);
                s2 = "i8";
            }
            else if (tag.equals("i9"))
            {
                b2.setImageResource(R.drawable.j9);
                s2 = "i9";
            }
            else if (tag.equals("i10"))
            {
                b2.setImageResource(R.drawable.j10);
                s2 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b2.setImageResource(R.drawable.j11);
                s2 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b2.setImageResource(R.drawable.j12);
                s2 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b2.setImageResource(R.drawable.j13);
                s2 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b2.setImageResource(R.drawable.j14);
                s2 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b2.setImageResource(R.drawable.j15);
                s2 = "i15";
            }



            b6.setImageResource(R.drawable.jblank);
            s6 = "blank";
            count++;
            sc.setText(count.toString());

        }
        else if(t2.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b5.setImageResource(R.drawable.j1);
                s5 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b5.setImageResource(R.drawable.j2);
                s5 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b5.setImageResource(R.drawable.j3);
                s5 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b5.setImageResource(R.drawable.j4);
                s5 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b5.setImageResource(R.drawable.j5);
                s5 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b5.setImageResource(R.drawable.j6);
                s5 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b5.setImageResource(R.drawable.j7);
                s5 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b5.setImageResource(R.drawable.j8);
                s5 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b5.setImageResource(R.drawable.j9);
                s5 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b5.setImageResource(R.drawable.j10);
                s5 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b5.setImageResource(R.drawable.j11);
                s5 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b5.setImageResource(R.drawable.j12);
                s5 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b5.setImageResource(R.drawable.j13);
                s5 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b5.setImageResource(R.drawable.j14);
                s5 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b5.setImageResource(R.drawable.j15);
                s5 = "i15";
            }


            b6.setImageResource(R.drawable.jblank);
            s6 = "blank";
            count++;
            sc.setText(count.toString());
        }
        else if(t3.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b7.setImageResource(R.drawable.j1);
                s7 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b7.setImageResource(R.drawable.j2);
                s7 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b7.setImageResource(R.drawable.j3);
                s7 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b7.setImageResource(R.drawable.j4);
                s7 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b7.setImageResource(R.drawable.j5);
                s7 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b7.setImageResource(R.drawable.j6);
                s7 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b7.setImageResource(R.drawable.j7);
                s7 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b7.setImageResource(R.drawable.j8);
                s7 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b7.setImageResource(R.drawable.j9);
                s7 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b7.setImageResource(R.drawable.j10);
                s7 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b7.setImageResource(R.drawable.j11);
                s7 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b7.setImageResource(R.drawable.j12);
                s7 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b7.setImageResource(R.drawable.j13);
                s7 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b7.setImageResource(R.drawable.j14);
                s7 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b7.setImageResource(R.drawable.j15);
                s7 = "i15";
            }


            b6.setImageResource(R.drawable.jblank);
            s6 = "blank";
            count++;
            sc.setText(count.toString());
        }
        else if(t4.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b10.setImageResource(R.drawable.j1);
                s10 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b10.setImageResource(R.drawable.j2);
                s10 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b10.setImageResource(R.drawable.j3);
                s10 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b10.setImageResource(R.drawable.j4);
                s10 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b10.setImageResource(R.drawable.j5);
                s10 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b10.setImageResource(R.drawable.j6);
                s10 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b10.setImageResource(R.drawable.j7);
                s10 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b10.setImageResource(R.drawable.j8);
                s10 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b10.setImageResource(R.drawable.j9);
                s10 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b10.setImageResource(R.drawable.j10);
                s10 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b10.setImageResource(R.drawable.j11);
                s10 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b10.setImageResource(R.drawable.j12);
                s10 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b10.setImageResource(R.drawable.j13);
                s10 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b10.setImageResource(R.drawable.j14);
                s10 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b10.setImageResource(R.drawable.j15);
                s10 = "i15";
            }


            b6.setImageResource(R.drawable.jblank);
            s6 = "blank";
            count++;
            sc.setText(count.toString());
        }

        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("i9") && s10.equals("i10") && s11.equals("i11") && s12.equals("i12") && s13.equals("i13") && s14.equals("i14") && s15.equals("i15") && s16.equals("blank") )
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }


    //   change  7
    private void change7(String tag,String t1,String t2,String t3,String t4)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b3.setImageResource(R.drawable.j1);
                s3 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b3.setImageResource(R.drawable.j2);
                s3 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b3.setImageResource(R.drawable.j3);
                s3 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b3.setImageResource(R.drawable.j4);
                s3 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b3.setImageResource(R.drawable.j5);
                s3 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b3.setImageResource(R.drawable.j6);
                s3 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b3.setImageResource(R.drawable.j7);
                s3 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b3.setImageResource(R.drawable.j8);
                s3 = "i8";
            }
            else if (tag.equals("i9"))
            {
                b3.setImageResource(R.drawable.j9);
                s3 = "i9";
            }
            else if (tag.equals("i10"))
            {
                b3.setImageResource(R.drawable.j10);
                s3 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b3.setImageResource(R.drawable.j11);
                s3 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b3.setImageResource(R.drawable.j12);
                s3 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b3.setImageResource(R.drawable.j13);
                s3 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b3.setImageResource(R.drawable.j14);
                s3 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b3.setImageResource(R.drawable.j15);
                s3 = "i15";
            }



            b7.setImageResource(R.drawable.jblank);
            s7 = "blank";
            count++;
            sc.setText(count.toString());

        }
        else if(t2.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b6.setImageResource(R.drawable.j1);
                s6 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b6.setImageResource(R.drawable.j2);
                s6 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b6.setImageResource(R.drawable.j3);
                s6 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b6.setImageResource(R.drawable.j4);
                s6 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b6.setImageResource(R.drawable.j5);
                s6 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b6.setImageResource(R.drawable.j6);
                s6 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b6.setImageResource(R.drawable.j7);
                s6 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b6.setImageResource(R.drawable.j8);
                s6 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b6.setImageResource(R.drawable.j9);
                s6 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b6.setImageResource(R.drawable.j10);
                s6 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b6.setImageResource(R.drawable.j11);
                s6 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b6.setImageResource(R.drawable.j12);
                s6 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b6.setImageResource(R.drawable.j13);
                s6 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b6.setImageResource(R.drawable.j14);
                s6 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b6.setImageResource(R.drawable.j15);
                s6 = "i15";
            }


            b7.setImageResource(R.drawable.jblank);
            s7 = "blank";
            count++;
            sc.setText(count.toString());
        }
        else if(t3.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b8.setImageResource(R.drawable.j1);
                s8 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b8.setImageResource(R.drawable.j2);
                s8 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b8.setImageResource(R.drawable.j3);
                s8 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b8.setImageResource(R.drawable.j4);
                s8 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b8.setImageResource(R.drawable.j5);
                s8 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b8.setImageResource(R.drawable.j6);
                s8 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b8.setImageResource(R.drawable.j7);
                s8 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b8.setImageResource(R.drawable.j8);
                s8 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b8.setImageResource(R.drawable.j9);
                s8 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b8.setImageResource(R.drawable.j10);
                s8 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b8.setImageResource(R.drawable.j11);
                s8 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b8.setImageResource(R.drawable.j12);
                s8 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b8.setImageResource(R.drawable.j13);
                s8 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b8.setImageResource(R.drawable.j14);
                s8 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b8.setImageResource(R.drawable.j15);
                s8 = "i15";
            }


            b7.setImageResource(R.drawable.jblank);
            s7 = "blank";
            count++;
            sc.setText(count.toString());
        }
        else if(t4.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b11.setImageResource(R.drawable.j1);
                s11 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b11.setImageResource(R.drawable.j2);
                s11 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b11.setImageResource(R.drawable.j3);
                s11 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b11.setImageResource(R.drawable.j4);
                s11 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b11.setImageResource(R.drawable.j5);
                s11 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b11.setImageResource(R.drawable.j6);
                s11 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b11.setImageResource(R.drawable.j7);
                s11 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b11.setImageResource(R.drawable.j8);
                s11 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b11.setImageResource(R.drawable.j9);
                s11 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b11.setImageResource(R.drawable.j10);
                s11 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b11.setImageResource(R.drawable.j11);
                s11 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b11.setImageResource(R.drawable.j12);
                s11 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b11.setImageResource(R.drawable.j13);
                s11 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b11.setImageResource(R.drawable.j14);
                s11 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b11.setImageResource(R.drawable.j15);
                s11 = "i15";
            }


            b7.setImageResource(R.drawable.jblank);
            s7 = "blank";
            count++;
            sc.setText(count.toString());
        }

        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("i9") && s10.equals("i10") && s11.equals("i11") && s12.equals("i12") && s13.equals("i13") && s14.equals("i14") && s15.equals("i15") && s16.equals("blank") )
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }


    //   change  8
    private void change8(String tag,String t1,String t2,String t3)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b4.setImageResource(R.drawable.j1);
                s4 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b4.setImageResource(R.drawable.j2);
                s4 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b4.setImageResource(R.drawable.j3);
                s4 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b4.setImageResource(R.drawable.j4);
                s4 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b4.setImageResource(R.drawable.j5);
                s4 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b4.setImageResource(R.drawable.j6);
                s4 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b4.setImageResource(R.drawable.j7);
                s4 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b4.setImageResource(R.drawable.j8);
                s4 = "i8";
            }
            else if (tag.equals("i9"))
            {
                b4.setImageResource(R.drawable.j9);
                s4 = "i9";
            }
            else if (tag.equals("i10"))
            {
                b4.setImageResource(R.drawable.j10);
                s4 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b4.setImageResource(R.drawable.j11);
                s4 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b4.setImageResource(R.drawable.j12);
                s4 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b4.setImageResource(R.drawable.j13);
                s4 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b4.setImageResource(R.drawable.j14);
                s4 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b4.setImageResource(R.drawable.j15);
                s4 = "i15";
            }



            b8.setImageResource(R.drawable.jblank);
            s8 = "blank";
            count++;
            sc.setText(count.toString());

        }
        else if(t2.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b7.setImageResource(R.drawable.j1);
                s7 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b7.setImageResource(R.drawable.j2);
                s7 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b7.setImageResource(R.drawable.j3);
                s7 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b7.setImageResource(R.drawable.j4);
                s7 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b7.setImageResource(R.drawable.j5);
                s7 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b7.setImageResource(R.drawable.j6);
                s7 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b7.setImageResource(R.drawable.j7);
                s7 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b7.setImageResource(R.drawable.j8);
                s7 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b7.setImageResource(R.drawable.j9);
                s7 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b7.setImageResource(R.drawable.j10);
                s7 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b7.setImageResource(R.drawable.j11);
                s7 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b7.setImageResource(R.drawable.j12);
                s7 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b7.setImageResource(R.drawable.j13);
                s7 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b7.setImageResource(R.drawable.j14);
                s7 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b7.setImageResource(R.drawable.j15);
                s7 = "i15";
            }


            b8.setImageResource(R.drawable.jblank);
            s8 = "blank";
            count++;
            sc.setText(count.toString());
        }
        else if(t3.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b12.setImageResource(R.drawable.j1);
                s12 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b12.setImageResource(R.drawable.j2);
                s12 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b12.setImageResource(R.drawable.j3);
                s12 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b12.setImageResource(R.drawable.j4);
                s12 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b12.setImageResource(R.drawable.j5);
                s12 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b12.setImageResource(R.drawable.j6);
                s12 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b12.setImageResource(R.drawable.j7);
                s12 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b12.setImageResource(R.drawable.j8);
                s12 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b12.setImageResource(R.drawable.j9);
                s12 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b12.setImageResource(R.drawable.j10);
                s12 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b12.setImageResource(R.drawable.j11);
                s12 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b12.setImageResource(R.drawable.j12);
                s12 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b12.setImageResource(R.drawable.j13);
                s12 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b12.setImageResource(R.drawable.j14);
                s12 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b12.setImageResource(R.drawable.j15);
                s12 = "i15";
            }


            b8.setImageResource(R.drawable.jblank);
            s8 = "blank";
            count++;
            sc.setText(count.toString());
        }


        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("i9") && s10.equals("i10") && s11.equals("i11") && s12.equals("i12") && s13.equals("i13") && s14.equals("i14") && s15.equals("i15") && s16.equals("blank") )
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }



    //   change  9
    private void change9(String tag,String t1,String t2,String t3)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b5.setImageResource(R.drawable.j1);
                s5 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b5.setImageResource(R.drawable.j2);
                s5 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b5.setImageResource(R.drawable.j3);
                s5 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b5.setImageResource(R.drawable.j4);
                s5 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b5.setImageResource(R.drawable.j5);
                s5 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b5.setImageResource(R.drawable.j6);
                s5 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b5.setImageResource(R.drawable.j7);
                s5 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b5.setImageResource(R.drawable.j8);
                s5 = "i8";
            }
            else if (tag.equals("i9"))
            {
                b5.setImageResource(R.drawable.j9);
                s5 = "i9";
            }
            else if (tag.equals("i10"))
            {
                b5.setImageResource(R.drawable.j10);
                s5 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b5.setImageResource(R.drawable.j11);
                s5 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b5.setImageResource(R.drawable.j12);
                s5 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b5.setImageResource(R.drawable.j13);
                s5 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b5.setImageResource(R.drawable.j14);
                s5 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b5.setImageResource(R.drawable.j15);
                s5 = "i15";
            }



            b9.setImageResource(R.drawable.jblank);
            s9 = "blank";
            count++;
            sc.setText(count.toString());

        }
        else if(t2.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b10.setImageResource(R.drawable.j1);
                s10 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b10.setImageResource(R.drawable.j2);
                s10 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b10.setImageResource(R.drawable.j3);
                s10 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b10.setImageResource(R.drawable.j4);
                s10 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b10.setImageResource(R.drawable.j5);
                s10 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b10.setImageResource(R.drawable.j6);
                s10 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b10.setImageResource(R.drawable.j7);
                s10 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b10.setImageResource(R.drawable.j8);
                s10 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b10.setImageResource(R.drawable.j9);
                s10 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b10.setImageResource(R.drawable.j10);
                s10 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b10.setImageResource(R.drawable.j11);
                s10 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b10.setImageResource(R.drawable.j12);
                s10 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b10.setImageResource(R.drawable.j13);
                s10 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b10.setImageResource(R.drawable.j14);
                s10 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b10.setImageResource(R.drawable.j15);
                s10 = "i15";
            }


            b9.setImageResource(R.drawable.jblank);
            s9 = "blank";
            count++;
            sc.setText(count.toString());
        }
        else if(t3.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b13.setImageResource(R.drawable.j1);
                s13 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b13.setImageResource(R.drawable.j2);
                s13 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b13.setImageResource(R.drawable.j3);
                s13 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b13.setImageResource(R.drawable.j4);
                s13 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b13.setImageResource(R.drawable.j5);
                s13 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b13.setImageResource(R.drawable.j6);
                s13 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b13.setImageResource(R.drawable.j7);
                s13 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b13.setImageResource(R.drawable.j8);
                s13 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b13.setImageResource(R.drawable.j9);
                s13 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b13.setImageResource(R.drawable.j10);
                s13 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b13.setImageResource(R.drawable.j11);
                s13 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b13.setImageResource(R.drawable.j12);
                s13 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b13.setImageResource(R.drawable.j13);
                s13 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b13.setImageResource(R.drawable.j14);
                s13 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b13.setImageResource(R.drawable.j15);
                s13 = "i15";
            }


            b9.setImageResource(R.drawable.jblank);
            s9 = "blank";
            count++;
            sc.setText(count.toString());
        }


        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("i9") && s10.equals("i10") && s11.equals("i11") && s12.equals("i12") && s13.equals("i13") && s14.equals("i14") && s15.equals("i15") && s16.equals("blank") )
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }



    //   change  10
    private void change10(String tag,String t1,String t2,String t3,String t4)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b6.setImageResource(R.drawable.j1);
                s6 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b6.setImageResource(R.drawable.j2);
                s6 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b6.setImageResource(R.drawable.j3);
                s6 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b6.setImageResource(R.drawable.j4);
                s6 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b6.setImageResource(R.drawable.j5);
                s6 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b6.setImageResource(R.drawable.j6);
                s6 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b6.setImageResource(R.drawable.j7);
                s6 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b6.setImageResource(R.drawable.j8);
                s6 = "i8";
            }
            else if (tag.equals("i9"))
            {
                b6.setImageResource(R.drawable.j9);
                s6 = "i9";
            }
            else if (tag.equals("i10"))
            {
                b6.setImageResource(R.drawable.j10);
                s6 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b6.setImageResource(R.drawable.j11);
                s6 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b6.setImageResource(R.drawable.j12);
                s6 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b6.setImageResource(R.drawable.j13);
                s6 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b6.setImageResource(R.drawable.j14);
                s6 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b6.setImageResource(R.drawable.j15);
                s6 = "i15";
            }

            b10.setImageResource(R.drawable.jblank);
            s10 = "blank";
            count++;
            sc.setText(count.toString());

        }
        else if(t2.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b9.setImageResource(R.drawable.j1);
                s9 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b9.setImageResource(R.drawable.j2);
                s9 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b9.setImageResource(R.drawable.j3);
                s9 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b9.setImageResource(R.drawable.j4);
                s9 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b9.setImageResource(R.drawable.j5);
                s9 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b9.setImageResource(R.drawable.j6);
                s9 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b9.setImageResource(R.drawable.j7);
                s9 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b9.setImageResource(R.drawable.j8);
                s9 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b9.setImageResource(R.drawable.j9);
                s9 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b9.setImageResource(R.drawable.j10);
                s9 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b9.setImageResource(R.drawable.j11);
                s9 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b9.setImageResource(R.drawable.j12);
                s9 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b9.setImageResource(R.drawable.j13);
                s9 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b9.setImageResource(R.drawable.j14);
                s9 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b9.setImageResource(R.drawable.j15);
                s9 = "i15";
            }


            b10.setImageResource(R.drawable.jblank);
            s10 = "blank";
            count++;
            sc.setText(count.toString());
        }
        else if(t3.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b11.setImageResource(R.drawable.j1);
                s11 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b11.setImageResource(R.drawable.j2);
                s11 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b11.setImageResource(R.drawable.j3);
                s11 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b11.setImageResource(R.drawable.j4);
                s11 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b11.setImageResource(R.drawable.j5);
                s11 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b11.setImageResource(R.drawable.j6);
                s11 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b11.setImageResource(R.drawable.j7);
                s11 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b11.setImageResource(R.drawable.j8);
                s11 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b11.setImageResource(R.drawable.j9);
                s11 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b11.setImageResource(R.drawable.j10);
                s11 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b11.setImageResource(R.drawable.j11);
                s11 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b11.setImageResource(R.drawable.j12);
                s11 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b11.setImageResource(R.drawable.j13);
                s11 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b11.setImageResource(R.drawable.j14);
                s11 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b11.setImageResource(R.drawable.j15);
                s11 = "i15";
            }


            b10.setImageResource(R.drawable.jblank);
            s10 = "blank";
            count++;
            sc.setText(count.toString());
        }
        else if(t4.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b14.setImageResource(R.drawable.j1);
                s14 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b14.setImageResource(R.drawable.j2);
                s14 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b14.setImageResource(R.drawable.j3);
                s14 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b14.setImageResource(R.drawable.j4);
                s14 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b14.setImageResource(R.drawable.j5);
                s14 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b14.setImageResource(R.drawable.j6);
                s14 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b14.setImageResource(R.drawable.j7);
                s14 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b14.setImageResource(R.drawable.j8);
                s14 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b14.setImageResource(R.drawable.j9);
                s14 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b14.setImageResource(R.drawable.j10);
                s14 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b14.setImageResource(R.drawable.j11);
                s14 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b14.setImageResource(R.drawable.j12);
                s14 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b14.setImageResource(R.drawable.j13);
                s14 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b14.setImageResource(R.drawable.j14);
                s14 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b14.setImageResource(R.drawable.j15);
                s14 = "i15";
            }


            b10.setImageResource(R.drawable.jblank);
            s10 = "blank";
            count++;
            sc.setText(count.toString());
        }

        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("i9") && s10.equals("i10") && s11.equals("i11") && s12.equals("i12") && s13.equals("i13") && s14.equals("i14") && s15.equals("i15") && s16.equals("blank") )
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }



    //   change  11
    private void change11(String tag,String t1,String t2,String t3,String t4)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b7.setImageResource(R.drawable.j1);
                s7 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b7.setImageResource(R.drawable.j2);
                s7 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b7.setImageResource(R.drawable.j3);
                s7 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b7.setImageResource(R.drawable.j4);
                s7 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b7.setImageResource(R.drawable.j5);
                s7 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b7.setImageResource(R.drawable.j6);
                s7 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b7.setImageResource(R.drawable.j7);
                s7 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b7.setImageResource(R.drawable.j8);
                s7 = "i8";
            }
            else if (tag.equals("i9"))
            {
                b7.setImageResource(R.drawable.j9);
                s7 = "i9";
            }
            else if (tag.equals("i10"))
            {
                b7.setImageResource(R.drawable.j10);
                s7 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b7.setImageResource(R.drawable.j11);
                s7 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b7.setImageResource(R.drawable.j12);
                s7 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b7.setImageResource(R.drawable.j13);
                s7 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b7.setImageResource(R.drawable.j14);
                s7 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b7.setImageResource(R.drawable.j15);
                s7 = "i15";
            }

            b11.setImageResource(R.drawable.jblank);
            s11 = "blank";
            count++;
            sc.setText(count.toString());

        }
        else if(t2.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b10.setImageResource(R.drawable.j1);
                s10 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b10.setImageResource(R.drawable.j2);
                s10 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b10.setImageResource(R.drawable.j3);
                s10 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b10.setImageResource(R.drawable.j4);
                s10 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b10.setImageResource(R.drawable.j5);
                s10 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b10.setImageResource(R.drawable.j6);
                s10 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b10.setImageResource(R.drawable.j7);
                s10 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b10.setImageResource(R.drawable.j8);
                s10 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b10.setImageResource(R.drawable.j9);
                s10 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b10.setImageResource(R.drawable.j10);
                s10 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b10.setImageResource(R.drawable.j11);
                s10 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b10.setImageResource(R.drawable.j12);
                s10 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b10.setImageResource(R.drawable.j13);
                s10 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b10.setImageResource(R.drawable.j14);
                s10 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b10.setImageResource(R.drawable.j15);
                s10 = "i15";
            }


            b11.setImageResource(R.drawable.jblank);
            s11 = "blank";
            count++;
            sc.setText(count.toString());
        }
        else if(t3.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b12.setImageResource(R.drawable.j1);
                s12 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b12.setImageResource(R.drawable.j2);
                s12 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b12.setImageResource(R.drawable.j3);
                s12 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b12.setImageResource(R.drawable.j4);
                s12 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b12.setImageResource(R.drawable.j5);
                s12 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b12.setImageResource(R.drawable.j6);
                s12 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b12.setImageResource(R.drawable.j7);
                s12 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b12.setImageResource(R.drawable.j8);
                s12 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b12.setImageResource(R.drawable.j9);
                s12 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b12.setImageResource(R.drawable.j10);
                s12 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b12.setImageResource(R.drawable.j11);
                s12 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b12.setImageResource(R.drawable.j12);
                s12 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b12.setImageResource(R.drawable.j13);
                s12 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b12.setImageResource(R.drawable.j14);
                s12 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b12.setImageResource(R.drawable.j15);
                s12 = "i15";
            }


            b11.setImageResource(R.drawable.jblank);
            s11 = "blank";
            count++;
            sc.setText(count.toString());
        }
        else if(t4.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b15.setImageResource(R.drawable.j1);
                s15 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b15.setImageResource(R.drawable.j2);
                s15 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b15.setImageResource(R.drawable.j3);
                s15 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b15.setImageResource(R.drawable.j4);
                s15 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b15.setImageResource(R.drawable.j5);
                s15 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b15.setImageResource(R.drawable.j6);
                s15 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b15.setImageResource(R.drawable.j7);
                s15 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b15.setImageResource(R.drawable.j8);
                s15 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b15.setImageResource(R.drawable.j9);
                s15 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b15.setImageResource(R.drawable.j10);
                s15 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b15.setImageResource(R.drawable.j11);
                s15 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b15.setImageResource(R.drawable.j12);
                s15 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b15.setImageResource(R.drawable.j13);
                s15 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b15.setImageResource(R.drawable.j14);
                s15 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b15.setImageResource(R.drawable.j15);
                s15 = "i15";
            }


            b11.setImageResource(R.drawable.jblank);
            s11 = "blank";
            count++;
            sc.setText(count.toString());
        }

        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("i9") && s10.equals("i10") && s11.equals("i11") && s12.equals("i12") && s13.equals("i13") && s14.equals("i14") && s15.equals("i15") && s16.equals("blank") )
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }


    //   change  12
    private void change12(String tag,String t1,String t2,String t3)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b8.setImageResource(R.drawable.j1);
                s8 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b8.setImageResource(R.drawable.j2);
                s8 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b8.setImageResource(R.drawable.j3);
                s8 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b8.setImageResource(R.drawable.j4);
                s8 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b8.setImageResource(R.drawable.j5);
                s8 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b8.setImageResource(R.drawable.j6);
                s8 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b8.setImageResource(R.drawable.j7);
                s8 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b8.setImageResource(R.drawable.j8);
                s8 = "i8";
            }
            else if (tag.equals("i9"))
            {
                b8.setImageResource(R.drawable.j9);
                s8 = "i9";
            }
            else if (tag.equals("i10"))
            {
                b8.setImageResource(R.drawable.j10);
                s8 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b8.setImageResource(R.drawable.j11);
                s8 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b8.setImageResource(R.drawable.j12);
                s8 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b8.setImageResource(R.drawable.j13);
                s8 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b8.setImageResource(R.drawable.j14);
                s8 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b8.setImageResource(R.drawable.j15);
                s8 = "i15";
            }

            b12.setImageResource(R.drawable.jblank);
            s12 = "blank";
            count++;
            sc.setText(count.toString());

        }
        else if(t2.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b11.setImageResource(R.drawable.j1);
                s11 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b11.setImageResource(R.drawable.j2);
                s11 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b11.setImageResource(R.drawable.j3);
                s11 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b11.setImageResource(R.drawable.j4);
                s11 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b11.setImageResource(R.drawable.j5);
                s11 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b11.setImageResource(R.drawable.j6);
                s11 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b11.setImageResource(R.drawable.j7);
                s11 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b11.setImageResource(R.drawable.j8);
                s11 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b11.setImageResource(R.drawable.j9);
                s11 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b11.setImageResource(R.drawable.j10);
                s11 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b11.setImageResource(R.drawable.j11);
                s11 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b11.setImageResource(R.drawable.j12);
                s11 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b11.setImageResource(R.drawable.j13);
                s11 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b11.setImageResource(R.drawable.j14);
                s11 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b11.setImageResource(R.drawable.j15);
                s11 = "i15";
            }


            b12.setImageResource(R.drawable.jblank);
            s12 = "blank";
            count++;
            sc.setText(count.toString());
        }
        else if(t3.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b16.setImageResource(R.drawable.j1);
                s16 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b16.setImageResource(R.drawable.j2);
                s16 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b16.setImageResource(R.drawable.j3);
                s16 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b16.setImageResource(R.drawable.j4);
                s16 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b16.setImageResource(R.drawable.j5);
                s16 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b16.setImageResource(R.drawable.j6);
                s16 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b16.setImageResource(R.drawable.j7);
                s16 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b16.setImageResource(R.drawable.j8);
                s16 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b16.setImageResource(R.drawable.j9);
                s16 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b16.setImageResource(R.drawable.j10);
                s16 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b16.setImageResource(R.drawable.j11);
                s16 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b16.setImageResource(R.drawable.j12);
                s16 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b16.setImageResource(R.drawable.j13);
                s16 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b16.setImageResource(R.drawable.j14);
                s16 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b16.setImageResource(R.drawable.j15);
                s16 = "i15";
            }


            b12.setImageResource(R.drawable.jblank);
            s12 = "blank";
            count++;
            sc.setText(count.toString());
        }


        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("i9") && s10.equals("i10") && s11.equals("i11") && s12.equals("i12") && s13.equals("i13") && s14.equals("i14") && s15.equals("i15") && s16.equals("blank") )
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }


    //   change  13
    private void change13(String tag,String t1,String t2)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b9.setImageResource(R.drawable.j1);
                s9 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b9.setImageResource(R.drawable.j2);
                s9 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b9.setImageResource(R.drawable.j3);
                s9 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b9.setImageResource(R.drawable.j4);
                s9 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b9.setImageResource(R.drawable.j5);
                s9 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b9.setImageResource(R.drawable.j6);
                s9 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b9.setImageResource(R.drawable.j7);
                s9 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b9.setImageResource(R.drawable.j8);
                s9 = "i8";
            }
            else if (tag.equals("i9"))
            {
                b9.setImageResource(R.drawable.j9);
                s9 = "i9";
            }
            else if (tag.equals("i10"))
            {
                b9.setImageResource(R.drawable.j10);
                s9 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b9.setImageResource(R.drawable.j11);
                s9 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b9.setImageResource(R.drawable.j12);
                s9 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b9.setImageResource(R.drawable.j13);
                s9 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b9.setImageResource(R.drawable.j14);
                s9 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b9.setImageResource(R.drawable.j15);
                s9 = "i15";
            }

            b13.setImageResource(R.drawable.jblank);
            s13 = "blank";
            count++;
            sc.setText(count.toString());

        }
        else if(t2.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b14.setImageResource(R.drawable.j1);
                s14 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b14.setImageResource(R.drawable.j2);
                s14 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b14.setImageResource(R.drawable.j3);
                s14 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b14.setImageResource(R.drawable.j4);
                s14 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b14.setImageResource(R.drawable.j5);
                s14 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b14.setImageResource(R.drawable.j6);
                s14 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b14.setImageResource(R.drawable.j7);
                s14 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b14.setImageResource(R.drawable.j8);
                s14 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b14.setImageResource(R.drawable.j9);
                s14 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b14.setImageResource(R.drawable.j10);
                s14 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b14.setImageResource(R.drawable.j11);
                s14 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b14.setImageResource(R.drawable.j12);
                s14 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b14.setImageResource(R.drawable.j13);
                s14 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b14.setImageResource(R.drawable.j14);
                s14 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b14.setImageResource(R.drawable.j15);
                s14 = "i15";
            }


            b13.setImageResource(R.drawable.jblank);
            s13 = "blank";
            count++;
            sc.setText(count.toString());
        }


        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("i9") && s10.equals("i10") && s11.equals("i11") && s12.equals("i12") && s13.equals("i13") && s14.equals("i14") && s15.equals("i15") && s16.equals("blank") )
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }


    //   change  14
    private void change14(String tag,String t1,String t2,String t3)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b10.setImageResource(R.drawable.j1);
                s10 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b10.setImageResource(R.drawable.j2);
                s10 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b10.setImageResource(R.drawable.j3);
                s10 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b10.setImageResource(R.drawable.j4);
                s10 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b10.setImageResource(R.drawable.j5);
                s10 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b10.setImageResource(R.drawable.j6);
                s10 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b10.setImageResource(R.drawable.j7);
                s10 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b10.setImageResource(R.drawable.j8);
                s10 = "i8";
            }
            else if (tag.equals("i9"))
            {
                b10.setImageResource(R.drawable.j9);
                s10 = "i9";
            }
            else if (tag.equals("i10"))
            {
                b10.setImageResource(R.drawable.j10);
                s10 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b10.setImageResource(R.drawable.j11);
                s10 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b10.setImageResource(R.drawable.j12);
                s10 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b10.setImageResource(R.drawable.j13);
                s10 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b10.setImageResource(R.drawable.j14);
                s10 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b10.setImageResource(R.drawable.j15);
                s10 = "i15";
            }

            b14.setImageResource(R.drawable.jblank);
            s14 = "blank";
            count++;
            sc.setText(count.toString());

        }
        else if(t2.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b13.setImageResource(R.drawable.j1);
                s13 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b13.setImageResource(R.drawable.j2);
                s13 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b13.setImageResource(R.drawable.j3);
                s13 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b13.setImageResource(R.drawable.j4);
                s13 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b13.setImageResource(R.drawable.j5);
                s13 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b13.setImageResource(R.drawable.j6);
                s13 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b13.setImageResource(R.drawable.j7);
                s13 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b13.setImageResource(R.drawable.j8);
                s13 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b13.setImageResource(R.drawable.j9);
                s13 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b13.setImageResource(R.drawable.j10);
                s13 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b13.setImageResource(R.drawable.j11);
                s13 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b13.setImageResource(R.drawable.j12);
                s13 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b13.setImageResource(R.drawable.j13);
                s13 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b13.setImageResource(R.drawable.j14);
                s13 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b13.setImageResource(R.drawable.j15);
                s13 = "i15";
            }


            b14.setImageResource(R.drawable.jblank);
            s14 = "blank";
            count++;
            sc.setText(count.toString());
        }
        else if(t3.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b15.setImageResource(R.drawable.j1);
                s15 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b15.setImageResource(R.drawable.j2);
                s15 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b15.setImageResource(R.drawable.j3);
                s15 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b15.setImageResource(R.drawable.j4);
                s15 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b15.setImageResource(R.drawable.j5);
                s15 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b15.setImageResource(R.drawable.j6);
                s15 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b15.setImageResource(R.drawable.j7);
                s15 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b15.setImageResource(R.drawable.j8);
                s15 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b15.setImageResource(R.drawable.j9);
                s15 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b15.setImageResource(R.drawable.j10);
                s15 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b15.setImageResource(R.drawable.j11);
                s15 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b15.setImageResource(R.drawable.j12);
                s15 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b15.setImageResource(R.drawable.j13);
                s15 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b15.setImageResource(R.drawable.j14);
                s15 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b15.setImageResource(R.drawable.j15);
                s15 = "i15";
            }


            b14.setImageResource(R.drawable.jblank);
            s14 = "blank";
            count++;
            sc.setText(count.toString());
        }


        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("i9") && s10.equals("i10") && s11.equals("i11") && s12.equals("i12") && s13.equals("i13") && s14.equals("i14") && s15.equals("i15") && s16.equals("blank") )
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }



    //   change  15
    private void change15(String tag,String t1,String t2,String t3)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b11.setImageResource(R.drawable.j1);
                s11 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b11.setImageResource(R.drawable.j2);
                s11 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b11.setImageResource(R.drawable.j3);
                s11 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b11.setImageResource(R.drawable.j4);
                s11 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b11.setImageResource(R.drawable.j5);
                s11 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b11.setImageResource(R.drawable.j6);
                s11 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b11.setImageResource(R.drawable.j7);
                s11 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b11.setImageResource(R.drawable.j8);
                s11 = "i8";
            }
            else if (tag.equals("i9"))
            {
                b11.setImageResource(R.drawable.j9);
                s11 = "i9";
            }
            else if (tag.equals("i10"))
            {
                b11.setImageResource(R.drawable.j10);
                s11 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b11.setImageResource(R.drawable.j11);
                s11 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b11.setImageResource(R.drawable.j12);
                s11 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b11.setImageResource(R.drawable.j13);
                s11 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b11.setImageResource(R.drawable.j14);
                s11 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b11.setImageResource(R.drawable.j15);
                s11 = "i15";
            }

            b15.setImageResource(R.drawable.jblank);
            s15 = "blank";
            count++;
            sc.setText(count.toString());

        }
        else if(t2.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b14.setImageResource(R.drawable.j1);
                s14 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b14.setImageResource(R.drawable.j2);
                s14 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b14.setImageResource(R.drawable.j3);
                s14 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b14.setImageResource(R.drawable.j4);
                s14 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b14.setImageResource(R.drawable.j5);
                s14 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b14.setImageResource(R.drawable.j6);
                s14 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b14.setImageResource(R.drawable.j7);
                s14 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b14.setImageResource(R.drawable.j8);
                s14 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b14.setImageResource(R.drawable.j9);
                s14 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b14.setImageResource(R.drawable.j10);
                s14 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b14.setImageResource(R.drawable.j11);
                s14 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b14.setImageResource(R.drawable.j12);
                s14 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b14.setImageResource(R.drawable.j13);
                s14 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b14.setImageResource(R.drawable.j14);
                s14 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b14.setImageResource(R.drawable.j15);
                s14 = "i15";
            }


            b15.setImageResource(R.drawable.jblank);
            s15 = "blank";
            count++;
            sc.setText(count.toString());
        }
        else if(t3.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b16.setImageResource(R.drawable.j1);
                s16 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b16.setImageResource(R.drawable.j2);
                s16 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b16.setImageResource(R.drawable.j3);
                s16 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b16.setImageResource(R.drawable.j4);
                s16 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b16.setImageResource(R.drawable.j5);
                s16 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b16.setImageResource(R.drawable.j6);
                s16 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b16.setImageResource(R.drawable.j7);
                s16 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b16.setImageResource(R.drawable.j8);
                s16 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b16.setImageResource(R.drawable.j9);
                s16 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b16.setImageResource(R.drawable.j10);
                s16 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b16.setImageResource(R.drawable.j11);
                s16 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b16.setImageResource(R.drawable.j12);
                s16 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b16.setImageResource(R.drawable.j13);
                s16 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b16.setImageResource(R.drawable.j14);
                s16 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b16.setImageResource(R.drawable.j15);
                s16 = "i15";
            }


            b15.setImageResource(R.drawable.jblank);
            s15 = "blank";
            count++;
            sc.setText(count.toString());
        }


        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("i9") && s10.equals("i10") && s11.equals("i11") && s12.equals("i12") && s13.equals("i13") && s14.equals("i14") && s15.equals("i15") && s16.equals("blank") )
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }



    //   change  16
    private void change16(String tag,String t1,String t2)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b12.setImageResource(R.drawable.j1);
                s12 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b12.setImageResource(R.drawable.j2);
                s12 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b12.setImageResource(R.drawable.j3);
                s12 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b12.setImageResource(R.drawable.j4);
                s12 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b12.setImageResource(R.drawable.j5);
                s12 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b12.setImageResource(R.drawable.j6);
                s12 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b12.setImageResource(R.drawable.j7);
                s12 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b12.setImageResource(R.drawable.j8);
                s12 = "i8";
            }
            else if (tag.equals("i9"))
            {
                b12.setImageResource(R.drawable.j9);
                s12 = "i9";
            }
            else if (tag.equals("i10"))
            {
                b12.setImageResource(R.drawable.j10);
                s12 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b12.setImageResource(R.drawable.j11);
                s12 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b12.setImageResource(R.drawable.j12);
                s12 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b12.setImageResource(R.drawable.j13);
                s12 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b12.setImageResource(R.drawable.j14);
                s12 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b12.setImageResource(R.drawable.j15);
                s12 = "i15";
            }

            b16.setImageResource(R.drawable.jblank);
            s16 = "blank";
            count++;
            sc.setText(count.toString());

        }
        else if(t2.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b15.setImageResource(R.drawable.j1);
                s15 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b15.setImageResource(R.drawable.j2);
                s15 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b15.setImageResource(R.drawable.j3);
                s15 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b15.setImageResource(R.drawable.j4);
                s15 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b15.setImageResource(R.drawable.j5);
                s15 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b15.setImageResource(R.drawable.j6);
                s15 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b15.setImageResource(R.drawable.j7);
                s15 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b15.setImageResource(R.drawable.j8);
                s15 = "i8";
            }

            else if (tag.equals("i9"))
            {
                b15.setImageResource(R.drawable.j9);
                s15 = "i9";
            }

            else if (tag.equals("i10"))
            {
                b15.setImageResource(R.drawable.j10);
                s15 = "i10";
            }
            else if (tag.equals("i11"))
            {
                b15.setImageResource(R.drawable.j11);
                s15 = "i11";
            }
            else if (tag.equals("i12"))
            {
                b15.setImageResource(R.drawable.j12);
                s15 = "i12";
            }
            else if (tag.equals("i13"))
            {
                b15.setImageResource(R.drawable.j13);
                s15 = "i13";
            }
            else if (tag.equals("i14"))
            {
                b15.setImageResource(R.drawable.j14);
                s15 = "i14";
            }
            else if (tag.equals("i15"))
            {
                b15.setImageResource(R.drawable.j15);
                s15 = "i15";
            }


            b16.setImageResource(R.drawable.jblank);
            s16 = "blank";
            count++;
            sc.setText(count.toString());
        }



        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("i9") && s10.equals("i10") && s11.equals("i11") && s12.equals("i12") && s13.equals("i13") && s14.equals("i14") && s15.equals("i15") && s16.equals("blank") )
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }

}

