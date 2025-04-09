n = int(input("Digite um número inteiro: "))

contador = 0

while contador <= 9:
    print(f"{n} x {contador} = {n * contador}")
    contador += 1
print("Fim da tabuada!")
