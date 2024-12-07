def calcular__valor__futuro(pv, i, n):
    vf = pv * (1 + i) ** n
    return vf

def calcular__valor__presente(vf, i, n):
    pv = vf / (1 + i) ** n
    return pv

print("Cálculo de Valor Futuro e Valor Presente")
print("__________________________________________________________________________________________________")


vf_desejado = float(input("\nDigite o valor futuro que quer R$:"))
i = float(input("\nDigite a taxa de juros anual em %:")) / 100
n = int(input("\nDigite a quantidade de anos para calcular:"))


pv_desejado = calcular__valor__presente(vf_desejado, i, n)
print(f"\nPara obter ${vf_desejado:.2f} após {n} anos, você precisaria depositar: ${pv_desejado:.2f}\n")
print("__________________________________________________________________________________________________")


pv = float(input("\nDigite o valor presente referente ao deposito inicial R$:"))
i = float(input("\nDigite a taxa de juros anual em %:")) / 100
n = int(input("\nDigite a quantidade de anos para calcular:"))


vf = calcular__valor__futuro(pv, i, n)
print(f"\nO valor futuro apos {n} anos sera: ${vf:.2f}\n")
print("__________________________________________________________________________________________________")

