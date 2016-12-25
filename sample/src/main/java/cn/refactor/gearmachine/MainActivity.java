package cn.refactor.gearmachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.refactor.gear.GearMachineView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GearMachineView gear = (GearMachineView) findViewById(R.id.gear);
        gear.start();
    }
}
