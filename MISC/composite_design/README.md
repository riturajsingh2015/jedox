## Composite Design Pattern Example

Here is an example of the Composite pattern in Java. Here we have used the Composite pattern to represent employees in an organization. Here some employees are **Managers**, who are the composite objects because they contain the reference to other employees who report to them.

If we need to print directs(employees who report to him) for a list of employees, we can not do this without checking if this employee is a Manager or not. One way to remove this check is by using the Composite pattern, which allows treating both normal **employees** and **managers** in the same way.

- In composite design pattern, we have a **Component** object, which defines a method for both leaf and composite objects, in this example it is Employee, who has methods like add(Employee e), remove(Employee e) as well as normal methods like getId(), getName()

- In our example, **Employee** will be an interface, to provide a default implementation for most of the methods and it has two concrete subclasses **Developer** and **Manager** , where Developer is Leaf object and Manager is the composite object

- Manager overrides directs() method to return a list of Employees, who reports to him, while developer just returns an empty list, which is also a good example of avoiding NullPointerException using null object pattern.  



