# P07E12:
# Escribe un programa que te pida una frase, y pase la frase como parámetro a una función. Ésta debe devolver si es palíndroma o no , y el programa principal escribirá el resultado por pantalla:
# Asumir que cada palabra está separada por un solo blanco.
# No se sabe cómo están separadas las palabras. Pueden estar separadas por más de un blanco o por signos de puntuación.
def comprobarEspacio(palabra):
    for i in palabra:
        if i != " ":
            return True
    return False

def customSplit(frase):
    ret = []
    current_word = ""
    for i in frase:
        if i == " " and current_word != "" and comprobarEspacio(current_word):
            ret.append(current_word)
            current_word = ""
        else:
            current_word += i
    if current_word != "" and comprobarEspacio(current_word):
        ret.append(current_word)
    return ret

def contarPalabras(frase, custom=True):
    if custom:
        return len(customSplit(frase))
    else:
        return len(frase.split(" "))

frase = input("Escribe una frase: ")
count = contarPalabras(frase)
print("El numero de palabras es: %d" % (count))

