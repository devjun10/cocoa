# java.util.Timer

특정 작업을 일정 시간 주기로 반복적으로 실행할 수 있도록 해 준다.
<br/><br/><br/><br/><br/><br/>

## schedule( )

schedule( ) 메서드는 특정 시간에 원하는 작업을 수행하고자 할 때 사용하는 메소드다.
<br/><br/>

| 반환 타입 |   메서드  |설명|
|:------:|:-------|:-----|
|  void  |&nbsp; schedule(TimerTask task, Date time)  |&nbsp; 지정한 시간(time)에 지정한 작업(task)을 수행|
|  void  |&nbsp; schedule(TimerTask task, Date firstTime, long period)|&nbsp; 지정 시간(firstTime) 부터 일정 간격(period)으로 지정한 작업(task) 수행| 
|  void  |&nbsp; schedule(TimerTask task, long delay) |&nbsp; 일정 시간(delay)이 지난 후에 지정한 작업(task)을 수행|
|  void  |&nbsp; schedule(TimerTask task, long delay, long period)|&nbsp; 일정 시간(delay)이 지난 후 일정 간격(period)으로 지정한 작업(task)을 수행|

<br/><br/><br/><br/>

## scheduleAtFixedRate( )

정확하게 일정 시간 간격으로 작업을 실행하기 위해서는 아래 메서드를 사용한다.
<br/><br/>

| 반환 타입 |   메서드  |설명|
|:------:|:-------|:-----|
|  void  |&nbsp; scheduleAtFixedRate(TimerTask task, Date firstTime, long period)|&nbsp; 지정 시간(firstTime)부터 일정 간격(period)으로 지정한 작업(task)을 수행|
|  void  |&nbsp; scheduleAtFixedRate(TimerTask task, long delay, long period)|&nbsp; 일정 시간(delay)이 지난후 일정 간격(period)으로 지정한 작업(task)을 수행| 

<br/><br/><br/><br/>

## TimerTask

Timer 클래스가 수행할 작업을 나타낸다.
<br/><br/>

| 반환 타입 |   메서드  |설명|
|:------:|:-------|:-----|
|  boolean  |&nbsp; cancel( )|&nbsp; TimerTask 작업을 취소|
|  void  |&nbsp; run( )|&nbsp; TimerTask가 실행할 작업| 
|  long  |&nbsp; scheduledExecutionTime( )|&nbsp; 가장 최근의 작업 실행 시간 반환| 
