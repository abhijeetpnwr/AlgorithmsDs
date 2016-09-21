#Solution for problem http://train.usaco.org/usacoprob2?a=8JlMBRMMuy0&S=ride

def rideOrNot(cometname , groupname):
	cometresult=1
	groupresult=1

	for char in cometname:
		digit = ord(char)-ord('A')+1
		cometresult = cometresult*digit

	for char in groupname:
		digit = ord(char)-ord('A')+1
		groupresult = groupresult*digit

	return cometresult%47 == groupresult%47


cometname = "COMETQ"
groupname="HVNGAT"

if rideOrNot(cometname,groupname)==True:
	print "GO"
else:
	print "STAY"
