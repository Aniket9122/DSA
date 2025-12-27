/*

*/

#include <iostream>
#include <cstdlib>
using namespace std;

void swap(int arr[], int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

void revers(int arr[], int i, int j){
    if(i == j){
        return;
    }
    swap(arr, i, j);
    revers(arr, i + 1, j - 1);
}

int main(){
    int arr[5] = {1, 2, 3, 4, 5};
    revers(arr,0,5);
    for(int i = 0; i < 5; i++){
        cout << arr[i] << " ";
    }
    return 0;
}