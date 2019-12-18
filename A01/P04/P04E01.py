# P04E01: Serafi Nebot Ginard
# Pida al usuario 5 números y diga cual es el mayor y cuál el menor.
num_1 = float(input("Introduzca un numero: "))

max_num = num_1
min_num = num_1

num_2 = float(input("Introduzca otro numero: "))
if num_2 > max_num:
    max_num = num_2
if num_2 < min_num:
    min_num = num_2
    
num_3 = float(input("Introduzca otro numero: "))
if num_3 > max_num:
    max_num = num_3
if num_3 < min_num:
    min_num = num_3

num_4 = float(input("Introduzca otro numero: "))
if num_4 > max_num:
    max_num = num_4
if num_4 < min_num:
    min_num = num_4

num_5 = float(input("Introduzca otro numero: "))
if num_5 > max_num:
    max_num = num_5
if num_5 < min_num:
    min_num = num_5

print("El numero mayor es:", max_num)
print("El numero menor es:", min_num)
