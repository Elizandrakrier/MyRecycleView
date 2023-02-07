package com.example.myrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.myrecycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recyclerView.apply {
            adapter = ProfileInfosAdapter()
            layoutManager = LinearLayoutManager(this@MainActivity)


            /**
             * LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
             * StaggeredGridLayoutManager( 2(spn/coluna), LinearLayoutManager.VERTICAL)
             */
        }


    }
}