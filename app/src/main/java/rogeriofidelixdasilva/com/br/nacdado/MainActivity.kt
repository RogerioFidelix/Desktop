package rogeriofidelixdasilva.com.br.nacdado

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private var numeroAleatorio: Random? = null

    private val diceone = 1
    private val dicetwo = 2
    private val dicethree = 3
    private val dicefour = 4
    private val dicefive = 5
    private val dicesix = 6

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numeroAleatorio = Random()

        btn_play.setOnClickListener {
            realizarJogada()
        }
    }

    private fun realizarJogada() {

        val jogadaPC = numeroAleatorio!!.nextInt(6) + 1
        val jogadaPlayer = numeroAleatorio!!.nextInt(6) + 1

        when (jogadaPC) {
            1 -> {
                iv_pcdice!!.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dicei))
            }
            2 -> {
                iv_pcdice!!.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.diceii))
            }
            3 -> {
                iv_pcdice!!.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.diceiii))
            }
            4 -> {
                iv_pcdice!!.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.diceiv))
            }
            5 -> {
                iv_pcdice!!.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dicev))
            }
            6 -> {
                iv_pcdice!!.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dicevi))
            }
        }

        when (jogadaPlayer) {
            1 -> {
                iv_playerdice!!.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dicei))
                if (jogadaPlayer < jogadaPC) {
                    lose()
                } else if (jogadaPlayer > jogadaPC) {
                    win()
                } else {
                    draw()
                }
            }
            2 -> {
                iv_playerdice!!.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.diceii))
                if (jogadaPlayer < jogadaPC) {
                    lose()
                } else if (jogadaPlayer > jogadaPC) {
                    win()
                } else {
                    draw()
                }
            }
            3 -> {
                iv_playerdice!!.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.diceiii))
                if (jogadaPlayer < jogadaPC) {
                    lose()
                } else if (jogadaPlayer > jogadaPC) {
                    win()
                } else {
                    draw()
                }
            }
            4 -> {
                iv_playerdice!!.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.diceiv))
                if (jogadaPlayer < jogadaPC) {
                    lose()
                } else if (jogadaPlayer > jogadaPC) {
                    win()
                } else {
                    draw()
                }
            }
            5 -> {
                iv_playerdice!!.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dicev))
                if (jogadaPlayer < jogadaPC) {
                    lose()
                } else if (jogadaPlayer > jogadaPC) {
                    win()
                } else {
                    draw()
                }
            }
            6 -> {
                iv_playerdice!!.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dicevi))
                if (jogadaPlayer < jogadaPC) {
                    lose()
                } else if (jogadaPlayer > jogadaPC) {
                    win()
                } else {
                    draw()
                }
            }
        }
    }

    private fun win() {
        tv_win!!.text = getString(R.string.win_number) + 1.inc().and(1)
    }

    private fun lose() {
        tv_defeat!!.text = getString(R.string.defeat_number) + 1.inc().and(1)
    }

    private fun draw() {
        tv_draw!!.text = getString(R.string.draw_number) + 1.inc().and(1)
    }
}
