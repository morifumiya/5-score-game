package rob.myappcompany.fivescoreapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class GameClear : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_clear)

        val btnReplay: Button = findViewById(R.id.btnReplay)
        btnReplay.setOnClickListener {
            // 5) ボタンを推したらアクティビティを終了
            // 5) ボタンを推したらメインに渡す＆自アクティビティを終了
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
