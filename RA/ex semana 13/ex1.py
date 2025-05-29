def soma_elementos(numeros):
    soma = 0
    for num in numeros:
        soma += num
    return(soma)

listaNumeros = []

while True:
    n = int(input("Digite um número inteiro: "))
    listaNumeros.append(n)
    escolha = input("Você deseja continuar? [S/N] ").upper()
    if escolha == 'N':
        break
    
print(soma_elementos(listaNumeros))