package com.rawan.yarab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.Int as Int1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val exampleList=generateDummyList(size=500)
        recycler_view.adapter=ExampleAdapter(exampleList)
        recycler_view.layoutManager= LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }
    
    private fun generateDummyList (size: Int1):List<ExampleItem>{
        
        val list = ArrayList<ExampleItem>()
        
        for (i in 0 until size){
            val drawable=when (i%6){
                0->R.drawable.img1
                1->R.drawable.img2
                2->R.drawable.img3
                3->R.drawable.img4
                4->R.drawable.img5
                else->R.drawable.img6
            }
            val item=ExampleItem(drawable,"Item$i","line 2")
            list +=item
        }
        return list
    }
} 