
2025-10-29 15:09
URL (if applicable): file:///C:/Users/Ashley-PC/Documents/Books/Spring%20Start%20Here%20Learn%20what%20you%20need%20and%20learn%20it%20well%20(Laurentiu%20Spilca%20[Spilc%C4%83,%20Lauren%C8%9Biu])%20(Z-Library).pdf
Author: Laurentiu Spilca

# Spring Start Here

xi
>In my opinion, this book is a must-read for any developer starting on their first Spring project.

I picked up this book as I felt overwhelmed by the requirements of an idea for an app I recently had fleshed out.

While I have implemented a project utilizing the Spring framework, I recognize that I have yet to fully understand its fundamentals.

My hopes are that this book will aid me in tackling my project, as the line exactly suggests.


xviii
> My recommendation is you build these examples with me while reading. Then, you can compare your result with my solution.

I was wondering how I could effectively learn from the book, considering it's in a different format from the MOOC Java Programming course. I appreciate how the author explicitly stated the importance of recreating the examples along with the book, as well as performing comparisons.


xviii
![[000 - Attachments/Pasted image 20251029154915.png]]


xix
>The book provides about 70 projects, which we’ll work on in chapters 2 through 14. When working on a specific example, I mention the project’s name, which implements that example. My recommendation is to try to write your example from scratch and then use the provided project only to compare your solution with mine. This approach will help you better understand the concepts you’re learning.

Following on the same idea I quoted previously, the formula for learning, as in any media or material, I have to first write the solution on my own -> perform the comparison with the model solution.

**WRITE MY OWN SOLUTION FROM SCRATCH -> PERFORM COMPARISON TO MODEL SOLUTION**


3
> An application framework is a set of common software functionalities that provides a foundation structure for developing an application.

A framework is used amongst many things, not only in the backend, but also the frontend. My first encounter with a framework was `TailwindCSS`.

My understanding of Spring is that it "bootstraps" your application to fill in the common operations an application typically requires. It's akin to a boilerplate – however, in this case, it's not just a boilerplate for a single code but for your entire application. It's providing abstraction to help the developer focus on what matters the most.


4
> You need to understand all these things about the Spring framework before trying to use it. Otherwise, you might try to use a hammer to dig your garden.

*"You might try to use a hammer to dig your garden."*

I love this line. It perfectly encapsulates my reasoning behind picking up this book. As I said previously, I had this overwhelming feeling towards the development of the idea I had. I feel as if I do not have the correct/enough understanding of the tools I have at my disposal.


4
>I use this approach because learning a framework like Spring doesn’t always offer us a linear learning path, and sometimes you need to wait until you get more pieces of the puzzle before you see the complete picture.

Right on. When I first learned about programming, while I understood the syntax, I couldn't understand the "*why*". It was only until later on that we were given practical assessments, allowing me to grasp its true purpose. 

I've always considered myself an "*empiricist*" in learning. If I were to learn about a topic, I needed to understand why it existed and see practical implementations of it.

This is the same exact reason why I liked Object Oriented Programming, it models after real world objects in the problem domain that make the problem solution more "*tangible*" to me.


4
> To be motivated to use something, you need to know how that something brings you value.

My previous note on a quote from the same page points to this same exact idea.

I need to see how that something serves me, to actually want to learn and use it.


5
> The application framework offers you various pieces of software you need to build your app. You need to know what features to choose and how to assemble them to achieve the right result.

I think this is the reason why I felt overwhelmed by immediately starting the development for my app. I knew what I wanted for the app, but I don't have enough understanding of the tools at my disposal. 

It's similar to writing code with AI as a beginner – you don't understand the fundamentals yet, so how are you going to be able to build efficient and effective applications? You can't build a house just by having the "correct" tools, you need to learn how to use the tools.


6
> Moreover, the business logic code is what makes an application different from another from the functionality point of view. If you take two different apps, say a ride-sharing system and a social networking app, they have different use cases.
> 
> A use case represents the reason a person uses the app. For example, in a ride-sharing app, a use case is “requesting a car.” For an app managing food delivery, a use case is “ordering a pizza.”

The business logic is the set of rules, requirements, or processes that are specific to that application.

It defines what the system is supposed to do. On the other hand, domain pertains to the domain of concepts in which the business operates. An online retail store operates in the domain of "customers", "orders", "items", "refunds", "deliveries", etc.

Another example of business logic could be writing a program to determine if a student is eligible for graduation. The requirements or rules needed for a student to be eligible would already be defined by the client – it is the business logic. 

As a programmer, we would need to make sure that the program adheres to the business logic. In this case, the algorithm would need to align with what exactly makes a student eligible for graduation.

To expand on the topic, we can use chess as another example. In a chess game, there are rules, the AI, these are all considered the business logic. 

However, the code for drawing pieces on the screen, saving the board state, getting input, etc. are not business logic. We could say that the latter makes up the technicalities on how exactly the application functions as a program.

To put it into perspective, the business logic is the *"what"* – what does the app do?

The non-business logic is the *"how"* – how will it do what the app needs to do?

In other words, your program needs to take user input and output. The data has to be sent in and out of the database, in which we implement certain logic to handle such. The user does not have to think about all these details, they only have to worry about how the program will do what they need out of it.

![[000 - Attachments/Pasted image 20251030141703.png]]


6
> You take different actions, but they both need data storing, data transfer, logging, security configurations, probably caching, and so on. Various applications can reuse these non-business implementations. Is it then efficient to rewrite the same functionalities every time?
> 
> - You spare a lot of time and money by reusing something rather than developing
> it yourself.
> 
> - An existing implementation that many apps already use has fewer chances to
> introduce bugs, as others have tested it.
> 
> - You benefit from the advice of a community because you now have a lot of
> developers understanding the same functionality. If you had implemented your
> own code, only a few people would know it.

As discussed in the previous note, there are a multitude of underlying processes behind the business logic code. These functionalities are not business-specific. Thus, it's not always efficient and necessary to rewrite the same functionalities every time.


8
> We refer to Spring as a framework, but it is much more complex. Spring is an ecosystem of frameworks.

Within the Spring framework are another set of frameworks that are designed to help you implement a specific part of an app faster.

![[000 - Attachments/Pasted image 20251030142757.png]]

The Spring Core defines the mechanisms that Spring uses to integrate into the app.


8-9
> Spring works based on the principle inversion of control (IoC)... Here’s where the “inversion” in IoC comes from: you don’t let the app control the execution by its own code and use dependencies. Instead, we allow the framework (the dependency) to control the app and its code (figure 1.4).

Inversion of Control (IoC) in Spring, pertains to how we make the framework *work* using our app and its code, instead of the other way around. The framework controls an app during its execution. 

