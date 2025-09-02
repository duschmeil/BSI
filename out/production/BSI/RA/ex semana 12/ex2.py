matriz = [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]

maior = 0

for i in range(4):
    for l in range(4):  
        matriz[i][l] = int(input(f"Digite um núemro para a posição {i}, {l}: "))

for linha in matriz:
    for num in linha:
        if maior < num:
            maior = num

for linha in matriz:
    print(linha)
print(maior)
