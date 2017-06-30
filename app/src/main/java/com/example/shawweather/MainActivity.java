package com.example.shawweather;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.shawweather.util.Utility;


public class MainActivity extends baseActivity {
    public static String old_id;
    public static int SINGLE=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if(prefs.getString("weather",null)!=null){
            if(SINGLE==1){
            Intent intent= new Intent(this,WeatherActivity.class);
            startActivity(intent);
            finish();}else if (SINGLE==0){
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("weather",null).apply();
                SINGLE=1;
            }
        }
    }

    public static void launch(Context context) {                            //启动的方法
        context.startActivity(new Intent(context, MainActivity.class));
    }

    @Override
    public void onBackPressed() {

        Intent intent = new Intent(MainActivity.this, WeatherActivity.class);
        intent.putExtra("weather_id",old_id);
        startActivity(intent);
        finish();
    }
}
