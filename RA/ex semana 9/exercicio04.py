vetor = []
i = 0
while i < 8:
    vetor.append(float(input(f"Digite o valor da posição {i}: ")))
    i += 1

x = int(input("Digite a posição X (0 a 7): "))
y = int(input("Digite a posição Y (0 a 7): "))

soma = vetor[x] + vetor[y]
print(f"Soma dos valores: {soma}")
