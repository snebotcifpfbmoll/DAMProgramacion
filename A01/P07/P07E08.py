# P07E08:
# Escribe un programa que pida una frase, y pase la frase como parámetro a una función que debe eliminar los espacios en blanco (compactar la frase). El programa principal imprimirá por pantalla el resultado final.
def eliminarEspacios(frase):
    ret = ""
    for i in frase:
        if i != " ":
            ret += i
    return ret

frase = input("Escribe una frase: ")
final = eliminarEspacios(frase)
print("Frase compactada: %s" % (final))
