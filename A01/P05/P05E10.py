# P05E10
# Escribe un programa que pida la altura de un triángulo y lo dibuje de la siguiente manera:
altura = int(input("Altura del triangulo: "))

espacio = altura - 1
for i in range(altura):
    for j in range(0, espacio):
        print(" ", end='')
    for j in range(0, i*2+1):
        print("*", end='')
    print("")
    espacio -= 1
