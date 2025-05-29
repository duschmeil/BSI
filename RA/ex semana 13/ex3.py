def maior_elemento(lista):
    cont = 0
    for num in lista:
        if cont == 0:
            maior = num
        else:
            if maior < num:
                maior = num
        cont += 1
    return maior
listaNumeros = []

while True:
    n = int(input("Digite um número inteiro: "))
    listaNumeros.append(n)
    escolha = input("Você deseja continuar? [S/N] ").upper()
    if escolha == 'N':
        break
    
print(maior_elemento(listaNumeros))