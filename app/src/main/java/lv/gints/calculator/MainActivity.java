package lv.gints.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static lv.gints.calculator.R.id.textCalc;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnMultiplay,btnDivide,btnPluss,btnMinus,btnMS,btnMC,btnMR,btnEqual;
    TextView textCalc;
    Boolean firstNumberEntered = false, clearTextView = false, Equal = false;
    Integer firstNumberValue = -1;
    Integer secondNumberValue = -1;
    String operation = "", savedValue = "";
    Double result = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnMultiplay = (Button)findViewById(R.id.btnMultiplay);
        btnDivide = (Button)findViewById(R.id.btnDivide);
        btnPluss = (Button)findViewById(R.id.btnPluss);
        btnMinus = (Button)findViewById(R.id.btnMinus);
        btnMS = (Button)findViewById(R.id.btnMS);
        btnMC = (Button)findViewById(R.id.btnMC);
        btnMR = (Button)findViewById(R.id.btnMR);
        btnEqual = (Button)findViewById(R.id.btnEqual);
        textCalc = findViewById(R.id.textCalc);

        btn0.setOnClickListener((View.OnClickListener) this);
        btn1.setOnClickListener((View.OnClickListener) this);
        btn2.setOnClickListener((View.OnClickListener) this);
        btn3.setOnClickListener((View.OnClickListener) this);
        btn4.setOnClickListener((View.OnClickListener) this);
        btn5.setOnClickListener((View.OnClickListener) this);
        btn6.setOnClickListener((View.OnClickListener) this);
        btn7.setOnClickListener((View.OnClickListener) this);
        btn8.setOnClickListener((View.OnClickListener) this);
        btn9.setOnClickListener((View.OnClickListener) this);
        btnMultiplay.setOnClickListener((View.OnClickListener) this);
        btnDivide.setOnClickListener((View.OnClickListener) this);
        btnPluss.setOnClickListener((View.OnClickListener) this);
        btnMinus.setOnClickListener((View.OnClickListener) this);
        btnEqual.setOnClickListener((View.OnClickListener) this);
        btnMS.setOnClickListener((View.OnClickListener) this);
        btnMC.setOnClickListener((View.OnClickListener) this);
        btnMR.setOnClickListener((View.OnClickListener) this);
    }
    @SuppressLint("NonConstantResourceId")
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnMS:
                textCalc.setText("");
                firstNumberEntered = false;
                if ((operation.equals("")) && (firstNumberValue != -1)) savedValue = firstNumberValue.toString();
                if (!operation.equals("")) savedValue = secondNumberValue.toString();
                firstNumberValue = -1;
                secondNumberValue = -1;
                break;
            case R.id.btnMR:
                if (!savedValue.equals("")) {
                    textCalc.append(savedValue);
                    convertFirst();
                    convertSecond(savedValue);
                }
                break;
            case R.id.btn0:
                Equal = false;
                textCalc.append("0");
                convertFirst();
                convertSecond("0");
                break;
            case R.id.btn1:
                if (clearTextView) {
                    textCalc.setText("");
                    clearTextView = false;
                }
                textCalc.append("1");
                convertFirst();
                convertSecond("1");
                break;
            case R.id.btn2:
                if (clearTextView) {
                    textCalc.setText("");
                    clearTextView = false;
                }
                textCalc.append("2");
                convertFirst();
                convertSecond("2");
                break;
            case R.id.btn3:
                if (clearTextView) {
                    textCalc.setText("");
                    clearTextView = false;
                }
                textCalc.append("3");
                convertFirst();
                convertSecond("3");
                break;
            case R.id.btn4:
                if (clearTextView) {
                    textCalc.setText("");
                    clearTextView = false;
                }
                textCalc.append("4");
                convertFirst();
                convertSecond("4");
                break;
            case R.id.btn5:
                if (clearTextView) {
                    textCalc.setText("");
                    clearTextView = false;
                }
                textCalc.append("5");
                convertFirst();
                convertSecond("5");
                break;
            case R.id.btn6:
                if (clearTextView) {
                    textCalc.setText("");
                    clearTextView = false;
                }
                textCalc.append("6");
                convertFirst();
                convertSecond("6");
                break;
            case R.id.btn7:
                if (clearTextView) {
                    textCalc.setText("");
                    clearTextView = false;
                }
                textCalc.append("7");
                convertFirst();
                convertSecond("7");
                break;
            case R.id.btn8:
                if (clearTextView) {
                    textCalc.setText("");
                    clearTextView = false;
                }
                textCalc.append("8");
                convertFirst();
                convertSecond("8");
                break;
            case R.id.btn9:
                if (clearTextView) {
                    textCalc.setText("");
                    clearTextView = false;
                }
                textCalc.append("9");
                convertFirst();
                convertSecond("9");
                break;
            case R.id.btnPluss:
                operation = "+";
                if (firstNumberValue != -1) {
                    textCalc.append("+");
                    firstNumberEntered = true;
                }
                break;
            case R.id.btnMinus:
                operation = "-";
                if (firstNumberValue != -1) {
                    textCalc.append("-");
                    firstNumberEntered = true;
                }
                break;
            case R.id.btnDivide:
                operation = "/";
                if (firstNumberValue != -1) {
                    textCalc.append("/");
                    firstNumberEntered = true;
                }
                break;
            case R.id.btnMultiplay:
                operation = "*";
                if (firstNumberValue != -1) {
                    textCalc.append("*");
                    firstNumberEntered = true;
                }
                break;
            case R.id.btnMC:
                textCalc.setText("");
                firstNumberEntered = false;
                firstNumberValue = -1;
                secondNumberValue = -1;
                break;
            case R.id.btnEqual:
                textCalc.append("=");
                result = calculate();
                textCalc.append(result.toString());
                firstNumberEntered = false;
                firstNumberValue = result.intValue();
                secondNumberValue = -1;
                operation = "";
                savedValue = "";
                clearTextView = true;
                Equal = true;
                break;
        }
    }

    private void convertFirst() {
        if (!firstNumberEntered) {
            firstNumberValue = Integer.parseInt(textCalc.getText().toString());
            secondNumberValue = 0;
        }
    }

    private void convertSecond(String value) {
        if (firstNumberEntered) {
            String s_representation = secondNumberValue.toString();
            s_representation += value;
            secondNumberValue = Integer.parseInt(s_representation);
        }
    }

    private double calculate() {
        double result = 0.0;
        switch (operation) {
            case "+":
                result = firstNumberValue + secondNumberValue;
                break;
            case "-":
                result = firstNumberValue - secondNumberValue;
                break;
            case "*":
                result = firstNumberValue * secondNumberValue;
                break;
            case "/":
                result = (double) firstNumberValue / secondNumberValue;
                break;
        }
        return result;
    }
}