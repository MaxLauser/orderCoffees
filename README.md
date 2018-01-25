# Welcome to the orderCoffees wiki!

orderCoffeees is a simple android app(basic app), doesn't require any internet or even server to connect to in order to order a coffee, so as i told you its just simple, it does only a math operation to calculate the price of how much coffees you order based on $5 for 1 coffee.

## What can this app do?:

- the default number of coffees and price is set to 0 by default
- Increase the number of coffees you want
- Also decrease it, but stopped at 0 (its not logically to order -1 coffee xD)
- Shows a toast message when you order your coffees
- Perform new order

## What event are used in this app ?:

### It uses 4 onClick events

1. Increase the amount of coffees you want(executed when **plus** button is clicked)
2. Decrease the amount of coffees you want(executed when **minus** button is clicked)
3. Order the amount of coffees you want(executed when **order** button is clicked)
4. perform new order (executed when "**new order**" button is clicked)

### The name of every onClick event method used in the MainActivity Java file and its role:

1. `submitOrder(View view)` --> when **order** button is clicked
          * display a toast message "Your order has been submitted"
2. `newOrder(View view)`    --> when **new order** button is clicked
          * set default value for quantity(0) and price(0)
3. `increase(View view)`    --> when **plus** button is clicked
          * increase the quantity by 1
4. `decrease(View view)`   --> when **minus** button is clicked
          * decrease the quantity by 1

### Other helpful methods:

1. `display(int number)`:
          - connect to the quantity TextView and display a given value
2. `displayPrice(int number)`:
          - connect to the price TextView and display a given value

### Other helpful explanation to fully understand the code:

* i used 3 helpful variables:
1. `price`: i fixed the value of this variable to 5 which means $5 for 1 cop of coffee
2. `int initialQuantity`: declared in the class but outside of any method because i want it to be global variable so if i changed its value from somewhere else it will be changed everywhere i use it, when i click `newOrder()` method executed it set the default quantity to `initialQuantity` which is 0 and default price to `initialQuantity*price` which equal to 0 (0*5 = 0)
3. `newQuantity`: when user increase(click +)/decrease(click -) the quantity value this variable get increased/decreased

* while decreasing the quantity, i check either it's negative or not, if negative then set the quantity to 0 and price to 0 as well.