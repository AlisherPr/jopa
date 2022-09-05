fun main() {
    println("Учебник по программированию")
    println("Введите название учебника по программированию, цену и кол-во страничек :)")
    val parts = Uchebnik(_name = readLine().toString(), _price = readLine().toString().toDouble(), _kolvo = readLine().toString().toInt())
    println(parts.Vivod())
    println("Год издания")
    println("Введите название, цену, кол-во страничек, год издания, текущий год: ")
    val parts2 = Yearvipusk(_name = readLine().toString(), _price = readLine().toString().toDouble(), _kolvo = readLine().toString().toInt(), _P = readLine().toString().toInt(), _T = readLine().toString().toInt())
    println(parts2.Vivod())
}