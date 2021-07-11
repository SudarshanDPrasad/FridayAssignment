package com.example.youtube_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class YouTubeAdaptor extends RecyclerView.Adapter<YouTubeHolder> {
    private ArrayList<YouTube> youTubeArrayList;
    private ItemOnClick itemOnClick;

    public YouTubeAdaptor(ArrayList<YouTube> youTubeArrayList,ItemOnClick itemOnClick) {
        this.youTubeArrayList = youTubeArrayList;
        this.itemOnClick = itemOnClick;
    }

    @NonNull
    @Override
    public YouTubeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.youtube_layout, parent, false);
        return new YouTubeHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull YouTubeHolder holder, int position) {
        YouTube youTube = youTubeArrayList.get(position);
        holder.setData(youTube,itemOnClick);
    }

    @Override
    public int getItemCount() {
        return youTubeArrayList.size();
    }
}