>[!note]
>In this context the term “controls” refers to actions like “creating an instance” or “calling a method.” A framework can create objects of the classes you define in your app. Based on the configurations that you write, Spring intercepts the method to augment it with various features. For example, Spring can intercept a specific method to log any error that might appear during the method’s execution.

![[000 - Attachments/Pasted image 20251030143515.png]]


11
> We have Spring Data Access, which is a module of Spring Core, and we also have an independent project in the Spring ecosystem named Spring Data. Spring Data Access contains fundamental data access implementations like the transaction mechanism and JDBC tools. Spring Data enhances access to databases and offers a broader set of tools, which makes development more accessible and enables your app to connect to different kinds of data sources.

Spring Data is different from the Spring Data Access module from Spring Core. Spring Data provides an extended level of functionalities.


11
> Spring Boot is a project part of the Spring ecosystem that introduces the concept of “convention over configuration.” The main idea of this concept is that instead of setting up all the configurations of a framework yourself, Spring Boot offers you a default configuration that you can customize as needed. The result, in general, is that you write less code because you follow known conventions and your app differs from others in few or small ways. So instead of writing all the configurations for each and every app, it’s more efficient to start with a default configuration and only change what’s different from the convention.

Spring Boot helps "*bootstrap*" the application following the convention of setups present within similar applications. Following the same idea behind the Spring framework, with Spring Boot, we are able to retrieve a "*default*" configuration, wherein we can then make changes as necessary to fit the context of our application.


12
> My advice for you is to always take into consideration your alternatives. In software development, you need to be open-minded and never trust one solution as being “the one.” You’ll always find scenarios in which a specific technology works better than another.

We don't always have to stick to a specific technology all the time. We can determine what works best for our use case and adapt accordingly. Most of our knowledge in different solutions or technology are always transferable to one another anyway – what matters most is our fundamental understanding.


12
> Remember what we discussed in section 1.2: a framework is not always a good choice. But these are common cases in which generally Spring is a good fit:
	1 The development of a backend app
	2 The development of an automation testing framework
	3 The development of a desktop app
	4 The development of a mobile app

![[000 - Attachments/Pasted image 20251030151522.png]]

While the figure above can be quite intimidating to look at, understanding it at this point is of no importance. The figure above goes to show how complex an application can be in the real world, the Spring framework is utilized to reduce the level of complexity.

Below is a diagram of the same use case for an application, utilizing the Spring framework.

![[000 - Attachments/Pasted image 20251030151841.png]]

The diagram above is much more cohesive due to the nature of frameworks. As the author stated, they had to rewrite a 25 year old system from scratch using the Spring framework – by the end of it, they were able to reduce the lines of code by 40%.

![[000 - Attachments/Pasted image 20251030152211.png]]

We can also utilize Spring for developing test automation apps. In the diagram above, we utilized different components of the Spring ecosystem to have a simpler implementation of functionalities.


17
>Sometimes, using a tool that’s too much for the job might consume more energy and also
obtain a worse result. Imagine using a chainsaw to cut bread. While you could try to and even achieve a final result, it’d be more difficult and energy-consuming than using a regular knife (and you may end up with nothing but breadcrumbs instead of sliced bread).

We don't have to use frameworks all the time. That's why our fundamental understanding is critical in this process – if we understand the reasoning behind architectural decisions, we can determine if it's best for our project.

To reflect upon this further, I have also been contemplating if the utilization of the Spring framework for my app is optimal. I expect to have a clearer answer to this by the end of the book. But so far, I determine that Spring Boot, Spring Data, and Spring Security, can be highly useful for my application.

The list below are certain scenarios where implementing a framework is not ideal:

1. You need to implement a particular functionality with a footprint as small as possible. By footprint, I mean the storage memory occupied by the app’s files.
2. Specific security requirements force you to implement only custom code in your app without making use of any open source framework.
3. You’d have to make so many customizations over the framework that you’d write more code than if you’d simply not used it at all.
4. You already have a functional app, and by changing it to use a framework you don’t gain any benefit.


17
> One crucial principle regarding app deployment in containers is that the containers should be easily disposable: they can be destroyed and recreated as fast as possible. The size of the app (footprint) matters a lot here. You can save seconds from the app initialization by making it smaller.

When using containers such as Docker, Kubernetes, we want to make sure our footprint is as small as possible.


17-18
> Such a case is a kind of application called server-less function. These server-less functions are tiny applications deployed in containers. Because you don’t have too much access to the way they’re deployed, it looks like they execute without a server (hence their name). These apps need to be small, and that’s why, for this specific case of apps, you’ll want to avoid adding a framework as much as possible. Because of its size, it’s also possible that you won’t need a framework anyway.

In the case of server-less functions, there is no need to implement frameworks due to its size. Implementing a framework would only overload the footprint, making its deployment sub-optimal.


18
> I said in point two that in specific situations, apps could not use frameworks because of security requirements. This scenario usually happens with apps in the field of defense or governmental organizations. Again, it doesn’t mean all the apps used in governmental organizations are prohibited from using frameworks, but for some, restrictions are applied. You may wonder why. Well, say an open source framework like Spring is used. If someone finds a specific vulnerability, it will become known, and a hacker could use this knowledge to exploit it. Sometimes, stakeholders of such apps want to make sure the chances of someone hacking into their system is as close to zero as possible. This could lead to even rebuilding a functionality instead of using it from a third-party source.

While using open source libraries or frameworks can be more secure due to its nature, applications requiring high level of security want to avoid this level of exposure to the public. In such case, its more common to rebuild a certain functionality entirely from scratch rather than using it from a third-party source.


18
> Another case (point three) in which you might want to avoid using a framework is when you’d have to customize its components so much that you end up writing more code than if it hadn’t been used. 

If a framework will only bloat your application, or make you write more code than necessary, then it's best to steer away from it.

Exerting more effort to customize the framework to fit your needs than just writing the functionality from scratch, may signify that the framework probably doesn't suit the project or a framework may not be needed at all.


19
> Sometimes we are tempted to replace an existing architecture with something new. A new framework appears, and it’s popular, and everyone uses it, so why shouldn’t we change our app as well to use this framework? You can, but you need to attentively analyze what you want to achieve by changing something that works.

"*If it ain't broke, don't fix it.*"

As long as the change brings benefit, then it's worth replacing the existing architecture. These benefits could be better maintainability, better performance, or better security. If there really isn't a benefit – don't waste your time, effort, and resources, to fix something that still works.


20
>Using a widely known framework like Spring opens a door to a large community, which makes it more likely that others will faces similar problems. You then have an excellent opportunity to learn about how others solved something similar to an issue you need to address, which will spare you the time of individual research.

