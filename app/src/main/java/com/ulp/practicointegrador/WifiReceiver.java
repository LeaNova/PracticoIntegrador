package com.ulp.practicointegrador;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

public class WifiReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        boolean isConectado = intent.getBooleanExtra("connected", false);

        if(isConectado) {
            Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2664553747"));
            context.startActivity(i);
        }
    }
}