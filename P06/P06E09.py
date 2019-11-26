#P06E09:
# Escribe un programa que te pida nombres de personas y sus números de teléfono. Para terminar debe pulsar “S” cuando te pida el nombre. El programa termina escribiendo nombres y números de teléfono. Nota: La lista en la que se guardan los nombres y números de teléfono es [[nombre1, telef1], [nombre2, telef2], [nom3, telef3], etc], es decir, lista de listas.
lista = []
nombre = ""

while nombre != "S":
    nombre = input("Escribe un nombre: ")
    telf = input("Escribe el telefono: ")
    lista.append([nombre, telf])
del lista[-1]
print("Lista guardada: ")

for i in range(0, len(lista)):
    print(lista[i][0], ":", lista[i][1])
