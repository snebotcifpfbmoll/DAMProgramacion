# P05E07:
# Escribe un programa que pida la altura de un triángulo y lo dibuje de la siguiente manera:
altura = int(input("Altura del triangulo: "))

for i in range(altura, 0, -1):
    for j in range(0, i):
        print("*", end='')
    print("")
