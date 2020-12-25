package com.besheer.mahmoud.dialogfragement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.besheer.mahmoud.dialogfragement.dfragment.GenderFragment;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    Button opendialog;
    TextView txtview ,textdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opendialog=findViewById(R.id.btn);
        txtview=findViewById(R.id.txtv);
        textdata=findViewById(R.id.txtdata);

        opendialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"On click : opening dialog");
                customdialog dialog=new customdialog();
                GenderFragment genderFragment = new GenderFragment("nh");
                //dialog.show(getFragmentManager(),"My customdialog");
                genderFragment.show(getFragmentManager(),"My GenderFragment");

            }
        });

    }
}