As previously mentioned, frameworks with a large community base allow us to seek support on issues that we encounter. Most of the time, these issues have already been encountered by users and thus, the solutions to them are already readily available.


22
> Imagine the context as a place in the memory of your app in which we add all the object instances that we want the framework to manage. By default, Spring doesn’t know any of the objects you define in your application.

The context is where we add all the object instances that we want Spring to manage.

It is explicitly stated that only the objects we add to the context are handled by Spring, because not all objects need to be managed by Spring.


23
> A build tool is software we use to build apps more easily. You configure a build tool to do the tasks that are part of building the app instead of manually doing them.
> 
> Some examples of tasks that are often part of building the app are as follows:
	 Downloading the dependencies needed by your app
	 Running tests
	 Validating that the syntax follows rules that you define
	 Checking for security vulnerabilities
	 Compiling the app
	 Packaging the app in an executable archive

The build tool helps us streamline the set up needed prior to running an application, such as downloading dependencies, running tests, validating syntax, checking for vulnerabilities, compiling the app, and packaging the app in an executable archive.

## Chapter 2: The Spring context: Defining Beans

29
#### Three ways of adding beans to the Spring context
- Using @Bean annotation
- Using stereotype annotations
- Programmatically


32
> If you’re just getting started with Spring, my recommendation is to avoid getting into details with context implementations and these classes’ inheritance chains. Chances are that if you do you’ll get lost with unimportant details instead of focusing on the essential things.

It's a good reminder to focus more on the fundamentals or essentials rather than intricate details when starting out. More often that not, these abstractions were created for us not to have to worry about them to begin with.


32
![[000 - Attachments/Pasted image 20251031144151.png]]

At this point, I was able to create the Parrot class, an instance of it, and as well as an instance of the `AnnotationConfigApplicationContext` class.

We need to add the instance to the Spring context in order for the framework to recognize it.


33
#### How to add a bean to the Spring context using the @Bean annotation.

1. Create a configuration class with the annotation @Configuration.
2. Create a method within the configuration class that returns the object instance of the object you want to add to the context and annotate it with @Bean.
3. Make the Spring context utilize the configuration created from the first step.

![[000 - Attachments/Pasted image 20251031151808.png]]


35
![[000 - Attachments/Pasted image 20251031152529.png]]

> Observe that the name I used for the method doesn’t contain a verb. You probably learned that a Java best practice is to put verbs in method names because the methods generally represent actions. But for methods we use to add beans in the Spring context, we don’t follow this convention. Such methods represent the object instances they return and that will now be part of the Spring context. The method’s name also becomes the bean’s name (as in listing 2.8, the bean’s name is now “parrot”). By convention, you can use nouns, and most often they have the same name as the class.

**What are the conventions for naming the method that returns the object instance of the object we want to add to the Spring context?**
- The name of the method, which returns the object instance, becomes the bean's name – we don't follow the conventions for Java methods (verb), instead we use a noun, and often times they are the same name as the class.


38-40
##### Adding multiple beans of the same type to the Spring Context

To add a new bean of the same type, we can simply rewrite the name of the method returning the object instance, with a unique identifier. From there, we can create new beans (the methods returning that object instance) as necessary, making sure they have the a unique identifier.

```java
@Bean  
@Primary  
Parrot parrot1() {  
    var p = new Parrot();  
    p.setName("Koko");  
    return p;  
}  
  
@Bean  
Parrot parrot2() {  
    var p = new Parrot();  
    p.setName("Miki");  
    return p;  
}  
  
@Bean  
Parrot parrot3() {  
    var p = new Parrot();  
    p.setName("Riki");  
    return p;  
}
```

We can refer to the instance by using the parameters `context(*nameOfBean*, *objectType*)` .

```java
Parrot p = context.getBean("parrot1", Parrot.class);
```

We can also use the following value attributes as an identifier to the bean:
- @Bean(name = "miki")
- @Bean(value = "miki")
- @Bean("miki")

```java
@Bean  
@Primary  
Parrot parrot1() {  
    var p = new Parrot();  
    p.setName("Koko");  
    return p;  
}  
  
@Bean(name = "miki")
Parrot parrot2() {  
    var p = new Parrot();  
    p.setName("Miki");  
    return p;  
}  
  
@Bean  
Parrot parrot3() {  
    var p = new Parrot();  
    p.setName("Riki");  
    return p;  
}
```

```
Parrot p = context.getBean("miki", Parrot.class);
```

Using the code above, referring to Parrot without specifying the name would return the name `Koko`.

```
Parrot p = context.getBean(Parrot.class);
```


41
#### Using stereotype annotations to add beans to the Spring context

![[000 - Attachments/Pasted image 20251105161252.png]]

To use stereotype annotations, we first need to put the `@Component` annotation to the class we want to add as a bean to the Spring Context. Then we use the `@ComponentScan` annotation to the configuration class to tell Spring where to look for classes that utilize stereotype annotations.

In short, we need to:
- Annotate which classes to add to the Spring Context
- Annotate where these classes can be found by Spring

> [!note] 
> 
> The above implementation allows us to achieve similar results when using the `@Bean` annotation, with less code. However, if we attempt to call the `getter` method for the `name` attribute of the `Parrot` class, the program will return null. The `@Component` annotation simply creates an instance of the class, but does not define its attributes. The responsibility to assign such attributes is passed on to the programmer.

![[000 - Attachments/Pasted image 20251105174843.png]]


44
#### Advantages and disadvantages: A comparison of the two ways of adding beans to the Spring context, which tells you when you would use either of them

###### Using the @Bean annotation
- You have full control over the instance you want to add to the Spring context as defined in the methods for the configuration.
- You can make multiple methods to create an instance of the same object.
- You can add any object or class to the Spring context, regardless whether or not if it's part of your application or an object class such as Integer or String.
- You have to write a separate method for each object instance.
###### Using stereotype annotations
- You can only control the instance after the framework creates it.
- You can only add one instance of the class to the context.
- You can only use classes your application owns. You can't annotate pre-defined classes such as String or Integer.
- There is less boilerplate code using this method.

>[!summary]
>Use stereotype annotations first for everything you own; use `@Bean` for everything else.


44
#### Using `@PostConstruct` to manage an instance after its creation

When using stereotype annotations, we have no control over the instance at instantiation. As a remedy, we can use the `@PostConstruct` annotation to manage the instance after its creation.

For example, for the same `Parrot` class, if we want to assign a `name` attribute to it, we can set it manually by using the `@PostConstruct` annotation to a method that performs the set of actions we want executed after instance creation.

From the name of the annotation itself `@PostConstruct`, you can think of it as telling Spring: "Here's the set of instructions that must be executed after you create the instance."

