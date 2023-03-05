package ie.wit.gamecollectionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber
import timber.log.Timber.i

class GameCollectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gamecollection)
        Timber.plant(Timber.DebugTree())
        i("Game Collection App started..")
    }
}