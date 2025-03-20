import time

mesesMais = 0
idadeUsuario = int(input("Quantos anos você tem? "))
mesUsuario = int(input("Em que mês você nasceu? (em números) "))
mesAtual = time.localtime().tm_mon
anoAtual = time.localtime().tm_year
fezOuNaoFez = input("Já fez aniversário esse ano? [S/N] ").upper
if fezOuNaoFez == "S":
    mesesMais = mesUsuario - mesAtual
    idadeMeses = (idadeUsuario * 12) + mesesMais
else: 
    mesesMais = 12 - mesUsuario + mesAtual
    idadeMeses = (idadeUsuario * 12) + mesesMais

print("Você tem ",idadeMeses," meses de idade")
