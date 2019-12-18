# Serafi Nebot Ginard - Examen 1º Evaluacion

# Variable constante para el menu
ANCHURA = 50

# Variables globales
diccionario = {}

def anadirTraduccion(lista):
    traducciones = [lista]
    if "," in lista:
        traducciones = lista.split(",")
    for i in traducciones:
        if ":" in i:
            traduccion = i.split(":")
            global diccionario
            if traduccion[0] in diccionario:
                print("Ojo!! La palabra %s no ha sido añadida al traductor, ya que existe actualmente con la traducción: %s" % (traduccion[0], traduccion[1]))
            else:
                diccionario[traduccion[0]] = traduccion[1]
                print("La palabra %s ha sido añadida al diccionario." % (traduccion[0]))
        else:
            print("[Error] Formato de '%s' no es correcto." % (i))

def separarPalabras(frase):
    result = []
    palabra = ""
    for i in frase:
        if i == " " or i == "." or i == ",":
            result += [palabra]
            palabra = ""
        else:
            palabra += i
    result += [palabra]
    return result

def traducirFrase(frase):
    global diccionario
    result = ""
    for i in separarPalabras(frase):
        palabra = i
        if palabra in diccionario:
            palabra = diccionario[palabra]
        result += "%s " % (palabra)
    return result

def menu():
    print("="*ANCHURA)
    print("TRADUCTOR CASTELLANO-INGLÉS".center(ANCHURA))
    print("="*ANCHURA)
    print("\t1) Introducir palabras.")
    print("\t2) Traducir texto.")
    print("\t3) Salir.")
    return int(input("¿Qué opción deseas? "))

# Programa Principal
opcion = menu()
while opcion != 3:
    if opcion == 1:
        palabras = input("Introduce la lista de palabras en formato palabra:traduccion separado por comas: ")
        anadirTraduccion(palabras)
    elif opcion == 2:
        frase = input("Introduce el texto que quieres traducir: ")
        traduccion = traducirFrase(frase)
        print(traduccion)
    opcion = menu()
