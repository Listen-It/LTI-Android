package com.example.listenit2.view.adapter.recycler

import android.view.View
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.model.music.UploadMusic

class MusicUploadAdapter : RecyclerView.Adapter<MusicUploadAdapter.MusicUploadViewHolder>() {

    lateinit var musicList: List<UploadMusic>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicUploadViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MusicUploadViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class MusicUploadViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}