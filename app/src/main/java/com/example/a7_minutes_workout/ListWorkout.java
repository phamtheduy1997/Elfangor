package com.example.a7_minutes_workout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.a7_minutes_workout.adapter.WorkoutAdapter;
import com.example.a7_minutes_workout.model.Workout;

import java.util.ArrayList;
import java.util.List;

public class ListWorkout extends AppCompatActivity {
    private List<Workout> workoutList = new ArrayList<>();
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView recyclerView;
    WorkoutAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_workout);
        initData();
        recyclerView = findViewById(R.id.list_workout);
        adapter = new WorkoutAdapter(workoutList,getBaseContext());
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void initData() {
        workoutList.add(new Workout(R.drawable.e1f,"Nhảy đan chéo"));
        workoutList.add(new Workout(R.drawable.e2f,"Ngồi dựa tường"));
        workoutList.add(new Workout(R.drawable.e3f,"Chống đẩy"));
        workoutList.add(new Workout(R.drawable.e4f,"Tập cơ bụng"));
        workoutList.add(new Workout(R.drawable.e5f,"Bước lên ghế"));
        workoutList.add(new Workout(R.drawable.e6f,"Gánh đùi"));
        workoutList.add(new Workout(R.drawable.e7f,"Nhún cơ tam đầu bằng ghế"));
        workoutList.add(new Workout(R.drawable.e8f,"Tấm ván"));
        workoutList.add(new Workout(R.drawable.e9f,"Chạy tại chỗ đầu gối đánh cao"));
        workoutList.add(new Workout(R.drawable.e10f,"Bước gập gối"));
        workoutList.add(new Workout(R.drawable.e11f,"Chống đẩy và xoay người"));
        workoutList.add(new Workout(R.drawable.e12f,"Tấm ván bên"));

    }
}
