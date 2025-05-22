matriz = [[0 for _ in range(5)] for _ in range(5)]

for i in range(5):
    matriz[i][i] = 1

for linha in matriz:
    print(linha)