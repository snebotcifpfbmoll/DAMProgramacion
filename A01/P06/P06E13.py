# P06E13:
# Desarrolla de nuevo el ejercicio de la práctica anterior de los números primos, con while. Reflexiona y escribe en el propio programa en forma de comentario, qué opción es mejor y por qué.
num = int(input("Escribe un numero: "))

numero_primo = True
indice = num - 1
while indice > 1:
    if num % indice == 0:
        numero_primo = False
    indice -= 1

if numero_primo == True:
    print("El numero", num, "es primo.")
else:
    print("El numero", num, "no es primo.")

# Reflexion:
# Es mejor utilizar un bucle for proque te permite declarar un indice (lo qual es necesario, segun mi solucion) dentro de la declaracion. Mientras que while necesitas hacerlo fuera del bucle. Para mi es mucho mas facil leer o escribir un bucle for.
