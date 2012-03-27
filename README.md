Sprout Candidate Assignment
===========================

The makers of "New Shimmer" want a mobile ad campaign showing off its dual benefits of floor wax and
dessert topping.  They want to see which benefit has more appeal via how users interact with their mobile ad, and
have the ad display differently over time depending on whether people are more interested in waxing floors or topping
desserts.  The ad will be flighted over two weeks and 1 billion impressions are expected.

This package contains:

 * a Sprout ad
 * a Spring web application

When the ad starts up, it calls the web application (/api/preference.json) and asks which benefit to emphasize.
The application returns either {"preference":"FLOOR_WAX"} or {"preference":"DESSERT_TOPPING"}.  Initially the application
just chooses randomly.

The ad contains two exit links, one for people to "take the floor waxing challenge"
(/api/exit/FloorWaxingChallenge.html) and one to find dessert recipes (/api/exit/DessertRecipes.html).

Your job is to collect incoming exits and compute a preference.  If people turn out to be more interested in dessert
toppings, the page emphasizing desserts should be shown more often, likewise if floor waxing turns out to be more
popular, the dessert topping benefit page should show more often.

You are encouraged to use scalable, big data techniques, e.g. MapReduce to process the exits.  This is not a hard
requirement, but be prepared to explain how you would scale this application for large volume (millions of exits,
thousands of requests per second).  You don't need to build a whole distributed infrastructure, just show that you can
use scalable algorithms and techniques.  Use your discretion and creativity around how to use the data to alter the ad
behavior.

There is no right or wrong answer.  Feel free to ask for clarification if needed.
This exercise should take around 2-4 hours.

Prerequisites
-------------

* [Gradle](http://gradle.org/)
* A servlet container (e.g. [Apache Tomcat](http://tomcat.apache.org/))
* A Webkit-based browser

Getting started
---------------

* Run the following command to download dependencies and copy an exploded WAR to the folder of your choice:

    gradle -si -PdeployTo=/path/to/deployment/folder deploy

    E.g. For Tomcat, deployTo should be $TOMCAT_HOME/webapps/shimmer

* Load the base URL of the servlet, in a Webkit-based browser (Chrome or Safari) to see the ad, e.g.

    http://localhost:8080/

* The two main integration points are the two controller classes, PreferenceController and ExitController
