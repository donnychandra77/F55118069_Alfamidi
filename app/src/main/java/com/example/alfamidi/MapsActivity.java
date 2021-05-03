package com.example.alfamidi;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Membuar mark pada tempat tinggal User
        LatLng TempatTinggal = new LatLng(-0.833392, 119.885413);
        // Custom size marker
        int tinggi = 150;
        int lebar = 90;
        BitmapDrawable bitmapDraw = (BitmapDrawable)getResources().getDrawable(R.drawable.lokasi_donny1);
        Bitmap b = bitmapDraw.getBitmap();
        Bitmap markerKecil = Bitmap.createScaledBitmap(b, lebar, tinggi, false);
        //Masukan Ke Map
        mMap.addMarker(new MarkerOptions().position(TempatTinggal).title("Tempat Tinggal (Donny Chandra F55118069)").snippet("Ini Tempat Tinggal Saya").icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(TempatTinggal, 13.5f));


        LatLng AlfamidiReMartadinata2 = new LatLng(-0.840324, 119.883388);
        mMap.addMarker(new MarkerOptions().position(AlfamidiReMartadinata2).title("Lokasi Terdekat : Alfamidi R.E Martadinata 2"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AlfamidiReMartadinata2));

        LatLng AlfamidiMartadinataTondo = new LatLng(-0.845055, 119.882739);
        mMap.addMarker(new MarkerOptions().position(AlfamidiMartadinataTondo).title("Alfamidi Martadinata Tondo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AlfamidiMartadinataTondo));

        LatLng AlfamidiTondo = new LatLng(-0.853605, 119.883743);
        mMap.addMarker(new MarkerOptions().position(AlfamidiTondo).title("Alfamidi Tondo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AlfamidiTondo));

        LatLng AlfamidiArba2Yosda = new LatLng(-0.874326, 119.874626);
        mMap.addMarker(new MarkerOptions().position(AlfamidiArba2Yosda).title("Alfamidi Arba 2 Yosda"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AlfamidiArba2Yosda));

        LatLng AlfamidiHantuah = new LatLng(-0.877754, 119.876815);
        mMap.addMarker(new MarkerOptions().position(AlfamidiHantuah).title("Alfamidi Hantuah"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AlfamidiHantuah));

        LatLng AlfamidiYosudarso = new LatLng(-0.880168, 119.872600);
        mMap.addMarker(new MarkerOptions().position(AlfamidiYosudarso).title("Alfamidi Yosudarso"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AlfamidiYosudarso));

        LatLng AlfamidiTombolututu = new LatLng(-0.883268, 119.878760);
        mMap.addMarker(new MarkerOptions().position(AlfamidiTombolututu).title("Alfamidi Tombolututu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AlfamidiTombolututu));

        LatLng AlfamidiSetiabudi = new LatLng(-0.891220, 119.878431);
        mMap.addMarker(new MarkerOptions().position(AlfamidiSetiabudi).title("Alfamidi Setiabudi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AlfamidiSetiabudi));

        LatLng AlfamidiSigma = new LatLng(-0.893323, 119.886641);
        mMap.addMarker(new MarkerOptions().position(AlfamidiSigma).title("Alfamidi Sigma"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AlfamidiSigma));

        LatLng AlfamidiHjHayyun = new LatLng(-0.892334, 119.868111);
        mMap.addMarker(new MarkerOptions().position(AlfamidiHjHayyun).title("Alfamidi Hj. Hayyun"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AlfamidiHjHayyun));

        LatLng AlfamidiKimaja = new LatLng(-0.892112, 119.865536);
        mMap.addMarker(new MarkerOptions().position(AlfamidiKimaja).title("Alfamidi Kimaja"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AlfamidiKimaja));

        LatLng AlfamidiWahidHasyim = new LatLng(-0.8933894, 119.8596795);
        mMap.addMarker(new MarkerOptions().position(AlfamidiWahidHasyim).title("Alfamidi Wahid Hasyim"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AlfamidiWahidHasyim));

        LatLng Alfamidi = new LatLng(-0.897328, 119.880603);
        mMap.addMarker(new MarkerOptions().position(Alfamidi).title("Alfamidi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Alfamidi));

        LatLng AlfamidiVeteran2 = new LatLng(-0.897805, 119.891988);
        mMap.addMarker(new MarkerOptions().position(AlfamidiVeteran2).title("Alfamidi Veteran 2"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AlfamidiVeteran2));

        LatLng AlfamidiVeteran = new LatLng(-0.899558, 119.899420);
        mMap.addMarker(new MarkerOptions().position(AlfamidiVeteran).title("Alfamidi Veteran"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AlfamidiVeteran));

        LatLng AlfamidiTanjungSatu = new LatLng(-0.906540, 119.882026);
        mMap.addMarker(new MarkerOptions().position(AlfamidiTanjungSatu).title("Alfamidi Tanjung Satu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AlfamidiTanjungSatu));

        LatLng Alfamidi1 = new LatLng(-0.906831, 119.875408);
        mMap.addMarker(new MarkerOptions().position(Alfamidi1).title("Alfamidi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Alfamidi1));

        LatLng AlfamidiCabangImamBonjol = new LatLng(-0.894950, 119.856901);
        mMap.addMarker(new MarkerOptions().position(AlfamidiCabangImamBonjol).title("Alfamidi Cabang Imam Bonjol"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AlfamidiCabangImamBonjol));

        LatLng AlfamidiPaluPlaza = new LatLng(-0.900123, 119.860654);
        mMap.addMarker(new MarkerOptions().position(AlfamidiPaluPlaza).title("Alfamidi Palu Plaza"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AlfamidiPaluPlaza));

        LatLng Alfamidi2 = new LatLng(-0.903592, 119.857937);
        mMap.addMarker(new MarkerOptions().position(Alfamidi2).title("Alfamidi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Alfamidi2));

        LatLng AlfamidiDatuAdam = new LatLng(-0.892378, 119.847484);
        mMap.addMarker(new MarkerOptions().position(AlfamidiDatuAdam).title("Alfamidi Datu Adam"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AlfamidiDatuAdam));

        LatLng AlfamidiKabonena = new LatLng(-0.8856847, 119.8357393);
        mMap.addMarker(new MarkerOptions().position(AlfamidiKabonena).title("Alfamidi Kabonena"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AlfamidiKabonena));

        //PolyLine ke Alfamidi R.E Martadinata 2
        mMap.addPolyline(new PolylineOptions().add(
                TempatTinggal,
                new LatLng(-0.833262, 119.885358),
                new LatLng(-0.833514, 119.883136),
                new LatLng(-0.836624, 119.883438),
                new LatLng(-0.837203, 119.883481),
                new LatLng(-0.838152, 119.883414),
                new LatLng(-0.839045, 119.883331),
                new LatLng(-0.840311, 119.883319),
                AlfamidiReMartadinata2
        ).width(10)
                .color(Color.BLACK)
        );
    }
}