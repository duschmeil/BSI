valores = [5, 7, 12, 2, 9, 21]

print(valores[0])
print(valores[1])
print(valores[2])
print(valores[3])
print(valores[4])
print(valores[5])

valores[1] = 17
valores[3] = 22
print(valores)

valores[2] = 1
valores[4] = 29
print(valores)

soma  = valores[5] + valores[4]
sub = valores[3] - valores[1]
multiplicaçao = valores[0] * valores[5]
divisao = valores[3] / valores[2] 

print(soma)
print(sub)
print(multiplicaçao)
print(divisao)

i = 0

while i < 5:
    print(valores[i] * 2)
    i += 1

