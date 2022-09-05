/**
 * Класс Учебник
 * @property name - Название учебника
 * @property price - Цена
 * @property kolvo - Количество страниц
 *
 * @author - Щура Алишер и Мачкарина Анна
 */
open class Uchebnik(_name: String,_kolvo: Int,_price: Double) {
    private var name: String
    private var kolvo: Int
    private var price: Double
    init {
        name = _name
        price = _price
        kolvo = _kolvo
    }
    /**
     * Расчет стоймойсти страницы в учебнике
     * @return - сколько стоит одна страница [Double]
     * @author - Щура Алишер и Мачкарина Анна
     */
    open fun Que(): Double{
        return (price / kolvo)
    }
    /**
     * Вывожу информацию на экран
     * @return - строка с информацией [String]
     * @author - Щура Алишер и Мачкарина Анна
     */
    open fun Vivod(): String{
        return "Name $name, Price $price, Kolvo $kolvo, Que ${Que()}\n"
    }
}