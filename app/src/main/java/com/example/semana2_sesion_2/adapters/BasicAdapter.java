package com.example.semana2_sesion_2.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.semana2_sesion_2.Contacto;
import com.example.semana2_sesion_2.R;

import java.util.List;

public class BasicAdapter extends RecyclerView.Adapter<BasicAdapter.BasicViewHolder> {

    private List<Contacto> data;

    public BasicAdapter(List<Contacto> data){
        this.data = data;
    }

    @NonNull
    @Override
    public BasicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_basic, parent, false);
        return new BasicViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public void onBindViewHolder(@NonNull BasicViewHolder holder, int position) {
        TextView tvtext = holder.itemView.findViewById(R.id.tvText);
        TextView tvtext1 = holder.itemView.findViewById(R.id.tvText1);
        String name = data.get(position).getName();
        int tel = data.get(position).getTel();
        tvtext.setText(name);
        tvtext1.setText(Integer.toString(tel));
    }

    public class BasicViewHolder extends RecyclerView.ViewHolder{
        public BasicViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
