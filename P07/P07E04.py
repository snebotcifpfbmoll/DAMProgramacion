# P07E04:
# Escribe un programa que pida una frase, y le pase como parámetro a una función dicha frase. La función debe sustituir todos los espacios en blanco de una frase por un asterisco, y devolver el resultado para que el programa principal la imprima por pantalla.
def cambiarEspacios(frase):
    ret = ""
    for i in frase:
        char = ''
        if i == " ":
            char = '*'
        else:
            char = i
        ret += char
    return ret

frase = input("Escribe una frase: ")
final = cambiarEspacios(frase)
print("Frase final: %s" % (final))
