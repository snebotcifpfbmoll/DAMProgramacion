# P05E09:
# Escribe un programa que pida la anchura y la altura de un rectángulo y lo dibuje de la siguiente manera:
altura = int(input("Altura de un rectangulo: "))
anchura = int(input("Anchura de un rectangulo: "))

for i in range(altura):
    for j in range(anchura):
        if j == 0 or j == anchura - 1 or i == 0 or i == altura - 1:
            print("*", end='')
        else:
            print(" ", end='')
    print("")
