#senha não pode ser igual ao usuário
usuario = input('Digite seu nome de usuário.\n')

while True:
    senha = input('Digite sua senha.\n')
    if senha == usuario:
        print('Sua senha não pode ser igual ao usuário. Por favor, digite outra senha.\n')
    else:
        print('Conta criada com sucesso.')
        break
