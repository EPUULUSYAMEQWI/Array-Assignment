fun main() {
 cities("Nairobi","Mombasa","Nakuru","Kisumu")
    cities()
    number()
    var x=identity(arrayOf("lavyne","Owiti","Epuu"))
    println(x)
    var y =multiply(45, 89, 23,22, 87)
    println(y.contentToString())
    var w= sum(8, 65.86,74.98, 43.77,)
    println(w.contentToString())
    var b=sums(arrayOf(1,2,3,4))
    println()
    var b=sumIntergers(arrayOf(5,8,9,8,"water",7))
    println(x)
}


fun cities(city1:String,city2:String,city3:String,city4:String){
    var cities=arrayOf(city1,city2,city3,city4)
    println(cities.contentToString())

}
fun cities() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.forEach { capital ->
        println(capital.capitalize())
    }
}
fun number(){
    var number= arrayOf(32, 17, 4,213,78,43,90,31,3,73,11,158,62)
    var sum=number[2]+number[4]
    println(sum)

    println(number.indexOf (158))

    var sortednumber=number.sortedArray()
    println(sortednumber.contentToString())
    
}
fun identity(name:Array<String>):String{
    var name=name.contentToString()
    return name
}
fun multiply(num1:Int, num2:Int, num3:Int, num4:Int, num5:Int):Array<Int>{
    var x=arrayOf(num1*num2*num3*num4*num5)
    return x
}

fun sum (nu1:Int, nu3:Double, nu4:Double, nu5:Double):Array<Double> {
    var z = arrayOf(nu1 + nu3 + nu4 + nu5)
    return z

}
fun sums(numbers:Array<Int>):Int{
    var sum=0
    numbers.forEach{ x->
        sum+=x
    }
return sum
}
 fun sentence(name:Array<String>):String {
     var w = " "
     w.forEach { word->
         w+=word+" "

     }
     return

 }
fun sumIntergers(mixedArr: Array<Any>):Int{
var sum =0
mixedArr.forEach {b->
    if(num is Int) {
        sum =+=b
    }
}
}
