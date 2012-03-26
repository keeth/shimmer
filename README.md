Sprout Candidate Assignment
===========================

The makers of "New Shimmer" want a mobile ad campaign showing off its dual benefits of floor wax and
dessert topping.  They want to see which benefit has more appeal via how users interact with their mobile ad, and
have the ad display differently over time depending on whether people are more interested in waxing floors or topping
desserts.  The ad will be flighted over two weeks and 1 billion impressions are expected.

This package contains:

 * a Sprout ad
 * a Spring web application

When the ad starts up, it calls the web application (/shimmer/preference.json) and asks which benefit to emphasize.
The application returns either {"preference":"FLOOR_WAX"} or {"preference":"DESSERT_TOPPING"}.  Initially the application
just picks one of these randomly.

The ad contains two exit links, one for people to "take the floor waxing challenge"
(/shimmer/exit/FloorWaxingChallenge.html) and one to find dessert recipes (/shimmer/exit/DessertRecipes.html).

Your job is to collect incoming exits and compute a preference.  If people turn out to be more interested in dessert
toppings, the page emphasizing desserts should be shown more often, likewise if floor waxing turns out to be more
popular, the dessert topping benefit page should show more often.

You are encouraged to use scalable, big data techniques, e.g. MapReduce to process the exits.  This is not a hard
requirement, but be prepared to explain how you would scale this application for large volume (millions of exits,
thousands of requests per second).  You don't need to build a whole distributed infrastructure, just show that you can
use scalable algorithms and techniques.

There is no right or wrong answer.  Feel free to ask for clarification.  This exercise should take around 2-4 hours.
