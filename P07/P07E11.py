# P07E11:
# Escribe un programa que te pida una frase, y pase la frase como parámetro a una función. Ésta debe devolver si es palíndroma o no , y el programa principal escribirá el resultado por pantalla:

# Nota: El programa no tiene en cuenta si la frase contiene acentos.
def comprobarPalindromo(frase):
    frase = frase.lower()
    reverse = ""
    for i in range(len(frase) - 1, -1, -1):
        reverse += frase[i]
    return reverse == frase

def juntarPalabras(frase):
    ret = ""
    for i in frase:
        if i != " " and i != "," and i != ".":
            ret += i
    return ret

frase = input("Dime una frase (sin acentos): ")
if comprobarPalindromo(juntarPalabras(frase)):
    print("La frase %s es palíndroma." % (frase))
else:
    print("La frase %s no es palíndroma." % (frase))
