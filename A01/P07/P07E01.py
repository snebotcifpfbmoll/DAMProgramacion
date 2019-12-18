# P07E01:
# Escribe un programa que pida un texto por pantalla, este texto lo pase como parámetro a un procedimiento, y éste lo imprima primero todo en minúsculas y luego todo en mayúsculas.
def procedimiento(texto):
    print("Text en minusculas: %s" % (texto.lower()))
    print("Text en mayusculas: %s" % (texto.upper()))

text = input("Escribe un texto: ")
procedimiento(text)
