package com.websarva.wings.android.listviewsample2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ListViewオブジェクト取得
        ListView lvMenu = findViewById(R.id.lvMenu);
        List<String> menuList = new ArrayList<>();

        menuList.add("から揚げ定食");
        menuList.add("ハンバーグ定食");
        menuList.add("生姜焼き定食");
        menuList.add("ステーキ定食");
        menuList.add("野菜炒め定食");
        menuList.add("とんかつ定食");
        menuList.add("ミンチかつ定食");
        menuList.add("チキンカツ定食");
        menuList.add("コロッケ定食");
        menuList.add("回鍋肉定食");
        menuList.add("麻婆豆腐定食");
        menuList.add("青椒肉絲定食");//チンジャオロース
        menuList.add("八宝菜定食");
        menuList.add("酢豚定食");
        menuList.add("豚の角煮定食");
        menuList.add("焼き鳥定食");
        menuList.add("焼き魚定食");
        //アダプタオブジェクト生成
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_list_item_1,menuList);
        //リストビューにアダプタオブジェクト設定
        lvMenu.setAdapter(adapter);


        lvMenu.setOnItemClickListener(new ListItemClickListener());

    }

    private class ListItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            OrderConfirmDialogFragment dialogFragment = new OrderConfirmDialogFragment();

            dialogFragment.show(getSupportFragmentManager(), "OrderConfirmDialogFragment");
        }


    }
}