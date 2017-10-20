package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by nmatveev on 19.10.2017.
 */

public class ParksFragment extends android.support.v4.app.Fragment{
    ArrayList<Attraction> attractions = new ArrayList<Attraction>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.list_item,container,false);
        attractions.add(new Attraction("Парк Горького","ул. Крымский Вал, 9, Москва, 119049","8(495)995-00-20",R.drawable.placeholder));
        attractions.add(new Attraction("Таганский Парк","Таганская ул., 40-42, Москва, 109147","8 (495) 912-27-17",R.drawable.placeholder ));
        attractions.add(new Attraction("Таганский детский парк","Таганская ул., 15А, Москва, 109147","8 (495) 911-10-16",R.drawable.placeholder ));
        attractions.add(new Attraction("Музеон","Крымский вал, вл. 2, Москва, 119049","  (985) 382-27-32",R.drawable.placeholder ));
        attractions.add(new Attraction("Екатерининский парк","Большая Екатерининская ул., 27, Москва, 129110","8 (495) 600-63-91",R.drawable.placeholder ));
        attractions.add(new Attraction("Сокольники","ул. Сокольнический Вал, 1, стр. 1, Москва","8 (499) 393-92-22",R.drawable.placeholder ));
        attractions.add(new Attraction("Сад имени Н. Э. Баумана","Старая Басманная ул., 15, Москва, 105064","8 (499) 261-58-83",R.drawable.placeholder ));
        attractions.add(new Attraction("Таганский Парк","Таганская ул., 40-42, Москва, 109147","8 (495) 912-27-17",R.drawable.placeholder ));
        attractions.add(new Attraction("Таганский Парк","Таганская ул., 40-42, Москва, 109147","8 (495) 912-27-17",R.drawable.placeholder ));
        attractions.add(new Attraction("Таганский Парк","Таганская ул., 40-42, Москва, 109147","8 (495) 912-27-17",R.drawable.placeholder ));



        AttractionAdapter adapter = new AttractionAdapter(attractions);
        RecyclerView rv = container.findViewById(R.id.rv);
        rv.setAdapter(adapter);

        return v;
    }




}
