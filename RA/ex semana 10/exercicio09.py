texto = input("Digite um texto qualque: ")
contador = 0

for i in texto:
    if i in "aeiou":
        print(i)
        contador += 1
print(contador)