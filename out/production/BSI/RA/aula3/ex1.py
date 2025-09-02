import time

ano = time.localtime().tm_year
mes = time.localtime().tm_mon
dia = time.localtime().tm_mday

anousuario = int(input("Em qual ano você nasceu? "))
mesusuario = int(input("Em qual mes você nasceu? "))
diausuario = int(input("Em qual dia você nasceu? "))

if mes > mesusuario:
    idade = ano - anousuario
if mes < mesusuario:
    idade = ano - anousuario - 1
if mes == mesusuario:
    if dia >= diausuario:
        idade = ano - anousuario
    else:
        idade = ano - anousuario - 1

print("Você tem ",idade," anos de idade!")
