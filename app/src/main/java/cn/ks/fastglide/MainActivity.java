package cn.ks.fastglide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import cn.ks.mylibrary.TestUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Log.d("MainActivity: ", "Android Studio上传代码到GitHub");
        TestUtils.toast(this, "Android Studio制作自己的依赖库");
    }
}
