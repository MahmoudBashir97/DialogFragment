package com.besheer.mahmoud.dialogfragement.dfragment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.besheer.mahmoud.dialogfragement.R;

public class gender_adapter extends RecyclerView.Adapter<gender_adapter.ViewHolder>{

    private final String[] gender;
    Context context;
    genderChooseInterface chooseInterface;

    public gender_adapter(String[] gender, Context context,genderChooseInterface chooseInterface) {
        this.gender = gender;
        this.context = context;
        this.chooseInterface=chooseInterface;
    }

    @NonNull
    @Override
    public gender_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.single_item_choose_gender,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull gender_adapter.ViewHolder holder,final int i) {
        holder.txt_gender.setText(gender[i]);
        holder.txt_gender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseInterface.chooseGender(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return gender.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txt_gender;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_gender = itemView.findViewById(R.id.txt_gender);
        }
    }
}
