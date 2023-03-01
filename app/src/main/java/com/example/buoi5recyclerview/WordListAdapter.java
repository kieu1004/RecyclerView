package com.example.buoi5recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordViewHolder> {
    private Context context;
    private LinkedList<Blog> blogList = new LinkedList<Blog>();


    public WordListAdapter(Context context, LinkedList<Blog> blogList) {
        this.blogList = blogList;
        this.context = context;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new WordViewHolder(context, mItemView, this);
    }


    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        int resource = blogList.get(position).getImageViewSrc();
        String title = blogList.get(position).getTitle();
        String description = blogList.get(position).getDescription();
        String descriptionFull = blogList.get(position).getDescriptionFull();
        holder.setData(resource, title, description, descriptionFull);
    }


    @Override
    public int getItemCount() {
        return blogList.size();
    }
}
