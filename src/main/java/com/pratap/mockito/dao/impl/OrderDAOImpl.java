package com.pratap.mockito.dao.impl;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.pratap.mockito.dao.OrderDAO;
import com.pratap.mockito.dto.Order;
@Service
public class OrderDAOImpl implements OrderDAO {

	@Override
	public int create(Order order) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Order read(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Order order) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
