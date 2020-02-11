import sqlite3
conn = sqlite3.connect("Student.db")
connect = conn.cursor()

def create_table():
    connect.execute("CREATE TABLE IF NOT EXISTS Student(ID INT, Name TEXT, Address TEXT, Status TEXT)")

def data_entry():
    connect.execute("INSERT INTO Student VALUES(111111,'John Doe','123 Main St','Freshman')")
    connect.execute("INSERT INTO Student VALUES(666666,'Joseph Public','666 Hollow Rd','Sophomore')")
    connect.execute("INSERT INTO Student VALUES(525252,'Amy Vis','431 Diamond Rd','Senior')")
    connect.execute("INSERT INTO Student VALUES(112233,'Mary Smith','1 Lake St','Freshman')")
    connect.execute("INSERT INTO Student VALUES(987654,'Bart Simpson','Fox 5 TV','Senior')")
    connect.execute("INSERT INTO Student VALUES(023412,'Homer Simpson','Fox 5 TV','Senior')")
    connect.execute("INSERT INTO Student VALUES(144335,'Joe Blow','6 Yard CT','Junior')")
    conn.commit()
    #connect.close()
    #conn.close()

def read_from_table():
    ##Querry 1
    connect.execute("SELECT Name,Address FROM Student WHERE Status ='Freshman'")
    results = connect.fetchall()
    print(results)

def second_read_from_table():
    connect.execute("SELECT ID,Name FROM Student WHERE Status ='Junior' AND Status = 'Senior'")
    new_results = connect.fetchall()
    print(new_results)

    
        
create_table()
data_entry()
read_from_table()
second_read_from_table()
connect.close()
conn.close()
