#i genuinely think this is the worst code ive ever made

usbs = {
 "usb_1" : {
    "speed" : 12,
    "speed_unit" : "Mbps"
},
"usb_2" : {
    "speed" : 480,
    "speed_unit" : "Mbps"
},
"usb_3" : {
    "speed" : 5,
    "speed_unit" : "Gbps"
},
"usb_3.1_gen_1" : {
    "speed" : 5,
    "speed_unit" : "Gbps"
},
"usb_3.1_gen_2" : {
    "speed" : 10,
    "speed_unit" : "Gbps"
},
"usb_3.2" : {
    "speed" : 20,
    "speed_unit" : "Gbps"
},
"usb_4" : {
    "speed" : 20,
    "speed_unit" : "Gbps"
}
}

def user_input():
    input("What is the speed of USB1?")
    print(f"Speed is {usbs["usb_1"]["speed"]} {usbs["usb_1"]["speed_unit"]}")

    input("What is the speed of USB2?")
    print(f"Speed is {usbs["usb_2"]["speed"]} {usbs["usb_2"]["speed_unit"]}")

    input("What is the speed of USB3?")
    print(f"Speed is {usbs["usb_3"]["speed"]} {usbs["usb_3"]["speed_unit"]}")

    input("What is the speed of USB3.1 Gen 1?")
    print(f"Speed is {usbs["usb_3.1_gen_1"]["speed"]} {usbs["usb_3.1_gen_1"]["speed_unit"]}")

    input("What is the speed of USB3.1 Gen 2?")
    print(f"Speed is {usbs["usb_3.1_gen_2"]["speed"]} {usbs["usb_3.1_gen_2"]["speed_unit"]}")

    input("What is the speed of USB3.2?")
    print(f"Speed is {usbs["usb_3.2"]["speed"]} {usbs["usb_3.2"]["speed_unit"]}")

    input("What is the speed of USB4?")
    print(f"Speed is {usbs["usb_4"]["speed"]} {usbs["usb_4"]["speed_unit"]}")

def all_usb_details():
    for x, obj in usbs.items():
        print(x + "\n")
        for y in obj:
            print(y + ':', obj[y])


def main():
    user_input()
    all_usb_details()


main()