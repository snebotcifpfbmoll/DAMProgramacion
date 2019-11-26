# P04E04: Serafi Nebot Ginard
# Pida al usuario tres números y un cuarto número, y compruebe si éste último es divisor de los tres números primeros.
print("Introduzca tres numeros:")
num_1 = int(input("1: "))
num_2 = int(input("2: "))
num_3 = int(input("3: "))
divisor = int(input("Ahora introduzca otro numero: "))
if num_1 % divisor == 0 and num_2 % divisor == 0 and num_3 % divisor == 0: 
    print("El ultimo numero es divisor de los demas.")
else:
    print("El ultimo numero no es divisor de los demas.")
