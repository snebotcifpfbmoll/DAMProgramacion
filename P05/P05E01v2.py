# P05E01v2: Serafi Nebot Ginard
# Escribe un programa que escriba a los siguientes número (la separación entre número es para facilitar cuántos números se deben escribir en cada bucle) y en el que la función range que utilices tenga un ÚNICO argumento y que el valor de este se corresponda con el número de elementos que aparecen en la lista ( por Ejemplo, para la primera lista range (10)).
for i in range(10):
    print(i + 1, "| ", end='') # Sumamos + 1 porque el range() va a devolver una lista que empieza con 0
print("")

for i in range(10):
    print((i + 1) * 2, "| ", end='')
print("")

for i in range(10):
    print(i * 2 + 20, "| ", end='')
print("")

for i in range(6):
    print(i * 4 + 10, "| ", end='')
print("")

for i in range(9):
    print(40 - (5 * i), "| ", end='')
print("")
