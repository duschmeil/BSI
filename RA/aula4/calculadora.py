print("Bem-Vindo a Calculadora!")

a = int(input("Digite o primeiro número: "))
b = int(input("Digite o segundo número: "))

print("Escolha a operação que deseja realizar!")
print("1 - Soma")
print("2 - Subtração")
print("3 - Multiplicação")
print("4 - Divisão")
print("5 - Sair")
escolha = int(input("Digite sua escolha: "))

if escolha == 1:
    print("O resultado é: ", a + b)
elif escolha == 2:
    print("O resultado é: ", a - b)
elif escolha == 3:
    print("O resultado é: ", a * b)
elif escolha == 4:
    print("O resultado é: ", a / b)
else:
    print("Obrigado por usar a calculadora!")