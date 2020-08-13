fun main() {
    val panjang ="20"
    val lebar = 12.6
    val tinggi = 10
    val volume : Double
    //To Do
    val p = panjang.toDouble()
    val l = lebar.toDouble()
    val t = tinggi.toDouble()

    print("Volume dari balok yang mempunyai panjang $panjang, lebar $lebar, dan tinggi $tinggi ini adalah ${hitungVolume(p, l, t)}")
}
fun hitungVolume(p : Double, l : Double, t : Double) : Float
{
    val v = p * l * t
    //To Do
    return v.toFloat()
}