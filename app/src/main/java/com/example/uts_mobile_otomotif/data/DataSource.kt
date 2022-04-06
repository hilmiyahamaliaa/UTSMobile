package com.example.uts_mobile_otomotif.data

import com.example.uts_mobile_otomotif.R
import com.example.uts_mobile_otomotif.model.Mobil_cars

class DataSource {
    fun loadMobil(): List<Mobil_cars> {
        return listOf<Mobil_cars>(
            Mobil_cars(R.string.mobil1, R.drawable.gambar1),
            Mobil_cars(R.string.mobil2, R.drawable.gambar2),
            Mobil_cars(R.string.mobil3, R.drawable.gambar3),
            Mobil_cars(R.string.mobil4, R.drawable.gambar4),
            Mobil_cars(R.string.mobil5, R.drawable.gambar5),
            Mobil_cars(R.string.mobil6, R.drawable.gambar6),
            Mobil_cars(R.string.mobil7, R.drawable.gambar7),
            Mobil_cars(R.string.mobil8, R.drawable.gambar8),
            Mobil_cars(R.string.mobil9, R.drawable.gambar9),
            Mobil_cars(R.string.mobil10, R.drawable.gambar10)
        )
    }
}