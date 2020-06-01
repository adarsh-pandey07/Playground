#include<iostream>
using namespace std;
int main() {
  int n,count= 0;
  cin>>n;
  do{
    count += 1;
    n /=10;
  }while(n);
  cout<<count;
}