package com.codingblocks.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textview);
        b1=(Button)findViewById(R.id.clear);
        b2=(Button)findViewById(R.id.back);
        b3=(Button)findViewById(R.id.divide);
        b4=(Button)findViewById(R.id.multiply);
        b5=(Button)findViewById(R.id.seven);
        b6=(Button)findViewById(R.id.eight);
        b7=(Button)findViewById(R.id.nine);
        b8=(Button)findViewById(R.id.minus);
        b9=(Button)findViewById(R.id.four);
        b10=(Button)findViewById(R.id.five);
        b11=(Button)findViewById(R.id.six);
        b12=(Button)findViewById(R.id.plus);
        b13=(Button)findViewById(R.id.one);
        b14=(Button)findViewById(R.id.two);
        b15=(Button)findViewById(R.id.three);
        b16=(Button)findViewById(R.id.equal);
        b17=(Button)findViewById(R.id.zero);
        b18=(Button)findViewById(R.id.dot);
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();
        char ch = tv.getText().toString().charAt(tv.getText().length() - 1);
        char firstchar = tv.getText().toString().charAt(0);
        if (R.id.clear == id) {
            tv.setText("0");
        } else if (R.id.back == id) {
            if (tv.getText().length() == 1) {
                tv.setText("0");
                return;
            } else {
                String S = tv.getText().toString();
                tv.setText(S.substring(0, S.length() - 1));
            }
        } else if (R.id.plus == id) {
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                return;
            } else {
                tv.append("+");
            }
            b18.setEnabled(true);
        } else if (R.id.minus == id) {
            if (ch == '-' || ch == '+' || ch == '*' || ch == '/') {
                return;
            } else {
                tv.append("-");
            }
            b18.setEnabled(true);
        } else if (R.id.divide == id) {
            if (ch == '/' || ch == '-' || ch == '*' || ch == '+') {
                return;
            } else {
                tv.append("/");
            }
            b18.setEnabled(true);
        } else if (R.id.multiply == id) {
            if (ch == '*' || ch == '-' || ch == '+' || ch == '/') {
                return;
            } else {
                tv.append("*");
            }
            b18.setEnabled(true);
        } else if (R.id.seven == id) {
            if (firstchar == '0') {
                tv.setText("7");
            } else {
                tv.append("7");
            }
        } else if (R.id.eight == id) {
            if (firstchar == '0') {
                tv.setText("8");
            } else {
                tv.append("8");
            }
        } else if (R.id.nine == id) {
            if (firstchar == '0') {
                tv.setText("9");
            } else {
                tv.append("9");
            }
        } else if (R.id.four == id) {
            if (firstchar == '0') {
                tv.setText("4");
            } else {
                tv.append("4");
            }
        } else if (R.id.five == id) {
            if (firstchar == '0') {
                tv.setText("5");
            } else {
                tv.append("5");
            }
        } else if (R.id.six == id) {
            if (firstchar == '0') {
                tv.setText("6");
            } else {
                tv.append("6");
            }
        } else if (R.id.one == id) {
            if (firstchar == '0') {
                tv.setText("1");
            } else {
                tv.append("1");
            }
        } else if (R.id.two == id) {
            if (firstchar == '0') {
                tv.setText("2");
            } else {
                tv.append("2");
            }
        } else if (R.id.three == id) {
            if (firstchar == '0') {
                tv.setText("3");
            } else {
                tv.append("3");
            }
        } else if (R.id.zero == id) {
            if (firstchar == '0') {
                tv.setText("0");
            }
            else {
                tv.append("0");
            }
        } else if (R.id.equal == id) {
            float answer = result(tv.getText().toString());
            tv.setText(answer + "");
        }
        else if(R.id.dot == id) {
            tv.append(".");
            b18.setEnabled(false);
        }
    }


    private float result(String text) {
        return EvaluateString.evaluate(text);
    }
}
