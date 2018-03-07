/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */
	const val integral = "\u222B"
    const val greeting = "Hello"

fun main(args: Array<String>) {
    val sample1: Byte = 0x3A
    val sample2: Byte = 8
    val heartRate = 85
    val deposits = 135002796
    val acceleration = 9.800
    val mass = 14.6
    val distance: Double = 129.763001
    val lost = true
    val expensive = true
    val choice = 2
//     const val integral = "\u222B"
//     const val greeting = "Hello"
    var name = "Karen"
    
    if(sample1 == sample2){
        println("The samples are equal.")
    }
    else{
        println("The samples are not equal.")
    }
    
    if(heartRate >= 40 && heartRate <= 80){
        println("Heart rate is normal.")
    }
    else{
        println("Heart rate is not normal.")
    }
    
    if(deposits >= 100000000){
        println("You are exceedingly wealthy.")
    }
    else{
        println("Sorry you are so poor.")
    }
    
    var force = mass * acceleration
    
    println("force = $force")
    
    println("$distance is the distance.")
    
    println("I am really sorry! I will get the manager.")
    if(lost == true && expensive == true){
        println("Here is coupon for 10% off.")
    }
    
    when (choice) {
        1 -> println("You chose 1.")
        2 -> println("You chose 2.")
        3 -> println("You chose 3.")
        else ->{
            println("You made an unknown choice.")
        }
    }
    
   println("$integral is an integral")
    
    for(i in 5..10){
        println("i = $i")
    }
    
    var age = 0
    while(age < 6){
        println("age = $age")
        age++
    }
    
    println("$greeting $name")
    
}