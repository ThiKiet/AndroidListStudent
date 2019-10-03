package com.example.androidrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {

    List<Student> students;

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from( parent.getContext() ).inflate( R.layout.item_student,parent,false );

        return new StudentViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        holder.txtName.setText(students.get(position).name);
        holder.txtAge.setText( ""+students.get(position).age );
        holder.txtAdd.setText( ""+students.get(position).hometown);
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    class StudentViewHolder extends RecyclerView.ViewHolder{
        TextView txtName;
        TextView txtAge;
        TextView txtAdd;

        public StudentViewHolder(@NonNull View itemView) {
            super( itemView );
            txtName = itemView.findViewById(R.id.test_name);
            txtAge  = itemView.findViewById(R.id.test_age);
            txtAdd  = itemView.findViewById(R.id.test_address);
        }
    }

}
