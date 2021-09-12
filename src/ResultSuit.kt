
class ResultSuit(val status: String) {
    companion object {
        const val WIN: String = "YOU WIN"
        const val LOSE: String = "YOU LOSE"
        const val DRAW: String = "DRAW"
        //penambahan result status untuk element other
        const val ERROR: String = "INPUT ERROR"
    }
}