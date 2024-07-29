kg_morango = float(input("Digite a quantidade de morangos (em Kg): "))

kg_maca = float(input("Digite a quantidade de maçãs (em Kg): "))

if kg_morango <= 5:
    preco_morango = kg_morango * 2.50
else:
    preco_morango = kg_morango * 2.20

if kg_maca <= 5:
    preco_maca = kg_maca * 1.80
else:
    preco_maca = kg_maca * 1.50

preco_total = preco_morango + preco_maca

if (kg_morango + kg_maca) > 8 or preco_total > 25.00:
    preco_total = preco_total * 0.90

print(f"Valor a ser pago: R$ {preco_total:.2f}")
