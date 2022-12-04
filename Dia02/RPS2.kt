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
            totalScore += when(me){
                1 -> 0
                2 -> 3
                else -> 6
            } + check2(me,opponent)
        }
        print(totalScore)
    }catch(e:Exception) {
        e.printStackTrace()
    }
}

/*
1 means lose
2 means draw
3 means win
 */
fun check2(me : Int, opponent : Int): Int{
    if(me == 2){
        return opponent
    }
    return when(opponent){
        1 -> if(me == 1) 3 else 2
        2 -> if(me == 1) 1 else 3
        else -> if(me ==1) 2 else 1
    }
}
