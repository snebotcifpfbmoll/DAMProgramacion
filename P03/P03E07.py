# P03E07: Serafi Nebot Ginard
# Pida al usuario tres número que serán el día, mes y año. Comprueba que la fecha introducida es válida.
print("Introduce una fecha.")
dia = int(input("Dia: "))
mes = int(input("Mes: "))
ano = int(input("Ano: "))

# Cada mes tine 30 o 31 dias (excepto febrero)
# Se empieza el año con un mes de 31 dias y se va alternando entre 31 y 30 dias cada mes
# (Si el mes es un numero par va a tener 30 dias y si no es par va a tener 31)
# A partir de Agosto es al reves (meses pares 31 dias i meses no pares 30)
if mes >= 1 and mes <= 12:
    if mes == 2:
        # El mes es febrero por lo tanto solo va a tener 28 dias
        if dia <= 28:
            print("%02d/%02d/%04d - La fecha es correcta." %(dia, mes, ano))
        else:
            print("%02d/%02d/%04d - La fecha es incorrecta." %(dia, mes, ano))
    elif (mes < 8 and mes % 2 == 0) or (mes >= 8 and mes % 2 != 0):
        # El mes es par (y esta al principio del año) por lo tanto va a tener 30 dias como maximo
        # O
        # El mes no es par (y esta al final del año) por lo tanto va a tener 30 dias como maximo
        if dia <= 30:
            print("%02d/%02d/%04d - La fecha es correcta." %(dia, mes, ano))
        else:
            print("%02d/%02d/%04d - La fecha es incorrecta." %(dia, mes, ano))
    elif (mes < 8 and mes % 2 != 0) or (mes >= 8 and mes % 2 == 0):
        # El mes no es par (y esta al principio del año) por lo tanto va a tener 31 dias como maximo
        # O
        # El mes es par (y esta al final del año) por lo tanto va a tener 31 dias como maximo
        if dia <= 31:
            print("%02d/%02d/%04d - La fecha es correcta." %(dia, mes, ano))
        else:
            print("%02d/%02d/%04d - La fecha es incorrecta." %(dia, mes, ano))
else:
    print("%02d/%02d/%04d - La fecha es incorrecta." %(dia, mes, ano))