```java
@Component
public class Parrot {
    private String name;

    @PostConstruct
    public void setupName() {
        this.name = "Kiki"; // Custom logic after constructor
    }
    
    // ...getters/setters...
}
```

The `@PostConstruct` is a feature borrowed from Java EE's annotation API. Starting from Java 11, it must be added as a dependency to utilize the annotation.

```xml
<dependency>
<groupId>javax.annotation</groupId>
<artifactId>javax.annotation-api</artifactId>
<version>1.3.2</version>
</dependency>
```

There is also an annotation called `@PreDestroy`, however, this annotation is less used in real-world apps as it presents some issues if Spring fails to clear the context. For example, if it doesn't properly clear the database connection specified in the `@PreDestroy` method, there can be a multitude of problems.


45
#### Programmatically adding beans to the Spring context

There may be instances where we want a custom solution for adding beans to the Spring context, particularly for when the previous annotations, `@Bean` and stereotype annotations do not fit our needs.

One specific example could be if we want to conditionally add a bean to the Spring context.

```java
Parrot p1 = new Parrot();
p1.setName("Kiki");
p1.setColor("Red");

Parrot p2 = new Parrot();
p2.setName("Miki");
p2.setColor("Green");

Parrot p3 = new Parrot();
p3.setName("Riki");
p3.setColor("Green");

Parrot[] allParrots = {p1, p2, p3};

for (Parrot p : allParrots) {
	// Only add instances of the Parrot class if they are "Green"
	if (p.getColor().equals("Green")) {
		Supplier<Parrot> parrotSupplier = () -> p;  
	
        context.registerBean(p.getName(), Parrot.class, parrotSupplier); 
	}
}
```

![[000 - Attachments/Pasted image 20251105185934.png]]
![[000 - Attachments/Pasted image 20251105185242.png]]

The solution would involve using the `registerBean` method. The method takes in the following parameters: the name of the bean to be added, the class we want to add to the Spring context, the Supplier instance for the class, and an optional `BeanDefinitionCustomizer` for properties like the `@Primary` annotation.

In this case, the configuration class for the application could be empty.

```java
@Configuration
public class ProjectConfig {
}
```

Most of the implementation would occur within the main class:

```java
public class Main {  
    public static void main(String[] args) {  
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);  
  
        Parrot x = new Parrot();  
        x.setName("Kiki");  
  
        Supplier<Parrot> parrotSupplier = () -> x;  
  
        context.registerBean("parrot1", Parrot.class, parrotSupplier);  
  
        Parrot p = context.getBean(Parrot.class);  
        System.out.println(p.getName());  
    }  
}
```

![[000 - Attachments/Pasted image 20251105185505.png]]

The fourth parameter for defining the other characteristics of the bean, such as setting it as `@Primary`, would be implemented as such:

```java
context.registerBean("parrot1",
Parrot.class,
parrotSupplier,
bc -> bc.setPrimary(true));
```

>[!note]
>This approach can only be implemented using Spring 5 and later!


## Chapter 3: The Spring context: Wiring beans

51
> At the end of this chapter, you’ll have the needed skills to use the Spring context and configure beans and relationships among them. This skill is the foundation of using Spring; you won’t find any Spring app in which you wouldn’t apply the approaches we discuss in this chapter. 

Chapters 2 to 5 are the most important sections of the book as they teach you the fundamentals on implementing Spring into your application.


51
#### Implementing relationships among beans defined in the configuration file 

##### Ways of establishing relationships between beans

- Link the beans by directly calling the methods that create them (*wiring*).
- Enable Spring to provide us a value using a method parameter (*auto-wiring*).

We also have a third approach that is based on the "IoC" (Inversion of Control) , which is called *dependency injection*. This approach also utilizes the `@Autowired` annotation from the second approach. 


52
For the two ways of establishing relationships between beans, we must conduct the following steps:

1) Add the beans to the Spring context
2) Establish the relationship between the beans

![[000 - Attachments/Pasted image 20251106171140.png]]

In this specific example, we first want the classes "Parrot" and "Person" to be recognized by the Spring context. After the initial step, we need to establish the relationship between the two beans.

![[000 - Attachments/Pasted image 20251106171424.png]]

As more technically presented in Figure 3.2, we observe the "has-a" relationship between "Person" and "Parrot". In a more literal sense, the *"The person has a parrot"*.

The code implementation for the first step is as follows:

1) We create the classes, which have a relationship to one another.

```java
public class Parrot {
	private String name;
	
	// Omitted getters and setters
	
	@Override
	public String toString() {
		return "Parrot : " + name;
	}
}
```

```java
public class Person {
	private String name;
	private Parrot parrot;
	
	// Omitted getters and setters
}
```

2) We make these classes known to the Spring context, adding them as beans.

```java
a@Configuration
public class ProjectConfig {
	@Bean
	public Parrot parrot() {
		Parrot p = new Parrot();
		p.setName("Koko");
		return p;
	}
	
	@Bean
	public Person person() {
		Person p = new Person();
		p.setName("Ella");
		return p;
	}
}
```

3) We can now implement the context into the Main class and observe what the objects return to us:

```java
public class Main {
	public static void main(String[] args) {
		/* create an instance of the Spring context based on the
		config class */
		var context = new AnnotationConfigApplicationContext
		(ProjectConfig.class);
		
		/* retrieve a reference to the Person bean from the 
		Spring context */
		Person person = context.getBean(Person.class);
		/* retrieve a reference to the Person bean from the 
		 Spring context  */
		Parrot parrot = context.getBean(Parrot.class);
		
		// outputting the instances' attributes to make sure they match
		System.out.println("Person's name: " + person.getName());
		System.out.println("Parrot's name: " + parrot.getName());
		System.out.println("Person's parrot: " + person.getParrot());
}}
```

```Output
Person's name: Ella
Parrot's name: Koko
Person's parrot: null
```

Since we have yet to establish the relationship between the two beans, the Person instance returns null for its attribute Parrot. 

![[000 - Attachments/Pasted image 20251106172311.png]]


55
##### Wiring the beans using a direct method call between the @Bean methods

```java
@Configuration  
public class ProjectConfig {  
  
    @Bean  
    Parrot parrot() {  
        Parrot p = new Parrot();  
        p.setName("Koko");  
  
        return p;  
    }  
  
    @Bean  
    Person person() {  
        Person p = new Person();  
  
        p.setName("Ella");
        /* directly calling the method for the Parrot bean, linking the
        the two together */
        p.setParrot(parrot());  
  
        return p;  
    }  
}
```

A common approach for "wiring" beans together is by simply calling the `@Bean` method from within one another in the configuration class.

![[000 - Attachments/Pasted image 20251107202828.png]]

By directly calling the `parrot()` (which returns the bean) inside the `person()` method's setter for its Parrot attribute, we establish a "has-A" (owns) relationship between the two.

