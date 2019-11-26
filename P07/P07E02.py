# P07E02:
# Escribe un programa que lea el nombre y los dos apellidos de una persona (en tres cadenas de caracteres diferentes), los pase como parámetros a una función, y ésta debe unirlos y devolver una única cadena. La cadena final la imprimirá el programa por pantalla.
def unirPalabras(lista):
    string = ""
    for i in lista:
        string += i
    return string

lista = []
lista += input("Nombre: ")
lista += input("Primer apellido: ")
lista += input("Segundo apellido: ")
nombre_unido = unirPalabras(lista)
print("Resultado: %s" % (nombre_unido))
