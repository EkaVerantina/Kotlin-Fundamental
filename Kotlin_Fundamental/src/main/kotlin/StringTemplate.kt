fun main() {
    val name = "Kotlin"
    val age = "4 tahun"
    val version = "1.3.70"

    val template = """
        Nama saya $name
        Saya berusia $age
        Saat ini saya sudah mencapai versi $version
    """.trimIndent()

    println(template)
}