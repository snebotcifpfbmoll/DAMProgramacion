# P06E01:
# Escribe un programa que te pida palabras y las guarde en una lista. Para terminar de introducir palabras, simplemente pulsa Enter. El programa termina escribiendo la lista de palabras.
palabra = input("Escribe una palabra: ")
lista = []

while palabra != "":
    lista += [palabra]
    palabra = input("Escribe otra palabra: ")

print("Has escrito: ", lista)
