/*
peter keres
2-28-2019
part of phase 3 for programming lang class. this is program 1, the number guessing game

 */


fun main(args: Array<String>) {
    println("hello everyone and welcome to the number guessing game.")
    println("Pick a number between 1 and 100 and ill will try to guess it.")
    println("just let me know if my number is higher, lower, or is your number.\n")

    var numberRange = arrayOf<Int>(0,100)
    var numberGuess = (numberRange[1] - numberRange[0]) / 2
    var stillPlaying = true


    while( stillPlaying )
    {
        println("\nis your number ${numberGuess} ?")
        println("[CHOICES: higher, lower, yes]")
        print("--> ")

        var user = readLine()!!
        user = user.toUpperCase()

        numberGuess = when (user) {
                        "HIGH","HIGHER"  -> {
                            numberRange[0] = numberGuess
                            numberRange[0] + ((numberRange[1] - numberRange[0]) / 2)
                        }
                        "LOW","LOWER"    ->  {
                            numberRange[1] = numberGuess
                            numberRange[0] + ((numberRange[1] - numberRange[0]) / 2)
                        }
                        "YES"           ->{
                            println("YES!! I guessed it right, i knew i would find it sooner or later :)!")
                            stillPlaying = false
                            0
                        }
                        else            -> {
                            println("Please enter higher, lower, or yes")
                            numberGuess
                        }
        }   
    }

    println("\n\nThanks for playing!")
} 