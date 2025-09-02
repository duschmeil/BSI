vetor = []
i = 0
pares = 0
while i < 10:
    num = int(input("Digite um número inteiro: "))
    vetor.append(num)
    if num % 2 == 0:
        pares += 1
    i += 1
print(f"Quantidade de números pares: {pares}")
