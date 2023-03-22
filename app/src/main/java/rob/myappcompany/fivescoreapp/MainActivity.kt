package rob.myappcompany.fivescoreapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvScore: TextView = findViewById(R.id.tvScore)
        val btnPlus: Button = findViewById(R.id.btnPlus)
        val btnMinus: Button = findViewById(R.id.btnMinus)
        var num = 0

        btnPlus.setOnClickListener {
            num++

            if (num == 5) {
                val intent = Intent(this, GameClear::class.java)
                startActivity(intent)
                finish()
            } else {
                tvScore.text = num.toString()
            }

        }

        btnMinus.setOnClickListener {
            num--

            if (num == -5) {
                val intent = Intent(this, GameOver::class.java)
                startActivity(intent)
                finish()
            } else {
                tvScore.text = num.toString()
            }
        }
    }
}
