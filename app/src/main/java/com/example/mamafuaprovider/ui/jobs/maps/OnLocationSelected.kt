package com.example.mamafuaprovider.ui.jobs.maps

import com.google.android.gms.maps.model.LatLng

interface OnLocationSelected {

    fun onLocationSelected(latLng: LatLng)
}