> The `Person` bean "has-A" (owns) the `Parrot` bean.

![[000 - Attachments/Pasted image 20251107203154.png]]
![[000 - Attachments/Pasted image 20251107203202.png]]

You might think this would create two instances of the `Parrot` class: one when Spring calls the `parrot()` method, and a second one when the `person()` method calls it.

Spring does not create two instances. Because the class is annotated with `@Configuration`, Spring *intercepts* the call to `parrot()` inside the `person()` method. Instead of executing the method again, it checks the Spring context for an existing bean of that type. It finds the `Parrot` bean that was already created and injects that **same instance**.

This process, outlined in Figure 3.6, ensures the `Parrot` bean remains a singleton, and the `Person` bean refers to the one already in the context.


58
##### Wiring the beans using the @Bean annotated method’s parameters

Another alternative to the previous approach is by providing the type of object to the bean's method parameters for the other bean we want to establish a relationship with. 

This approach is a bit more flexible. With this approach, it doesn't matter if we used the `@Bean` annotation or the stereotype annotations to add the bean to the Spring context. We can call the type of object and Spring will perform "dependency injection" by looking for the bean within its context and inject it into the parameter.

![[000 - Attachments/Pasted image 20251107210859.png]]![[000 - Attachments/Pasted image 20251107211126.png]]

```java
@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    // Spring sees this parameter and "injects" the Parrot bean
    public Person person(Parrot parrot) { 
        Person p = new Person();
        p.setName("Ella");
        // We use the injected bean, not a direct method call
        p.setParrot(parrot); 
        return p;
    }
}
```


61
#### Using the @Autowired annotation to inject beans

This approach involves the use of the `@Autowired` annotation, where we mark an object's property where we want to inject a specific value from the Spring context.

There are three ways we can use the `@Autowired` annotation.
- Injecting the value through the field of the class (usually found in examples and proofs of concept)
- Injecting the value through the constructor parameters of the class (most often used in real-world scenarios)
- Injecting the value through the setter (rarely used in production-ready code)


61
##### Using @Autowired to inject the values through the class fields

We can inject the values through simply annotating a particular property with the `@Autowired` annotation.

An example of this approach using the same Person and Parrot scenario is shown below:

```java
@Component  
public class Parrot {  
    private String name;  
  
    // Omitted getters and setters
}
```

```java
@Component  
public class Person {  
    private String name;  
  
	@Autowired  
    private Parrot parrot;
  
    // Omitted getters and setters
}
```

```java
@Configuration  
@ComponentScan(basePackages = "beans")  
public class ProjectConfig {  
}
```

By annotating the Parrot field of Person with the `@Autowired` annotation, we are instructing Spring to look at its context and assign the instance of the bean that matches this particular type or object. In simpler terms, we are telling it to "inject" the appropriate value in the annotated field.

![[000 - Attachments/Pasted image 20251108211042.png]]

We can also observe that the stereotype annotation is being utilized in this example (`@Component` and `@ComponentScan`).

![[000 - Attachments/Pasted image 20251108211245.png]]

>[!note]
>The author mentions that while the stereotype annotation was utilized in this example, the `@Bean` annotation can also be used. However, in real-world scenarios, the stereotype and the `@Autowired` annotations are more frequently used together.

While trying out this approach myself, I realized why the author noted that this is not often used in real-world scenarios: by using field injection, you cannot use the `final` keyword, which means the field can be changed after initialization.

In real-world scenarios, we want certain fields to be immutable.

Using field injection prevents immutability, as we can't set the field to `final`. The absence of immutability creates the risk that the value may be unintentionally modified, which could break the program.

The second approach discussed in the book (injecting through constructor parameters) delegates the responsibility of providing the dependency object to whoever instantiates the class. This, in turn, allows us to use the final keyword for the field, ensuring immutability.

> [!note] 
> The delegation of responsibility for providing the dependency can be handled either **by the programmer** in a unit test, or automatically by **Spring itself** (e.g., it looks at its context and passes on the appropriate bean to the constructor parameters).


64
##### Using @Autowired to inject the values through the constructor

As mentioned in the previous section, the second approach involves injecting the values through the constructor. 

![[000 - Attachments/Pasted image 20251109180752.png]]

When we set the public constructor for the class with the `@Autowired` annotation as well as pass on the object that we want, Spring takes a look at its context to search for the appropriate bean to the constructor parameters. Since we implemented it within the constructor, we can freely set the corresponding field outside the constructor as "final" and assign the instance from the Spring context as its value. 

![[000 - Attachments/Pasted image 20251109181119.png]]


65
##### Using dependency injection through the setter

The author also touches upon the approach of using dependency injection through the setter. However, he notes that this approach is not recommended as it poses more disadvantages than advantages.

The disadvantages of this approach are as follows:
- It's not as readable.
- It prevents immutability as you can't set the field to final.
- It doesn't help make testing easier.

An example of this approach can still be observed below:

```java
@Component
public class Person {
	private String name = "Ella";
	private Parrot parrot;
	// Omitted getters and setters
	@Autowired
	public void setParrot(Parrot parrot) {
	this.parrot = parrot;
	}
}
```



66
#### Dealing with circular dependencies

![[000 - Attachments/Pasted image 20251111200759.png]]

Spring handles the building and managing of dependencies to objects of our application, however, it's important that we avoid creating "circular dependencies".

Circular dependencies occur when Spring attempts to create an instance of a bean, but is unable to because the other bean needs the former bean to exist before it can be created. 

> It cannot create Bean A because it needs Bean B, and it cannot create Bean B because it needs Bean A.

When Spring looks at its context and discovers that there is no instance of the other bean, it cannot proceed with creating both of them – it gets caught up in a deadlock.

We can avoid circular dependency by making sure we don't define objects whose creation depends on one another. Having such relationship between two objects is a symptom of a design issue to begin with.

![[000 - Attachments/Pasted image 20251111201318.png]]

The above is an example of circular dependency, where we can observe how the `Person` bean's instantiation is dependent on the `Parrot` bean, and vice versa.

Running the app would result in the following error:

![[000 - Attachments/Pasted image 20251111201445.png]]


68
#### Choosing from multiple beans in the Spring context

There are multiple ways where we can instruct which Spring chooses as the bean when there are multiple beans of the same type in the Spring context.

1. Spring takes a look at your code to see if a bean is specified to be injected using the `@Qualifier` annotation.
2. If it doesn't find the `@Qualifier` annotation Spring will search for a bean in the Spring context which matches the identifier of the parameter.
3. If the previous conditions are not met, Spring chooses the bean in the Spring context marked with the `@Primary` annotation.
4. If none of these conditions above are met, the program will return an exception.

