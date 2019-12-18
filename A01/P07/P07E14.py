# P07E14:
# Aprovechando el potencial de los diccionarios, escribe un programa que llame a un procedimiento, que recibe como parámetro la fecha en números y devuelve la fecha  con el nombre del mes. Comentario: no es necesario validar si la es correcta, damos por hecho que lo será. 
meses = {
        "01": "enero",
        "02": "febrero",
        "03": "marzo",
        "04": "abril",
        "05": "mayo",
        "06": "junio",
        "07": "julio",
        "08": "agosto",
        "09": "setiembre",
        "10": "octubre",
        "11": "noviembre",
        "12": "diciembre"
}

def imprimirFecha(fecha):
    lista = fecha.split("/")
    print("%s de %s de %s" % (lista[0], meses[lista[1]], lista[2]))

fecha = input("Introduce una fecha: ")
imprimirFecha(fecha)
