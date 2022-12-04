import java.lang.Exception
import java.util.Scanner

fun main() {
    try{
        val sc : Scanner = Scanner(System.`in`)
        var line : String
        var max : Int = 0
        var counter : Int = 0
        while(sc.hasNext()){
            line = sc.nextLine()
            if(line.isBlank() || line.isEmpty()){
                if(counter > max){
                    max = counter
                }
                counter = 0
            }else{
                counter += line.toInt()
            }
        }
        print(max)
    }catch (e : Exception){
        e.printStackTrace()
    }
}
