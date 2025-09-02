soma = 0
contador = 0
while True:
    n = int(input("Digite um número inteiro (ou -1 para sair): "))
    if n == -1:
        break
    else:
        soma += n
        contador += 1
if contador == 0:
    print("Nenhum número foi digitado.")
else:
    resultado = soma / contador
    print(f"A média dos números digitados é: {resultado}")