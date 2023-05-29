fun main(){
    val a= 10;//inmutable
    val b= 5;//inmutable
    var c = 0;//mutable (su valor va a cambiar)

    println("Operadores: ");

    //Suma 
    println("Suma: ");
    c =a+b;
    //c =a.plus(b);
    println("$c = $a + $b");

    //Resta
    println("Resta: ");
    //c =a-b;
    c =a.minus(b);
    println("$c = $a - $b");


    //Comparaciones
    println("Comparaciones: ");
    println(a.compareTo(b)>0);
    println("$a > $b = " + (a>b));
    
    println("Comparaciones parte 2: ");
    println("a > b :");
    println(a.compareTo(b)>0);

    println("b < a :");
    println(b.compareTo(a)<0);
    
    println("a < b :");
    println(a.compareTo(b)<0);


    //a==b
    println("son iguales:");
    println("a == b");
    println(a.equals(b));

    //a!=b
    println("son desiguales:");
    println("a != b");
    println(!(a.equals(b)));
}