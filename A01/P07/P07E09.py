# P07E09:
# Escribe un programa que pida dos palabras las pase como parámetro a un procedimiento y diga si riman o no. Si coinciden las tres últimas letras tiene que decir que riman. Si coinciden sólo las dos últimas tiene que decir que riman un poco y si no, que no riman.
def comprobarRima(palabra_1, palabra_2):
    if palabra_1[-3:] == palabra_2[-3:]:
        print("Las palabras %s y %s riman." % (palabra_1, palabra_2))
    elif palabra_1[-2:] == palabra_2[-2:]:
        print("Las palabras %s y %s riman un poco." % (palabra_1, palabra_2))
    else:
        print("Las palabras %s y %s no riman." % (palabra_1, palabra_2))

palabra_1 = input("Dame una palabra: ")
palabra_2 = input("Dame otra palabra: ")
comprobarRima(palabra_1, palabra_2)
