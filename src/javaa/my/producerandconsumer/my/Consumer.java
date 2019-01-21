package javaa.my.producerandconsumer.my;





public class Consumer extends Handler{
	//共享资源对象
		public Consumer(Poool poool,String name){
			super(poool,name);
		}

		@Override
		void toDo() {
			try {
				while (true) {
					this.poool.decreace(this.name);
					Thread.sleep(this.random.nextInt(4000) + 2000);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}