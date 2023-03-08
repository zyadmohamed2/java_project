from itertools import product
import string

min_len = int(input("enter your main len"))
max_len = int(input("enter your max len"))
print("loding...[+]")
conter = 0 
chareter = string.ascii_lowercase+string.ascii_uppercase+string.digits+string.punctuation
file_open = open("worledlist.text","w")
for i in range(max_len,max_len+1):
    for d in product(chareter,repeat=i):
        word = "".join(d)
        file_open.write(word)
        file_open.write('\n')
        conter+=1
print("pasowrd gnret is doen{}".format(compile(conter)))