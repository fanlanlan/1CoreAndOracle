package javaa.my.producerandconsumer.my;
public class Producer extends Handler{
	//共享资源对象
	public Producer(Poool poool,String name){
		super(poool,name);
	}
	@Override
	void toDo() {
		try {
			while (true) {
				this.poool.increace("苹果" + name,name);
				sleep(this.random.nextInt(2000) + 1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}