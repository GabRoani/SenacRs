pares = 0
impares = 0

for i in range(10):
    try:
        numero = int(input(f"Digite o {i + 1}º número inteiro: "))
    except ValueError:
        print("Erro: Digite um número inteiro válido.")
        continue

    if numero % 2 == 0:
        pares += 1
    else:
        impares += 1

print(f"\nQuantidade de números pares: {pares}")
print(f"Quantidade de números ímpares: {impares}")
