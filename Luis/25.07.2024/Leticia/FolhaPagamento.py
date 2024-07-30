valor_hora = float(input("Digite o valor da sua hora de trabalho: "))
horas_trabalhadas = float(input("Digite a quantidade de horas trabalhadas no mês: "))

salario_bruto = valor_hora * horas_trabalhadas

if salario_bruto <= 900:
    desconto_ir = 0
    porcentagem_ir = 0

elif salario_bruto <= 1500:
    desconto_ir = salario_bruto * 0.05
    porcentagem_ir = 5

elif salario_bruto <= 2500:
    desconto_ir = salario_bruto * 0.10
    porcentagem_ir = 10

else:
    desconto_ir = salario_bruto * 0.20
    porcentagem_ir = 20

    desconto_inss = salario_bruto * 0.10

    fgts = salario_bruto * 0.11

    desconto_sindicato = salario_bruto * 0.03

    total_descontos = desconto_ir + desconto_inss + desconto_sindicato

    salario_liquido = salario_bruto - total_descontos

    print(f"Salário Bruto: ({valor_hora:.2f} * {horas_trabalhadas:.2f})        : R$ {salario_bruto:.2f}")
    print(f"(-) IR ({porcentagem_ir}%)                     : R$ {desconto_ir:.2f}")
    print(f"(-) INSS (10%)                 : R$ {desconto_inss:.2f}")
    print(f"(-) Sindicato (3%)             : R$ {desconto_sindicato:.2f}")
    print(f"FGTS (11%)                      : R$ {fgts:.2f}")
    print(f"Total de descontos              : R$ {total_descontos:.2f}")
    print(f"Salário Líquido                 : R$ {salario_liquido:.2f}")
