BankAccount Java Inheritance Assignment
=======================================

Source files:
- BankAccount.java       : superclass; account information and transactions
- CheckingAccount.java   : subclass; interest rate and overdraft handling
- BankAccountTest.java   : main/test class; four test cases

Run in VS Code or the terminal:
  javac BankAccount.java CheckingAccount.java BankAccountTest.java
  java BankAccountTest

The code uses 0.025 to represent a 2.50% interest rate.
The checking-account test includes a $30 fee only when the requested
withdrawal exceeds the available balance.

Suggested screenshots to take in your own IDE:
1. Full IDE showing the Java files and successful program output.
2. Test 1: regular account and resulting balance.
3. Test 2: checking withdrawal without a fee.
4. Test 3: negative checking balance and $30 overdraft fee.
5. GitHub repository page (or local git history) after you push/commit.

Suggested Git commands (run in this folder):
  git init
  git add BankAccount.java CheckingAccount.java BankAccountTest.java README.txt
  git commit -m "Add bank account inheritance project"

Then create a repository in GitHub and publish your branch through VS Code
or add the remote URL GitHub provides and push the branch.

Note: The Word document is a submission draft. Paste genuine screenshots
from YOUR own IDE and GitHub repository into the marked sections before
submitting. Do not submit the draft without screenshots.