![[000 - Attachments/Pasted image 20251113183122.png]]

```Output
Person's name: Ella
Person's parrot: Parrot : Miki
```

Above is an example of Spring finding a match for the identifier within the parameter. It looked at the beans in the Spring context and found an exact match for the `parrot2` identifier with the same name.

The author notes while the approach above works perfectly fine, it's not as readable and easily refactorable. Imagine if another developer looked at your code – he or she would have to go through all the parameters to make sure it matches what he or she is looking for.

To resolve the issue of readability, we can use a much more visible approach using the `@Qualifier` annotation. However, the author does not forget to mention that other developers believe the `@Qualifer` annotation creates unneeded (boilerplate) code to your application. 

```java
@Configuration
public class ProjectConfig {
	@Bean
	public Parrot parrot1() {
		Parrot p = new Parrot();
		p.setName("Koko");
		return p;
	}
	@Bean
	public Parrot parrot2() {
		Parrot p = new Parrot();
		p.setName("Miki");
		return p;
	}
	@Bean
	public Person person( 
		@Qualifier("parrot2") Parrot parrot) {
		/* Using the @Qualifier annotation,
		you clearly mark your intention
		to inject a specific bean from the
		context. */
		
		Person p = new Person();
		p.setName("Ella");
		p.setParrot(parrot);
		return p;
	}
}
```

Running the code above will result in the same exact output as before.

The approach could also be implemented for beans that utilize stereotype annotations.

```java
@Configuration
@ComponentScan(basePackages = "beans")
public class ProjectConfig {
	@Bean
	public Parrot parrot1() {
		Parrot p = new Parrot();
		p.setName("Koko");
		return p;
	}
	
	@Bean
	/* With the current setup, the bean named
	parrot2 is the one that Spring injects into
	the Person bean */
	public Parrot parrot2() {
		Parrot p = new Parrot();
		p.setName("Miki");
		return p;
	}
}
```

Using the previous scenario, we annotate the `Person` class with `@Component`. In the context of this example, we kept the implementation of using the `@Bean` annotation for the `Parrot` class as we intend on creating two beans of the `Parrot` type in the configuration class.

```java
@Component
public class Person {
	private String name = "Ella";
	
	private final Parrot parrot;
	
	public Person(Parrot parrot2) {
		this.parrot = parrot2;
	}
	
	// Omitted getters and setters
}
```

In the code snippet above, we can observe that we made sure the identifier in the parameter matches the name of the bean method within the configuration class – the same implementation previously demonstrated.

As such, the program will return the same output:

```Output
Person's name: Ella
Person's parrot: Parrot : Miki
```

![[000 - Attachments/Pasted image 20251113185245.png]]

This slightly altered code demonstrates how the Spring framework determines which bean will be injected, in this case, both the `@Bean` annotation and the stereotype annotation are used.

The author does not forget to remind the reader that the `@Qualifier` annotation is much preferable due to its readability. The `@Qualifier` captures the intention better, where it signifies "I inject a specific bean from the context." This way, we avoid any issues if somewhere down the line, the application is refactored and the name of the variable is changed.

Here is the altered code for the `Person`, utilizing the `@Qualifier` annotation for specifying the correct bean.

```java
@Component
public class Person {
	private String name = "Ella";
	
	private final Parrot parrot;
	
	public Person(@Qualifier("parrot2") Parrot parrot) {
		this.parrot = parrot;
	}
	// Omitted getters and setters
}
```

> The behavior of the app doesn’t change, and the output remains the same. This approach makes your code less subject to mistakes.

## Chapter 4: The Spring context: Using abstractions

75

The chapter focuses on using abstraction using Spring beans. The author notes that abstraction is especially important in real-world projects, particularly for decoupling implementations. Through this, we ensure that the application becomes easier maintain and test.


76
#### Using interfaces to define contracts

The section reviews the use of interfaces in Java to define contracts.

> The interface specifies "what needs to happen", while the objects implementing the interface specifies "how it should happen".

> I learned that it’s always smarter to ask for what you need instead of for a solution when you have no idea what you’re doing. Interfaces are the way objects ask for what they need.

Objects implementing interfaces simply ask the interface, what tools do I need to solve the problem? The specific implementation of the solution using the said tools is entirely up to the object.

##### Using interfaces for decoupling implementations

To better explain the concept of interfaces, the author gives an example of a ride sharing app. In a ride sharing app, typically, the customer does not have to worry about what model the car is or what it looks like – their only focus is getting to their destination. Similarly, the driver only wants to get a customer but doesn't care about *who* the customer is.

Suppose you are developing a functionality for printing a package's details for a shipping app. The details need to be sorted by their destination address, and as a result, you want the object to delegate this responsibility to another object.

![](000%20-%20Attachments/Pasted%20image%2020251118102146.png)

The implementation above does exactly this. However, this implementation presents some issues.

The `DeliveryDetailsPrinter` and `SorterByAdrress` objects are strongly coupled, this means that if somewhere down the line, we decide to change the way we sort the addresses – we would need to change multiple areas of the code. The optimal design for such implementation is to avoid having to make changes to the object using the responsibility (of sorting addresses, in this case).

![](000%20-%20Attachments/Pasted%20image%2020251118102242.png)

We can utilize interfaces to improve the design as discussed previously. In the new implementation below, we create a `Sorter` interface. The `DeliveryDetailsPrinter` can utilize this new interface, so regardless of specificity, the details will still be sorted accordingly.

Under the `Sorter` interface, there are two different classes implementing it: `SorterByAddress` and `SorterByName`. We can add as many objects implementing the same interface as necessary, and more importantly, we don't have to worry about breaking the application because the `DeliveryDetailsPrinter` isn't tightly coupled to any specific implementation of the `Sorter` interface.

![](000%20-%20Attachments/Pasted%20image%2020251118102358.png)

```java
public interface Sorter {
	void sortDetails();
}
```

![](000%20-%20Attachments/Pasted%20image%2020251118112444.png)


79
##### The requirement of the scenario

> Say you are implementing an app a team uses to manage their tasks. One of the app’s features is allowing the users to leave comments for the tasks. When a user publishes a comment, it is stored somewhere (e.g., in a database), and the app sends an email to a specific address configured in the app.
> 
> We need to design the objects and find the right responsibilities and abstractions for implementing this feature.


80
##### Implementing the requirement without using a framework

Objects implementing use cases are referred to as *services*.

In the scenario discussed previously, we would need a service that implements the "publish comment" use case. The object is named `CommentService`; the author notes that it is preferable to insert "Service" at the end of the name of any service class to make its role in the project clearer (and stand out).

When analyzing the requirements of the scenario, we recognize that the use case consists of two actions: storing the comment and sending the comment by mail. These actions are two different responsibility, and thus we need to implement two objects.

