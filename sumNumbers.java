while (i <= 10) {
    System.out.println(i);
    i++;
}
printNumbers();
printNumbers(5);
printNumbers(10);
printNumbers(20);
sumNumbers(5);
sumNumbers(11);
sumNumbers(23);
sumNumbers(5);
sumNumbers(11);
sumNumbers(23);
sumNumbers(5683);
sumNumbers(106839);
sumNumbers(5);
sumNumbers(10);
sumNumbers(20);
sumNumbers(106839);
sumNumbersTo10();
while (i <= 10) {
    System.out.println(i);
    i++;
}
void printNumbers() {
    int i = 1;
    while (i <= 10) {
        System.out.println(i);
        i++;
    }
}
printNumbers();
void printNumbers(int n) {
    int i = 1;
    while (i <= n) {
        System.out.println(i);
        i++;
    }
}
printNumbers(5);
printNumbers(10);
printNumbers(20);
sumNumbers(5);
sumNumbers(11);
sumNumbers(23);
sumNumbers(5);
sumNumbers(11);
sumNumbers(23);
sumNumbers(5683);
sumNumbers(106839);
sumNumbers(5);
sumNumbers(10);
sumNumbers(20);
sumNumbers(106839);
int sumNumbers(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum = sum + i;
    }
    return sum;
}
int sumNumbersTo10() {
    return sumNumbers(10);
}
sumNumbersTo10();
int sumNumbersTo13() {
return sumNumbers(13);
}
sumNumbersTo13();
addTwoNumber(5,10);
int addTwoNumber (int x, int y) {
    return x+y;
}
addTwoNumber(5,10);
int divideTwoNumbers(int x, int y) {
return x/y;
}
int multiplyTwoNumbers(int x, int y) {
return x*y;
}
int subtractTwoNumbers(int x, int y) {
return x-y;
}
divideTwoNumbers(4,2);
multiplyTwoNumbers(4,2);
subtractTwoNumbers(4,2);
isEven(5);
isEven(5);
isEven(4);
isEven(5);
isEven(4);
isEven(5);
boolean isEven(int x) {
    if (x%2==1){ 
return false;
} 
else { 
return true;
}
}
boolean isOdd (int x) {
if (x%2==1){
return true;
}
else { 
return false;
}
}
isOdd(5);
isOdd(4);
int i = 1;
while (i <= 10) {
    System.out.println(i + "%2=" + i % 2);
    i++;
}
void printOddEven() {
    int i = 1;
    while (i <= 10) {
        if (isEven(i)) {
            System.out.println(i +" is even");
        }
        else {
            System.out.println(i +" is odd");
        }
        i++;
    }
}
printOddEven();