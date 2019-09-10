package MyRestaurent2;
public class currentCustomer {
    //当前用户类型
   static boolean isCurrentvip = false; 
   //当前用户
   static VIP vip_current;
   static NOTVIP notvip_current;
   
   public currentCustomer(){
       vip_current=new VIP("","");
       notvip_current=new NOTVIP();
   }

   public static boolean isIsCurrentvip() {
       return isCurrentvip;
   }

   public static void setIsCurrentvip(boolean aIsCurrentvip) {
       isCurrentvip = aIsCurrentvip;
   }

   public static VIP getVip_current() {
       return vip_current;
   }

   public static void setVip_current(VIP aVip_current) {
       vip_current = aVip_current;
   }

   public static NOTVIP getNotvip_current() {
       return notvip_current;
   }

   public static void setNotvip_current(NOTVIP aNotvip_current) {
       notvip_current = aNotvip_current;
   }
}
