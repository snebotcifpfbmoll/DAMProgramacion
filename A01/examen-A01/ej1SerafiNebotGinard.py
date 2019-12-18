# Serafi Nebot Ginard - Examen 1º Evaluacion

def esPrimo(num):
    res = True
    for i in range(2, num):
        if num % i == 0:
            res = False
    return res

def obtenerEspejo(num):
    res = 0
    for i in range(len(str(num)) - 1, -1, -1):
        res *= 10
        res += int(str(num)[i])
    return res

def anadirPrimos(num, lista):
    for i in range(2, num + 1):
        if esPrimo(i):
            lista.append(i)

def obtenerNumMult(num):
    res = 1
    for i in str(num):
        res *= int(i)
    return res

ANCHURA = 50
print("*"*ANCHURA)
print("PROGRAMA CÁLCULO CONJETURA SHELDON".center(ANCHURA))
print("*"*ANCHURA)
num = int(input("Dame el número para el que quieres comprobar si cumple el teorema de Sheldon: "))
numero_sheldon = False
if esPrimo(num):
    lista_primos = []
    lista_primos_2 = []
    anadirPrimos(num, lista_primos)
    anadirPrimos(obtenerEspejo(num), lista_primos_2)
    pos_1 = len(lista_primos)
    pos_2 = len(lista_primos_2)
    if pos_1 == obtenerEspejo(pos_2):
        if obtenerNumMult(num) == pos_1:
            numero_sheldon = True

if numero_sheldon:
    print("El número %d es un número Sheldon." % (num))
else:
    print("El número %d NO es un número Sheldon." % (num))
