# P06E12:
# Escribir un programa para jugar a adivinar un número (el usuario piensa un número y el programa lo ha de adivinar). El programa empieza pidiendo entre qué números está el número a adivinar y luego intenta adivinar de qué número se trata. El usuario va diciendo si el número que ha dicho el programa es menor, mayor o igual al que se ha buscado.
import random

minimo = int(input("Introduce el valor minimo: "))
maximo = int(input("Introduce el valor maximo: "))

while minimo > maximo:
    print("%d es menor que %d." % (maximo, minimo))
    maximo = int(input("Escribe un valor mas grande que %d: " % (minimo)))

print("Piensa un numero entre %d y %d y lo voy a adivinar.\n" % (minimo, maximo))

resultado = ""
num_min = minimo
num_max = maximo

while resultado != "igual" and num_min != num_max:
    num = random.randint(num_min, num_max)
    resultado = input("Es %d? " % (num))
    
    if resultado == "mayor":
        num_min = num
        if num_min == num_max:
            print("El unico resultado posible es %d." % (num_min))
    elif resultado == "menor":
        num_max = num
        if num_min == num_max:
            print("El unico resultado posible es %d." % (num_max))
    elif resultado == "igual":
        print("Sabia que lo adivinaria!")
    else:
        print("Solo dime si es mayor, menor o igual.")

print("Gracias por jugar!")
