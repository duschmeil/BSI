listapares = []
listaimpares = []

for i in range (1, 11):
    if i % 2 == 0:
        listapares.append(i)
    else:
        listaimpares.append(i)
lista = listaimpares + listapares

print(lista)