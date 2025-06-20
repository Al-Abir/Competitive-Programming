#include<iostream>
#include<vector>
using namespace std;
class Solution {
  public:
    vector<int> minPartition(int N) {
        // code here
        int currency[]={2000,500,200,100,50,20,10,5,2,1};
        
        int notes=0,i=0;
        vector<int>ans;
        while(N){
            
            notes = N/currency[i];
            while(notes--){
                 ans.push_back(currency[i]);
            }

            N%=currency[i];
            i++;
        }
        return ans;
        
    }
};

int main(){

    Solution sl;
    int n;
    cin>>n;
    vector<int> res = sl.minPartition(n);

    for(int num: res){
        cout<<num<<" ";
    }
    cout<<endl;

    return 0;

}