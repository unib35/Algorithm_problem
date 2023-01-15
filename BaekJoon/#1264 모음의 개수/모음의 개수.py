collection = ['a', 'e', 'i', 'o', 'u']
count_list = []
while True:
  input_str = list(input().lower())
  if(input_str[0] == '#'):
    break
  else:
    count = 0
    for i in input_str:
      if(i in collection):
        count += 1
    print(count)