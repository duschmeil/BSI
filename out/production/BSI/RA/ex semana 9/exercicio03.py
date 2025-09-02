vetor = []
i = 0
while i < 10:
    num = float(input("Digite um número real: "))
    vetor.append(num)
    i += 1

quadrados = []
i = 0
while i < 10:
    quadrados.append(vetor[i] ** 2)
    i += 1

print(f"Vetor original: {vetor}")
print(f"Vetor com quadrados: {quadrados}")
