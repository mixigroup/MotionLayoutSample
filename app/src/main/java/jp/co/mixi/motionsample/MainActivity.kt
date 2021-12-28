package jp.co.mixi.motionsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.sample1).setOnClickListener {
            startActivity(Intent(this, Sample1Activity::class.java))
        }
        findViewById<Button>(R.id.sample2).setOnClickListener {
            startActivity(Intent(this, Sample2Activity::class.java))
        }
        findViewById<Button>(R.id.sample3).setOnClickListener {
            startActivity(Intent(this, Sample3Activity::class.java))
        }
        findViewById<Button>(R.id.sample4).setOnClickListener {
            startActivity(Intent(this, Sample4Activity::class.java))
        }
    }
}