package com.example.listenit2.view.binding

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.model.music.UploadMusic
import com.example.listenit2.view.adapter.recycler.MusicUploadAdapter


@BindingAdapter("app:items")
fun setList(recyclerView: RecyclerView, item : List<UploadMusic>) {
    item.let {
        (recyclerView.adapter as MusicUploadAdapter).musicList = item
    }
}

