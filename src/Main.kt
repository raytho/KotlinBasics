fun main(args: Array<String>)
{
    var activarMenu = false

    mostrarMenu()

    val response:String? = readLine()
    do {
        when(response){
            "1"-> {
                crearReceta()
                activarMenu = true
            }
            "2"-> {
                println("No hay recetas guardadas")
                mostrarMenu()
            }
            "3" -> println("Adios")
        }
    }while (activarMenu)
}

fun crearReceta() {
    val listRecipes = listOf<String>("Agua", "Leche", "Carne", "Verduras",
            "Frutas", "Cereal",
            "Huevos", "Aceite")
    println("Elige entre los ingredientes:")
    for ((index,value) in listRecipes.withIndex()){
        println("${index.plus(1)}: $value")
    }
    println("Presiona 9 para salir al menu")

    val recipe:String? = readLine()

    when(recipe){
        "1"-> println("Agregaste ${listRecipes[0]}")
        "2"-> println("Agregaste ${listRecipes[1]}")
        "3"-> println("Agregaste ${listRecipes[2]}")
        "4"-> println("Agregaste ${listRecipes[3]}")
        "5"-> println("Agregaste ${listRecipes[4]}")
        "6"-> println("Agregaste ${listRecipes[7]}")
        "9" -> mostrarMenu()
        else -> println("Opción no valida")
    }
}

fun mostrarMenu() {
    println(""":: Bienvenido a Recipe maker ::
    Selecciona una la opción deseada
    1. Hacer una receta
    2. Ver mis recetas
    3. Salir""")
}

