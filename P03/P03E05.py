# P03E05: Serafi Nebot Ginard
# Pida un número que como máximo tenga tres cifras (por ejemplo serían válidos 1, 99 i 213 pero no 1001). Si el usuario introduce un número de más de tres cifras debe un informar con un mensaje de error como este “ ERROR: El número 1005 tiene más de tres cifras”.
num = int(input("Introduzca un numero (maximo 3 cifras): "))
if num > 999:
    print("ERROR: El numero", num, "tiene mas de tres cifras.")
