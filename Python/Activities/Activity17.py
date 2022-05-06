import pandas as pd


data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}

dataframe = pd.DataFrame(data)


print(dataframe)

"""
 Write the DataFrame to a CSV file
 To avoid writing the index numbers to the file as well
 the index property is set to false
"""

dataframe.to_csv("csvdata.csv")
dataframe.to_csv("sample.csv", index=False)