# P05E03
# Escribe un programa que pida dos números y escriba la suma de enteros desde el primero hasta el último.
num_1 = int(input("Escribe un numero: "))
num_2 = int(input("Escribe otro numero mayor: "))

total = num_1
for i in range(num_1 + 1, num_2 + 1):
    total += i
print("La suma de", num_1, "hasta", num_2, "es de:", total)
