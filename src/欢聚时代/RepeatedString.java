package ����ʱ��;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

//�����ַ������ظ����ַ����������ظ��ַ�������Ӧ���ظ�������ӡ������
public class RepeatedString {
	public static HashMap fun(String str)
	{
		HashMap<String,Integer> map = new HashMap<>();
		HashMap<String,Integer> map0 = new HashMap<>();
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			String s = String.valueOf(ch[i]);
			if(map.containsKey(s))
				map.put(s, map.get(s)+1);
			else
				map.put(s, 1);
		}
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<String, Integer>  en = it.next();
			String key = en.getKey();
			Integer value = en.getValue();
			if(value>1)
				map0.put(key, value);
		}
		return map0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String str = sc.next();
			HashMap<String,Integer> map1 = new HashMap<>();
			map1 = fun(str);
			Iterator<Entry<String, Integer>> it0 = map1.entrySet().iterator();
			while(it0.hasNext())
			{
				Entry<String, Integer>  en = it0.next();
				String key = en.getKey();
				Integer value = en.getValue();
				System.out.println(key+":"+value);
			}
		}
	}
}
