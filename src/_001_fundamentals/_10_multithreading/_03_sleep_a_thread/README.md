# Thread.sleep() in Java with Examples

The Java Thread class provides the two variant of the sleep() method. First one accepts only an arguments, whereas the
other variant accepts two arguments. The method sleep() is being used to halt the working of a thread for a given amount
of time. The time up to which the thread remains in the sleeping state is known as the sleeping time of the thread.
After the sleeping time is over, the thread starts its execution from where it has left.

## The sleep() Method Syntax:

Following are the syntax of the sleep() method.

```
public static void sleep(long mls) throws InterruptedException   
public static void sleep(long mls, int n) throws InterruptedException
```

## Parameters:

The following are the parameters used in the sleep() method.

- **mls**: The time in milliseconds is represented by the parameter mls. The duration for which the thread will sleep is
  given by the method sleep().

- **n**: It shows the additional time up to which the programmer or developer wants the thread to be in the sleeping state.
  The range of n is from 0 to 999999.

The method does not return anything.