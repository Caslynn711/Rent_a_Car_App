package com.example.rentacarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CarList extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String [] carRentals = {"Enterprise Rent-A-Car", "Budget Car Rentals", "Hertz",
                "Avis Car Rental", "Kayak", "Alamo Car Rentals"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_car_list, R.id.travel, carRentals));
    }

    protected void onListItemClick(ListView i, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.enterprise.com")));
                break;

            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.budget.com")));
                break;

            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hertz.com")));
                break;

            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.avis.com")));
                break;

            case 4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kayak.com/cars")));
                break;

            case 5:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alamo.com")));

        }
    }
}
