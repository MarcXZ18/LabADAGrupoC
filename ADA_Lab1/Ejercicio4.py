# Ejercicio 4

def asc(valores):
    #Dados una lista con 3 valores la funcion
    #retorna un array con los valores en forma ascendente
    for i in valores:
        for j in range(len(valores) - 1):
            if valores[j] > valores[j + 1]:
                valores[j], valores[j + 1] = valores[j + 1], valores[j]
    for x in valores:
        print(x)

numbers = [9, 2, 7]
val = asc(numbers)
print(val)
