package com.example.waycycle;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap gMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map_angkut);
        if (mapFragment != null) {
            mapFragment.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        gMap = googleMap;

        // Contoh menambahkan marker di lokasi tertentu dan memindahkan kamera ke lokasi tersebut
        LatLng lokasi = new LatLng(-6.3706482426187065, 106.82369205442816); // Koordinat Jakarta, Indonesia
        gMap.addMarker(new MarkerOptions().position(lokasi).title("Politeknik Negeri Jakarta"));
        float zoomLevel = 20f;
        gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasi, zoomLevel));
    }
}
