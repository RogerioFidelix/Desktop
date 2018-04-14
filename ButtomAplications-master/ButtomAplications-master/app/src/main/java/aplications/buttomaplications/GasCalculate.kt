package aplications.buttomaplications

import android.inputmethodservice.ExtractEditText
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_gas_calculate.*
import kotlinx.android.synthetic.main.activity_gas_calculate.view.*

class GasCalculate : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gas_calculate)

        btn_valorCalculate.setOnClickListener{
            var gas = etx_gasolina.text.toString().toDouble()
            var alc = etx_alcool.text.toString().toDouble()


            var resultado = alc/gas

            if(resultado < 0.7){
                txv_resultadoGas.setText("Compre Álcool")
            }else if(resultado > 0.7){
                txv_resultadoGas.setText("Compre Gasosa")
            }
        }
    }
}
