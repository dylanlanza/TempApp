fun main() {
    val c = Celsius(100.0)
    val f = Fahrenheit(32.0)
    val k = Kelvin(0.0)

    println("100 C in F: ${c.getTempIn(Temperature.Unit.F)}")
    println("32 F in C: ${f.getTempIn(Temperature.Unit.C)}")
    println("0 K in C: ${k.getTempIn(Temperature.Unit.C)}")

    c.setTemp(37.0)
    println("37 C in F: ${c.getTempIn(Temperature.Unit.F)}")
}