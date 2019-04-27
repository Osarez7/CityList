package co.edu.intecap.citieslist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class CitiesAdaper extends RecyclerView.Adapter<CityViewHolder> {

   final List<String> citiesList = Arrays.asList("London", "Roma", "Madrid", "Tokyo", "Seul", "Paris", "Portugal");

    @NonNull
    @Override
    public CityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_city, parent, false);
        return new CityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CityViewHolder holder, int position) {
        holder.txtCityName.setText(citiesList.get(position));
        holder.txtExtra.setVisibility(((position + 1) % 2 == 0) ? View.VISIBLE: View.GONE);
    }

    @Override
    public int getItemCount() {
        return citiesList.size();
    }


}
