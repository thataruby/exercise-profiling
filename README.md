# Reflection
### Athazahra Nabila Ruby - 2306173113 
 
## JMETER before optimization

### all-student

![alt text](media/all-student.png)
![alt text](media/all-student-test.png)
![alt text](media/all-student-result.png)

### all-student-name

![alt text](media/all-student-course.png)
![alt text](media/all-student-course-test.png)
![alt text](media/all-student-course-result.png)

### highest-gpa

![alt text](media/highest-gpa.png)
![alt text](media/highest-gpa-test.png)
![alt text](media/highest-gpa-result.png)


## JMETER after optimization

### all-student

![alt text](media/A-all-student.png)
![alt text](media/A-all-student-test.png)
![alt text](media/A-all-student-result.png)

### all-student-name

![alt text](media/A-all-student-course.png)
![alt text](media/A-all-student-course-test.png)
![alt text](media/A-all-student-course-result.png)

### highest-gpa

![alt text](media/A-highest-gpa.png)
![alt text](media/A-highest-gpa-test.png)
![alt text](media/A-highest-gpa-result.png)

After optimizing the code, the JMeter test results show a clear improvement, with faster response times for all tested endpoints (all-student, all-student-name, highest-gpa). This means the application now processes requests more efficiently, reducing delays and improving overall performance.

### 1. What is the difference between the approach of performance testing with JMeter and profiling with IntelliJ Profiler in the context of optimizing application performance?
JMeter simulates multiple users to test application performance under load, while IntelliJ Profiler analyzes code execution to identify and fix inefficient methods consuming the most resources.

### 2. How does the profiling process help you in identifying and understanding the weak points in your application?
Profiling shows which parts of the code are slow or using too much CPU/memory, allowing developers to pinpoint bottlenecks. This makes it easier to focus on optimizing the most inefficient parts of the code.

### 3. Do you think IntelliJ Profiler is effective in assisting you to analyze and identify bottlenecks in your application code?
I think IntelliJ Profiler is very effective because it visually highlights performance issues in a detailed way, making it easy to spot slow methods and resource-heavy operations.

### 4. What are the main challenges you face when conducting performance testing and profiling, and how do you overcome these challenges?
The hardest parts are setting up realistic performance conditions, understanding all the profiling data, and making sure optimizations actually improve performance without breaking anything. I deal with this by carefully analyzing profiling results, checking logs, and verifying that changes make a real impact.

### 5. What are the main benefits you gain from using IntelliJ Profiler for profiling your application code?
It makes finding inefficient parts of the code a lot faster, helps track CPU and memory usage, shows if database queries are taking too long, and it also helps confirm if performance tweaks actually make things better.

### 6. How do you handle situations where the results from profiling with IntelliJ Profiler are not entirely consistent with findings from performance testing using JMeter?
If JMeter and IntelliJ Profiler don’t match up, I rerun tests, check for anything that might be skewing the results, and compare logs.

### 7. What strategies do you implement in optimizing application code after analyzing results from performance testing and profiling? How do you ensure the changes you make do not affect the application's functionality?
I try to reduce unnecessary database queries, optimize loops, and add caching where needed. After making changes, I manually check key features to make sure everything still works fine.
