# most-active-cookie
Process a cookie log and return the most active cookie for a specific day

## Tech

- Java 8 onward, Spring Boot (framework), Maven (build tool)

## Requirements

Given a cookie log file in the following format:

~~~
cookie,timestamp
AtY0laUfhglK3lC7,2018-12-09T14:19:00+00:00
SAZuXPGUrfbcn5UA,2018-12-09T10:13:00+00:00
5UAVanZf6UtGyKVS,2018-12-09T07:25:00+00:00
AtY0laUfhglK3lC7,2018-12-09T06:19:00+00:00
SAZuXPGUrfbcn5UA,2018-12-08T22:03:00+00:00
4sMM2LxV07bPJzwf,2018-12-08T21:30:00+00:00
fbcn5UAVanZf6UtG,2018-12-08T09:30:00+00:00
4sMM2LxV07bPJzwf,2018-12-07T23:30:00+00:00
~~~

- Write a command line program to process the log file and return the most active cookie for a specific day. 
- Include a -f parameter for the filename to process and a -d parameter to specify the date.

e.g. we’d execute your program like this to obtain the most active cookie for 9th Dec 2018.

~~~
$ ./[command] -f cookie_log.csv -d 2018-12-09
~~~

And it would write to stdout:

~~~
AtY0laUfhglK3lC7
~~~

We define the most active cookie as one seen in the log the most times during a given day.

## Assumptions

- If multiple cookies meet that criteria, please return all of them on separate lines.
- Only use additional libraries for testing, logging and cli-parsing.
- You can assume -d parameter takes date in UTC time zone.
- You have enough memory to store the contents of the whole file.
- Cookies in the log file are sorted by timestamp (most recent occurrence is the first line of the file).

## Build

- Go to directory: cookie-filter
- Using Maven to build and package source code into a jar file: 

~~~
mvn clean package
~~~

[Build Successful](https://imgur.com/a/fCR0DIT)

## Run

- Still stand at the directory: cookie-filter
- Run the compiled jar file:

~~~
java -jar target\cookie-filter-version-SNAPSHOT.jar -f csv-file-path -d selected-date
~~~

- Example:

~~~
java -jar \target\cookie-filter-0.0.1-SNAPSHOT.jar -f src\logs\cookie_log.csv -d 2018-12-09

~~~

## Analysed performance :

Y = 10^X

## Step 1 

X = 5

Y = 10^5 = 100.K  

File size = 4.5MB

Total execution time taken in millis to published 1 lac records in groupCookieByDate from cookie log csv file : {}0.678 seconds

 Total Latency  = 0.678  seconds


## Step 2

X = 6 

Y = 10^6 = 1.0M 
File size = 45MB

Total execution time taken in millis to published records in groupCookieByDate from cookie log csv file : {}2.692 seconds

 Total Latency  =2.692 seconds


For further optimisation required  for this records to reduce the latency for publishing records to groupCookieByDate using parallel processing?


 [perf testing](https://imgur.com/a/ShG6yVd)
 

[Run Successful](https://imgur.com/a/GpnwVpV)
