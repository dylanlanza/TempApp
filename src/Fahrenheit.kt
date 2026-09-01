class Fahrenheit(temp: Double = 0.0) : Temperature(Unit.F, temp) {
    override fun getTemp(): Double = getTemp(Unit.F)
    override fun getTempIn(unit: Temperature.Unit): Double = getTemp(unit)
}