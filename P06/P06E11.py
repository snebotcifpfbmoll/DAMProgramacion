# P06E11:
# Escribir un programa para jugar a adivinar un número (el ordenador "piensa" el número y el usuario lo ha de adivinar). El programa empieza pidiendo entre qué números está el número a adivinar, se "inventa" un número al azar y luego el usuario va probando valores. El programa va decidiendo si son demasiado grandes o pequeños. pista:
import time
import random

random.seed = (time.time())
minimo = int(input("Valor minimo: "))
maximo = int(input("Valor maximo: "))
secret = random.randint(minimo, maximo)

print("Adivina un numero entre %d i %d." % (minimo, maximo))
num = None
num_intentos = 0

while num != secret:
    num = int(input("Escribe un numero: "))
    if num > secret:
        print("Demasiado grande!")
    else:
        print("Demasiado pequeño!")
    num_intentos += 1

print("Correcto! Lo has intentado %d veces." % (num_intentos))
