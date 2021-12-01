count = 0
with open("input.in") as file:
    lines = file.readlines()
    for i in range(1, len(lines)):
        if lines[i] > lines[i-1]:
            count += 1
print(count)