An object that works directly with a database is generally named *repository*. Sometimes, these objects can also be referred to as *data access objects* (DAO). In this scenario, we name the object that implements the storing comment responsibility as `CommentRepository`.

When implementing objects whose responsibility is to establish communication with something outside the application, we name these objects *proxies*. In this scenario, we follow this convention and name the object whose responsibility is sending the email `CommentNotificationProxy`.

> But wait! Didn’t we say we shouldn’t use direct coupling between implementations? We need to make sure we decouple the implementations by using interfaces.

In an application, a lot can always change, and we want to make sure that implementing changes will be easy. Through implementing them as interfaces instead of objects, we can ensure that we avoid any direct coupling between implementations.

![](000%20-%20Attachments/Pasted%20image%2020251120185000.png)

![](000%20-%20Attachments/Pasted%20image%2020251120185202.png)

We can now begin with the implementation of the project in code.

![](000%20-%20Attachments/Pasted%20image%2020251120191920.png)

We first setup the packages to organize our project, making it easy to understand. 

We create a *POJO* (Plain Old Java Object) to represent the comment object. The responsibility of this type of object is to model the data the app uses, thus we place it within a package called *model*.

```java
public class Comment {  
    private String author;  
  
    private String text;  
  
	// Omitted getters and setters
}
```

```java
public interface CommentRepository {  
    void storeComment(Comment comment);  
}
```

```java
public class DBCommentRepository implements CommentRepository {  
  
    @Override  
    public void storeComment(Comment comment) {  
        System.out.println("Storing comment: " + comment.getText());  
    }  
}
```

As we don't know how to connect to a database yet at this point, we simulate this action through the console for now. 

The same goes for the `EmailCommentNotificationProxy` class.

```java
public class EmailCommentNotificationProxy implements CommentNotificationProxy {  
    @Override  
    public void sendComment(Comment comment) {  
        System.out.println("Sending notification for comment: " +  
                comment.getText());  
    }  
}
```

Finally, we can implement the `CommentService` class utilizing both the `CommentRepository` and the `CommentNotificationProxy` interfaces.

```java
public class CommentService {  
  
    // We define the two dependencies as attributes of the class.  
    private final CommentRepository commentRepository;  
    private final CommentNotificationProxy commentNotificationProxy;  
  
    /* We provide the dependencies when the object is  
    built through the parameters of the constructor. */    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {  
        this.commentRepository = commentRepository;  
        this.commentNotificationProxy = commentNotificationProxy;  
    }  
  
    /* We implement the use case that delegates the “store comment” and   
    “send notification” responsibilities to the dependencies. */  
    public void publishComment(Comment comment) {  
        commentRepository.storeComment(comment);  
        commentNotificationProxy.sendComment(comment);  
    }  
}
```

In the main class, we can test the whole class design.

```java
public class Main {  
    public static void main(String[] args) {  
        // Creates the instance for the dependencies  
        var commentRepository = new DBCommentRepository();  
        var commentNotificationProxy = new EmailCommentNotificationProxy();  
        // Creates the instance of the service class and providing the dependencies  
        var commentService = new CommentService(commentRepository, commentNotificationProxy);  
  
        // Creates an instance of comment to send as a parameter to the publish comment use case  
        var comment = new Comment();  
        comment.setAuthor("Laurentiu");  
        comment.setText("Demo comment");  
  
        // Calls the publish comment use case  
        commentService.publishComment(comment);  
    }  
}
```

```Output
Storing comment: Demo comment
Sending notification for comment: Demo comment
```


85
#### Using dependency injection with abstractions

In this section, we apply the Spring framework over the class design we implemented previously.

The goal of this section is to improve the reader's understanding of how Spring manages dependency injection when using abstractions.


85
##### Deciding which objects should be part of the Spring context

It's important to recognize whether or not an object has to be part of the Spring context. 

It all comes down to a simple question:

> “Does this object need to be managed by the framework?”

In the previous scenario, we only need to add an object to the Spring context if it has a dependency we need to inject from the context or if it's a dependency itself.

The only object in that doesn't have a dependency nor a dependency itself is `Comment`.

- `CommentService` - Has two dependencies, the `CommentRepository` and the `CommentNotificationProxy`.
- `DBCommentRepository` - Implements the `CommentRepository` interface and is a dependency of the `CommentService`.
- `EmailCommentNotificationProxy` - Implements the `CommentNotificationProxy` interface and is a dependency of the `CommentService`.

You might wonder why we didn't add the `Comment` class to the Spring context, the author explicitly states the following reason for this:

> Adding objects to the Spring context without needing the framework to manage them adds unnecessary complexity to your app, making the app both more challenging to maintain and less performant. (...) If you add the object to be managed by Spring without getting any benefit from the framework, you just over-engineer your implementation.

When adding objects to the Spring context, in this case, we can use stereotype annotations (`@Component`). However, it's important to remember that it doesn't make sense to annotate abstract or interface classes as these cannot be instantiated.

```java
/* Marking the class with @Component instructs Spring 
to instantiate the class and add an instance as a bean
in its context. */
@Component
public class DBCommentRepository implements CommentRepository {
	@Override
	public void storeComment(Comment comment) {
	System.out.println("Storing comment: " + comment.getText());
	}
}
```

![](000%20-%20Attachments/Pasted%20image%2020251124205558.png)

```java
@Component  
public class EmailCommentNotificationProxy implements CommentNotificationProxy {  
    @Override  
    public void sendComment(Comment comment) {  
        System.out.println("Sending notification for comment: " +  
                comment.getText());  
    }  
}
```

The `CommentService` class declares the dependencies to the other two components through the interfaces `CommentRepository` and `CommentNotificationProxy`.

Spring is smart enough to recognize that the attributes are defined with interface types, and thus, looks at the context to search for beans created with classes that implement the interfaces.

```java
// Spring creates a bean of this class and adds it to its context  
@Component  
public class CommentService {  
  
    private final CommentRepository commentRepository;  
    private final CommentNotificationProxy commentNotificationProxy;  
  
    /* We would have to use @Autowired if the class had more than one constructor.  
    Spring uses this constructor to create the bean and injects references    from its context in the parameters when creating the instance. */    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {  
        this.commentRepository = commentRepository;  
        this.commentNotificationProxy = commentNotificationProxy;  
    }  
  
    public void publishComment(Comment comment) {  
        commentRepository.storeComment(comment);  
        commentNotificationProxy.sendComment(comment);  
    }  
}
```

```java
// The @Configuration annotation marks the configuration class.  
@Configuration 

/* We use the @ComponentScan annotation to tell Spring in which  
packages to search for the classes annotated with stereotype  
annotations. Observe that the model package is not specified because it  
doesn’t contain classes annotated with stereotype annotations. */  
@ComponentScan(basePackages = {"proxies", "repositories", "services"})  
public class ProjectConfig {  
}
```

