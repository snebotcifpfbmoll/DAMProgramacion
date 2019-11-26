# P06E08:
# Escribe un programa que te pida primero un número y luego te pida números hasta que la suma de los números introducidos coincida con el número inicial. El programa termina escribiendo la lista de números.
limite = int(input("Escribe el limite: "))
lista = []
suma = 0

while suma != limite and suma <= limite:
    num = int(input("Escribe un valor: "))
    while suma + num > limite:
        num = int(input("El valor es %d demasiado grande. Escribe otro valor: " % (num)))
    suma += num
    lista.append(num)
print("El limite es", limite, ". La lista creada es: ", end="")

for i in range(0, len(lista)):
    print(lista[i], end="")
    if i < len(lista) - 1 :
        print(end=", ")

print("")
