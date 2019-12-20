package ru.mirea.pustynnikov.mireaproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;



public class CalculatorFragment extends Fragment implements View.OnClickListener{

    private TextView tv;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button plus;
    private Button minus;
    private Button multi;
    private Button split;
    private Button equals;
    private Button clear;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculator, container, false);
        tv = view.findViewById(R.id.infoTextView);
        one = view.findViewById(R.id.one);
        one.setOnClickListener(this);
        two = view.findViewById(R.id.two);
        two.setOnClickListener(this);
        three = view.findViewById(R.id.three);
        three.setOnClickListener(this);
        four = view.findViewById(R.id.four);
        four.setOnClickListener(this);
        five = view.findViewById(R.id.five);
        five.setOnClickListener(this);
        six = view.findViewById(R.id.six);
        six.setOnClickListener(this);
        seven = view.findViewById(R.id.seven);
        seven.setOnClickListener(this);
        eight = view.findViewById(R.id.eight);
        eight.setOnClickListener(this);
        nine = view.findViewById(R.id.nine);
        nine.setOnClickListener(this);
        zero = view.findViewById(R.id.zero);
        zero.setOnClickListener(this);
        plus = view.findViewById(R.id.plus);
        plus.setOnClickListener(this);
        minus = view.findViewById(R.id.minus);
        minus.setOnClickListener(this);
        multi = view.findViewById(R.id.multi);
        multi.setOnClickListener(this);
        split = view.findViewById(R.id.split);
        split.setOnClickListener(this);
        equals = view.findViewById(R.id.equals);
        equals.setOnClickListener(this);
        clear = view.findViewById(R.id.clear);
        clear.setOnClickListener(this);
        return view;
    }


    public void onClick(View view) {
        switch (view.getId()){
            case R.id.one:
                onClickOne(one);
                break;
            case R.id.two:
                onClickTwo(two);
                break;
            case R.id.three:
                onClickThree(three);
                break;
            case R.id.four:
                onClickFour(four);
                break;
            case R.id.five:
                onClickFive(five);
                break;
            case R.id.six:
                onClickSix(six);
                break;
            case R.id.seven:
                onClickSeven(seven);
                break;
            case R.id.eight:
                onClickEight(eight);
                break;
            case R.id.nine:
                onClickNine(nine);
                break;
            case R.id.zero:
                onClickZero(zero);
                break;
            case R.id.plus:
                onClickPlus(plus);
                break;
            case R.id.minus:
                onClickMinus(minus);
                break;
            case R.id.multi:
                onClickMulti(multi);
                break;
            case R.id.split:
                onClickSplit(split);
                break;
            case R.id.equals:
                onClickEquals(equals);
                break;
            case R.id.clear:
                onClickClear(clear);
                break;
            default:
                break;
        }
    }

    private void onClickOne(View view) {
        tv.setText(tv.getText() + "1");
    }

    private void onClickTwo(View view) {
        tv.setText(tv.getText() + "2");
    }

    private void onClickThree(View view) {
        tv.setText(tv.getText() + "3");
    }

    private void onClickFour(View view) {
        tv.setText(tv.getText() + "4");
    }

    private void onClickFive(View view) {
        tv.setText(tv.getText() + "5");
    }

    private void onClickSix(View view) {
        tv.setText(tv.getText() + "6");
    }

    private void onClickSeven(View view) {
        tv.setText(tv.getText() + "7");
    }

    private void onClickEight(View view) {
        tv.setText(tv.getText() + "8");
    }

    private void onClickNine(View view) {
        tv.setText(tv.getText() + "9");
    }

    private void onClickZero(View view) {
        tv.setText(tv.getText() + "0");
    }

    private void onClickPlus(View view) {
        tv.setText(tv.getText() + "+");
    }

    private void onClickMinus(View view) {
        tv.setText(tv.getText() + "-");
    }

    private void onClickMulti(View view) {
        tv.setText(tv.getText() + "*");
    }

    private void onClickSplit(View view) {
        tv.setText(tv.getText() + "/");
    }

    private void onClickEquals(View view) {
        int result = 0;
        int index = 0;
        String text = tv.getText().toString();
        String text1 = "";
        String text2 = "";
        String op = "";

        here:
        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            switch (c){
                case '+':
                    index = i;
                    op = "+";
                    break here;
                case '-':
                    index = i;
                    op = "-";
                    break here;
                case '*':
                    index = i;
                    op = "*";
                    break here;
                case '/':
                    index = i;
                    op = "/";
                    break here;
                default:
                    text1 += c;
                    break;
            }

        }

        there:
        for (int i = index + 1; i < text.length(); i++){
            char c = text.charAt(i);
            switch (c){
                case '=':
                    break there;
                default:
                    text2 += c;
            }
        }

        switch (op){
            case "+":
                result = Integer.parseInt(text1) + Integer.parseInt(text2);
                break;
            case "-":
                result = Integer.parseInt(text1) - Integer.parseInt(text2);
                break;
            case "*":
                result = Integer.parseInt(text1) * Integer.parseInt(text2);
                break;
            case "/":
                result = Integer.parseInt(text1) / Integer.parseInt(text2);
                break;
        }

        tv.setText(String.valueOf(result));
    }

    private void onClickClear(View view) {
        tv.setText("");
    }
}
