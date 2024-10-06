class MixedMessage{
    int counter;
    public static void main(String[] args){
        int count = 0;
        MixedMessage[] mix4 = new MixedMessage[20];
        int x = 0;
        while(x<19){
            mix4[x] = new MixedMessage();
            mix4[x].counter = mix4[x].counter+1;
            count = count + 1;
            count = count + mix4[x].mayBeNew(x);
            x=x+1;
        }
        System.out.println(count+" "+mix4[1].counter);
    }

    public int mayBeNew(int index){
        if(index<1){
            MixedMessage mix4 = new MixedMessage();
            mix4.counter = mix4.counter + 1;
            return 1;
        }
        return 0;
    }
}