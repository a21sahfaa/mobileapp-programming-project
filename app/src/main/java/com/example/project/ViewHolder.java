package com.example.project;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView id;
    private TextView name;
    private TextView type;

    public ViewHolder (@NonNull View itemView){
        super (itemView);
        id = itemView.findViewById(R.id.title);
        name = itemView.findViewById(R.id.name);
        type = itemView.findViewById(R.id.size);
        type = itemView.findViewById(R.id.category);
        type = itemView.findViewById(R.id.location);



    }
}
