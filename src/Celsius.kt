class Celsius(temp: Double = 0.0) : Temperature(Unit.C, temp) {
    override fun getTemp(): Double = getTemp(Unit.C)
    override fun getTempIn(unit: Temperature.Unit): Double = getTemp(unit)
}