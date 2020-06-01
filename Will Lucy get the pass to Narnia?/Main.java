#include<iostream>

using namespace std;

int main() {
  int num1,num2,menu;
  cout<<"Enter first number : Enter second number : Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  cin>>num1>>num2>>menu;
  switch(menu)
  {
    case 1:cout<<num1+num2;
      break;
    case 2:cout<<num1-num2;
      break;
    case 3:cout<<num1*num2;
      break;
    case 4:cout<<num1/num2;
      break;
    case 5:cout<<num1%num2;
      break;
    default :cout<<"Invalid operation";
  }
  return 0;
}
