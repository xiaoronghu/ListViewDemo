package com.sjfd.listviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private List<Fruit> fruitList=new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruit();
        FruitAdapter adapter=new FruitAdapter(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,fruitList);
        ListView listView=(ListView)findViewById(R.id.lsit_view);
        listView.setAdapter(adapter);
    }

    private void initFruit(){
        Fruit apple=new Fruit("Apple",R.drawable.apple_pic);
        fruitList.add(apple);
        Fruit pear=new Fruit("Pear",R.drawable.apple_pic);
        fruitList.add(pear);
        Fruit orange=new Fruit("Orange",R.drawable.apple_pic);
        fruitList.add(orange);
        Fruit banana=new Fruit("Banana",R.drawable.apple_pic);
        fruitList.add(banana);
        Fruit mango=new Fruit("Mango",R.drawable.apple_pic);
        fruitList.add(mango);
    }

}
