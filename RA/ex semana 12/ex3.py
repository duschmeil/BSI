matriz = [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]

for i in range(5):
    for l in range(3):
        if l == 0:
            coisa = "Número de Matrícula"
        elif l == 1:
            coisa = "Média das provas"
        elif l == 2:
            coisa = "Média dos trabalhos"
        matriz[i][l] = int(input(f"Digite a {coisa} do aluno {i + 1}: "))

for linha in matriz:
    soma = 0
    for i in range(4):
        if i == 1 or i == 2:
            soma += linha[i]
    linha[3] = soma/2

for linha in matriz:
    print(linha)
