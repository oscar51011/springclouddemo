package com.demo.payment.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.payment.bean.entity.Payment;

/**
 * 付款 DAO
 * @author oscar51011
 * @date 2022年1月29日
 */
@Repository
public interface PaymentDao extends CrudRepository<Payment, Long> {

}
