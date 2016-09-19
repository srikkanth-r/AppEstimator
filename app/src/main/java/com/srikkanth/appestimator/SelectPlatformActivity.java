package com.srikkanth.appestimator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class SelectPlatformActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    CheckBox chkiOS, chkAndroid;
    TextView txtPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_platform);

        txtPrice = (TextView) findViewById(R.id.txtPrice);
        txtPrice.setText("Price: $" + Global.getPrice());

        chkiOS = (CheckBox)findViewById(R.id.checkBoxiOS);
        chkAndroid = (CheckBox)findViewById(R.id.checkBoxAndroid);

        chkiOS.setOnCheckedChangeListener(this);
        chkAndroid.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId())
        {
            case R.id.checkBoxiOS:
                if(isChecked)
                    Global.setPrice(Global.getPrice() + 600);
                else
                    Global.setPrice(Global.getPrice() - 600);
                break;

            case R.id.checkBoxAndroid:
                if(isChecked)
                    Global.setPrice(Global.getPrice() + 400);
                else
                    Global.setPrice(Global.getPrice() - 400);
                break;
        }
        txtPrice.setText("Price: $" + Global.getPrice());
    }

    public void gotoFeatureLogin(View view)
    {
        startActivity(new Intent(SelectPlatformActivity.this, FeatureLoginActivity.class));
    }
}
