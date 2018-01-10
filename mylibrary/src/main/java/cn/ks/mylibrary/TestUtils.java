package cn.ks.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Steven.wang on 2018/1/10.
 * 774296858@qq.com
 */

public class TestUtils {
    public static void toast(Context ctx, String s) {
        Toast.makeText(ctx, s, Toast.LENGTH_LONG).show();
    }
}
