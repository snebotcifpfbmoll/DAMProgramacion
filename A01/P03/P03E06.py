# P03E06: Serafi Nebot Ginard
# Pida al usuario el precio de un producto y el nombre del producto y muestre el mensaje con el precio del IVA (21%). Por ejemplo: “ Tu bicicleta vale 100 euros y con el 21 % de IVA se queda en 121 euros en total”.
nombre_producto = input("Introduzca el nombre de un producto: ")
precio = float(input("Ahora intoduzca su precio: "))
precio_con_iva = precio + (precio * 21 / 100)
print("Tu", nombre_producto, "vale", precio, "€; Con el 21% de IVA vale", precio_con_iva, "€.")

