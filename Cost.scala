object Cost extends App{

    def costcaluculator(c: Int) :Double={
      if(c<0)
      {
        return 0;
      }
      else if(c>50)
      {
        return (24.95*0.6)+3+(c-50)*0.75;
      }
      else{
        return (24.95*0.6)+3;
      }

    }
  println("wholesale cost: "+ costcaluculator(60));
  
}