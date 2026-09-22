def alphabet():
    print("Please enter 3 words")
    word1 = input(" - Enter word 1: ").upper()
    word2 = input(" - Enter word 2: ").upper()
    word3 = input(" - Enter word 3: ").upper()

    last_letter = max(word1, word2, word3)

    print(f"\nThe last letter in alphabetical order is: {last_letter}")

alphabet()