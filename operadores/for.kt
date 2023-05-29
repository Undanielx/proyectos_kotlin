fun main(){
    println("Valores de i: ");
    for(i in 1..10)
{
    println(i);
}


   
    println();
    println("Letras: ");
    for(caracter in 'a'..'g' step 2)
    {
        println(caracter);
    }

    println();
    println("Letras en reversa: ");
    for(caracter in 'g' downTo 'a' )
    {
        println(caracter);
    }


    //recorriendo for con un arreglo
    val mascotas = arrayOf("Ginger","Blackie","Nicky","Moka","Moji");
    println();
    println("Mascotas: ");
    for(i in mascotas.indices)
    {
        println("[$i, ${mascotas[i]}]");
    }

    println();
    println("Dividiendo un String en Caracteres: ");
    for(letra in "--Hola Mundo Kotlin--")
    {
        println(letra);
    }
    
}