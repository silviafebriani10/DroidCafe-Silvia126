package lat.pam.basicview

import android.app.Activity
import android.os.Bundle

class OrderActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Memuat layout dari XML yang sesuai (pastikan nama filenya benar, misalnya activity_order.xml)
        setContentView(R.layout.activity_order)
    }
}