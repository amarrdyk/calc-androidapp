//Developed by Amar
package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.*;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    double a,b ;
    boolean add, sub, div, mul, percentile;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, badd, bd, bsub, bprod, bpoint, bclc, bpercent, beq;
    boolean equals = false;
    int count = 0;
    TextView tf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 =findViewById(R.id.button1);
        b2 =findViewById(R.id.button2);
        b3 =findViewById(R.id.button3);
        b4 =findViewById(R.id.button4);
        b5 =findViewById(R.id.button5);
        b6 =findViewById(R.id.button6);
        b7 =findViewById(R.id.button7);
        b8 =findViewById(R.id.button8);
        b9 =findViewById(R.id.button9);
        b0 =findViewById(R.id.button0);
        badd =findViewById(R.id.buttona);
        bd =findViewById(R.id.buttond);
        bsub =findViewById(R.id.buttons);
        bprod =findViewById(R.id.buttonm);
        bpoint =findViewById(R.id.buttonpoint);
        bclc =findViewById(R.id.clc);
        bpercent =findViewById(R.id.buttonp);
        beq = findViewById(R.id.buttoneq);
        tf = findViewById(R.id.txt);

        tf.setText(" ");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                     if(equals == true || tf.getText() == "Bad expression!" )
                     {
                         tf.setText("1");
                         equals = false;
                     }
                     else{
                         tf.setText(tf.getText()+"1");
                     }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(equals == true || tf.getText() == "Bad expression!" )
                {
                    tf.setText("2");
                    equals = false;
                }
                else{
                    tf.setText(tf.getText()+"2");
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(equals == true || tf.getText() == "Bad expression!" )
                {
                    tf.setText("3");
                    equals = false;
                }
                else{
                    tf.setText(tf.getText()+"3");
                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(equals == true || tf.getText() == "Bad expression!" )
                {
                    tf.setText("4");
                    equals = false;
                }
                else{
                    tf.setText(tf.getText()+"4");
                }

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(equals == true || tf.getText() == "Bad expression!" )
                {
                    tf.setText("5");
                    equals = false;
                }
                else{
                    tf.setText(tf.getText()+"5");
                }

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(equals == true || tf.getText() == "Bad expression!" )
                {
                    tf.setText("6");
                    equals = false;
                }
                else{
                    tf.setText(tf.getText()+"6");
                }

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(equals == true || tf.getText() == "Bad expression!" )
                {
                    tf.setText("7");
                    equals = false;
                }
                else{
                    tf.setText(tf.getText()+"7");
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(equals == true || tf.getText() == "Bad expression!" )
                {
                    tf.setText("8");
                    equals = false;
                }
                else{
                    tf.setText(tf.getText()+"8");
                }

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(equals == true || tf.getText() == "Bad expression!" )
                {
                    tf.setText("9");
                    equals = false;
                }
                else{
                    tf.setText(tf.getText()+"9");
                }

            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(equals == true || tf.getText() == "Bad expression!" )
                {
                    tf.setText("0");
                    equals = false;
                }
                else{
                    tf.setText(tf.getText()+"0");
                }

            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (tf.getText() == " " || tf.getText() == "-" || tf.getText()=="Bad expression!") {
                        tf.setText(" ");
                    } else {
                        a = Double.parseDouble(tf.getText() + " ");
                        add = true;
                        sub = mul = div = percentile = false;
                        count = 0;
                        tf.setText(" ");
                    }
                }
                catch(Exception e)
                {
                    tf.setText("Bad expression!");
                }

            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (tf.getText() == " " || tf.getText() == "-" || tf.getText()=="Bad expression!") {
                        tf.setText("-");
                    }
                    else {
                        a = Double.parseDouble(tf.getText() + " ");
                        sub = true;
                        add = mul = div = percentile = false;
                        count = 0;
                        tf.setText(" ");
                    }
                }
                catch(Exception e)
                {
                    tf.setText("Bad expression!");
                }
            }
        });
        bprod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (tf.getText() == " " || tf.getText() == "-" || tf.getText()=="Bad expression!") {
                        tf.setText(" ");
                    } else {
                        a = Double.parseDouble(tf.getText() + " ");
                        mul = true;
                        sub = add = div = percentile = false;
                        count = 0;
                        tf.setText(" ");
                    }
                }
                catch(Exception e)
                {
                    tf.setText("Bad expression!");
                }
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (tf.getText() == " " || tf.getText() == "-" || tf.getText()=="Bad expression!") {
                        tf.setText(" ");
                    } else {
                        a = Double.parseDouble(tf.getText() + " ");
                        div = true;
                        sub = mul = add = percentile = false;
                        count = 0;
                        tf.setText(" ");
                    }
                }
                catch(Exception e)
                {
                    tf.setText("Bad expression!");
                }
            }
        });
        bpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (tf.getText() == " " || tf.getText() == "-" || tf.getText()=="Bad expression!") {
                        tf.setText(" ");
                    } else {
                        a = Double.parseDouble(tf.getText() + " ");
                        percentile = true;
                        sub = mul = div = add = false;
                        count = 0;
                        tf.setText(" ");
                    }
                }
                catch(Exception e)
                {
                    tf.setText("Bad expression!");
                }
            }
        });
        bpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if(count>1)
                {
                    tf.setText(tf.getText());
                }
                else {
                    if (equals == true || tf.getText() == "Bad expression!") {
                        tf.setText(".");
                        equals = false;
                    } else {
                        tf.setText(tf.getText() + ".");
                    }
                }

            }
        });
        bclc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = 0.0;
                b = 0.0;
                add = false;
                sub = false;
                mul = false;
                div = false;
                percentile = false;
                equals = false;
                count=0;
                tf.setText(" ");
            }
        });
        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (add == true) {
                        if (tf.getText() == " ") {
                            tf.setText(" ");
                        } else {
                            b = Double.parseDouble(tf.getText() + " ");
                            tf.setText(a + b + " ");
                            add = false;
                            equals = true;
                            count = 0;
                        }
                    } else if (sub == true) {
                        if (tf.getText() == " ") {
                            tf.setText(" ");
                        } else {
                            b = Double.parseDouble(tf.getText() + " ");
                            tf.setText(a - b + " ");
                            sub = false;
                            equals = true;
                            count = 0;
                        }
                    } else if (mul == true) {
                        if (tf.getText() == " ") {
                            tf.setText(" ");
                        } else {
                            b = Double.parseDouble(tf.getText() + " ");
                            tf.setText((a * b) + " ");
                            mul = false;
                            equals = true;
                            count = 0;
                        }
                    } else if (div == true) {
                        if (tf.getText() == " ") {
                            tf.setText(" ");
                        } else {
                            b = Double.parseDouble(tf.getText() + " ");
                            tf.setText((a / b) + " ");
                            div = false;
                            equals = true;
                            count = 0;
                        }
                    } else if (percentile == true) {
                        if (tf.getText() == " ") {
                            tf.setText(" ");
                        } else {
                            b = Double.parseDouble(tf.getText() + " ");
                            tf.setText(((a / 100) * b) + " ");
                            percentile = false;
                            equals = true;
                            count = 0;
                        }
                    } else if (tf.getText() == " ") {
                        tf.setText(" ");
                    } else if (tf.getText().charAt(0) == '-') {
                        tf.setText(tf.getText());
                    }

                }
                catch(Exception e){
                    tf.setText("Bad expression!");
                }

            }
        });
    }
}
