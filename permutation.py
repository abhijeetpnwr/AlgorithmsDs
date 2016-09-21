#Program to generate all permutation of a String using recursion

finalarr = []

temparr = []

def permute(hatarr):	
	global finalarr
	global temparr
	finalarr = temparr
	temparr = []

	if(len(finalarr)>0 and len(finalarr[0])>=len(hatarr)):

		return 0;

	else:
		if len(finalarr)==0:
			for elem1 in hatarr:
				temparr.append(elem1)

		else:
			for elem in finalarr:
				for elem1 in hatarr:
					if elem1 not in elem:
						temparr.append(elem+elem1)

		permute(hatarr)

name = "abc"

hatarr = []

for char in name:
	hatarr.append(char)

permute(hatarr)

print "final arr:",finalarr
