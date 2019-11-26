# P06E02:
# Escribe un programa que te pida números y los guarde en una lista. Para terminar de introducir número, simplemente escribe “Salir”. El programa termina escribiendo la lista de números.
num = input("Escribe un numero: ")
lista = []

while num != "Salir":
    lista += [int(num)]
    num = input("Escribe otro numero: ")

print("Has escrito: ", lista)
