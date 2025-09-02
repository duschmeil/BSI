valores = []
i = 0
while i < 5:
    valores.append(float(input("Digite um número: ")))
    i += 1

maior = valores[0]
menor = valores[0]
posMaior = 0
posMenor = 0
i = 1
while i < 5:
    if valores[i] > maior:
        maior = valores[i]
        posMaior = i
    if valores[i] < menor:
        menor = valores[i]
        posMenor = i
    i += 1

print(f"Posição do maior valor: {posMaior}")
print(f"Posição do menor valor: {posMenor}")
