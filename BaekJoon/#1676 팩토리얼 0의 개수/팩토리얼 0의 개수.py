import math

N = int(input())
facNum = str(math.factorial(N))
listNum = list(map(int, facNum))

count = 0
index = 1

while(True):
  if listNum[len(listNum)-index] == 0:
    count+= 1
  else:
    break
  index += 1

print(count)