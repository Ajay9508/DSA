#include<iostream>
#include<cmath>
using  namespace std;
int countdigit(int num){
    int count=0;
    while(num>0){
        count++;
        num/=10;
    }
    return count;
}
void armstrong(int num, int digit){
    int n= num, rem,ans=0;
    while(n>0){
        rem = n%10;
        ans +=pow(rem,digit);
        n/=10;
    }
     if(ans == num){
    cout<< "this is armstrong number"<<endl;
    }else{
    cout<<"This is not armstrong nunber"<<endl;}
}
int main(){
    int num;
    cin>>num;
    int digit=countdigit(num);
     armstrong(num, digit);
     return 0;
}