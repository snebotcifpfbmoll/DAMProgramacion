# P04E05: Serafi Nebot Ginard
# Pida al usuario un importe en euros y diga si el cajero automático le 	puede dar dicho importe utilizando el mismo billete y el más grande 	(recuerda que el billete puede ser de 500, 200, 100, 50, 20, 10 y 5 	€).
cantidad = int(input("Introduzca la cantidad: "))

if cantidad % 500 == 0:
    print("El cajero te devuelve", int(cantidad / 500), "billetes de 500€")
elif cantidad % 200 == 0:
    print("El cajero te devuelve", int(cantidad / 200), "billetes de 200€")
elif cantidad % 100 == 0:
    print("El cajero te devuelve", int(cantidad / 100), "billetes de 100€")
elif cantidad % 50 == 0:
    print("El cajero te devuelve", int(cantidad / 50), "billetes de 50€")
elif cantidad % 20 == 0:
    print("El cajero te devuelve", int(cantidad / 20), "billetes de 20€")
elif cantidad % 10 == 0:
    print("El cajero te devuelve", int(cantidad / 10), "billetes de 10€")
elif cantidad % 5 == 0:
    print("El cajero te devuelve", int(cantidad / 5), "billetes de 5€")
else:
    print("ERROR: El cajero no le puede devolver el dinero.")
