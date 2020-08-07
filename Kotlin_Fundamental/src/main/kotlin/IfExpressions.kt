fun main() {
    val nilaiku =70
    val text = "Nilai kamu "
    val school : String
    school = if (nilaiku >= 75) {
        ", selamat ya!"
    } else {
        ", silahkan ikuti remidial."
    }
    print( text + nilaiku + school)
}
