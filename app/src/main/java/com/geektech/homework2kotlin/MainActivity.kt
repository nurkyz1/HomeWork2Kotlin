package com.geektech.homework2kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.homework2kotlin.databinding.ActivityMainBinding
import com.geektech.homework2kotlin.extentions.load
import com.geektech.homework2kotlin.extentions.random
import com.geektech.homework2kotlin.extentions.showToast

class MainActivity : AppCompatActivity() {

    private val images = mutableListOf<String>()

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addImage()
        randomImage()
        submitImage()
    }

    private fun submitImage() {
        binding.btnSubmit.setOnClickListener {
            if (binding.etEditText.text.isNullOrEmpty()) {
                showToast(getString(R.string.toast))
            } else {
                val link = binding.etEditText.text.toString()
                images.add(link)

            }
        }

    }

    private fun randomImage() {
        binding.btnRandom.setOnClickListener {
            if (!images.isNullOrEmpty()) {
                val url = random(images)
                binding.ivImage.load(url)
            }
        }
    }

    private fun addImage() {
        images.add("https://lh3.googleusercontent.com/proxy/8WkXOhg_E595R_wAcDowXayr3VTAe58bfbmJr3oOlfVMsRu-O9ufDVgtgVI0gaP4x2bj7uy1epxBpb3rqIG9yfPggPPbNAWj0GgTpA2FVHjcGO6bj3zsM6wrBi5Zdz4pWiAsk3OE")
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRlfPsw8t8L-qEoLBieaDaHNSZ1EWsduJKMRXmZ66iFP5OQcfONOY_HPc5rZCpE4HhkaQ&usqp=CAU")
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQfQPzNcYa7mkDc0x_nxAYoh8OaFHGBn-LHyudEKIihqd4gL890K_u_vP1pUQmczRC5xls&usqp=CAU")
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTR7ZXi1V2ZS8Zfi2v4IgOdj7xWSvUKU8vk1YnKclQ9Lmub4KcDvN9scEhBFPr2X9mbJNU&usqp=CAU")
        images.add("https://lh3.googleusercontent.com/proxy/8TcANJF3Ca2Hc1Ei-O3RjMltshz6S1_eNvRPxSj8ax432tRlkaZa2pvmmdMUB4rtsRJuu4dGvYkAfPCdNI7Yp6dgES6-pxarsP4TxKBs7C2slv-FhqE8rNtPyGYMy2Jl3IThoeYww233OfiUQMD8")
    }
}