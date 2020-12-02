package `in`.hostranger.zoomvideocallguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

lateinit var handler: Handler
@Suppress("DEPRECATION")
class Splashactivity : LogActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashactivity)

        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, GetStartedActivity::class.java)
            startActivity(intent)
        }, 3000)

    }
}