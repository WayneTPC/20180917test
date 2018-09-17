package tw.edu.tut.mis.a20180917;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(TAG,"fsajffpklwaj");
        Log.i(TAG,"information");
        super.onCreate(savedInstanceState);
        Log.d(TAG,"debug");
        Log.e(TAG,"error test");
        setContentView(R.layout.activity_main);
    }
}
