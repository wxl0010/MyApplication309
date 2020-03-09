package cn.edu.sziit.chapter1_logcat;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        System.out.println("helloworld");
    }

    private void initData() {
        String TAG=getLocalClassName().toString();
        Log.d(TAG, "initData:调试信息 ");
        Log.v(TAG,"initData:冗余信息");
        Log.i(TAG, "initData: 普通信息");
        Log.w(TAG, "initData: 警告信息");
        Log.e(TAG, "initData: 错误信息");
    }
    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    protected void onPause() {
        super.onPause();
    }
    @Override
    protected void onStop() {
        super.onStop();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

}
