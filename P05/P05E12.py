# P05E12:
# Escribe un programa que pida un número y escriba si primo o no
num = int(input("Escribe un numero: "))

numero_primo = True
for i in range(2, num):
    if num % i == 0:
        numero_primo = False

if numero_primo:
    print("El numero", num, "es primo.")
else:
    print("El numero", num, "no es primo.")
