/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package account

import greeter.Greeter
import profile.Profile

class AccountApp {
    val greeting: String
        get() {
            val profile = Profile().getCurrentProfile()
            return "Hi, $profile. ${Greeter().getGreeting()}"
        }
}

fun main(args: Array<String>) {
    println("[account-service]: ${AccountApp().greeting}")
}
