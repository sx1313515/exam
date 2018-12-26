package »¶¾ÛÊ±´ú.BlockingQueueImpl;

public  interface BlockingQueue<E> {
	public void put(E e) throws InterruptedException;
    public E take() throws InterruptedException;
}
