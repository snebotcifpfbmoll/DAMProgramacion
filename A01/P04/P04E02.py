# P04E02: Serafi Nebot Ginard
# Pida al usuario 5 números y diga si estos estaban en orden decreciente, creciente o desordenado.
print("Introduzca una serie de numeros. En orden creciente, decreciente o desordenados.")
num_1 = float(input("Un numero: "))
num_2 = float(input("Otro numero: "))
num_3 = float(input("Otro numero: "))
num_4 = float(input("Otro numero: "))
num_5 = float(input("Otro numero: "))

if (num_1 >= num_2) and (num_2 >= num_3) and (num_3 >= num_4) and (num_4 >= num_5):
    print("Los numeros estan en orden decreciente.")
elif (num_1 <= num_2) and (num_2 <= num_3) and (num_3 <= num_4) and (num_4 <= num_5):
    print("Los numeros estan en orden creciente.")
else:
    print("Los numeros estan desordenados.")
