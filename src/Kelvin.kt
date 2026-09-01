class Kelvin(temp: Double = 0.0) : Temperature(Unit.K, temp) {
    override fun getTemp(): Double = getTemp(Unit.K)
    override fun getTempIn(unit: Temperature.Unit): Double = getTemp(unit)
}