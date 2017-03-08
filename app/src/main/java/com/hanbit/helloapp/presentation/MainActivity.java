package com.hanbit.helloapp.presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hanbit.helloapp.R;
import com.hanbit.helloapp.domain.CalcBean;
import com.hanbit.helloapp.service.CalcService;
import com.hanbit.helloapp.serviceImpl.CalcServiceImpl;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etFirstNum,etSecondNum;
    Button btPlus,btMinus,btMulti,btDivide,btMod,btEqual;
    TextView tvResult;
    CalcService service ;
    CalcBean bean ;
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        service=new CalcServiceImpl();
        bean=new CalcBean();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirstNum= (EditText) findViewById(R.id.etFirstNum);
        etSecondNum= (EditText) findViewById(R.id.etSecondNum);
        btPlus= (Button) findViewById(R.id.btPlus);
        btMinus= (Button) findViewById(R.id.btMinus);
        btMulti= (Button) findViewById(R.id.btMulti);
        btDivide= (Button) findViewById(R.id.btDivide);
        btMod= (Button) findViewById(R.id.btMod);
        btEqual= (Button) findViewById(R.id.btEqual);
        tvResult= (TextView) findViewById(R.id.tvResult);
        btPlus.setOnClickListener(this);
        btMinus.setOnClickListener(this);
        btMulti.setOnClickListener(this);
        btDivide.setOnClickListener(this);
        btMod.setOnClickListener(this);
        btEqual.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        bean.setFirstNum(Integer.parseInt(etFirstNum.getText().toString()));
        bean.setSecondNum(Integer.parseInt(etFirstNum.getText().toString()));

    switch (v.getId()){
        case R.id.btPlus:
            result=service.plus(bean);
            break;
        case R.id.btMinus:
            result=service.minus(bean);
            break;
        case R.id.btMulti :
            result=service.multi(bean);
            break;
        case R.id.btDivide:
            result=service.divide(bean);
            break;
        case R.id.btMod:
            result=service.mod(bean);
            break;
        case R.id.btEqual:
            tvResult.setText("RESULT:"+result);
            break;
    }
    }
}
