import numpy
lst=[]
n=int(input("enter the range:"))
for i in range(n):
    lst2=[]
    for j in range(n):
        a=int(input("enter the elements:"))
        lst2.append(a)
    lst.append(lst2)
    print(lst)
p=numpy.transpose(lst)
print("after finding the transpose of the array")
print(p)


