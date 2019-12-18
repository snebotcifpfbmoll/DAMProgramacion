# P07E05:
# Escribe un programa que te pida una frase y una vocal, y pase estos datos como parámetro a una función que se encargará de cambiar todas las vocales de la frase por la vocal seleccionada. Devolverá la función la frase modificada, y el programa principal la imprimirá:
def cambiarVocales(frase, vocal):
    ret = ""
    for i in frase:
        char = ''
        if i == 'a' or i == 'e' or i == 'i' or i == 'o' or i == 'u':
            char = vocal 
        else:
            char = i
        ret += char
    return ret

frase = input("Escribe una frase: ")
vocal = input("Vocal: ")
final = cambiarVocales(frase, vocal)
print("Frase final: %s" % (final))
