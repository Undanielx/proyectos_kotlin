//lsitas
fun main() {
    
    //lista inmutable
    println("________________________________________________________________________");
    val readOnly : List<String> = listOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo");
    println(readOnly);
    println("Tamaño de la lista: ${readOnly.size}");
    println("Elemento en la posicion 3: ${readOnly.get(3)}");
    println("Primer elemento en la lista: ${readOnly.first()}");
    println("Ultimo elemento en la lista: ${readOnly.last()}");

    //mostrar los elementos de lista 
    println("________________________________________________________________________");
    println("Elementos de readOnly");
    for (elemento in readOnly) {
        println(elemento);
    }

    //mostrar los elementos de la lista usando el metodo foreach
    println("________________________________________________________________________");
    println("Elementos de readOnly usando forEach: ");
    readOnly.forEach{println(it)};

    //Lista mutable
   println("________________________________________________________________________");
   var mutableList : MutableList<String> = mutableListOf("Lunes","Martes");
   println("Lista mutable: $mutableList");
   mutableList.add("miercoles");
   println("Lista Mutable: $mutableList");

   //Lista vacia
   println("________________________________________________________________________");
   var emptyList : MutableList<String> = mutableListOf();
   println("¿La lista esta vacia? ${emptyList.none()}");
   println("Primer Elemento de emptyList: ${emptyList.firstOrNull()}");
   println("Ultimo Elemento de emptyList: ${emptyList.lastOrNull()}");
   println("Elemento en la posicion 2 de emptyList: ${emptyList.elementAtOrNull(2)}");

   //Agregando elemnetos a emptyList

   println("________________________________________________________________________");
   readOnly.forEach{
    emptyList.add(it);
   }
   println("La lista que estaba vacia: $emptyList");
   println("¿La lista esta vacia? ${emptyList.none()}");
   println("Primer Elemento de emptyList: ${emptyList.firstOrNull()}");
   println("Ultimo Elemento de emptyList: ${emptyList.lastOrNull()}");
   println("Elemento en la posicion 2 de emptyList: ${emptyList.elementAtOrNull(2)}");

   //ordenar listas 
   println("________________________________________________________________________");
   val numerosDeLoteria = listOf(11,2,44,33,56,78,66);
   println("Numeros de loteria: $numerosDeLoteria");
   val numeroOrdenados = numerosDeLoteria.sorted();
   println("numeros ordenados: $numeroOrdenados");
   val numerosDescendentes = numerosDeLoteria.sortedDescending();
   println("numeros de loteria descendentes: $numerosDescendentes");
   val numerosPares = numerosDeLoteria.filter{num -> num % 2 ==0};
   println("Numeros Pares: $numerosPares")


}