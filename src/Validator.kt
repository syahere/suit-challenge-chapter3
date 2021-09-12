import elements.parent.Suit


open class Validator {
    open fun validasi(input:String) : Boolean {
        return if (input!= "batu" && input!= "kertas" && input != "gunting"){
            println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
            println("Pilihan yang anda masukkan salah, silahkan input ulang")
            print("")
            false
        } else {
            true
        }
    }

}