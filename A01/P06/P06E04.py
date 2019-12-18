# P06E04:
# Escribe un programa que te pida dos números, de manera que el segundo sea mayor que el primero. El programa termina escribiendo los dos números tal y como se pide.
num_1 = int(input("Escribe un numero: "))
num_2 = int(input("Escribe otro numero mayor que %d: " % (num_1)))

while num_1 >= num_2:
    num_2 = int(input("%d no es mayor que %d; Escribe otro numero: " % (num_2, num_1)))

print("Los numeros son", num_1, "y", num_2)
