package com.example.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<RecyclerViewItem> items;
    private LayoutInflater layoutInflater;
    private OnClickListener onClickListener;

    MyAdapter(Context context, List<RecyclerViewItem> items, OnClickListener onClickListener) {
        this.layoutInflater = LayoutInflater.from(context);
        this.items = items;
        this.onClickListener = onClickListener;
    }

    @Override
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(layoutInflater.inflate(R.layout.item_mountain, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.title.setText(items.get(position).getTitle() +"\n"+items.get(position).getLocation()+"\n"+items.get(position).getcost()+"\n"+items.get(position).getsize()+"\n"+items.get(position).getcategory());


    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title;




        ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            title = itemView.findViewById(R.id.title);
            title = itemView.findViewById(R.id.name);
            title = itemView.findViewById(R.id.location);
            title = itemView.findViewById(R.id.cost);
            title = itemView.findViewById(R.id.size);
            title = itemView.findViewById(R.id.category);






        }

        @Override
        public void onClick(View view) {
            onClickListener.onClick(items.get(getAdapterPosition()));
        }
    }

    public interface OnClickListener {
        void onClick(RecyclerViewItem item);
    }
}