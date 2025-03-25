import java util.random;
class RandomNumberGeneratorEx extends Thread{
private final numberprocessor processor;
public RandomNumberGenerator(Number processor processor){
this.processor=processor;
}
@override
public void run(){
Random random=new Random;
while(true){
int number= random.nextInt(100);
System.out.println("Generated:"+number);
Processor.processorNumber(number);
try{
Thread.sleep(1000);
}catch(InterruptedException e){
break
}
}
}
}
class NumberProcessor{
private int number;
public synchronized void NumberProcessor
(int number){
this.number=number;
notifyAll();
}
public void square(){
while (true){
wait();
if(number%2==0){
System.out.println("square:"+(number*number));
}
}catch(interrupted exception e){
break;
}
}
}
}
public void cube(){
while(true){
synchronized (this){
try{
wait();
if(number%2!==0){
System.out.println("cube:"+(number*number*number));
}
catch(InterruptedException e){
break;
}
}
}
}
}
pubilc classMultiThreadRandomNumber{
public static void main(string[]args){
NumberProcessor processor=new NumberProcessor();
RandomNumberGenerated genrated=new

