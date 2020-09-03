# About Project
This project aims to take the shortest route to all selected cities and return to the starting city. It uses the dijikstra algorithm while calculating the shortest path.

# Dijkstra’s shortest path algorithm
Dijkstra's algorithm (or Dijkstra's Shortest Path First algorithm, SPF algorithm) is an algorithm for finding the shortest paths between nodes in a graph, which may represent, for example, road networks. It was conceived by computer scientist Edsger W. Dijkstra in 1956 and published three years later. The algorithm exists in many variants. Dijkstra's original algorithm found the shortest path between two given nodes,but a more common variant fixes a single node as the "source" node and finds shortest paths from the source to all other nodes in the graph, producing a shortest-path tree.  
For a given source node in the graph, the algorithm finds the shortest path between that node and every other.[6]:196–206 It can also be used for finding the shortest paths from a single node to a single destination node by stopping the algorithm once the shortest path to the destination node has been determined. For example, if the nodes of the graph represent cities and edge path costs represent driving distances between pairs of cities connected by a direct road (for simplicity, ignore red lights, stop signs, toll roads and other obstructions), Dijkstra's algorithm can be used to find the shortest route between one city and all other cities.

# Travelling Salesman Problem
The travelling salesman problem (also called the travelling salesperson problem or TSP) asks the following question: "Given a list of cities and the distances between each pair of cities, what is the shortest possible route that visits each city exactly once and returns to the origin city?" It is an NP-hard problem in combinatorial optimization, important in theoretical computer science and operations research. The travelling purchaser problem and the vehicle routing problem are both generalizations of TSP.

# Scenario of the project 
As we mentioned in the section about, the main purpose of the project is to reach the selected cities in the shortest way and return. This goal is just like the Traveling salesman problem because the purpose of both is the same. It is the shortest way to visit all the given cities.  

But there is a difference in our project. In Tsp, all graff consist of selected cities. Therefore, the distance matrix has to belong only to the cities to be visited. But the distance matrix given in our project will belong to a country which is Turkey. And so there will be 81 provinces. If we give this distance matrix belonging to 81 to TSP, it will go around all provinces. However, we only want to reach the selected cities in the shortest way, not all cities.  

In short, our project aims to reach only the specified cities in the shortest way by using the dijkstra algorithm in Travelling Salesman Problem.
