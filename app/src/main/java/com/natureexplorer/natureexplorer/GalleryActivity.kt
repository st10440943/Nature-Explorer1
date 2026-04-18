package com.natureexplorer.natureexplorer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GalleryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // LayoutManager (REQUIRED)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Sample data
        val list = listOf(
            NatureItem(R.drawable.nature, "Forest", "Green forest area"),
            NatureItem(R.drawable.nature, "Mountain", "Beautiful mountain view"),
            NatureItem(R.drawable.nature, "River", "Calm flowing river")
        )

        // Adapter
        recyclerView.adapter = NatureAdapter(list)
    }
}