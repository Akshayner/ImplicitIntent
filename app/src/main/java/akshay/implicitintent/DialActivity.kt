package akshay.implicitintent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class DialActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dial)

        val i = Intent()
        i.setAction(Intent.ACTION_DIAL)
        startActivity(i)
    }

}
