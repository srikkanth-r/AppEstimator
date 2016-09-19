package com.srikkanth.appestimator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SelectTypeActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    CheckBox chkMobile, chk3D, chkSimulation, chkWBT;
    TextView txtPrice;
    boolean isOptionSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_type);

        txtPrice = (TextView) findViewById(R.id.txtPrice);
        txtPrice.setText("Price: $" + Global.getPrice());

        chkMobile = (CheckBox)findViewById(R.id.checkBoxMobileApp);
        chk3D = (CheckBox)findViewById(R.id.checkBox3DGame);
        chkSimulation = (CheckBox)findViewById(R.id.checkBoxSimulation);
        chkWBT = (CheckBox)findViewById(R.id.checkBoxWBT);

        //Add check listeners
        chkMobile.setOnCheckedChangeListener(this);
        chk3D.setOnCheckedChangeListener(this);
        chkSimulation.setOnCheckedChangeListener(this);
        chkWBT.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        isOptionSelected = isChecked;

        switch (buttonView.getId())
        {
            case R.id.checkBoxMobileApp:
                if(isChecked)
                    Global.setPrice(Global.getPrice() + 1000);
                else
                    Global.setPrice(Global.getPrice() - 1000);
                break;

            case R.id.checkBox3DGame:
                if(isChecked)
                Global.setPrice(Global.getPrice() + 1000);
                else
                    Global.setPrice(Global.getPrice() - 1000);
                break;

            case R.id.checkBoxSimulation:
                if(isChecked)
                Global.setPrice(Global.getPrice() + 800);
                else
                    Global.setPrice(Global.getPrice() - 800);
                break;

            case R.id.checkBoxWBT:
                if(isChecked)
                Global.setPrice(Global.getPrice() + 500);
                else
                    Global.setPrice(Global.getPrice() - 500);
                break;
        }
        txtPrice.setText("Price: $" + Global.getPrice());

    }

    public void gotoSelectPlatform(View view)
    {
        if(isOptionSelected)
        startActivity(new Intent(SelectTypeActivity.this, SelectPlatformActivity.class));
        else
            Toast.makeText(this, "You need to select an app type!", Toast.LENGTH_LONG).show();
    }
}
