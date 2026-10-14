message = str(input("Input message: "))

bytes_obj = bytes(message, "utf-8")
print("1. Bytes object:", bytes_obj)

string = bytes_obj.decode("utf-8")
print("2. Bytes to string:", string)

hex_string = message.encode("utf-8").hex()
print("3. Hexadecimal string:", hex_string)

back_to_bytes_object = bytes.fromhex(hex_string)
print("4. Hex to bytes:", back_to_bytes_object)

bytearray_obj = bytearray(message, "utf-8")
print("5. New bytearray:", bytearray_obj) 

bytearray_obj = bytearray(bytes_obj)
print("6. Bytes to bytearray:", bytearray_obj) 

print("7. Sliced bytes:", bytes_obj[6:])

bytearray_obj = bytearray(message, "utf-8")

first_char_lower = chr(bytearray_obj[0]).lower()  
bytearray_obj[0] = ord(first_char_lower)          

result = bytearray_obj.decode("utf-8")
print("8. Modified message:", result)