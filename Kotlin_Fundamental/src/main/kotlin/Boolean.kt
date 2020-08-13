fun main(){
    val nilaiku = 80
    val hasil : Char

    hasil = if (nilaiku > 90){
        'A' 
    }else if (nilaiku > 80 && nilaiku <= 90){
        'B'
    }else if (nilaiku > 70 && nilaiku <= 80){
        'C'
    }else if (nilaiku > 60 && nilaiku <= 70){
        'D'
    }else{
        'E'
    }
    print ("Nilai $nilaiku = $hasil")
}