notas = []
i = 0
soma = 0
while i < 15:
    nota = float(input("Digite a nota do aluno: "))
    notas.append(nota)
    soma += nota
    i += 1

media = soma / 15
print(f"Média geral: {media}")
