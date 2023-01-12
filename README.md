## Carpet Cost Calculator

### Description

The Carpet Company has asked you to write an application that calculates the price of carpeting for rectangular rooms. To calculate the price, you multiply the area of the floor (width times length) by the price per square meter of carpet. For example, the area of the floor that is 12 meters long and 10 meters wide is 120 square meters. To cover the floor with a carpet that costs $8 per square meter would cost $960.

1. Write a class with the name <b>Floor</b>. The class needs two fields (instance variables) with name <b>width</b> and <b>length</b> of type <b>double</b>.<br><br>The class needs to have one constructor with parameters width and length of type <b>double</b> and it needs to initialize the fields. In case the width parameter is less than 0 it needs to set the width field value to 0, in case the length parameter is less than 0 it needs to set the length field value to 0.<br><br>Write the following methods (instance methods):

<ul>
<li>Method named <b>getArea</b> without any parameters, it needs to return the calculated area (<b>width</b> * <b>length</b>).</li>
</ul>

2. Write a class with the name <b>Carpet</b>. The class needs one field (instance variable) with name <b>cost</b> of type <b>double</b>. The class needs to have one constructor with parameter cost of type <b>double</b> and it needs to initialize the field. In case the cost parameter is less than 0 it needs to set the cost field value to 0.<br><br> Write the following methods (instance methods):

<ul>
<li>Method named <b>getCost</b> without any parameters, it needs to return the value of <b>cost</b> field</li>
</ul>

3. Write a class with the name <b>Calculator</b>. The class needs two fields (instance variables) with name <b>floor</b> of type <b>Floor</b> and <b>carpet</b> of type <b>Carpet</b>. The class needs to have one constructor with parameters <b>floor</b> of type <b>Floor</b> and <b>carpet</b> of type <b>Carpet</b> and it needs to initialize the fields.<br><br>Write the following methods (instance methods):

<ul>
<li>Method named <b>getTotalCost</b> without any parameters, it needs to return the calculated total cost to cover the floor with a carpet.</li>
</ul>

### Test Code

    Carpet carpet = new Carpet(3.5);
    Floor floor = new Floor(2.75, 4.0);
    Calculator calculator = new Calculator(floor, carpet);
    System.out.println("total= " + calculator.getTotalCost());
    carpet = new Carpet(1.5);
    floor = new Floor(5.4, 4.5);
    calculator = new Calculator(floor, carpet);
    System.out.println("total= " + calculator.getTotalCost());

### Output

    total= 38.5
    total= 36.45
