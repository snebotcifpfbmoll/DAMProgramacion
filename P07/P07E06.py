# P07E06:
# Escribe un programa que lea el nombre de una persona y un carácter, le pase estos datos a una función que comprobará si dicho carácter está en su nombre. El resultado de dicha función lo imprimirá el programa principal por pantalla.
def comprobarCaracter(string, char):
    resultado = False
    for i in string:
        if char == i:
            resultado = True
            break;
    return resultado

nombre = input("Dime tu nombre: ")
char = input("Dime un caracter: ")
esta_en_nombre = comprobarCaracter(nombre, char)
if esta_en_nombre:
    print("El caracter %s esta en tu nombre." % (char))
else:
    print("El caracter %s no esta en tu nombre." % (char))
