dentro = 0
fora = 0

for i in range(0, 10):
    num = int(input("Digite um número: "))
    if 10 < num < 20:
        dentro += 1
    else:
        fora += 1

print(f"Você digitou {dentro} números entre 10 e 20 e {fora} fora desse intervalo")