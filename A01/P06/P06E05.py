# P06E05:
# Escribe un programa que te pida números cada vez más grandes y que se guarden en una lista. Para acabar de escribir los números, escribe un número que no sea mayor que el anterior. El programa termina escribiendo la lista de números:
num = int(input("Escribe un numero: "))
lista = [num]
num = int(input("Escribe un numero mayor que %d: " % (num)))

index = 0
while num > lista[index]:
    lista += [num]
    index += 1
    num = int(input("Escribe un numero mayor que %d: " % (num)))

print("Los numeros que has escrito son: ", end="")

for i in range(0, len(lista)):
    print(lista[i], end="")
    if i < len(lista) - 1 :
        print(end=", ")

print("")
