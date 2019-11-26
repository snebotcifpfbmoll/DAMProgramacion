# P04E03: Serafi Nebot Ginard
# Pida al usuario si quiere calcular el área de un triángulo o un cuadrado, y pida los datos según que caso y muestre el resultado
opcion = input("Elija que quire calcular. Cuadrado o triangulo? (C/T): ")
if opcion == "C" or opcion == "c":
    costado_1 = float(input("Introduzca el valor del costado 1: "))
    costado_2 = float(input("Introduzca el valor del costado 2: "))
    area = costado_1 * costado_2
    print("El area del cuadrado es de", area) 
elif opcion == "T" or opcion == "t":
    base = float(input("Introduzca la base: "))
    altura = float(input("Introduzca la altura: "))
    area = (base * altura) / 2
    print("El area del triangulo es de", area) 
else:
    print("ERROR: La opcion", opcion, "no se reconoce.")
