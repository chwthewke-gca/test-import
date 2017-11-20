# Paths kata

**Context : search paths produced by an API**

Imagine that some Google Maps like API provides possible paths from origin to destination.
Select the best one based on distance and intermediate stops.
Expect the API to produce only valid paths.
We consider that a path is collection of segments, rather than a collection of points

## Part 1: Find the shortest path

Find the shortest path in a list of paths :
- Compute the distance of a segment
- Compute the distance of a path
- Find the shortest path in a list of paths

## Part 2: Filter paths

Filter paths keeping only those which include a given list of stops :
- Enumerate all stops in a path
- Filter paths keeping only those which include a stop
- Filter paths keeping only those which include a given list of stops

## Part 3: Find the best path

Find the shortest path in a list of paths, which includes a given list of stops

## Bonus
Compute all possible paths between 2 points, given a list of Segments.
