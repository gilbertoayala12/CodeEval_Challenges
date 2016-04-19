import sys

with open(sys.argv[1], 'r') as test_cases:
    for test in test_cases:
        Lista= test
        pedazos=Lista.split(" ")
        print(pedazos[-2])
        # ignore test if it is an empty line
        # 'test' represents the test case, do something with it
        # ...
        # ...
