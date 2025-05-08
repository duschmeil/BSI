from random import randint 
certos = 0

nummega = [randint(0,100), randint(0,100), randint(0,100), randint(0,100), randint(0,100),randint(0,100)]
numuser = [0, 0, 0, 0, 0, 0]

i = 0 

while i < 6:
    numuser[i] = int(input("Digite o numero que você deseja: "))
    i += 1

i = 0

while i < 6:
    if numuser[i] == nummega[i]:
        print(f"{numuser[i]:>2}|{nummega[i]:>2}")
        certos += 1
    else:
        print(f"{numuser[i]:>2}|{nummega[i]:>2}")
    i += 1
if certos == 6:
    print("Parabéns você GANHOU!!!")
else:
    print("Você perdeu")

