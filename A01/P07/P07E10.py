# P07E10:
# Escribe un programa que te pida una palabra o número, pase por parámetro estos datos a una función, y ésta te diga si es o no palíndroma o capicúa. El programa principal imprimirá el resultado de la función:
def comprobarCapicua(palabra):
    reverse = ""
    for i in range(len(palabra) - 1, -1, -1):
        reverse += palabra[i]
    return reverse == palabra

palabra = input("Dime una palabra: ")
if comprobarCapicua(palabra):
    print("La palabra %s es capicúa o palíndroma." % (palabra))
else:
    print("La palabra %s no es capicúa o palíndroma." % (palabra))
