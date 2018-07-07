package akshay.implicitintent

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1.setOnClickListener {
            val i = Intent(this@MainActivity, DialActivity::class.java)
            startActivity(i)
        }

        b2.setOnClickListener {
            val o = Intent(this@MainActivity, ScreenActivity::class.java)
            startActivity(o)
        }

        b3.setOnClickListener {
            val a = Intent(this@MainActivity, CameraActivity::class.java)
            startActivity(a)
        }

        b4.setOnClickListener {
            val a = Intent(this@MainActivity, CopyActivity::class.java)
            startActivity(a)
        }
    }
}
