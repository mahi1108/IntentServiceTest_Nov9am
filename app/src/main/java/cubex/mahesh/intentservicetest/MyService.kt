package cubex.mahesh.intentservicetest

import android.app.IntentService
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.net.URL

var bmp:Bitmap? = null

class MyService : IntentService("and9am")  {
    override fun onHandleIntent(p0: Intent?) {
            var url = URL("https://cdn-images-1.medium.com/max/1600/1*sKmFAhoFQ9r6dbC-GmVnog.jpeg")
            var isr = url.openStream()
             bmp = BitmapFactory.decodeStream(isr)

            var i = Intent( )
            i.setAction("bgtask_done")
            sendBroadcast(i)
    }
}