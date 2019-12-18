# P06E07:
# Escribe un programa que pida un número (límite) y luego te pida números hasta que la suma de los números introducidos supere el límite inicial. El programa termina escribiendo la lista de números.
limite = int(input("Escribe el limite: "))
num = int(input("Escribe un valor: "))
suma = num

if suma <= limite:
    lista = [num]
    
    while suma <= limite:
        num = int(input("Escribe otro valor: "))
        lista += [num]
        suma += num
    print("El limite de la lista es", limite, ". La lista es ", end="")
    for i in range(0, len(lista)):
        print(lista[i], end="")
        if i < len(lista) - 1 :
            print(end=", ")
    
    print(" y la suma de ellos es %d." % (suma))
else:
    print("El valor es demasiado grande.")
