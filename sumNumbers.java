while (i <=10) {
    System.out.println(i);
    i++;
}
printNumbers(5);
printNumbers(10);
printNumbers(20);
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
int i=1;
while (i <=10) {
    System.out.println(i);
    i++;
}
void printNumbers() {
    int i=1;
    while (i<=10) {
        System.out.println(i);
        i++;
    }
}
void printNumbers (int n) {
    int i=1;
    while (i<=n) {
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
sumNumbers(5683);
sumNumbers(106839);
sumNumbers(5);
sumNumbers(10);
sumNumbers(20);
sumNumbers(106839);
int sumNumbers(int n) {
    int sum = 0;
    for (int i=1; i<=n; i++) {
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