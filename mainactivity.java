package com.mrcoder20.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int x = 1;
    private int action;
    private TextView display;
    private double val1 = Double.NaN;
    private double val2 = Double.NaN;
    //private String m,n;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button n1, n2, n3, n4, n5, n6, n7, n8, n9, n0;
        Button ac, plusminus, percentage, divide, mul, minus, plus, equals, dot;


        //numbers buttons
        n1 = (Button) findViewById(R.id.n1);
        n2 = (Button) findViewById(R.id.n2);
        n3 = (Button) findViewById(R.id.n3);
        n4 = (Button) findViewById(R.id.n4);
        n5 = (Button) findViewById(R.id.n5);
        n6 = (Button) findViewById(R.id.n6);
        n7 = (Button) findViewById(R.id.n7);
        n8 = (Button) findViewById(R.id.n8);
        n9 = (Button) findViewById(R.id.n9);
        n0 = (Button) findViewById(R.id.n0);

        //symbols

        ac = (Button) findViewById(R.id.ac);
        plusminus = (Button) findViewById(R.id.plusminus);
        percentage = (Button) findViewById(R.id.percentage);
        divide = (Button) findViewById(R.id.divide);
        mul = (Button) findViewById(R.id.mul);
        minus = (Button) findViewById(R.id.minus);
        plus = (Button) findViewById(R.id.plus);
        equals = (Button) findViewById(R.id.equals);
        dot = (Button) findViewById(R.id.dot);
        display = (TextView) findViewById(R.id.display);

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText((display.getText().toString()) + "1");
                //m= m +"1";

                Log.i("1",display.getText().toString());
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText((display.getText().toString()) + "2");
                Log.i("1",display.getText().toString());
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText((display.getText().toString()) + "3");
                Log.i("1",display.getText().toString());
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText((display.getText().toString()) + "4");
            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText((display.getText().toString()) + "5");
            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText((display.getText().toString()) + "6");
            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText((display.getText().toString()) + "7");
            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText((display.getText().toString()) + "8");
            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText((display.getText().toString()) + "9");
            }
        });
        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText((display.getText().toString()) + "0");
                Log.i("1",display.getText().toString());
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x == 1) {
                    display.setText((display.getText().toString()) + ".");
                    x = x - 1;
                }
            }
        });
        //buttttttttttttttttttttttttttttona
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("0");
                x = 1;
                val1=Double.NaN;
                val2=Double.NaN;
            }
        });
        plusminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = 1;
                Double value;
                value = Double.parseDouble(display.getText().toString());
                value = value * -1;
                display.setText(Double.toString(value));
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=1;
                action=1;
                compute();
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = 1;
                action=2 ;
                compute();
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = 1;
                action =3;
                compute();
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = 1;
                action=4;
                compute();
            }
        });
        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action  = 6;
                x = 1;
                Log.i("1",display.getText().toString());
                compute();

            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                x=1;
                compute();
                Log.i("1",display.getText().toString());
               display.setText(Double.toString(val1));
                Log.i("1",display.getText().toString());


            }
        });

    }

    private void compute() {
        if (!Double.isNaN(val1)) {
            val2 = Double.parseDouble(display.getText().toString());
            Log.i("1",Double.toString(val2));
            //display.setText("");
            switch (action) {
                case 1:
                    val1 = val1 + val2;
                    break;
                case 2:
                    val1 = val1 - val2;
                    break;
                case 3:
                    val1 = val1 * val2;
                    break;
                case 4:
                    val1 = val1 / val2;
                    break;
                case 6:
                    val1=val1 * 0.01 * val2;
                    Log.i("value1","value 1");
                    Log.i("value1",Double.toString(val1));
                    Log.i("value2","value 2");
                    Log.i("value2",Double.toString(val2));

                    break;
                case 9:
                    Log.i("cased","default case is called");
                    break;
            }
            val2=Double.NaN;
            display.setText("");

        } else {
            val1 = Double.parseDouble(display.getText().toString());
            Log.i("1",Double.toString(val1));
            display.setText("");

        }
    }
}



