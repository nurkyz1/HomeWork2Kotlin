package com.geektech.homework2kotlin.extentions

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.load(url: String) {
    Glide.with(this).load(url).into(this)
}

fun random(images: MutableList<String>): String {
    if (!images.isNullOrEmpty()) {
        return images.random()
    }
    return images[1]
}

