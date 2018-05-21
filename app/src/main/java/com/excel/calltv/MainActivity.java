package com.excel.calltv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    final static String TAG = "CallTV";
    final static String IS_FIRST_TIME = "dvb_is_first_time";

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        //setContentView( R.layout.activity_main );

        Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage( "com.amlogic.DTVPlayer" );
        startActivity(LaunchIntent);
        finish();
    }
}
