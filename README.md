# rewards-homework

Libraries used:

    Spring Boot 2.3
    Spring Web Web Starter
    Data mongo Starter
    Embedded mongo
    Lombok
    
Compile and Run

    Import the maven project.At starting of  application , data will load to ambadded mongodb. If failed to run, please change the server port or mongodb port in application.yml

Data Set

    Data set pre populated in the embadded mongo while running the application

    ID      User    Description             Amount  Date

    3001	user3    General Transaction	210.01	02/01/2020
    3002	user3    General Transaction	1000.00	04/15/2020
    3003	user3    General Transaction	10.01	06/13/2020
    3004	user3    General Transaction	60.01	06/13/2020

    1001    user1   General Transaction     20.01   02/01/2020
    1002    user1   General Transaction     1000.00	03/01/2020
    1003	user1	General Transaction     10.01	03/13/2020
    1004	user1	General Transaction     129.01	04/14/2020
    1005	user1	General Transaction     220.01	04/17/2020
    1006	user1	General Transaction     720.01	04/27/2020
    1007	user1	General Transaction     520.01	04/28/2020
    1008	user1	General Transaction     220.01	05/03/2020
    1009	user1	General Transaction     420.01	05/15/2020
    1010	user1	General Transaction     320.01	05/16/2020
    1011	user1	General Transaction     30.11	05/20/2020
    1012	user1	General Transaction     270.28	06/03/2020
    1013	user1	General Transaction     50.00	06/07/2020
    1014	user1	General Transaction     120.11	06/19/2020
    1015	user1	General Transaction     60.06	06/21/2020
    1016	user1	General Transaction     1000.95	06/23/2020
    1017	user1	General Transaction     10.00	06/24/2020
    1018	user1	General Transaction     60.01	07/01/2020
    1019	user1	General Transaction     300.01	07/05/2020
    1020	user1	General Transaction     200.01	07/06/2020

    2001	user2	General Transaction     20.01	02/01/2020
    2002	user2	General Transaction     300.00	05/01/2020
    2003	user2	General Transaction     30.01	05/02/2020
    2004	user2	General Transaction     90.01	05/14/2020
    2005	user2	General Transaction     2001.00	05/28/2020
    2006	user2	General Transaction     50.01	06/01/2020
    2007	user2	General Transaction     40.01	06/13/2020
    2008	user2	General Transaction     60.49	06/27/2020
    2009	user2	General Transaction     220.01	06/03/2020
    2010	user2	General Transaction     120.01	07/02/2020

   user3 dataset explanation
   
    Todays date: 07/14/2020
    3001 Transation will not count as it's not in the time imit
    
    for 3002    amount  1000.00 point   50 + (900 * 2)
    for 3003    amount  10.01   point   0
    for 3004    amount  60.01   point 50
    total point as of today = 1900
    
  EndPoint
  
    Get call
    http://localhost:8888/transaction/rewardpoint/{user}
    for user3   http://localhost:8888/transaction/rewardpoint/user3
