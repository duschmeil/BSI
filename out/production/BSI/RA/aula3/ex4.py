sumNotas = 0

for i in range(0, 4):
    numNota = i
    nota = int(input(f"Nota {numNota+1}: "))
    sumNotas += nota
notaFinal = sumNotas / 4
print("Sua nota final é: ",notaFinal)