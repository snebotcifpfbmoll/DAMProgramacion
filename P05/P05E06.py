# P05E06:
# Escribe un programa que pida la altura de un triángulo y lo dibuje de la siguiente manera:
altura = int(input("Altura del triangulo: "))

for i in range(altura + 1):
    for j in range(0, i + 1):
        print("*", end='')
    print("")
