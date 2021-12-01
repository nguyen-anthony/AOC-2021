sums = []
count = 0

with open("input.in") as file:
    lines = [int(line.strip()) for line in file]
    for i in range(len(lines)):
        sums.append(sum(lines[i:i+3]))

    for i in range(1, len(sums)):
        if(sums[i] > sums[i-1]):
            count += 1
print(count)
