public class marshall_diesel {
    public static void calcus(double w,double t,double v,double d,double cv,double l,double a,double n,double c){
        double fp=4;
        double bp=(w*340*746)/(400*1000);
        double tfc=(d*v/t)*3.6;
        double sfc=tfc/bp;
        double ip=bp+fp;
        double me=bp*100/ip;
        double bte=(bp/tfc)*(3600/cv)*100;
        double ite=(ip/tfc)*(3600/cv)*100;
        double bmep=bp*120/(l*a*n*c);
        double imep=ip*120/(l*a*n*c);
        System.out.println("bp is  "+bp);
        System.out.println("tfc is "+tfc);
        System.out.println("sfc is "+sfc);
        System.out.println("ip is "+ip);
        System.out.println("me is "+me);
        System.out.println("bte is "+bte);
        System.out.println("ite is "+ite);
        System.out.println("bmep is "+bmep);
        System.out.println("imep is "+imep);
    }
    public static void main(String[] args){
        marshall_diesel.calcus(8,13.22,10,0.82,44000,0.406,0.02835,340,1);

    }
}
