package O0_Basics.CallbackMethodInterfaces;

public class Store {
    Member[] members;
    int idx;
    public Store(){
        this.members = new Member[10];
        this.idx = 0;
    }
    public void registerCustomer(Member memeber) {
        members[idx++] = memeber;
    }

    public void inviteForSale(String saleMessage){
        for(Member member: members){
            if(member!=null){
                member.callback(saleMessage);
            }
        }
    }
}
