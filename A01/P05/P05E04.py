# P05E04:
# Escribe un programa que pida un número y calcule su factorial.
num = int(input("Escribe un numero: "))

total = 1
for i in range(1, num + 1):
    total *= i
print("El factorial de", num, "es:", total)
