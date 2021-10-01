# Ejercicio 2

def inverse(valor):
    #Dado un conjunto de valores la funcion
    #retorna un array con los valores en orden inverso
    inv = []
    length = len(valor)
    for i in range(length - 1, -1, -1):
        inv.append(valor[i])
    return inv

numbers = [9,7,5,3,1]
val = inverse(numbers)
print(val)
