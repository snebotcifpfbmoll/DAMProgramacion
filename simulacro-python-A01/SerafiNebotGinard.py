# Serafi Nebot Ginard - Examen 1º DAM

# Variables globales
id_anterior = 0
total_copias = 0
lista_peliculas = []

# Añadir peliculas
def anadir_peliculas(lista_peliculas):
    global total_copias
    global id_anterior
    print("="*24)
    print("Dar de alta nueva pelicula\n")

    ncopias_pelicula = int(input("Introduce el numero de copias: "))
    tmp_ncopias = total_copias + ncopias_pelicula
    if tmp_ncopias > 3000:
        print("Error: El videoclub no puede almacenar mas peliculas.")
        return lista_peliculas
    total_copias += ncopias_pelicula

    titulo_pelicula = input("Introduce el titulo: ")
    director_pelicula = input("Introduce el director: ")
    duracion_pelicula = int(input("Introduce la duracion: "))
    genero_pelicula = input("Introduce el genero: ")
    ano_pelicula = int(input("Introduce el año: "))

    disponible_pelicula = ""
    while disponible_pelicula != "cierto" and disponible_pelicula != "falso":
        disponible_pelicula = input("Esta disponible? (cierto/falso): ").lower()

    pdisponible = True
    if disponible_pelicula == "cierto":
        pdisponible = True
    elif disponible_pelicula == "falso":
        pdisponible = False

    # Comprobar titulos
    id_pelicula = 0
    for i in lista_peliculas:
        if i["titulo"] == titulo_pelicula:
            id_pelicula = i["id"]

    if id_pelicula == 0:
        id_anterior += 1
        id_pelicula = id_anterior

    # Añadir la pelicula
    lista_peliculas += [{ "id": id_pelicula, "ncopias": ncopias_pelicula, "ncopias_reservada": 0, "titulo": titulo_pelicula, "director": director_pelicula, "duracion": duracion_pelicula, "genero": genero_pelicula, "ano": ano_pelicula, "disponible": disponible_pelicula }]
    return lista_peliculas

def listar_peliculas(lista_peliculas):
    for i in lista_peliculas:
        estado = ""
        if i["disponible"]:
            estado = "disponible"
        else:
            estado = "no disponible"
        print("id: %d; Título: %s; Director: %s; Género: %s; Año: %d; Duración: %d; Estado: %s" % (i["id"], i["titulo"], i["director"], i["genero"], i["ano"], i["duracion"], estado))

def reservar_pelicula():
    global lista_peliculas
    print("="*24)
    print("Películas:\n")
    listar_peliculas(lista_peliculas)
    pid = int(input("\nIntroduce el id de la película: "))
    disponible = True
    correct_id = False
    for i in lista_peliculas:
        if i["id"] == pid:
            disponible = i["disponible"]
            correct_id = True
    if correct_id == False:
        print("Error: La película con id %d no existe." % (pid))
    else:
        if disponible == False:
            print("Aviso: La película seleccionada no esta disponible.")
        else:
            print("La película con id: %d ha sido reservada." % (pid))
            for i in lista_peliculas:
                if i["id"] == pid:
                    i["ncopias_reservada"] += 1
                    if i["ncopias_reservada"] == i["ncopias"]:
                        i["disponible"] = False

def buscar_pelicula():
    global lista_peliculas
    opcion = 0
    while opcion not in range(1, 6):
        print("="*24)
        print("¿Que quieres buscar?")
        print("\t1) Por título.")
        print("\t2) Por director.")
        print("\t3) Por genero.")
        print("\t4) Por ano.")
        print("\t5) Por duracion.")
        opcion = int(input("> "))
        if opcion not in range(1, 6):
            print("La opcion %d no esta disponible." % (opcion))
    tipo = ""
    if opcion == 1:
        tipo = "titulo"
    elif opcion == 2:
        tipo = "director"
    elif opcion == 3:
        tipo = "genero"
    elif opcion == 4:
        tipo = "ano"
    elif opcion == 5:
        tipo = "duracion"
    else:
        print("Error: La opcion %d no es valida." % (opcion))

    if tipo != "":
        param = input("Introduce el parametro por el cual quieres buscar: ")
        encontrado = False
        for i in lista_peliculas:
            if str(i[tipo]).find(param) != -1:
                estado = ""
                if i["disponible"]:
                    estado = "disponible"
                else:
                    estado = "no disponible"
                print("id: %d; Título: %s; Director: %s; Género: %s; Año: %d; Duración: %d; Estado: %s" % (i["id"], i["titulo"], i["director"], i["genero"], i["ano"], i["duracion"], estado))
                encontrado = True
    if encontrado == False:
        print("No se ha encontrado ninguna pelicula que cumpla los criterios de búsqueda.")

# Programa principal
opcion = ""
while opcion != "4":
    print("="*24)
    print("=%s=" % ("MENU".center(24 - 2)))
    print("="*24)
    print("Opciones:")
    print("\t1) Añdir pelicula.")
    print("\t2) Reservar pelicula.")
    print("\t3) Buscar pelicula.")
    print("\t4) Salir.")
    opcion = input("> ")

    if opcion == "1":
        lista_peliculas = anadir_peliculas(lista_peliculas[:])
    elif opcion == "2":
        reservar_pelicula()
    elif opcion == "3":
        buscar_pelicula()
    elif opcion == "4":
        print("") # No hacer nada
    else:
        print("Error: La opcion %s no es valida." % (opcion))
