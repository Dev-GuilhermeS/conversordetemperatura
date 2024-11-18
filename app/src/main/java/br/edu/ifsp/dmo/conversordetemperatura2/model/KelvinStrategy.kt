package br.edu.ifsp.dmo.conversordetemperatura2.model

object KelvinStrategy: TemperatureConverter {
    override fun converter(temperature: Double): Double {
        return temperature + 273.15;
    }
    override fun getScale(): String {
        return "ºK"
    }
}
