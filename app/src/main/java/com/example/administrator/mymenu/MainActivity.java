package com.example.administrator.mymenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private MyMenu mMyMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMyMenu = new MyMenu(this);
        setContentView(mMyMenu);
        LeftMenu leftMenu = new LeftMenu();
        getFragmentManager().beginTransaction().add(MyMenu.LEFT_ID,leftMenu).commit();

    }
}
