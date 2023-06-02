//Trabajando mapas
fun main() {
      //Mapa Inmutable
      val ladas : Map<Int, String> = mapOf(1 to "USA", 34 to "España", 52 to "Mexico", 233 to "Ghana");
      
      //imprimendo el conjunto clave-valor
      println(ladas);

     //imprimiendo el mapa usando lamda
     ladas.forEach{(k,v)-> println("$k -> $v")}; 
     //imprimiendo un conjunto usando un for
      for((key, value) in ladas){
        println("la lada de $value es $key");
      }
      
      //recupera un solo elemento del mapa
      println(ladas.get(52));
      println(ladas[52]);

      //recuperar su tamaño, cuantos pares hay en el elemento
      println("Tamaño: ${ladas.size}");
      //recuperar solo las claves
      println("Claves del mapa: ${ladas.keys}");
      //recuperar solamente los valores 
      println("valores del mapa: ${ladas.values}");
      //recuperar las entradas
      println("Entradas del mapa: ${ladas.entries}");
      //recuperar un valor si existe, sino, envia el default
      println("Valor de la lada 48: ${ladas.getOrDefault(48, "pais desconocido")}");
      //Comprobar si el mapa esta vacio
      println("Mapa vacio: ${ladas.isEmpty()}");
      //comprobar si existe una clave en el mapa
      println("Existe la clave lada 86: ${86 in ladas}");
      //comprobar si existe un valor en el mapa
      println("Existe el valor Mexico en el mapa:${ "Mexico" in ladas.values}");

      //Mapa mutable
      var nums=mutableMapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4);
      println("Mapa de numeros: $nums");


      //eliminar valores del mapa
      nums.remove("two");
      println("Mapa nuevo de numeros: $nums");
      
      //nuevo mapa
      var sortedNums = nums.toSortedMap();
      println("Mapa Ordenado: $sortedNums");

}