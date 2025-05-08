vetor = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
tamanho = 10

for i in range(0, 10):
    vetor[i] = int(input("Digite um número: "))

for i in range(tamanho - 1):
    for j in range(tamanho - 1 - i):
        if vetor[j] > vetor[j + 1]:
            temp = vetor[j]
            vetor[j] = vetor[j + 1]
            vetor[j + 1] = temp

print(vetor)
