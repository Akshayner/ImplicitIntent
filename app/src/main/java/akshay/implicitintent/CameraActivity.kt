package akshay.implicitintent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class CameraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)

        val i = Intent()
        i.setAction(Intent.ACTION_CAMERA_BUTTON)
        startActivity(i)

    }
}
