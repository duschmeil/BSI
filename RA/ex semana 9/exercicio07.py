vetor = []
i = 0
while i < 10:
    vetor.append(int(input("Digite um número inteiro: ")))
    i += 1

maior = vetor[0]
pos = 0
i = 1
while i < 10:
    if vetor[i] > maior:
        maior = vetor[i]
        pos = i
    i += 1

print(f"Maior valor: {maior}")
print(f"Posição: {pos}")
