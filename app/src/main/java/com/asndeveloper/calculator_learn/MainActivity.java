package com.asndeveloper.calculator_learn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
TextView inputtxt,outputtxt;
ImageButton delete,divides;

Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn00,btndot,btnc ,
        btnpercentage,btnmultiply,btnminus,btnadd,btnequalto;

// create a string name  data to store all data
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //id find
        inputtxt = findViewById(R.id.inputnshow);
        outputtxt = findViewById(R.id.txtAnswer);

        delete = findViewById(R.id.backspaces);
        divides = findViewById(R.id.divide);

        btnc = findViewById(R.id.cutn);
        btnpercentage = findViewById(R.id.percentage);
        btnmultiply = findViewById(R.id.multiply);
        btnminus = findViewById(R.id.subtract);
        btnadd = findViewById(R.id.add);
        btnequalto = findViewById(R.id.equalto);
        btndot = findViewById(R.id.dot);

        btn1 = findViewById(R.id.one);
        btn2 = findViewById(R.id.two);
        btn3 = findViewById(R.id.three);
        btn4 = findViewById(R.id.four);
        btn5 = findViewById(R.id.five);
        btn6 = findViewById(R.id.six);
        btn7 = findViewById(R.id.seven);
        btn8 = findViewById(R.id.eight);
        btn9 = findViewById(R.id.nine);
        btn0 = findViewById(R.id.zero);
        btn00 = findViewById(R.id.doublezero);
        // id find ended

        // button pe click listener
        // 0 button
         btn0.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 data=inputtxt.getText().toString();
                 inputtxt.setText(data+"0");
             }
         });
        // 00 button
        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"00");
            }
        });

        // 01button
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"1");
            }
        });
        // 2 button
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"2");
            }
        });

        // 3 button
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"3");
            }
        });
        // 4 button
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"4");
            }
        });
        // 5 button
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"5");
            }
        });
        // 0 button
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"6");
            }
        });
        // 7 button
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"7");
            }
        });
        // 8 button
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"8");
            }
        });

        // 9 button
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"9");
            }
        });
        // . dot button
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+".");
            }
        });
        //bacspace
        // delete dot button
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputtxt.getText().toString();
            String datas=outputtxt.getText().toString();
             if (data.length()>1&&datas.length()>1){
              data=data.substring(0,data.length()-1);
              inputtxt.setText(data);
             outputtxt.setText(datas);
             } else if (data.length()<=1&&datas.length()<=1) {
                 inputtxt.setText("");
                 outputtxt.setText("");
             } else{
                 inputtxt.setText("");
                 outputtxt.setText("");
                 Toast.makeText(MainActivity.this, "Nothing to Clear", Toast.LENGTH_SHORT).show();

            }}
        });

        // c cut button
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                inputtxt.setText("");
                outputtxt.setText("");
            }
        });
//        percentage button
        btnpercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         data=inputtxt.getText().toString();
                inputtxt.setText(data+"%");
            }
        });
        //       divide button
        divides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"÷");
            }
        });
        //       multiply button
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"x");
            }
        });

//        minus button
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"-");
            }
        });

        //     plus button
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"+");

            }
        });

        //equal to button
        btnequalto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result();
            }
        });
    }
    private void result() {
        data=inputtxt.getText().toString();
        data=data.replaceAll("%","/100");
        data=data.replaceAll("÷","/");
        data=data.replaceAll("x","*");
        //create its lib context
        Context rhino=Context.enter();
        rhino.setOptimizationLevel(-1);

        // final result
        String finalresult="";

        // scripable come from rhino libr
        Scriptable scriptable=rhino.initStandardObjects();
        finalresult=rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();
        outputtxt.setText(finalresult);
        if (finalresult.endsWith(".0")){
            finalresult=finalresult.replace(".0","");
            outputtxt.setText(finalresult);
        }
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}