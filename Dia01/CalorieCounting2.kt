import java.lang.Exception
import java.util.Scanner

fun main() {
    try{
        val sc : Scanner = Scanner(System.`in`)
        var line : String
        var max = mutableListOf<Int>(0,0,0,0,0)
        var counter : Int = 0
        while(sc.hasNext()){
            line = sc.nextLine()
            if(line.isBlank() || line.isEmpty()){
                if(counter > max[2]){
                    max[3] = max[2]
                    max[4] = max[1]
                    max[2] = counter
                    max[1] = max[3]
                    max[0] = max[4]
                    max[3] = 0
                    max[4] = 0
                }else if(counter > max[1]){
                    max[3] = max[1]
                    max[1] = counter
                    max[0] = max[3]
                    max[3] = 0
                }else if(counter > max[0]){
                    max[0] = counter
                }
                counter = 0
            }else{
                counter += line.toInt()
            }
        }
        print(max)
        print("${max[0]+max[1]+max[2]}")
    }catch (e : Exception){
        e.printStackTrace()
    }
}
