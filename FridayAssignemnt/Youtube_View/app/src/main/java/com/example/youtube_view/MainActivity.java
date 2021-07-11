package com.example.youtube_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemOnClick {

    private RecyclerView recyclerView;
    private ArrayList<YouTube> youTubeArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intidviews();
        buildrecycleview();
        setrecycleview();
    }

    private void setrecycleview() {
        YouTubeAdaptor youTubeAdaptor = new YouTubeAdaptor(youTubeArrayList, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(youTubeAdaptor);
    }

    private void buildrecycleview() {
        youTubeArrayList = new ArrayList<>();
        YouTube youTube1 = new YouTube("Masai", "https://www.youtube.com/channel/UCENOACKQiqejXP-bb9sCnMg0", R.drawable.masailogo, R.drawable.masailogo);
        youTubeArrayList.add(youTube1);
        youTubeArrayList.add(new YouTube("Music Lab", "https://www.youtube.com/watch?v=M5QY2_8704o&ab_channel=MusicLab", R.drawable.covermusic, R.drawable.musiclab));
        youTubeArrayList.add(new YouTube("Music Lab", "https://www.youtube.com/watch?v=M5QY2_8704o&ab_channel=MusicLab", R.drawable.covermusic, R.drawable.musiclab));
        youTubeArrayList.add(new YouTube("Music Lab", "https://www.youtube.com/watch?v=M5QY2_8704o&ab_channel=MusicLab", R.drawable.covermusic, R.drawable.musiclab));

        //        youTubeArrayList.add(new YouTube("Relaxing Music", "https://www.youtube.com/watch?v=77ZozI0rw7w&ab_channel=SoothingRelaxation", R.drawable.yogaframe, R.drawable.yogaimage));

    }


    private void intidviews() {
        recyclerView = findViewById(R.id.recycleView);
    }

    @Override
    public void onClick(YouTube youTube) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(youTube.getLink()));
        startActivity(intent);
    }
}