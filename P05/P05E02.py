# P05E02: Serafi Nebot Ginard
# Escribe un programa que pida dos números y escriba qué números entre ese par de números son pares y cuáles impares
num_1 = int(input("Escribe un numero: "))
num_2 = int(input("Ahora escribe otro numero mayor: "))

for i in range(num_1, num_2 + 1):
    if i % 2 == 0:
        print("El numero", i, "es par.")
    else:
        print("El numero", i, "no es par.")
