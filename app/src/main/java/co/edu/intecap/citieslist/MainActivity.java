package co.edu.intecap.citieslist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       RecyclerView rvCities =  findViewById(R.id.rv_cities);

       rvCities.setLayoutManager(new StaggeredGridLayoutManager(2 , RecyclerView.VERTICAL));
       rvCities.setAdapter(new CitiesAdaper());
    }
}
