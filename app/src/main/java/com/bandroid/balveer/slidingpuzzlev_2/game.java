package com.bandroid.balveer.slidingpuzzlev_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class game extends AppCompatActivity {

    ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    TextView tv;
    String s1 = "i1";
    String s2 = "i2";
    String s3 = "i3";
    String s4 = "i4";
    String s5 = "i5";
    String s6 = "i6";
    String s7 = "i7";
    String s8 = "i8";
    String s9 = "blank";

    Integer count = 0;
    TextView sc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        tv = (TextView)findViewById(R.id.name);
        sc = (TextView)findViewById(R.id.count);

        b1 = (ImageButton)findViewById(R.id.i1);
        b2 = (ImageButton)findViewById(R.id.i2);
        b3 = (ImageButton)findViewById(R.id.i3);
        b4 = (ImageButton)findViewById(R.id.i4);
        b5 = (ImageButton)findViewById(R.id.i5);
        b6 = (ImageButton)findViewById(R.id.i6);
        b7 = (ImageButton)findViewById(R.id.i7);
        b8 = (ImageButton)findViewById(R.id.i8);
        b9 = (ImageButton)findViewById(R.id.blank);

        assignRandom();

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change7(s7,s8,s4);
            }

        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change9(s9,s8,s6);
            }

        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change1(s1,s2,s4);
            }

        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change3(s3,s2,s6);
            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change2(s2,s1,s3,s5);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change4(s4,s1,s7,s5);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change6(s6,s3,s9,s5);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change8(s8,s7,s9,s5);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change5(s5,s2,s4,s6,s8);
            }
        });


    }


    //   arrange randomely
    private void assignRandom()
    {
        int a1,a2,a3,a4,a5,a6,a7,a8,a9;
        Random rand = new Random();

        a1 = rand.nextInt(9)+1;

        do{
            a2 = rand.nextInt(9)+1;
        }while(a2==a1);

        do{
            a3 = rand.nextInt(9)+1;
        }while(a3==a1 || a3==a2);

        do{
            a4 = rand.nextInt(9)+1;
        }while(a4==a1 || a4==a3 || a4==a2);

        do{
            a5 = rand.nextInt(9)+1;
        }while(a5==a1 || a5==a2 || a5==a3 || a5==a4);

        do{
            a6 = rand.nextInt(9)+1;
        }while(a6==a1 || a6==a2 || a6==a3 || a6==a4 || a6==a5);

        do{
            a7 = rand.nextInt(9)+1;
        }while(a7==a1 || a7==a2 || a7==a3 || a7==a4 || a7==a5 || a7==a6);

        do{
            a8 = rand.nextInt(9)+1;
        }while(a8==a1 || a8==a2 || a8==a3 || a8==a4 || a8==a5 || a8==a6 || a8==a7);

        do{
            a9 = rand.nextInt(9)+1;
        }while(a9==a1 || a9==a2 || a9==a3 || a9==a4 || a9==a5 || a9==a6 || a9==a7 || a9==a8);

        checkInt(s1,a1);
        checkInt(s2,a2);
        checkInt(s3,a3);
        checkInt(s4,a4);
        checkInt(s5,a5);
        checkInt(s6,a6);
        checkInt(s7,a7);
        checkInt(s8,a8);
        checkInt(s9,a9);

    }


    private void checkInt(String tag,int a) {

        if (tag == "i1") {

            if (a == 1) {
                b1.setImageResource(R.drawable.i1);
                s1 = "i1";
            } else if (a == 2) {
                b1.setImageResource(R.drawable.i2);
                s1 = "i2";
            } else if (a == 3) {
                b1.setImageResource(R.drawable.i3);
                s1 = "i3";
            } else if (a == 4) {
                b1.setImageResource(R.drawable.i4);
                s1 = "i4";
            } else if (a == 5) {
                b1.setImageResource(R.drawable.i5);
                s1 = "i5";
            } else if (a == 6) {
                b1.setImageResource(R.drawable.i6);
                s1 = "i6";
            } else if (a == 7) {
                b1.setImageResource(R.drawable.i7);
                s1 = "i7";
            } else if (a == 8) {
                b1.setImageResource(R.drawable.i8);
                s1 = "i8";
            } else if (a == 9) {
                b1.setImageResource(R.drawable.blank);
                s1 = "blank";
            }
        } else if (tag == "i2") {
            if (a == 1) {
                b2.setImageResource(R.drawable.i1);
                s2 = "i1";
            } else if (a == 2) {
                b2.setImageResource(R.drawable.i2);
                s2 = "i2";
            } else if (a == 3) {
                b2.setImageResource(R.drawable.i3);
                s2 = "i3";
            } else if (a == 4) {
                b2.setImageResource(R.drawable.i4);
                s2 = "i4";
            } else if (a == 5) {
                b2.setImageResource(R.drawable.i5);
                s2 = "i5";
            } else if (a == 6) {
                b2.setImageResource(R.drawable.i6);
                s2 = "i6";
            } else if (a == 7) {
                b2.setImageResource(R.drawable.i7);
                s2 = "i7";
            } else if (a == 8) {
                b2.setImageResource(R.drawable.i8);
                s2 = "i8";
            } else if (a == 9) {
                b2.setImageResource(R.drawable.blank);
                s2 = "blank";
            }
        } else if (tag == "i3") {
            if (a == 1) {
                b3.setImageResource(R.drawable.i1);
                s3 = "i1";
            } else if (a == 2) {
                b3.setImageResource(R.drawable.i2);
                s3 = "i2";
            } else if (a == 3) {
                b3.setImageResource(R.drawable.i3);
                s3 = "i3";
            } else if (a == 4) {
                b3.setImageResource(R.drawable.i4);
                s3 = "i4";
            } else if (a == 5) {
                b3.setImageResource(R.drawable.i5);
                s3 = "i5";
            } else if (a == 6) {
                b3.setImageResource(R.drawable.i6);
                s3 = "i6";
            } else if (a == 7) {
                b3.setImageResource(R.drawable.i7);
                s3 = "i7";
            } else if (a == 8) {
                b3.setImageResource(R.drawable.i8);
                s3 = "i8";
            } else if (a == 9) {
                b3.setImageResource(R.drawable.blank);
                s3 = "blank";
            }
        } else if (tag == "i4") {
            if (a == 1) {
                b4.setImageResource(R.drawable.i1);
                s4 = "i1";
            } else if (a == 2) {
                b4.setImageResource(R.drawable.i2);
                s4 = "i2";
            } else if (a == 3) {
                b4.setImageResource(R.drawable.i3);
                s4 = "i3";
            } else if (a == 4) {
                b4.setImageResource(R.drawable.i4);
                s4 = "i4";
            } else if (a == 5) {
                b4.setImageResource(R.drawable.i5);
                s4 = "i5";
            } else if (a == 6) {
                b4.setImageResource(R.drawable.i6);
                s4 = "i6";
            } else if (a == 7) {
                b4.setImageResource(R.drawable.i7);
                s4 = "i7";
            } else if (a == 8) {
                b4.setImageResource(R.drawable.i8);
                s4 = "i8";
            } else if (a == 9) {
                b4.setImageResource(R.drawable.blank);
                s4 = "blank";
            }
        }
        else if (tag == "i5") {
            if (a == 1) {
                b5.setImageResource(R.drawable.i1);
                s5 = "i1";
            } else if (a == 2) {
                b5.setImageResource(R.drawable.i2);
                s5 = "i2";
            } else if (a == 3) {
                b5.setImageResource(R.drawable.i3);
                s5 = "i3";
            } else if (a == 4) {
                b5.setImageResource(R.drawable.i4);
                s5 = "i4";
            } else if (a == 5) {
                b5.setImageResource(R.drawable.i5);
                s5 = "i5";
            } else if (a == 6) {
                b5.setImageResource(R.drawable.i6);
                s5 = "i6";
            } else if (a == 7) {
                b5.setImageResource(R.drawable.i7);
                s5 = "i7";
            } else if (a == 8) {
                b5.setImageResource(R.drawable.i8);
                s5 = "i8";
            } else if (a == 9) {
                b5.setImageResource(R.drawable.blank);
                s5 = "blank";
            }
        }
        else if (tag == "i6") {
            if (a == 1) {
                b6.setImageResource(R.drawable.i1);
                s6 = "i1";
            } else if (a == 2) {
                b6.setImageResource(R.drawable.i2);
                s6 = "i2";
            } else if (a == 3) {
                b6.setImageResource(R.drawable.i3);
                s6 = "i3";
            } else if (a == 4) {
                b6.setImageResource(R.drawable.i4);
                s6 = "i4";
            } else if (a == 5) {
                b6.setImageResource(R.drawable.i5);
                s6 = "i5";
            } else if (a == 6) {
                b6.setImageResource(R.drawable.i6);
                s6 = "i6";
            } else if (a == 7) {
                b6.setImageResource(R.drawable.i7);
                s6 = "i7";
            } else if (a == 8) {
                b6.setImageResource(R.drawable.i8);
                s6 = "i8";
            } else if (a == 9) {
                b6.setImageResource(R.drawable.blank);
                s6 = "blank";
            }
        }
        else if (tag == "i7") {
            if (a == 1) {
                b7.setImageResource(R.drawable.i1);
                s7 = "i1";
            } else if (a == 2) {
                b7.setImageResource(R.drawable.i2);
                s7 = "i2";
            } else if (a == 3) {
                b7.setImageResource(R.drawable.i3);
                s7 = "i3";
            } else if (a == 4) {
                b7.setImageResource(R.drawable.i4);
                s7 = "i4";
            } else if (a == 5) {
                b7.setImageResource(R.drawable.i5);
                s7 = "i5";
            } else if (a == 6) {
                b7.setImageResource(R.drawable.i6);
                s7 = "i6";
            } else if (a == 7) {
                b7.setImageResource(R.drawable.i7);
                s7 = "i7";
            } else if (a == 8) {
                b7.setImageResource(R.drawable.i8);
                s7 = "i8";
            } else if (a == 9) {
                b7.setImageResource(R.drawable.blank);
                s7 = "blank";
            }
        }
        else if (tag == "i8") {
            if (a == 1) {
                b8.setImageResource(R.drawable.i1);
                s8 = "i1";
            } else if (a == 2) {
                b8.setImageResource(R.drawable.i2);
                s8 = "i2";
            } else if (a == 3) {
                b8.setImageResource(R.drawable.i3);
                s8 = "i3";
            } else if (a == 4) {
                b8.setImageResource(R.drawable.i4);
                s8 = "i4";
            } else if (a == 5) {
                b8.setImageResource(R.drawable.i5);
                s8 = "i5";
            } else if (a == 6) {
                b8.setImageResource(R.drawable.i6);
                s8 = "i6";
            } else if (a == 7) {
                b8.setImageResource(R.drawable.i7);
                s8 = "i7";
            } else if (a == 8) {
                b8.setImageResource(R.drawable.i8);
                s8 = "i8";
            } else if (a == 9) {
                b8.setImageResource(R.drawable.blank);
                s8 = "blank";
            }
        }
        else if (tag == "blank") {
            if (a == 1) {
                b9.setImageResource(R.drawable.i1);
                s9 = "i1";
            } else if (a == 2) {
                b9.setImageResource(R.drawable.i2);
                s9 = "i2";
            } else if (a == 3) {
                b9.setImageResource(R.drawable.i3);
                s9 = "i3";
            } else if (a == 4) {
                b9.setImageResource(R.drawable.i4);
                s9 = "i4";
            } else if (a == 5) {
                b9.setImageResource(R.drawable.i5);
                s9 = "i5";
            } else if (a == 6) {
                b9.setImageResource(R.drawable.i6);
                s9 = "i6";
            } else if (a == 7) {
                b9.setImageResource(R.drawable.i7);
                s9 = "i7";
            } else if (a == 8) {
                b9.setImageResource(R.drawable.i8);
                s9 = "i8";
            } else if (a == 9) {
                b9.setImageResource(R.drawable.blank);
                s9 = "blank";
            }
        }

    }

    //   cchange 7
    private void change7(String tag,String t1,String t2)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b8.setImageResource(R.drawable.i1);
                s8 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b8.setImageResource(R.drawable.i2);
                s8 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b8.setImageResource(R.drawable.i3);
                s8 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b8.setImageResource(R.drawable.i4);
                s8 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b8.setImageResource(R.drawable.i5);
                s8 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b8.setImageResource(R.drawable.i6);
                s8 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b8.setImageResource(R.drawable.i7);
                s8 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b8.setImageResource(R.drawable.i8);
                s8 = "i8";
            }

            b7.setImageResource(R.drawable.blank);
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
                b4.setImageResource(R.drawable.i1);
                s4 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b4.setImageResource(R.drawable.i2);
                s4 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b4.setImageResource(R.drawable.i3);
                s4 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b4.setImageResource(R.drawable.i4);
                s4 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b4.setImageResource(R.drawable.i5);
                s4 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b4.setImageResource(R.drawable.i6);
                s4 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b4.setImageResource(R.drawable.i7);
                s4 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b4.setImageResource(R.drawable.i8);
                s4 = "i8";
            }
            b7.setImageResource(R.drawable.blank);
            s7 = "blank";
            count++;
            sc.setText(count.toString());

        }
        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("blank"))
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }


    }

    //   change 9
    private void change9(String tag,String t1,String t2)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b8.setImageResource(R.drawable.i1);
                s8 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b8.setImageResource(R.drawable.i2);
                s8 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b8.setImageResource(R.drawable.i3);
                s8 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b8.setImageResource(R.drawable.i4);
                s8 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b8.setImageResource(R.drawable.i5);
                s8 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b8.setImageResource(R.drawable.i6);
                s8 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b8.setImageResource(R.drawable.i7);
                s8 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b8.setImageResource(R.drawable.i8);
                s8 = "i8";
            }

            b9.setImageResource(R.drawable.blank);
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
                b6.setImageResource(R.drawable.i1);
                s6 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b6.setImageResource(R.drawable.i2);
                s6 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b6.setImageResource(R.drawable.i3);
                s6 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b6.setImageResource(R.drawable.i4);
                s6 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b6.setImageResource(R.drawable.i5);
                s6 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b6.setImageResource(R.drawable.i6);
                s6 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b6.setImageResource(R.drawable.i7);
                s6 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b6.setImageResource(R.drawable.i8);
                s6 = "i8";
            }
            b9.setImageResource(R.drawable.blank);
            s9 = "blank";
            count++;
            sc.setText(count.toString());

        }

        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("blank"))
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
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
                b2.setImageResource(R.drawable.i1);
                s2 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b2.setImageResource(R.drawable.i2);
                s2 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b2.setImageResource(R.drawable.i3);
                s2 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b2.setImageResource(R.drawable.i4);
                s2 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b2.setImageResource(R.drawable.i5);
                s2 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b2.setImageResource(R.drawable.i6);
                s2 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b2.setImageResource(R.drawable.i7);
                s2 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b2.setImageResource(R.drawable.i8);
                s2 = "i8";
            }

            b1.setImageResource(R.drawable.blank);
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
                b4.setImageResource(R.drawable.i1);
                s4 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b4.setImageResource(R.drawable.i2);
                s4 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b4.setImageResource(R.drawable.i3);
                s4 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b4.setImageResource(R.drawable.i4);
                s4 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b4.setImageResource(R.drawable.i5);
                s4 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b4.setImageResource(R.drawable.i6);
                s4 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b4.setImageResource(R.drawable.i7);
                s4 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b4.setImageResource(R.drawable.i8);
                s4 = "i8";
            }
            b1.setImageResource(R.drawable.blank);
            s1 = "blank";
            count++;
            sc.setText(count.toString());
        }

        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("blank"))
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }

    //   change 3
    private void change3(String tag,String t1,String t2)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b2.setImageResource(R.drawable.i1);
                s2 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b2.setImageResource(R.drawable.i2);
                s2 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b2.setImageResource(R.drawable.i3);
                s2 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b2.setImageResource(R.drawable.i4);
                s2 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b2.setImageResource(R.drawable.i5);
                s2 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b2.setImageResource(R.drawable.i6);
                s2 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b2.setImageResource(R.drawable.i7);
                s2 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b2.setImageResource(R.drawable.i8);
                s2 = "i8";
            }

            b3.setImageResource(R.drawable.blank);
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
                b6.setImageResource(R.drawable.i1);
                s6 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b6.setImageResource(R.drawable.i2);
                s6 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b6.setImageResource(R.drawable.i3);
                s6 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b6.setImageResource(R.drawable.i4);
                s6 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b6.setImageResource(R.drawable.i5);
                s6 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b6.setImageResource(R.drawable.i6);
                s6 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b6.setImageResource(R.drawable.i7);
                s6 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b6.setImageResource(R.drawable.i8);
                s6 = "i8";
            }
            b3.setImageResource(R.drawable.blank);
            s3 = "blank";
            count++;
            sc.setText(count.toString());

        }

        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("blank"))
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }


    //   change 2
    private void change2(String tag,String t1,String t2,String t3)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b1.setImageResource(R.drawable.i1);
                s1 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b1.setImageResource(R.drawable.i2);
                s1 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b1.setImageResource(R.drawable.i3);
                s1 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b1.setImageResource(R.drawable.i4);
                s1 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b1.setImageResource(R.drawable.i5);
                s1 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b1.setImageResource(R.drawable.i6);
                s1 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b1.setImageResource(R.drawable.i7);
                s1 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b1.setImageResource(R.drawable.i8);
                s1 = "i8";
            }

            b2.setImageResource(R.drawable.blank);
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
                b3.setImageResource(R.drawable.i1);
                s3 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b3.setImageResource(R.drawable.i2);
                s3 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b3.setImageResource(R.drawable.i3);
                s3 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b3.setImageResource(R.drawable.i4);
                s3 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b3.setImageResource(R.drawable.i5);
                s3 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b3.setImageResource(R.drawable.i6);
                s3 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b3.setImageResource(R.drawable.i7);
                s3 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b3.setImageResource(R.drawable.i8);
                s3 = "i8";
            }
            b2.setImageResource(R.drawable.blank);
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
                b5.setImageResource(R.drawable.i1);
                s5 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b5.setImageResource(R.drawable.i2);
                s5 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b5.setImageResource(R.drawable.i3);
                s5 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b5.setImageResource(R.drawable.i4);
                s5 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b5.setImageResource(R.drawable.i5);
                s5 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b5.setImageResource(R.drawable.i6);
                s5 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b5.setImageResource(R.drawable.i7);
                s5 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b5.setImageResource(R.drawable.i8);
                s5 = "i8";
            }
            b2.setImageResource(R.drawable.blank);
            s2 = "blank";
            count++;
            sc.setText(count.toString());

        }

        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("blank"))
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }


    //   change 4
    private void change4(String tag,String t1,String t2,String t3)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b1.setImageResource(R.drawable.i1);
                s1 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b1.setImageResource(R.drawable.i2);
                s1 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b1.setImageResource(R.drawable.i3);
                s1 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b1.setImageResource(R.drawable.i4);
                s1 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b1.setImageResource(R.drawable.i5);
                s1 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b1.setImageResource(R.drawable.i6);
                s1 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b1.setImageResource(R.drawable.i7);
                s1 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b1.setImageResource(R.drawable.i8);
                s1 = "i8";
            }

            b4.setImageResource(R.drawable.blank);
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
                b7.setImageResource(R.drawable.i1);
                s7 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b7.setImageResource(R.drawable.i2);
                s7 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b7.setImageResource(R.drawable.i3);
                s7 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b7.setImageResource(R.drawable.i4);
                s7 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b7.setImageResource(R.drawable.i5);
                s7 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b7.setImageResource(R.drawable.i6);
                s7 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b7.setImageResource(R.drawable.i7);
                s7 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b7.setImageResource(R.drawable.i8);
                s7 = "i8";
            }
            b4.setImageResource(R.drawable.blank);
            s4 = "blank";
            count++;
            sc.setText(count.toString());

        }
        else if(t3.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b5.setImageResource(R.drawable.i1);
                s5 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b5.setImageResource(R.drawable.i2);
                s5 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b5.setImageResource(R.drawable.i3);
                s5 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b5.setImageResource(R.drawable.i4);
                s5 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b5.setImageResource(R.drawable.i5);
                s5 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b5.setImageResource(R.drawable.i6);
                s5 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b5.setImageResource(R.drawable.i7);
                s5 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b5.setImageResource(R.drawable.i8);
                s5 = "i8";
            }
            b4.setImageResource(R.drawable.blank);
            s4 = "blank";
            count++;
            sc.setText(count.toString());

        }

        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("blank"))
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }


    //   change 6
    private void change6(String tag,String t1,String t2,String t3)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b3.setImageResource(R.drawable.i1);
                s3 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b3.setImageResource(R.drawable.i2);
                s3 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b3.setImageResource(R.drawable.i3);
                s3 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b3.setImageResource(R.drawable.i4);
                s3 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b3.setImageResource(R.drawable.i5);
                s3 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b3.setImageResource(R.drawable.i6);
                s3 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b3.setImageResource(R.drawable.i7);
                s3 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b3.setImageResource(R.drawable.i8);
                s3 = "i8";
            }

            b6.setImageResource(R.drawable.blank);
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
                b9.setImageResource(R.drawable.i1);
                s9 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b9.setImageResource(R.drawable.i2);
                s9 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b9.setImageResource(R.drawable.i3);
                s9 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b9.setImageResource(R.drawable.i4);
                s9 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b9.setImageResource(R.drawable.i5);
                s9 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b9.setImageResource(R.drawable.i6);
                s9 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b9.setImageResource(R.drawable.i7);
                s9 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b9.setImageResource(R.drawable.i8);
                s9 = "i8";
            }
            b6.setImageResource(R.drawable.blank);
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
                b5.setImageResource(R.drawable.i1);
                s5 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b5.setImageResource(R.drawable.i2);
                s5 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b5.setImageResource(R.drawable.i3);
                s5 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b5.setImageResource(R.drawable.i4);
                s5 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b5.setImageResource(R.drawable.i5);
                s5 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b5.setImageResource(R.drawable.i6);
                s5 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b5.setImageResource(R.drawable.i7);
                s5 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b5.setImageResource(R.drawable.i8);
                s5 = "i8";
            }
            b6.setImageResource(R.drawable.blank);
            s6 = "blank";
            count++;
            sc.setText(count.toString());

        }

        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("blank"))
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }

    //   change 8
    private void change8(String tag,String t1,String t2,String t3)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b7.setImageResource(R.drawable.i1);
                s7 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b7.setImageResource(R.drawable.i2);
                s7 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b7.setImageResource(R.drawable.i3);
                s7 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b7.setImageResource(R.drawable.i4);
                s7 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b7.setImageResource(R.drawable.i5);
                s7 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b7.setImageResource(R.drawable.i6);
                s7 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b7.setImageResource(R.drawable.i7);
                s7 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b7.setImageResource(R.drawable.i8);
                s7 = "i8";
            }

            b8.setImageResource(R.drawable.blank);
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
                b9.setImageResource(R.drawable.i1);
                s9 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b9.setImageResource(R.drawable.i2);
                s9 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b9.setImageResource(R.drawable.i3);
                s9 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b9.setImageResource(R.drawable.i4);
                s9 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b9.setImageResource(R.drawable.i5);
                s9 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b9.setImageResource(R.drawable.i6);
                s9 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b9.setImageResource(R.drawable.i7);
                s9 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b9.setImageResource(R.drawable.i8);
                s9 = "i8";
            }
            b8.setImageResource(R.drawable.blank);
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
                b5.setImageResource(R.drawable.i1);
                s5 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b5.setImageResource(R.drawable.i2);
                s5 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b5.setImageResource(R.drawable.i3);
                s5 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b5.setImageResource(R.drawable.i4);
                s5 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b5.setImageResource(R.drawable.i5);
                s5 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b5.setImageResource(R.drawable.i6);
                s5 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b5.setImageResource(R.drawable.i7);
                s5 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b5.setImageResource(R.drawable.i8);
                s5 = "i8";
            }
            b8.setImageResource(R.drawable.blank);
            s8 = "blank";
            count++;
            sc.setText(count.toString());

        }

        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("blank"))
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }


    //   change 5
    private void change5(String tag,String t1,String t2,String t3,String t4)
    {
        if(tag.equals("blank"))
            return;

        if(t1.equals("blank"))
        {
            if(tag.equals("i1"))
            {
                b2.setImageResource(R.drawable.i1);
                s2 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b2.setImageResource(R.drawable.i2);
                s2 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b2.setImageResource(R.drawable.i3);
                s2 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b2.setImageResource(R.drawable.i4);
                s2 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b2.setImageResource(R.drawable.i5);
                s2 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b2.setImageResource(R.drawable.i6);
                s2 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b2.setImageResource(R.drawable.i7);
                s2 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b2.setImageResource(R.drawable.i8);
                s2 = "i8";
            }

            b5.setImageResource(R.drawable.blank);
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
                b4.setImageResource(R.drawable.i1);
                s4 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b4.setImageResource(R.drawable.i2);
                s4 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b4.setImageResource(R.drawable.i3);
                s4 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b4.setImageResource(R.drawable.i4);
                s4 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b4.setImageResource(R.drawable.i5);
                s4 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b4.setImageResource(R.drawable.i6);
                s4 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b4.setImageResource(R.drawable.i7);
                s4 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b4.setImageResource(R.drawable.i8);
                s4 = "i8";
            }
            b5.setImageResource(R.drawable.blank);
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
                b6.setImageResource(R.drawable.i1);
                s6 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b6.setImageResource(R.drawable.i2);
                s6 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b6.setImageResource(R.drawable.i3);
                s6 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b6.setImageResource(R.drawable.i4);
                s6 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b6.setImageResource(R.drawable.i5);
                s6 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b6.setImageResource(R.drawable.i6);
                s6 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b6.setImageResource(R.drawable.i7);
                s6 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b6.setImageResource(R.drawable.i8);
                s6 = "i8";
            }
            b5.setImageResource(R.drawable.blank);
            s5 = "blank";
            count++;
            sc.setText(count.toString());

        }
        else if(t4.equals("blank"))
        {
            if(tag.equals("blank"))
                return;
            if(tag.equals("i1"))
            {
                b8.setImageResource(R.drawable.i1);
                s8 = "i1";
            }
            else if (tag.equals("i2"))
            {
                b8.setImageResource(R.drawable.i2);
                s8 = "i2";
            }
            else if (tag.equals("i3"))
            {
                b8.setImageResource(R.drawable.i3);
                s8 = "i3";
            }
            else if (tag.equals("i4"))
            {
                b8.setImageResource(R.drawable.i4);
                s8 = "i4";
            }
            else if (tag.equals("i5"))
            {
                b8.setImageResource(R.drawable.i5);
                s8 = "i5";
            }
            else if (tag.equals("i6"))
            {
                b8.setImageResource(R.drawable.i6);
                s8 = "i6";
            }
            else if (tag.equals("i7"))
            {
                b8.setImageResource(R.drawable.i7);
                s8 = "i7";
            }
            else if (tag.equals("i8"))
            {
                b8.setImageResource(R.drawable.i8);
                s8 = "i8";
            }
            b5.setImageResource(R.drawable.blank);
            s5 = "blank";
            count++;
            sc.setText(count.toString());

        }

        if(s1.equals("i1") && s2.equals("i2") && s3.equals("i3") && s4.equals("i4") && s5.equals("i5") && s6.equals("i6") && s7.equals("i7") && s8.equals("i8") && s9.equals("blank"))
        {
            Intent intent = new Intent(this,success.class);
            startActivity(intent);
            finish();
        }
    }
}
