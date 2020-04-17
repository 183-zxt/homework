package cn.edu.sdwu.android.home.sn150507180102;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework);

        //获取按钮
        Button button=(Button) findViewById(R.id.homework_btn1);
        Button button2=(Button) findViewById(R.id.homework_btn2);
        Button button3=(Button) findViewById(R.id.homework_btn3);
        Button button4=(Button) findViewById(R.id.homework_btn4);
        Button button5=(Button) findViewById(R.id.homework_btn5);

    }
    //作业一跳转
    public void startmain(View view){
        //界面跳转
        Intent intent=new Intent(this,homeworkActivity1.class);
        startActivity(intent);
    }
    //作业二跳转
    public void startmain2(View view) {
        Intent intent = new Intent(this, homeworkActivity2.class);
        startActivity(intent);
    }

        //作业三跳转

    public void startmain3(View view){
        Intent intent=new Intent(this,homeworkActivity3.class);
        startActivity(intent);


    }

    //作业四跳转

    public void startmain4(View view){
        Intent intent=new Intent(this,homeworkActivity4.class);
        startActivity(intent);


    }

    public void startmain5(View view){
        Intent intent=new Intent(this,homeworkActivity5.class);
        startActivity(intent);


    }
}
