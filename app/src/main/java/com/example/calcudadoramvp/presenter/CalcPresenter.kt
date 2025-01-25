package com.example.calculadoramvc.presenter

import androidx.core.net.ParseException
import com.example.calcudadoramvp.model.Calculadora
import com.ezylang.evalex.EvaluationException

class CalcPresenter(
    private val view: ICalcPresenter,
    private val calculadora: Calculadora
){

    fun addTerm(term: String){
        calculadora.addToExpression(term)
        view.updateVisor(calculadora.expression)
    }

    fun removeTerm(){
        calculadora.removeFromExpression()
        view.updateVisor(calculadora.expression)
    }

    fun calculate() {
        try {
            calculadora.evaluate()
            view.updateVisor(calculadora.expression)
        }catch (e: ParseException){
            view.showError("Erro ao analisar a expressão")
        }
        catch (e: EvaluationException){
            view.showError("Erro calcular a expressão")
        }catch (e: IllegalArgumentException){
            view.showError("A expressão esta vazia")
        }catch (e: Exception){
            view.showError("")
        }
    }
}