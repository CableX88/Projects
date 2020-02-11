from multiprocessing import Pool

def f(x):
    return x*x

if __name__ == '__main__':
    with Pool(3) as p:
        print(p.map(f, [1, 2, 3]))

'''
for answer 1(a)

[1, 4, 9]

for answer 1(b)

pool(3) allows for paralizzing multiple 

'''

