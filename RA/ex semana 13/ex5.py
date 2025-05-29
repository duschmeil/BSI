def soma(num1, num2):
    return num1 + num2
def div(num1, num2):
    return num1 // num2
def sub(num1, num2):
    return num1 - num2
def multi(num1, num2):
    return num1 * num2

def menu():
    print("CALCULADORA")
    n1 = int(input("Digite o primeiro número: "))
    n2 = int(input("Digite o segundo número: "))
    print("O QUE DESEJA FAZER? ")
    print("1 - SOMA\n2 - SUBTRAÇÃO\n3 - MULTIPLICAÇÃO\n4 - DIVISÃO\n0 - SAIR")
    escolha = int(input("Digite a operação que deseja realizar: "))
    return escolha, n1, n2

while True:
    escolha, n1, n2 = menu()
    if escolha == 1:
        print(soma(n1, n2))
    elif escolha == 2:
        print(sub(n1, n2))
    elif escolha == 3:
        print(multi(n1, n2))
    elif escolha == 4:
        print(div(n1, n2))
    else:
        break
