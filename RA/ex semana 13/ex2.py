def e_palindromo(string):
    if string == string[::-1]:
        return 'sim'
    else:
        return 'não'

palavra = input('Digite uma palavra para saber se é um palindromo: ')

print(e_palindromo(palavra))