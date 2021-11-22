package com.example.zametki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecycylerViewHolder> {
    List<TaskModel> list = new ArrayList<>();
    Context context;
 public RecyclerAdapter(Context context){
     this.context = context;

 }
    @Override
    public RecycylerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View view = LayoutInflater.from(context).inflate(R.layout.item_task,parent,false);
        return new RecycylerViewHolder(view);
    }
public void addTask(TaskModel taskModel){
        this.list.add(taskModel);
       notifyDataSetChanged();
}
    @Override
    public void onBindViewHolder(@NonNull RecycylerViewHolder holder, int position) {
holder.txtTitle.setText(list.get(position).getTitle());
        holder.txtDescription.setText(list.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecycylerViewHolder extends RecyclerView.ViewHolder{
        TextView txtTitle,txtDescription;
        public RecycylerViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.item_title_txt);
            txtDescription = itemView.findViewById(R.id.item_description_txt);
        }
    }
}
