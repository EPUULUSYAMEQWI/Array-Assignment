fun main() {
 cities("Nairobi","Mombasa","Nakuru","Kisumu")
    cities()
    number()
    var x=identity(arrayOf("lavyne","Owiti","Epuu"))
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
    var sum=number[2]+number[5]
    println(sum)

    println(number.indexOf (158))

    var sortednumber=number.sortedArray()
    println(sortednumber.contentToString())
    
}
fun identity(name:Array<String>):String{
    var name=name.contentToString()
    return name
}