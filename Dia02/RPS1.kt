import java.lang.Exception
import java.util.*

fun main() {
    try{
        val sc : Scanner = Scanner(System.`in`)
        var opponent : Int
        var me : Int
        var totalScore : Int = 0
        while(sc.hasNext()){
            opponent = translate(sc.next())
            me = translate(sc.next())
            totalScore += (me + check(me,opponent))
        }
        print(totalScore)
    }catch(e:Exception) {
        e.printStackTrace()
    }
}
fun translate(symbol : String) : Int{
    return when(symbol){
        "A" -> 1
        "B" -> 2
        "C" -> 3
        "X" -> 1
        "Y" -> 2
        else -> 3
    }
}
fun check(me : Int, opponent : Int): Int{
    if(me == opponent){
        return 3
    }
    return when(me){
        1 -> if(opponent == 2) 0 else 6
        2 -> if(opponent == 3) 0 else 6
        else -> if(opponent == 1) 0 else 6
    }
}
