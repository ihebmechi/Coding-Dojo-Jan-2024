class BankAccount:

    def __init__(self, int_rate, balance): 
        self.int_rate = int_rate
        self.balance = balance
    def deposit(self, amount):
        self.balance += amount 
        print(amount)
    def withdraw(self, amount):
        self.balance -= amount
        print(amount)
    def display_account_info(self):
        print(f"int_rate:{self.int_rate} \n balance:{self.balance}")
    def yield_interest(self):
        self.balance = self.balance * self.int_rate


iheb_account = BankAccount(0.01,100)
yaya_account = BankAccount(0.04,1000)

