# P07E03:
# Escribe un programa que lea una frase, y la pase como parámetro a un procedimiento, y éste debe mostrar la frase con un carácter en cada línea.
def imprimirCaracteres(frase):
    for i in frase:
        print(i)

frase = input("Escribe una frase: ")
imprimirCaracteres(frase)
