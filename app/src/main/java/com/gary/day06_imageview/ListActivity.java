package com.gary.day06_imageview;

import android.app.Dialog;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DialogTitle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {

    private Button bt_up;
    private Button bt_down;
    private TextView tx;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);

        Log.w(TAG, "onCreate: 输入法不正确");
        Log.d("ListActivity", "标题要长要醒目才能被看到标题要长要醒目才能被看到标题要长要醒目才能被看到标题要长要醒目才能被看到标题要长要醒目才能被看到");
    }



    private static final String TAG = "ListActivity";

  
}







