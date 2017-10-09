package com.moneyedittextdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mEditText1,mEditText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);

        //TextWatcher方式
        mEditText1.addTextChangedListener(new MoneyTextWatcher(mEditText1).setDigits(3));
        //setFilters方式
        mEditText2.setFilters(new InputFilter[]{new MoneyValueFilter().setDigits(3)});



    }
}
