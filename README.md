# Splitwise System Design:
Detailed Designing of Splitwise SystemM

# Use Cases to be covered:
- User should be able to add expense
- User should be able to enter the expense he paid for friends and the amount should be split amongst friends.
- The Splitting of expense is of the following types:
  - Split Equally : This case should handle the edge cases like recurring decimal digits like 100/3 =33.33333...333 in optimised way
  - Split Unequally :
    - User should be able to add the exact amount pertaining to every expense. The sum total of the amounts entered should match the total amount spent by the user.
    - User should be able to have option for percentage wise splitting. The sum total of the percentages should be equal to 100%.
- Multiple users can pay for an expense.
- Groups can be created and people can be added to the group.
- The expenses can be group wise or non-group wise
- User should be able to see the net balance in the total section and also against each friend.
- The expenses added should have the details like name, date, image, location, category etc.
- Settlement of expenses can be of 2 types- Partial and Final Settlement. User should be able to view and manage both
- User should be able to see all transaction histories.
- User should be provided with an option to enable Simplify Debt.
  - The Simplify Debt optimises the transaction exchanges. For example, If A owes B $10 and B owes C $10, then A can directly pay C $10.
  
# Non Functional Requirement:
- System should be available to everyone at all times
- System should be consistent and show accurate results
- System should handle heavy request flows since many users can login to the system at same time
- System should be secure
