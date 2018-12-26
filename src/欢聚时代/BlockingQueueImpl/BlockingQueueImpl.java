package ����ʱ��.BlockingQueueImpl;

import java.util.Vector;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BlockingQueueImpl<E> implements BlockingQueue<E>{
	private final int Max_Length = 100;  //������󳤶�����
	private Vector<E> vector = new Vector<E>(Max_Length);
	private ReentrantLock lock = new ReentrantLock(true);  //������
	private Condition notFull = lock.newCondition();  
	private Condition notempty = lock.newCondition();
	@Override
	public void put(E e) throws InterruptedException {
		// TODO Auto-generated method stub
		lock.lockInterruptibly();  //��ȡ��
		int size = vector.size();
		try {
			if(size==Max_Length)
				notFull.await();  //��������״̬
			else
			{
				vector.add(e);
				notempty.signal();  //����һ���ȴ��߳�
			}
		} finally {
			// TODO: handle finally clause
			lock.unlock();  //�ͷ���
		}
		
	}

	@Override
	public E take() throws InterruptedException {
		// TODO Auto-generated method stub
		lock.lockInterruptibly();  //��ȡ��
		E e = null;
		try {
			if(vector.size()==0)
				notempty.await();  //��������״̬
			else
			{
				e = vector.get(vector.size()-1);
				notFull.signal();  //����һ���ȴ��߳�
				return e;
			}
			return e;
		} finally {
			// TODO: handle finally clause
			lock.unlock();  //�ͷ���
		}
	}

}
