package helper
import startSuitWithCom

class Playagain {
    fun play() {
        lateinit var yes: String

        do {
            println("===============================================")
            println("Apakah Anda ingin melanjutkan permainan? yes/no")
            yes = readLine().toString()
            if (yes == "yes") {
                return startSuitWithCom()
            }
            else (yes != "yes")
                break

        } while(yes!="yes")
    }
}

