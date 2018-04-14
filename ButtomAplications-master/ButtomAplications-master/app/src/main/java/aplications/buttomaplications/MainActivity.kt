package aplications.buttomaplications

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_gas.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, GasCalculate::class.java)
            startActivity(intent);
        }

        btn_age.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, ChildAge::class.java)
            startActivity(intent);
        }

        btn_score.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, Score::class.java)
            startActivity(intent);
        }
    }
}
