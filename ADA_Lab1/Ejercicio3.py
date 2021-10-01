# Ejercicio 3

def parEimpar(valores):
    #Dados unos valores la función retorna dos
    #arrays con los números separados en pares e impares
    par = []
    impar = []

    for i in valores:
        if i % 2 == 0:
            par.append(i)
        else:
            impar.append(i)
    return par,impar

numbers = [9,2,7,6,3,8]
val = parEimpar(numbers)
print(val)
