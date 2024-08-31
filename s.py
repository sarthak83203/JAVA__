"""
amt=0
nu=int(input("Enter a electric bill: "))
if(nu<=100):
    amt=0
if nu>100 and nu<=200:
    amt=(nu-100)*5
if nu>200:
    amt=500+(nu-200)*10
print(amt)
"""
"""
n=int(input("Enter a number: "))
c=n%10
if(c%3==0):
    print("its divisible by 3")
else:
    print("not divisible by 3")
    """
"""
n=float(input("Enter a grade: "))
if(n>90):
    print("A")
elif(n>80 and n<=90):
    print("B")
elif(n>=60 and n<=80):
    print("C")
elif(n<60):
    print("D")
    """
"""
n=int(input("Enter a price: "))
if (n>100000):
    tax=(15/100)*n
elif(n>50000 and n<=100000):
    tax=(10/100)*n
elif(n<=50000):
    tax=(5/100)*n
print("The tax you have to pay is",tax) 
"""

"""
n=int(input("Enter a number: "))
if(len[n]!=3):
    print("The number is not a three digit number")
else:
    print("The number is three digit number")       

"""
"""
#Write a prgram to check whether a person is eligible for voting or not
age=float(input("Enter a age of person: "))
if (age>=18):
    print("He or She is eligible for voting")
else:
    print("No not eligible for voting")
    """
"""
n=int(input("Enter a number: "))
if(n%2==0 and n%3==0):
    print("Yahha the number divisible by 2 and 3 both")
else:
    print("Nothing happen")
    """
"""
workday=int(input("Enter a number of working days: "))
absent=int(input("Enter a number of absent days: "))
cal=(absent/workday) *100
print(cal)

if(cal<75):
    print("You can't seat in exam")
else:
    print("You can seat in exam")
    """
"""
salary=int(input("Enter a salary: "))
years=float(input("Enter a number of years: "))
if(years>10):
    print((10/100)*salary)
elif(years>=6 and years<=10):
    print((8/100)*salary)
elif(years<6):
    print((5/100)*salary)
    """
"""
a=int(input("Enter a side 1: "))
b=int(input("Enter a side 2: "))
c=int(input("Enter a side 3: "))
if(a==b and b==c):
    print("Equilateral triangle")
elif(a!=b and b!=c):
    print("Scelene")
elif(a==b or b==c or a==c):
    print("isoscelene")
    """
"""
n1=int(input('Enter a number 1: '))
n2=int(input('Enter a number 2: '))
o=(input("Enter a operarator"))
if o=="+":
    print(n1+n2)
elif(o=="-"):
    print(n1-n2)
    """
"""
ut=int(input('Enter a number of units: '))
if ut<=100:
    amt=0
elif(ut>100 and ut<=300):
    amt=(ut-100)*2
else:
    amt=400+(ut-300)*5
print("Total amount to pay is ",amt)
"""
"""
n=int(input("Enter a number of days: "))
if(n<=5):
    amt=n*2
elif(n>=6 and n<=10):
    amt=n*3
elif(n>=11 and n<=15):
    amt=n*4
elif(n>=15):
    amt=n*5
print("The total charge of the librarary is",amt)    
"""
q=int(input("Enter a kilometers cover: "))
if(q<=10):
    amt=q*11
elif(q>10 and q<=90):
    amt=q*10
elif(q>90):
    amt=q*9
print(amt)    






