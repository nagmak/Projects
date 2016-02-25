# from github/karan projects
# Find PI to the Nth Digit
import math

num = int(input("Enter a number: "))

def generate_pi(num):
	pi = math.pi
	print ("{0:.{prec}f}".format(pi, prec=num))

generate_pi(num)