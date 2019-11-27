package com.example.newsapp.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsapp.Models.Article;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter {
private List<Article> articles;
Context context;
private OnItemClickListener itemClickListener;

public interface OnItemClickListener{
    void onItemClick(View view,int position);
}

public void setOnItemClickListener(OnItemClickListener onItemClickListener){
    this.itemClickListener = onItemClickListener;
}

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
