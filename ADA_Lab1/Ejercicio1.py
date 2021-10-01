# Ejercicio 1

def sumar(array):
    #Dada una lista de numeros la funcion
    #calcula la suma de todos estos
    suma = 0
    for i in array:
        suma = suma + i
    return suma

numbers = [19,27,15,3,1]
val = sumar(numbers)
print(val)
