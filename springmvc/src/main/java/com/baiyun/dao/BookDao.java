package com.baiyun.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.baiyun.pojo.Book;

public interface BookDao {
	/**
	 * �������ͼ��
	 */
	public List<Book> getAllBooks();

	/**
	 * ����ͼ���Ż��ͼ�����
	 */
	public Book getBookById(@Param("id") Long id);

	/**
	 * ���ͼ��
	 */
	public int add(Book entity);

	/**
	 * ����ͼ����ɾ��ͼ��
	 */
	public int delete(int id);

	/**
	 * ����ͼ��
	 */
	public int update(Book entity);
}
