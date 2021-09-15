import elements.parent.Suit


open class Validator {
    open fun validasi(input:String) : Boolean {
        return if (input!= "batu" && input!= "kertas" && input != "gunting"){
            false
        } else {
            true
        }
    }

}