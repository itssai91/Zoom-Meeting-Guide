package `in`.hostranger.zoomvideocallguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_item.*

class ItemActivity : LogActivity() {
    private lateinit var mInterstitialAd: InterstitialAd
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        MobileAds.initialize(this) {}

        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = getString(R.string.interstial_id)
        mInterstitialAd.loadAd(AdRequest.Builder().build())

        whatiszoomBtn.setOnClickListener {
            val intent = Intent(this, WhatisZoom::class.java)
            startActivity(intent)
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
            }
        }

        howcanistartBtn.setOnClickListener {
            val intent = Intent(this, HowCaniStart::class.java)
            startActivity(intent)
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
            }
        }

        howcaniloginBtn.setOnClickListener {
            val intent = Intent(this, HowCaniLogin::class.java)
            startActivity(intent)
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
            }
        }

        afterLaunchAppBtn.setOnClickListener {
            val intent = Intent(this, AfterLaunchApp::class.java)
            startActivity(intent)
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
            }
        }

        wherecanifindDesktopBtn.setOnClickListener {
            val intent = Intent(this, WherecanifindDesktop::class.java)
            startActivity(intent)
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
            }
        }

        howdoistartmeetingBtn.setOnClickListener {
            val intent = Intent(this, HowdoistartMeeting::class.java)
            startActivity(intent)
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
            }
        }

        beforeYoustrtMeetingBtn.setOnClickListener {
            val intent = Intent(this, BeforeYouStartMeetingActivity::class.java)
            startActivity(intent)
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
            }
        }

        whtcandoinMettingBtn.setOnClickListener {
            val intent = Intent(this, WhatCanDoinMettingActivity::class.java)
            startActivity(intent)
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
            }
        }

        recordtheVideoCallBtn.setOnClickListener {
            val intent = Intent(this, RecordtheVideoCallActivity::class.java)
            startActivity(intent)
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
            }
        }


    }
}