#include <iostream>
#include <cstdlib>
using namespace std;


void printNum(int n, int num){
    if(num > n){
        return;
    }
    cout<<num<<endl;
    num++;
    printNum(n,num);
}

int main(){
    int n;
    cout << "Enter a number: ";
    cin>>n;
    printNum(n,0);
    return 0;
}