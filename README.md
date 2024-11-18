Exercice gestion de circulation de deux trains en mettant en oeuvre la classe Semaphore

Un sémaphore permet de protéger une variable (ou un type de donnée abstrait) et constitue la méthode utilisée couramment pour restreindre l'accès à des ressources partagées (par exemple un espace de stockage) dans un environnement de programmation concurrente. 
Le sémaphore a été inventé par Edsger Dijkstra et utilisé pour la première fois dans le système d'exploitation THE Operating system.


Les deux circulent dans des sens contraires, il faut donc mettre en place un système de gestion de circulation afin d’éviter le télescopage des deux trains.
En effet, dans leurs déplacements, ils vont utiliser le même tronçon de voie entre les points A et B.

Proposer une solution mettant en œuvre un sémaphore.
![image](https://github.com/user-attachments/assets/53bfa548-c088-4146-97a2-283b7f11366c)

Compléments sur les threads

La synchronisation entre "thread" utilise des méthodes de la classe Object 
A l'intérieur d'un objet, un thread utilise :
wait();	Met le thread en attente et relâche l'accès à l'objet. 

notify();	Réveille un des processus qui attendent l'objet par wait() et le choix est arbitraire et n'est pas obligatoirement FIFO 

notifyAll();	Réveille tous les processus attendant l'objet par wait() et ils seront exécuté dans un ordre quelconque.

Ces méthodes doivent être lancées dans des méthodes synchronized

En java chaque moniteur n'a qu'une variable condition anonyme. 
Toutes les opérations wait, notify, notifyAll, concernent cette condition anonyme 
Le moniteur en Java utilise la sémantique de réveil "signal and continue", le processus qui exécute notify ou notifyAll garde le moniteur et continue à s'exécuter dans l'objet. 
Un processus qui invoque le moniteur peut y avoir accès avant un processus réveillé par une opération notify.
