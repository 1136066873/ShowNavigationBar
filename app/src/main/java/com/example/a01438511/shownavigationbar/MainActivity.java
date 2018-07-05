package com.example.a01438511.shownavigationbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private View Click_me_to_show_or_hide;

    private static final String TAG = "heguodong";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*下面两行代码和功能清单列表中的 AppTheme (Theme.AppCompat.Light.NoActionBar)  一起使用才会动态隐藏显示Title 和 NavigationBar ... */
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        Click_me_to_show_or_hide = findViewById(R.id.Click_me_to_show_or_hide);
        Click_me_to_show_or_hide.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Click_me_to_show_or_hide:
                hideStatusBarAndNavigationBar();
                break;

            default:

                break;
        }
    }

    /**
     * Show StatusBar And NavigationBar
     */
    public void showStatusBarAndNavigationBar() {
        Log.e(TAG,"开始显示 systemBar");
        SystemBarHelper.showSystemBars(getWindow(),getBaseContext());
        Log.e(TAG,"显示 systemBar 结束");
    }

    /**
     * hide StatusBar And NavigationBar
     */
    public void hideStatusBarAndNavigationBar() {
        Log.e(TAG,"开始隐藏 systemBar");
        SystemBarHelper.hideSystemBars(getWindow());
        Log.e(TAG,"隐藏 systemBar 结束");
    }
}
