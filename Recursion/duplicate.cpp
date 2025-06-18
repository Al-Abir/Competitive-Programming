#include<iostream>
using namespace std;
void remove_duplicate(string &s, int i, string &res,bool seen[26])
{
     if(i== s.size()){
        return;
     }

     char ch = s[i];
     if(!seen[ch-'a']){
         res+=ch;
         seen[ch-'a']=true;
     }

    remove_duplicate(s,i+1,res,seen);
}

int main(){
  string s = "abacbbadsfasb";
  string res ="";
  bool seen[26]= {false};

  remove_duplicate(s,0,res,seen);

  cout<<res<<" "; 


    return 0;
}