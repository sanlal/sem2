#include <iostream>
#include <stdlib.h>
#include <limits.h>
#define CAPACITY 5
using namespace std;

struct Stack
{
  int *array;
  int top;
  // unsigned capacity;
} 
sturct Stack *createStack(CAPACITY) {// unsigned capacity
struct Stack *stack = (struct Stack *)malloc(sizeof(struct Stack));
// stack->capcity=capacity;
stack->top = -1;
stack->array = (int *)malloc(CAPACITY * sizeof(int)); // stack->capacity
return stack;
}

int isFUll(struct Stack *stack)
{
  return stack->top== CAPACITY - 1; // stack->capacity
}

int isEmpty(struct Stack *stack)
{
  return stack->top == -1;
}

void push(struct *Stack stack, int item)
{
  if (isFull(stack))
    return;
  stack->array[++stack->top] = item;
  cout << item << " pushed to stack \n";
}

int pop(struct Stack *stack)
{
if(isEmpty(stack))
return INT_MIN;
return stack->array[stack->top--];
}

int peek(struct Stack *stack)
{
if (isEmpty(stack))
  return INT_MIN;
return stack->array[stack->top];
}

int main()
{
struct Stack *stack = createStack(10);
push(stack, 1);
push(stack, 2);
push(stack, 3);

cout << pop(stack) << " popped from stack\n";
cout << peek(stack) << " is top item\n";
return 0;
}
