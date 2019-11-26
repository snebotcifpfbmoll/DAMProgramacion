# P05E01: Serafi Nebot Ginard
# Escribe un programa que escriba a los siguientes número (la separación entre número es para facilitar cuántos números se deben escribir en cada bucle) y en el que la función range que utilices tenga un ÚNICO argumento ( por Ejemplo, para la primera lista range (10)).
for i in range(11):
    if i > 0:
        print(i, "| ", end="")
print("")

for i in range(21):
    if i > 0:
        if i % 2 == 0:
            print(i, "| ", end="")
print("")

for i in range(39):
    if i >= 20:
        if i % 2 == 0:
            print(i, "| ", end="")
print("")

proximo_num = 10
for i in range(31):
    if i >= 10:
        if i == proximo_num:
            print(i, "| ", end="")
            proximo_num += 4
print("")

max_num = 40
for i in range(9):
    print(max_num, "| ", end="")
    max_num -= 5
print("")
