valores = []
i = 0
soma = 0
while i < 5:
    num = float(input("Digite um número: "))
    valores.append(num)
    soma += num
    i += 1

maior = max(valores)
menor = min(valores)
media = soma / 5

print(f"Valores lidos: {valores}")
print(f"Maior valor: {maior}")
print(f"Menor valor: {menor}")
print(f"Média: {media}")
