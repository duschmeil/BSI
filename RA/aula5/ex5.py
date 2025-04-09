contadorImpares = 0
contadorPares = 0

for i in range(0, 10):
    n = int(input("Digite um número inteiro: "))
    if n % 2 == 0:
        contadorPares += 1
    else:
        contadorImpares += 1
print(f"Quantidade de números pares: {contadorPares}")
print(f"Quantidade de números ímpares: {contadorImpares}")