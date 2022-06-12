## Working of Synchronized Keyword
Let us see how synchronized keyword helps us.

### About - [`SynchronizedDemo`](./SynchronizedDemo.java) 
- If we are **not** declaring **wish** method as synchronized then all the threads will be executed simaltaneously and hence we will **irregular or inconsistent** output
- If we declare **wish** method as synchronized then all the threads will be synchronized and hence we will get **regular or consistent** output