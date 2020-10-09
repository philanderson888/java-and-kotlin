# Collections

## Contents

- [Collections](#collections)
  - [Contents](#contents)
  - [List](#list)
    - [List To Array](#list-to-array)
  - [Queue](#queue)

## List

```java

```

### List To Array

```java
int[] array = list.stream().mapToInt(Integer::intValue).toArray();
```

## Queue

```java
PriorityQueue<Integer> q = new PriorityQueue<>();
for (int i = 0; i < n; i++){
    q.add(0);
}
```


```java
// create a queue of people from the array
Queue queue = new LinkedList<Integer>();
for(var item:customers){
    queue.add(item);
}
// print customer queue
System.out.println("\n\nCustomer Queue at start is: ");
for(var item:queue){
    System.out.print(item + ", ");
}
```

