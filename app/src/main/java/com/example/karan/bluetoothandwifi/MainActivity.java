package com.example.karan.bluetoothandwifi;

import android.bluetooth.BluetoothAdapter;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
ToggleButton tb;
Switch aSwitch;

BluetoothAdapter ba;
WifiManager wm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb=findViewById(R.id.toggleButton);
        aSwitch = findViewById(R.id.switch1);
        ba=BluetoothAdapter.getDefaultAdapter();
        wm= (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b==true)
                {
                    wm.setWifiEnabled(true);
                }
                else
                {
                    wm.setWifiEnabled(false);
                }
            }
        });

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b==true)
                {
                    ba.enable();
                }
                else
                {
                    ba.disable();
                }
            }
        });

    }
}
