vetor = []
i = 0
negativos = 0
somaPositivos = 0

while i < 10:
    num = float(input("Digite um número: "))
    vetor.append(num)
    if num < 0:
        negativos += 1
    else:
        somaPositivos += num
    i += 1

print(f"Quantidade de negativos: {negativos}")
print(f"Soma dos positivos: {somaPositivos}")
