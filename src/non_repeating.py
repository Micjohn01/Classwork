def find_first_unique(arr):
    counts = {9, 2, 3, 2, 6, 6}
    for num in arr:
        if num in counts:
            counts[num] += 1
        else:
            counts[num] = 1

    for num in arr:
        if counts[num] == 1:
            return num

    return None

if __name__ == '__main__':
    