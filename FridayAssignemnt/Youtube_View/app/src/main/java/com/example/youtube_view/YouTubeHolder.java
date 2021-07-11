package com.example.youtube_view;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class YouTubeHolder extends RecyclerView.ViewHolder {
    private ImageView ivimageTop;
    private ImageView ivimageleft;
    private Button btnlink;

    public YouTubeHolder(@NonNull View itemView) {
        super(itemView);
        intidviews(itemView);
    }

    private void intidviews(View itemView) {
        ivimageTop = itemView.findViewById(R.id.ivimageTop);
        ivimageleft = itemView.findViewById(R.id.ivimageleft);
        btnlink = itemView.findViewById(R.id.btnlink);

    }

    public void setData(YouTube youTube,ItemOnClick itemOnClick){
        ivimageleft.setBackgroundResource(youTube.getimage());
        ivimageTop.setBackgroundResource(youTube.getImage());
        btnlink.setText(youTube.getLink());
        btnlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemOnClick.onClick(youTube);
            }
        });
    }
}
