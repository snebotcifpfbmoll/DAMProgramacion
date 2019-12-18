# P06E10:
# Escribe un programa que te pida los nombres y notas de alumnos. Si escribes una nota fuera del intervalo de 0 a 10, el programa entenderá que no quieres introducir más notas de este alumno. Si no escribes el nombre, el programa entenderá que no quieres introducir más alumnos. Nota: La lista en la que se guardan los nombres y notas es [[nombre1, nota1, nota2, etc], [nombre2, nota1, nota2, etc], [nom3, nota1, nota2, etc], etc]
lista = []
nombre = " "

while nombre != "":
    nombre = input("Escribe un nombre: ")
    nota = 0
    notas = []
    while nota >= 0 and nota <= 10 and nombre != "":
        nota = int(input("Escribe una nota: "))
        notas.append(nota)
    if len(notas) > 0:
        del notas[-1]
    notas.insert(0, nombre)
    lista.append(notas)

if len(lista) > 0:
    del lista[-1]

print("Nombres y notas: ", lista)
