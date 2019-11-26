# P05E08:
# Escribe un programa que pida la anchura de un triángulo y lo dibuje de la siguiente manera:
altura = int(input("Altura del triangulo: "))

for i in range(altura + 1):
    for j in range(0, i):
        print("*", end='')
    print("")
for i in range(altura - 1, 0, -1):
    for j in range(0, i):
        print("*", end='')
    print("")
