def contar_caracteres(string, letraEscolhida):
    cont = 0
    for letra in string:
        if letra == letraEscolhida:
            cont += 1
    return cont

palavra = input("Digite uma palabraa: ")
letra = input("Digite a letra escolhida: ")

print(contar_caracteres(palavra, letra))