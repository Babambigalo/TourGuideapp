package com.example.android.tourguideapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nmatveev on 18.10.2017.
 */

public class AttractionAdapter extends RecyclerView.Adapter<AttractionAdapter.AttractionViewHolder> {
    ArrayList<Attraction> attractions;

    public static class AttractionViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView number;
        TextView adress;
        RecyclerView rv;
        ImageView image;
        public AttractionViewHolder(View itemView) {
            super(itemView);
            rv = itemView.findViewById(R.id.rv);
            name = itemView.findViewById(R.id.textViewName);
            number = itemView.findViewById(R.id.TextViewNumber);
            adress = itemView.findViewById(R.id.textViewAdress);
            image = itemView.findViewById(R.id.imageView);
        }
    }

    public AttractionAdapter(ArrayList<Attraction> data){
        attractions = data;


    }




    @Override
    public AttractionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.temp_items,parent,false);
        AttractionViewHolder vh = new AttractionViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(AttractionViewHolder holder, int position) {
        holder.name.setText(attractions.get(position).getmName());
        holder.number.setText(attractions.get(position).getmNumber());
        holder.adress.setText(attractions.get(position).getmAdress());
        holder.image.setImageResource(attractions.get(position).getmImageId());



    }

    @Override
    public int getItemCount() {
        return attractions.size();
    }

}
