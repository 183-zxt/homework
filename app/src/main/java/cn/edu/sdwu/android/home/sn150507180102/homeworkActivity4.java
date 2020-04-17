package cn.edu.sdwu.android.home.sn150507180102;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class homeworkActivity4 extends AppCompatActivity {
    private ArrayList list;
    private SimpleAdapter simpleAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework4_1);
        TextView textView1 = (TextView) findViewById(R.id.goods_name);
        TextView textView2 = (TextView) findViewById(R.id.goods_type);
        Spinner spinner = (Spinner) findViewById(R.id.homewoek4_spinner);
        Resources resources = getResources();
        // Spinner spinner = (Spinner) findViewById(R.id.homewoek4_spinner);
        //初始化数组
        list = new ArrayList();
        String[] strArr2 = getResources().getStringArray(R.array.catArr);
        final String[] strArr1 = getResources().getStringArray(R.array.prodArr);
        TypedArray typedArray = resources.obtainTypedArray(R.array.prodImg);
        ImageView imageView = (ImageView) findViewById(R.id.goods_img);
        for (int i = 0; i < strArr1.length; i++) {
            HashMap hashMap = new HashMap();
            hashMap.put("goods_name", strArr1[i]);
            hashMap.put("goods_type", strArr2[i]);
            hashMap.put("goods_img", R.drawable.sample_thumb_2);
            list.add(hashMap);
        }
        //实例化适配器
        simpleAdapter=new SimpleAdapter(this,list,R.layout.layout_homework4,new String[]{"goods_name","goods_type","goods_img"},new int[]{R.id.goods_name,R.id.goods_type,R.id.goods_img});
        //设置到listView
        final ListView listView=(ListView)findViewById(R.id.homework4_lv);
        listView.setAdapter(simpleAdapter);
    }
}
