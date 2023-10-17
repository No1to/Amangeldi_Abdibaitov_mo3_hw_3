package com.example.amangeldi_abdibaitov_mo3_hw_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    private TextView tvName;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tv_name);
    }

    public void onBind(String contactName){
        tvName.setText(contactName);
    }
}
