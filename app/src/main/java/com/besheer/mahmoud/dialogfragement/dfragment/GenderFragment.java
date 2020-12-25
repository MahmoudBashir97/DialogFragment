package com.besheer.mahmoud.dialogfragement.dfragment;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.besheer.mahmoud.dialogfragement.R;



public class GenderFragment extends DialogFragment implements genderChooseInterface {
    private static final String TAG = "GenderFragment";
    View v;
    gender_adapter adpt;
    RecyclerView rec;
    genderChooseInterface chooseInterface;
    private final String[] gender={
      "Male","Female"
    };
    String n;

    public GenderFragment(String n) {
        this.n=n;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        if (n.equals("mm")) {
             v = inflater.inflate(R.layout.fragment_gender_layout, container, false);
            rec = v.findViewById(R.id.rec_gender);
            rec.setHasFixedSize(true);
            rec.setLayoutManager(new LinearLayoutManager(getActivity()));
            adpt= new gender_adapter(gender,getActivity(),GenderFragment.this);
            rec.setAdapter(adpt);

        }else{
            getDialog().cancel();
        }


        return v;
    }

    @Override
    public void chooseGender(int position) {
        if (position != -1){
            Toast.makeText(getContext(), ""+gender[position], Toast.LENGTH_SHORT).show();
            getDialog().dismiss();
        }
    }
}