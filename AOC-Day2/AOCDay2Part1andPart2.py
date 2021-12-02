lines = open('d02.in').read().splitlines()

# Part 1
depth, pos = 0,0
for line in lines:
    direction, value = line.split();
    value = int(value);
    match direction:
        case 'forward':
            pos += value
        case 'down':
            depth += value
        case 'up':
            depth -= value
print(depth * pos)

# Part 2
depth, pos, aim = 0,0,0
for line in lines:
    direction, value = line.split();
    value = int(value);

    match direction:
        case 'forward':
            pos += value
            depth += aim*value
        case 'down':
            aim += value
        case 'up':
            aim -= value
print(depth * pos)
