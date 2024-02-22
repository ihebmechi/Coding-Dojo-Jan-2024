class user:
    def __init__(self, first_name, last_name, email, age, is_rewards_member=False, gold_card_points = 0):
        self.first_name = first_name
        self.last_name = last_name
        self.email = email
        self.age = age
        self.is_rewards_member = is_rewards_member
        self.gold_card_points = gold_card_points
    def display_info(self):
        print(f"first_name:{self.first_name}\n last_name:{self.last_name}")
    def enroll(self):
        self.is_rewards_member = True
        self.gold_card_points = 200   
    def spend_points(self, amount) :
        if amount<self.gold_card_points:
            self.gold_card_points = self.gold_card_points-amount




user1 =  user("jack", "smaith","jack@gmail.com", 23)
user2 =  user("lionel", "messi","messi@gmail.com", 37)
user1.display_info()
user1.enroll()
user1.spend_points(50)
user1.display_info()
user2.enroll()
user2.spend_points(80)
user2.display_info()

