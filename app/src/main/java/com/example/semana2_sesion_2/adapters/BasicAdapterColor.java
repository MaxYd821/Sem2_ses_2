package com.example.semana2_sesion_2.adapters;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.semana2_sesion_2.Colorclass;
import com.example.semana2_sesion_2.R;

import java.util.List;

public class BasicAdapterColor extends RecyclerView.Adapter<BasicAdapterColor.BasicViewHolder>{
    private List<Colorclass> data;

    public BasicAdapterColor(List<Colorclass> data)
    {

        this.data = data;
    }

    @NonNull
    @Override
    public BasicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_basic_color, parent, false);
        return new BasicViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public void onBindViewHolder(@NonNull BasicViewHolder holder, int position) {
        TextView tvname = holder.itemView.findViewById(R.id.tvname);
        TextView tvhex = holder.itemView.findViewById(R.id.tvhex);
        Colorclass color = data.get(position);
        FrameLayout flcirculo = holder.itemView.findViewById(R.id.flcirculo);
        Context context = holder.itemView.getContext();
        GradientDrawable drawable = (GradientDrawable) ContextCompat.getDrawable(context, R.drawable.round_border);
        tvname.setText(color.getName());
        tvhex.setText(color.getHex());
        drawable = (GradientDrawable) drawable.mutate();
        drawable.setColor(Color.parseColor(color.getHex()));
        flcirculo.setBackground(drawable);
    }

    public class BasicViewHolder extends RecyclerView.ViewHolder{
        public BasicViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
