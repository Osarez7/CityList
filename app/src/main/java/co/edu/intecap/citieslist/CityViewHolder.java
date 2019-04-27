package co.edu.intecap.citieslist;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public  class CityViewHolder extends RecyclerView.ViewHolder {
        TextView txtCityName;
        TextView txtExtra;

        public CityViewHolder(@NonNull View itemView) {
            super(itemView);
            txtCityName = itemView.findViewById(R.id.txt_city);
            txtExtra = itemView.findViewById(R.id.txt_extra);
        }
    }