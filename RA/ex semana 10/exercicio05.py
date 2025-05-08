pares = 0
impares = 0

for i in range(0, 10):
    num = int(input("Digite um número: "))
    if num % 2 == 0:
        pares += 1
    else:
        impares += 1
print(f"Você digitou {pares} números pares")
print(f"Você digitou {impares} números ímpares")
