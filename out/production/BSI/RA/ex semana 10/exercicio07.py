i = 0
soma = 0
pares = 0

while True:
    if i % 2 == 0:
        soma = soma + i
        pares += 1
    if pares == 51:
        break
    i += 1
        
print(soma)
