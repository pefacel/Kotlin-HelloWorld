 
data class Author(
    val name: String,
    val lastName: String,
    val outstandingWorks: List<String>? ,
    val birthdate: Int,
    val dateOfDeath: Int?,
    val comments: List<String>?,
)


fun calculateAge(birthdate: Int,dateOfDeath: Int):Int {
    return dateOfDeath - birthdate
}

fun Author.isDead(author:Author){

if(author.dateOfDeath != null){
    val age = calculateAge(author.birthdate , author.dateOfDeath);
    println("+ Año de muerte:${author.dateOfDeath}, murió a los ${age} años de edad +")
}

}

 
fun main() {
    val list = listOf("The Call of Cthulhu", "Ibid")

val lovecraft:Author = Author("Howard Phillips","Lovecraft", list,1917,1982,null )

    var calculateAge = calculateAge(1917,1937)
    println("++++++++++++++++++++++++++++++++++++++++++++++++++++")
    println("+ Nombre del autor: ${lovecraft.name} ${lovecraft.lastName} +")
    println("+ Obras destacadas: ${lovecraft.outstandingWorks} +")
    println("+ Año de nacimiento: ${lovecraft.birthdate} +")
    lovecraft.isDead(lovecraft)
    if(lovecraft.comments != null){     println("+ Comentarios: ${lovecraft.outstandingWorks} +")}
    println("++++++++++++++++++++++++++++++++++++++++++++++++++++")
}