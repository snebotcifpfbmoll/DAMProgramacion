# P06E03:
# Escribe un programa que pida notas y los guarde en una lista. Para terminar de introducir notas, escribe una nota que no esté entre 0 y 10. El programa termina escribiendo la lista de notas.
nota = float(input("Escribe una nota: "))
lista = []

if nota > 0 and nota <= 10:
    while nota > 0 and nota <= 10:
        lista += [nota]
        nota = float(input("Escribe otra nota: "))
    
    print("Las notas son: ", lista)
else:
    print("Las notas solo pueden ser de 0 a 10.")


