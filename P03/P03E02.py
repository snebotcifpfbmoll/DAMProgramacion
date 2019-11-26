# P03E02: Serafi Nebot Ginard
# Pida al usuario el espacio recorrido por un coche y el tiempo que ha tardado en horas y que calcule a qué velocidad media había realizado el recorrido.
dst_recorrida = float(input("Introduzca el recorrido de un coche (en KM): "))
tiempo_recorrido = float(input("Ahora introduzca el tiempo que ha tardado (en h): "))
vel_media = dst_recorrida / tiempo_recorrido
print("La velocidad media es de", vel_media, "km/h.")
