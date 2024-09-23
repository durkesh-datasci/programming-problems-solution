string = input("Enter the string: ")
char = input("Enter the character: ")
first_occurrence = string.find(char)
last_occurrence = string.rfind(char)
if first_occurrence != -1 and last_occurrence != -1:
    result = string[:first_occurrence] + string[last_occurrence + 1:]
    print(result)
else:
    print(string)