> [!note] 
> The author notes that one can either use the `basePackages` attribute of the `ComponentScan` annotation, or the `basePackageClasses` attribute of the same annotation. Both approaches have its own advantages and disadvantages. For instance, with the `basePackages` attribute, if the developer decides to change the name of the package – they would have to make the same change within the configuration class. On the other hand, with `basePackageClasses`, if changes are made to the name of a class, the error specifying this discrepancy would show up.

```java
public class Main {  
    public static void main(String[] args) {  
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);  
  
        var comment = new Comment();  
        comment.setAuthor("Laurentiu");  
        comment.setText("Demo comment");  
  
        var commentService = context.getBean(CommentService.class);  
        commentService.publishComment(comment);  
    }  
}
```

```Output
Storing comment: Demo comment
Sending notification for comment: Demo comment
```

With the implementation of the Spring framework to the example scenario, we can already see a difference. In the `Main` class, for example, we no longer had to create an instance of the `CommentService` class as well as its dependencies.

In a real-world scenario, we will end up having to manage several classes and managing them all without the Spring framework would be difficult to maintain. Having a framework like Spring makes all the difference; it reduces boilerplate code, allowing the developers to focus on functionality.
###### Different ways of using dependency injection with abstraction

1. Field dependency injection using `@Autowired`

```java
@Component
public class CommentService {
	/* Fields are no longer final, and they are marked with @Autowired. Spring uses the default constructor to create the instance of the class and then injects the two dependencies from its context. */
	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private CommentNotificationProxy commentNotificationProxy;
	
	public void publishComment(Comment comment) {
		commentRepository.storeComment(comment);
		commentNotificationProxy.sendComment(comment);
	}
}
```

2. `@Bean` annotated methods

```java
/* Because we don’t use stereotype  
annotations, we no longer need to use  
the @ComponentScan annotation. */  
@Configuration  
public class ProjectConfig {  
  
    // We create a bean for each of the two dependencies  
    @Bean  
    public CommentRepository commentRepository() {  
        return new DBCommentRepository();  
    }  
  
    @Bean  
    public CommentNotificationProxy commentNotificationProxy() {  
        return new EmailCommentNotificationProxy();  
    }  
  
    /* We use parameters of the @Bean method (which are now defined with  
    the interface type) to instruct Spring to provide references for beans    from its context, compatible with the type of the parameters. */    @Bean  
    public CommentService commentService(CommentRepository commentRepository,  
                                         CommentNotificationProxy commentNotificationProxy) {  
        return new CommentService(commentRepository, commentNotificationProxy);  
    }  
}
```


91
##### Choosing what to auto-wire from multiple implementations of an abstraction

In this section, we discuss what happens if the Spring context contains more instances that match a requested abstraction.

![](000%20-%20Attachments/Pasted%20image%2020251125210325.png)

In the figure above, we can see that we have two different implementations of the `CommentNotificationProxy` interface. When using dependency injection on the interface, we need to instruct Spring which implementation it should inject between the two.

```java
@Component  
public class CommentPushNotificationProxy implements CommentNotificationProxy {  
    @Override  
    public void sendComment(Comment comment) {  
        System.out.println("Sending push notification for comment: " + comment.getText());  
    }  
}
```

Running the same example from `sq-ch4-ex2` with the newly added implementation will return an error:

```Output
Caused by: org.springframework.beans.factory.NoUniqueBeanDefinitionException:

No qualifying bean of type 'proxies.CommentNotificationProxy' available:
expected single matching bean but found 2:

commentPushNotificationProxy,emailCommentNotificationProxy
```

###### Marking an implementation as default for injection with `@Primary`

The first solution is to simply set an implementation as default with the `@Primary` annotation as demonstrated below:

```java
@Component
@Primary
public class CommentPushNotificationProxy implements CommentNotificationProxy {
	@Override
	public void sendComment(Comment comment) {
		System.out.println(
		"Sending push notification for comment: "
		+ comment.getText());
	}
}
```

![](000%20-%20Attachments/Pasted%20image%2020251125211819.png)


94
###### Naming implementation for dependency injection with `@Qualifier`

Sometimes in production apps, we need to define more implementations of the same interface, and have different objects use these implementations.

For instance, we want to have two different implementations for the comment notification: by push notification or by email. These are implementations of the same interface, but they depend on different objects in the app.

![](000%20-%20Attachments/Pasted%20image%2020251125212950.png)

```java
@Component  
@Qualifier("PUSH")  
public class CommentPushNotificationProxy implements CommentNotificationProxy {  
    @Override  
    public void sendComment(Comment comment) {  
        System.out.println("Sending push notification for comment: " + comment.getText());  
    }  
}
```

```java
@Component  
@Qualifier("EMAIL")  
public class EmailCommentNotificationProxy implements CommentNotificationProxy {  
    @Override  
    public void sendComment(Comment comment) {  
        System.out.println("Sending notification for comment: " +  
                comment.getText());  
    }  
}
```

For each parameter where we want to use a specific implementation, we need to annotate the parameter with `@Qualifier`.

```java
@Component  
public class CommentService {  
  
    private final CommentRepository commentRepository;  
    private final CommentNotificationProxy commentNotificationProxy;  
  
    /* For each parameter where we want to use a specific  
    implementation, we annotate the parameter with @Qualifier. */    
    public CommentService(CommentRepository commentRepository, @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {  
        this.commentRepository = commentRepository;  
        this.commentNotificationProxy = commentNotificationProxy;  
    }  
  
    // Omitted code
}
```

```Output
Storing comment: Demo comment
Sending push notification for comment: Demo comment
```


96
##### Focusing on object responsibilities with stereotype annotations

Thus far, all of our examples utilize the `@Component` stereotype annotation.

There are two more stereotype annotations: `@Service` and `@Repository`.
- `@Service` - objects whose responsibility is implementing the use cases.
- `@Repository` - objects whose responsibility is managing the data persistence.

> (...) These responsibilities are so common in projects, and they are important in the class design, having a distinctive way of marking them helps the developer better understand the app design.

All three (`@Component`, `@Service`, and `@Repository`) are stereotype annotations and instruct Spring to create and add an instance of the annotated class to its context.

![](000%20-%20Attachments/Pasted%20image%2020251125220826.png)

We use `@Service` to define this object as a component having the responsibility of service.

```java
@Service
public class CommentService {
	// Omitted code
}
```

We use `@Repository` to define this object as a component with the responsibility of the repository.

```java
@Repository
public class DBCommentRepository implements CommentRepository {
	// Omitted code
}
```