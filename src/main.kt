fun main(){
    var f=haha("Benadate", 20)
    println(f)
    var p=assign("good")
    println(p)
 myWork("Benadate")
    word("akirachix")




}
fun word(set:String){
    var stmnt = "akirachix"
    var a = stmnt[0]
    var b = stmnt[2]
    var c = stmnt[3]
var good = "$a$b$c"
    println(good)
}


//println(result)
  //  var x ="Hi, my name is Benadate and"
    //var y ="iam twenty years old."



fun haha(name:String, age:Int):String{
    var word="Hi, my name is $name and i'm $age years old"
    return word
}
fun assign(word:String):Int{
    var apple="word".length
    return apple

}


fun myWork(name:String){
    var me=("Benadate")
    var me2=("Able")
    if (me==me2)
        println("That's me!")
    else{
        println("I don't know who that is")
    }
}







