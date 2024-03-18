package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<RecyclerViewAdapter.RecycleViewHolder> {

    private List<RecyclerView> RecycleList = new ArrayList<>();

    @NonNull
    @Override
    public RecycleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycle, parent, false);
        return new RecycleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewHolder holder, int position) {
        RecyclerView mahasiswa = RecycleList.get(position);
        holder.bind(mahasiswa);
    }

    @Override
    public int getItemCount() {
        return RecycleList.size();
    }

    public void addMhs(RecyclerView mahasiswa) {
        RecycleList.add(mahasiswa);
    }

    static class RecycleViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {

        private TextView nameTextView;
        private TextView infoTextView;
        private ImageView logoImageView;

        public RecycleViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.tv_name);
            infoTextView = itemView.findViewById(R.id.tv_info);
            logoImageView = itemView.findViewById(R.id.iv_logo);
        }

        public void bind(RecyclerView mahasiswa) {
            nameTextView.setText(mahasiswa.getName());
            infoTextView.setText(mahasiswa.getInfo());
            logoImageView.setImageResource(mahasiswa.getLogo());
        }
    }
}
