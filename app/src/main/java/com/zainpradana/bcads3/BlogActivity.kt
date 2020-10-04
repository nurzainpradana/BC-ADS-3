package com.zainpradana.bcads3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_blog.*

class BlogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog)

        Toast.makeText(this, "Silahkan Tunggu ... ", Toast.LENGTH_SHORT).show()
        //Web View
        webview.loadUrl("https://www.google.co.id/")
        webview.settings.javaScriptEnabled
    }
}