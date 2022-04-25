package com.faisalgehlot.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.faisalgehlot.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // setAdapter
        val songObjects = mutableListOf<Song>()
        songObjects.add(Song("Na Tutteya Ve", "Fariha Pervez, Sanam Marvi"))
        songObjects.add(Song("Dil Khirki", "Mehdi Maloof"))
        songObjects.add(Song("Jaag Rahi", "Fariha Pervez ft. Ali Noor"))
        songObjects.add(Song("Dil Tarpe", "Rahat Fateh Ali Khan ft. Zara Madani"))
        songObjects.add(Song("Yaqeen", "Wajiha Naqvi"))
        songObjects.add(Song("Gal Sunn", "Ali Pervez Mehdi ft. Meesha Shafi"))
        songObjects.add(Song("Ishq Da Kukkar", "Sehar Gul Khan"))
        songObjects.add(Song("Pardesiya", "Zara Madani"))
        songObjects.add(Song("Har Funn Maula", "Umair Jaswal ft. Sanam Marvi"))
        songObjects.add(Song("Anbhol", "Sanam Marvi"))
        songObjects.add(Song("Megh", "Aizaz Sohail"))
        songObjects.add(Song("Saari Dunya", "Bohemia"))
        songObjects.add(Song("Shuru Karein", "Rovalio"))
        songObjects.add(Song("Tu Jhoom", "Abida Parveen & Naseebo Lal"))
        songObjects.add(Song("Kana Yaari", "Kaifi Khalil, Eva B & Abdul Wahab Bugti"))
        songObjects.add(Song("Sajan Das Na", "Atif Aslam & Momina Mustehsan"))
        songObjects.add(Song("Mehram", "Asfar Hussain & Arooj Aftab"))
        songObjects.add(Song("Neray Neray Vas", "Soch & Butt Brothers"))
        songObjects.add(Song("Pasoori", "Ali Sethi & Shae Gill"))
        songObjects.add(Song("Ye Dunya", "Karakoram, Talha Anjum, Faris Shafi"))
        songObjects.add(Song("Peechay Hutt", "Hasan Raheem, Justin Bibis, Talal Qureshi"))
        songObjects.add(Song("Muaziz Saarif", "Action Zain & Xulfi"))
        songObjects.add(Song("Muaziz Saarif", "Faris Shafi & Meesha Shafi"))
        songObjects.add(Song("Beparwah", "Momina Mustehsan"))
        songObjects.add(Song("Thagyan", "Quratulain Baloch, Zain & Zohaib"))
        songObjects.add(Song("Go", "Abdullah Siddiqui & Atif Aslam"))
        songObjects.add(Song("Phir Milenge", "Faisal Kapadia & Young Stunners"))
        songObjects.add(Song("Pareek", "Ariana & Amrina"))
        songObjects.add(Song("Faqeera", "Shamu Bai & Vishnu"))
        songObjects.add(Song("Naseebaya", "Darehan, Shayan & Mangal"))
        songObjects.add(Song("Tere Bin Soona", "Mishal Khawaja"))
        binding.songsList.adapter = MyAdapter(songObjects)

        // setLayoutManager
        binding.songsList.layoutManager = LinearLayoutManager(this)

    }
}