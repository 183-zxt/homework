package cn.edu.sdwu.android.home.sn150507180102;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class homeworkActivity5 extends AppCompatActivity implements View.OnClickListener {
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework5);
        //数字
        Button bt0 = (Button) findViewById(R.id.num0);
        Button bt1 = (Button) findViewById(R.id.num1);
        Button bt2 = (Button) findViewById(R.id.num2);
        Button bt3 = (Button) findViewById(R.id.num3);
        Button bt4 = (Button) findViewById(R.id.num4);
        Button bt5 = (Button) findViewById(R.id.num5);
        Button bt6 = (Button) findViewById(R.id.num6);
        Button bt7 = (Button) findViewById(R.id.num7);
        Button bt8 = (Button) findViewById(R.id.num8);
        Button bt9 = (Button) findViewById(R.id.num9);
        //运算符
        Button bt_jia = (Button) findViewById(R.id.jia);
        Button bt_jian = (Button) findViewById(R.id.jian);
        Button bt_cheng = (Button) findViewById(R.id.cheng);
        Button bt_chu = (Button) findViewById(R.id.chu);
        Button bt_dengyu = (Button) findViewById(R.id.dengyu);
        Button bt_dian = (Button) findViewById(R.id.dian);
        editText=(EditText) findViewById(R.id.homewoek5_et);
        bt0.setOnClickListener(this);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt_jia.setOnClickListener(this);
        bt_jian.setOnClickListener(this);
        bt_cheng.setOnClickListener(this);
        bt_chu.setOnClickListener(this);
        bt_dengyu.setOnClickListener(this);
        bt_dian.setOnClickListener(this);

    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.num0:
                editText.append("0");
                break;
            case R.id.num1:
                editText.append("1");
                break;
            case R.id.num2:
                editText.append("2");
                break;
            case R.id.num3:
                editText.append("3");
                break;
            case R.id.num4:
                editText.append("4");
                break;
            case R.id.num5:
                editText.append("5");
                break;
            case R.id.num6:
                editText.append("6");
                break;
            case R.id.num7:
                editText.append("7");
                break;
            case R.id.num8:
                editText.append("8");
                break;
            case R.id.num9:
                editText.append("9");
                break;
            case R.id.jia:
                editText.append("+");
                break;
            case R.id.jian:
                editText.append("-");
                break;
            case R.id.cheng:
                editText.append("*");
                break;
            case R.id.chu:
                editText.append("/");
                break;
            case R.id.dian:
                editText.append(".");
                break;
            case R.id.dengyu:
                editText.append("=");
                break;
        }
    }
}
