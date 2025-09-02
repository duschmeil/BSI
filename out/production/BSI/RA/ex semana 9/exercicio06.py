vetor = []
i = 0
while i < 10:
    vetor.append(float(input("Digite um número: ")))
    i += 1

maior = vetor[0]
menor = vetor[0]
i = 1
while i < 10:
    if vetor[i] > maior:
        maior = vetor[i]
    if vetor[i] < menor:
        menor = vetor[i]
    i += 1

print(f"Maior valor: {maior}")
print(f"Menor valor: {menor}")
