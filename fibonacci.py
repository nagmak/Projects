# from github/karan projects
# Fibonacci Sequence to the Nth number

num = int(input("Please enter a number: "))

def generate_fib(num):
	a = 1
	print(a)
	b = 0
	sum = 0
	for i in range(a, num):
	    sum = a + b
	    b = a
	    a = sum
	    print (sum)
        
generate_fib(num)
