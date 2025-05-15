vetor = [2, 4, 7, 2, 3, 3, 1, 0, 2, 6]

mais_repetido = vetor[0]
maior_contagem = 0

for i in range(len(vetor)):
    contagem = 0
    for j in range(len(vetor)):
        if vetor[i] == vetor[j]:
            contagem += 1
    if contagem > maior_contagem:
        maior_contagem = contagem
        mais_repetido = vetor[i]

print(f"Número que mais se repete: {mais_repetido}")