from enum import Enum
import time

class Command(Enum):
    ADD = "01"
    SUB = "02"
    MUL = "03"
    LDA = "05"
    LDK = "06"
    STA = "07"
    INP = "08"
    OUT = "09"
    HALT = "0A"
    JMP = "0B"
    JEZ = "0C"

file = open("assembly.txt", "r")
# init array with size 3
registers = [None, None, None]
akkumulator = None

lines = file.readlines()
i = 0
while i < len(lines):
    line = lines[i]
    print("current line: " + str(i + 1) + ": " + line)
    # Split the line into the first two characters and the rest of the line
    command = line[:2]
    value = line[2:]
    # If the command is a comment, skip it
    if command == "//":
        continue
    if command == Command.ADD.value:
        print("Adding " + str(registers[int(value) - 1]) + " to " + str(akkumulator))
        akkumulator = akkumulator + registers[int(value) - 1]
    if command == Command.SUB.value:
        print("Subtracting " + str(registers[int(value) - 1]) + " from " + str(akkumulator))
        akkumulator = akkumulator - registers[int(value) - 1]
    if command == Command.MUL.value:
        print("Multiplying " + str(registers[int(value) - 1]) + " with " + str(akkumulator))
        akkumulator = akkumulator * registers[int(value) - 1]
    if command == Command.LDA.value:
        print("Loading " + str(registers[int(value) - 1]) + " into akkumulator")
        akkumulator = registers[int(value) - 1]
    if command == Command.LDK.value:
        print("Loading " + str(value) + " into akkumulator")
        akkumulator = int(value)
    if command == Command.STA.value:
        print("Storing " + str(akkumulator) + " in register " + str(value))
        registers[int(value) - 1] = akkumulator
    if command == Command.INP.value:
        print("Inputing value into register " + str(value))
        registers[int(value) - 1] = int(input("Input: "))
    if command == Command.OUT.value:
        print(registers[int(value) - 1])
    if command == Command.HALT.value:
        print("Halting")
        break
    if command == Command.JMP.value:
        print("Jumping to line " + str(value))
        i = int(value) - 2
    if command == Command.JEZ.value:
        if akkumulator == 0:
            print("Jumping to line " + str(value))
            i = int(value) - 2
    i = i + 1
    time.sleep(0.5)