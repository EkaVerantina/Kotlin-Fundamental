fun main() {
    var wordOne = "Modern"
    var wordTwo = "Concise"
    var wordThree = "Pragmatic"

    val text = """
        Kotlin is $wordOne
        Kotlin is $wordTwo
        Kotlin is $wordThree
    """.trimIndent()

    print(text)
}