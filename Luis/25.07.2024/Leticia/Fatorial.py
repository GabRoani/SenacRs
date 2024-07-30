numero = int(input("Fatorial de: "))

fatorial = 1

for i in range(1, numero + 1):
    fatorial *= i

print(f"{numero}! = ", end="")
for i in range(numero, 1, -1):
    print(f"{i}.", end="")
print(f"1 = {fatorial}")
