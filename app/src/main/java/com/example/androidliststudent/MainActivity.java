package com.example.androidrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Student> users;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById( R.id.Recycler_student );
        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
        final StudentAdapter studentAdapter = new StudentAdapter();

        recyclerView.setAdapter(studentAdapter);

        final Student student1= new Student("Lan",22,"Da Nang");
        Student student2 = new Student("Mai",34,"Quang Nam");
        Student student3 = new Student("Nam",19,"Binh Dinh");

        final List<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        studentAdapter.students=students;

        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                students.add(new Student("Anonymous",20,"Mars"));

                studentAdapter.notifyDataSetChanged();

            }
        });

        findViewById(R.id.delete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                students.remove(students.size()-1);

                studentAdapter.notifyDataSetChanged();

            }
        });
    }
}
