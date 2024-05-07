import random

class testing:

    def main():

        print("Hello World!")

        # This is a comment

        """
        Big Comment




        See told you it was big
        (That's what she said)
        """

        for i in range(0, 10):

            rand = random.randint(0, 10)

            print(f"Random Number: {rand}")

if __name__ == '__main__':
    testing.main()