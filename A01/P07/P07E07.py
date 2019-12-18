# P07E07:
# Escribe un programa que lea una frase, y la pase como parámetro a un procedimiento. El procedimiento contará el número de vocales (de cada una) que aparecen, y lo imprimirá por pantalla.
def contarVocales(frase):
    num_a = 0
    num_e = 0
    num_i = 0
    num_o = 0
    num_u = 0
    for i in frase:
        if i == 'a':
            num_a += 1
        elif i == 'e':
            num_e += 1
        elif i == 'i':
            num_i += 1
        elif i == 'o':
            num_o += 1
        elif i == 'u':
            num_u += 1
    print("Numero de vocales:")
    print("A: %d" % (num_a))
    print("E: %d" % (num_e))
    print("I: %d" % (num_i))
    print("O: %d" % (num_o))
    print("U: %d" % (num_u))
frase = input("Escribe una frase: ")
contarVocales(frase)
