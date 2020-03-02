/*
peter keres
2-28-2019
part of phase 3 for programming lang class. this is program 1, the number guessing game
 */


fun main(args: Array<String>) {

    // gretting the user and explaing the rules
    println("hello everyone and welcome to the number guessing game.")
    println("Pick a number between 1 and 100 and ill will try to guess it.")
    println("just let me know if my number is higher, lower, or is your number.\n")

    //setting up values we need to keep track of
    var numberRange = arrayOf<Int>(0,100)
    var numberGuess = (numberRange[1] - numberRange[0]) / 2
    var stillPlaying = true

    // we keep doing the following untill the computer guesses the user's number
    while( stillPlaying )
    {
        // display the guess and get the responce from the user
        println("\nis your number ${numberGuess} ?")
        println("[CHOICES: higher, lower, yes]")
        print("--> ")

        // getting the input from the user and forcing it to be all upper case
        var user = readLine()!!
        user = user.toUpperCase()

        // figuring out what the guess should be based on the users input
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
                            -1
                        }
                        else            -> {
                            println("Please enter higher, lower, or yes")
                            numberGuess
                        }
        }   
    }

    // telling the user bye bye!
    println("\n\nThanks for playing!")
} 