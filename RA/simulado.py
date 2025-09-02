#    lista1 = [1, 2, 3] 
#    lista2 = [4, 5, 6]
#    lista3 = []
#
#    for i in range(0, 3):
#        lista3.append(lista1[i])
#        lista3.append(lista2[i])
#    print(lista3)

def contarChar(texto):
    return len(texto)

texto = input("Digite um texto qualquer: ")

print(texto)
print(contarChar(texto))