package com.besheer.mahmoud.dialogfragement;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class customdialog extends DialogFragment{
    private static final String TAG = "customdialog";
    private EditText input;
    private TextView msg;
    private Button btnok,btncancel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.dialog_frag,container,false);
        btncancel=view.findViewById(R.id.btn1);
        btnok=view.findViewById(R.id.btn2);
        input=view.findViewById(R.id.input);
        
        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Closing Dialog!");
                getDialog().dismiss();
            }
        });
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: capturing input ");
                String inp=input.getText().toString();


                if(!inp.equals("")) {
                    ((MainActivity) getActivity()).textdata.setText(inp);

                }  getDialog().dismiss();
            }
        });

        return view;
    }
}

