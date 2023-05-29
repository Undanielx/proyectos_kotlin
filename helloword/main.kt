// primer programa en kotlin
fun main() {
    // un valor es un valor inmutable (no cambia)
    val veces = 35;
    val border = "/";
    printBorder(1, 30);
    println("Hello mundo kotlin");
    printBorder(2, 30);
    println();
    println("En este programa, el caracter de border es: ${border}");//las llaves despues del signo de pesos son para separa cuando existe operaciones
    println("Y se repite ${veces} veces");
    
}

// fun printBorder(numero: Int, caracter: String)
// {
//     repeat(numero) 
//     {  
//        print(caracter);  
//     }
//     println();
// }

fun printBorder(tipoCaracter : Int, numero : Int)
{
    when(tipoCaracter)
    {
        1->{
            repeat(numero){
            print('-');
            }
        }
        
        2->{
            repeat(numero){
            print('&');
            }
        }
        
        3->{
            repeat(numero){
            print('?');
            }
        }
        else ->
        print("Tipo de caracter no valido, no se imprime el border");
    }
    println();
}