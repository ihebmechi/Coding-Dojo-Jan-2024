from mysqlconnection import connectToMySQL
DATABASE = "users_cr"

class user:
    def __init__(self, date):
        self.id = date["id"]
        self.first_name = date["first_name"]
        self.last_name = date["last_name"]
        self.email = date["email"]
        self.created_at = date["created_at"]
        self.updated_at = date["created_at"]
    
    @classmethod
    def add(cls, data):
        querry="""
                insert into users (first_name, last_name, email)
                values (%(first_name)s,%(last_name)s,%(email)s);
               """
        result=connectToMySQL(DATABASE).query_db(querry,data)
        print(result) 
        return result
    
    @classmethod
    def find_all_users(cls):
        querry="""
                select * from users;
                """
        results=connectToMySQL(DATABASE).query_db(querry)
        all_users=[]
        for one_user in results:
            all_users.append(cls(one_user))
        return all_users