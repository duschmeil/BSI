print("Você está perdido em uma floresta!")
print("Qual caminho deseja seguir?\n1 - Direita\n2 - Esquerda")
escolha1 = int(input(""))
if escolha1 == 1:
    print("Você encontrou uma montanha!\nQuer subi-la ou não?\n1 - Sim\n2 - Não")
    escolha2 = int(input(""))
    if escolha2 == 1:
        print("Parabéns, você subiu a montanha!")
    else:
        print("Você não subiu a montanha!")
else:
    print("Você encontrou um rio!\nQuer atravessá-lo ou não?\n1 - Sim\n2 - Não")
    escolha3 = int(input(""))
    if escolha3 == 1:
        print("Parabéns, você atravessou o rio!")
    else:
        print("Você não atravessou o rio!")
