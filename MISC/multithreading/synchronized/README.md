## Working of Synchronized Keyword
Let us see how synchronized keyword helps us.
- In our example multiple threads try to operate on the same **Display** object. Therfore, synchronization is required.

### Synchronized Method [`SynchronizedDemo`](./SynchronizedDemo.java) 
Source : [Synchronized Method](https://www.youtube.com/watch?v=equLV2F0vLA&list=PLd3UqWTnYXOkWZUcbW68CbN9fyPFQ0LDk&index=7)
- If we are **not** declaring **wish** method as synchronized then all the threads will be executed simaltaneously and hence we will **irregular or inconsistent** output
- If we declare **wish** method as synchronized then all the threads will be synchronized and hence we will get **regular or consistent** output

### Synchronized Block
Source : [Synchronized Block](https://www.youtube.com/watch?v=ORzmjiYmOJg&list=PLd3UqWTnYXOkWZUcbW68CbN9fyPFQ0LDk&index=9)
- If very few lines of the code require synchronization, then it is not recommended to declare entire method as synchronized.
- We have to then enclose those few lines of the code by using synchronized block
- The main advantage of the synchronized block over synchronized method is :
- It reduces waiting time of thread and improves performance of the system