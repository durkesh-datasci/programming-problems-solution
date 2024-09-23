#to print the number multiplied with the unit digit for unit digit times
n=int(input())
u=n%10
m=u**u
print(n*m)
#or you can use loop
c=u
if u==0:
    print(n)
else:
    while c>0:
        n=n*u
        c-=1
    print(n)