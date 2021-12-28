package jp.co.mixi.motionsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.utils.widget.MotionLabel

class Sample1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample1)

        val motionLayout = findViewById<MotionLayout>(R.id.motion_layout)

        findViewById<Button>(R.id.to_state0).setOnClickListener {
            motionLayout.transitionToState(R.id.state_0)
        }
        findViewById<Button>(R.id.to_state1).setOnClickListener {
            motionLayout.transitionToState(R.id.state_1)
        }
        findViewById<Button>(R.id.to_state2).setOnClickListener {
            motionLayout.transitionToState(R.id.state_2)
        }
        findViewById<Button>(R.id.to_state3).setOnClickListener {
            motionLayout.transitionToState(R.id.state_3)
        }
    }
}