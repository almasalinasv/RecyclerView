package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeVideoData: Array<JSONObject> = arrayOf(
            JSONObject("{\"title\": \"Nick Jonas - Introducing Me\", \"channel\": \"DisneyMusicVEVO\n\", \"views\": \"28M views\", \"datePosted\": \"3 years ago\", \"duration\": \"03:08\"}"),
            JSONObject("{\"title\": \"He escrito una canción solo con frases de mi infancia\", \"channel\": \"David Reed\", \"views\": \"273M views\", \"datePosted\": \"3 years ago\", \"duration\": \"05:36\"}"),
            JSONObject("{\"title\": \"Justin Bieber - Baby (Official Music Video) ft. Ludacris\", \"channel\": \"Justin Bieber\", \"views\": \"2706M views\", \"datePosted\": \"12 years ago\", \"duration\": \"3:40\"}"),
            JSONObject("{\"title\": \"One Direction - What Makes You Beautiful (Official Video)\", \"channel\": \"\n" +
                    "One Direction\n\", \"views\": \"1340M views\", \"datePosted\": \"10 years ago \", \"duration\": \"03:27\"}"),
            JSONObject("{\"title\": \"John\", \"channel\": \"Channel\", \"views\": \"254k views\", \"datePosted\": \"2 years ago\", \"duration\": \"05:00\"}")
        )
    binding.rvVideoEntries.adapter = MainAdapter(fakeVideoData)

    }
}