/**
 * Класс Год издания
 * @property P - год издания
 * @property T - текущий год
 *
 * @author Щура Алишер и Мачкарина Анна
 */
class Yearvipusk(_name: String,_kolvo: Int,_price: Double, _P: Int, _T: Int):Uchebnik(_name,_kolvo,_price) {
    private var P: Int
    private var T: Int
    init {
        P = _P
        T = _T
    }
    /**
     * @author - Щура Алишер и Мачкарина Анна
     */
    override fun Que(): Double {
        return super.Que() - 0.2 * (T - P)
    }
    /**
     * Вывожу информацию на экран
     * @return - строка с информацией [String]
     * @author - Щура Алишер и Мачкарина Анна
     */
    override fun Vivod(): String {
        return super.Vivod() + "Yearvipusk: $P, Tekgod: $T, QPT: ${Que()}\n"
    }
}