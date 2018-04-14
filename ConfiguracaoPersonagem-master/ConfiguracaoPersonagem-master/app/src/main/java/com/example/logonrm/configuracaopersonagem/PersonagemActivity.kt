package com.example.logonrm.configuracaopersonagem

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.AdapterView
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import kotlinx.android.synthetic.main.activity_personagem.*

class PersonagemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personagem)

        sbForce.setOnSeekBarChangeListener (object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                tvForca.setText(progress.toString())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        spJobs.onItemSelectedListener = (object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val tipoPersonagem = TipoPersonagemEnum.from(position)
                when (tipoPersonagem) {
                    TipoPersonagemEnum.ANAO -> trocaImagem(R.drawable.dwarf)
                    TipoPersonagemEnum.ELFO -> trocaImagem(R.drawable.archer)
                    TipoPersonagemEnum.GUERREIRO -> trocaImagem(R.drawable.warrior)
                    TipoPersonagemEnum.MAGO -> trocaImagem(R.drawable.wizard)
                }
            }
        })
    }
    fun trocaImagem(idImagem: Int){
        ivJobs.setImageDrawable(ContextCompat.getDrawable(this, idImagem))
    }
}
