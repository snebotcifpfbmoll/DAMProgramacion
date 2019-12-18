# P05E05:
# Escribe un programa que pida la altura y ancho de un rectángulo y lo dibuje de la siguiente manera:
base = int(input("Escribe la base de un rectangulo: "))
altura = int(input("Escribe la altura de un rectangulo: "))

for i in range(altura):
    for j in range(base):
        print("*", end='')
    print("")
