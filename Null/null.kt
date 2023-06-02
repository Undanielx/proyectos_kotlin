 fun main() {
  var nombre : String?; 
  nombre = null;
  println("Imprimiendo el valor nulo de nombre: ");
  println(nombre);
 nombre = "Ginger";
//  // println(nombre.length);
//   var longitud = nombre?.length ?: 0;
//   println("Longitud de nombre: ");
//  println(longitud);

 try{
    println("nombre: $nombre");
 }catch(exception : NullPointerException){
    println("Ha ocurrido un error");
    println(exception);
 }finally{
    println("Lo que este en finally, se ejecuta siempre");
 }

 println("________________ TRY _______________");
var longitud = -1;
 try{
    longitud = nombre.length;
 }catch(error : NullPointerException){
    //hubo un error, no se puede obtener la longitud del momento
    longitud = 0;
 }finally{
    println("Valor de longitud: $longitud")
 }



} 