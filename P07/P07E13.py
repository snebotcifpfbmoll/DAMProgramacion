# P07E13:
# Escribe un programa que le pida al usuario si quiere calcular si un número es primo con for o con while, por tanto, habrán dos funciones que se caracterizan por hacer ese mismo cálculo de una manera (con for y sin breaks), o de otra (con while). Ambas funciones devolverá true (si es es primo) o false (si no es primo). El programa principal informará del resultado. Además, como mejora puedes calcular el tiempo que tarda en encontrar la solución de una manera u otra. Comentario: aprovecha el código que tienes ya creado
def comprobarNumero(num, usarWhile=True):
    numero_primo = True
    if usarWhile:
        indice = num - 1
        while indice > 1:
            if num % indice == 0:
                numero_primo = False
            indice -= 1
    else:
        for i in range(num, 1, -1):
            if num % i == 0:
                numero_primo = False
    return numero_primo

num = int(input("Escribe un numero: "))

decision = None
while decision == None:
    while_for = input("Quieres hacerlo con while o con for? ").lower()
    
    if while_for == "while":
        decision = True
    elif while_for == "for":
        decision = False
    else:
        print("[Error] %s: No se reconoce." % (while_for))
    
numero_primo = comprobarNumero(num, decision)
if numero_primo:
    print("El numero", num, "es primo.")
else:
    print("El numero", num, "no es primo.")
