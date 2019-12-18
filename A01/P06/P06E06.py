# P06E06:
# Escribe un programa que pida primero dos números (máximo y mínimo) y que después te pida números intermedios. Para terminar de escribir números, escribe un número que no esté comprendido entre los dos valores iniciales. El programa termina escribiendo la lista de números.
num_1 = int(input("Escribe un numero: "))
lista = [num_1]
num_2 = int(input("Escribe un numero mayor que %d: " % (num_1)))
lista += [num_2]

while num_1 > num_2:
    num_2 = int(input("%d no es mayor que %d. Escribe un numero mayor que %d: " % (num_2, num_1, num_1)))

num = int(input("Escribe un numero entre %d y %d: " % (num_1, num_2)))
while num >= num_1 and num <= num_2:
    lista += [num]
    num = int(input("Escribe un numero entre %d y %d: " % (num_1, num_2)))

print("Los numeros que has escrito son: ", end="")

for i in range(0, len(lista)):
    print(lista[i], end="")
    if i < len(lista) - 1 :
        print(end=", ")

print("")
