package com.example.calcudadoramvp;

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calcudadoramvp.R
import com.example.calcudadoramvp.databinding.ActivityMainBinding
import com.example.calcudadoramvp.model.Calculadora

import com.example.calculadoramvc.presenter.CalcPresenter
import com.example.calculadoramvc.presenter.ICalcPresenter

class MainActivity : AppCompatActivity(), ICalcPresenter{

    private lateinit var binding: ActivityMainBinding
    private lateinit var visor: TextView
    private lateinit var presenter: CalcPresenter
    private lateinit var calculadora: Calculadora


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        calculadora = Calculadora()
        presenter = CalcPresenter( this, calculadora)
        setupButtonListeners()
        visor = binding.tvResult
    }

    private fun setupButtonListeners() {
        val buttons = listOf(
            binding.btn1,
            binding.btn2,
            binding.btn3,
            binding.btn4,
            binding.btn5,
            binding.btn6,
            binding.btn7,
            binding.btn8,
            binding.btn9,
            binding.btn0,
            binding.btnAdd,
            binding.btnDot,
            binding.btnDivide,
            binding.btnMultiply,
            binding.btnSubtract
        )

        buttons.forEach { button ->
            button.setOnClickListener {
                presenter.addTerm(button.text.toString())
            }
        }
        binding.btnBackspace.setOnClickListener{
            presenter.removeTerm()
        }
        binding.btnEqual.setOnClickListener{
            presenter.calculate()
        }
    }

    override fun showError(s: String) {
        var alert = AlertDialog.Builder(this)
        alert.setTitle("ERRO")
        alert.setMessage("Voce esta tentando efetuar uma operação não permitida.\n$s")
        alert.setNeutralButton("Voltar"){_,_ ->

        }
        alert.create().show()
    }


    override fun updateVisor(expression: String) {
        visor.text = expression
    }

}