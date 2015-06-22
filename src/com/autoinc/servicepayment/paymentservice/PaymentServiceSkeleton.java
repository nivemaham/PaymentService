/**
 * PaymentServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.autoinc.servicepayment.paymentservice;

import java.util.Random;

import org.example.www.paymentserviceschema.PaymentInvoice;
import org.example.www.paymentserviceschema.PaymentResponse;

/**
 * PaymentServiceSkeleton java skeleton for the axisService
 */
public class PaymentServiceSkeleton {

	/**
	 * Auto generated method signature
	 * 
	 * @param paymentDetailInput
	 * @return paymentResponse
	 * @throws ConfirmPaymentFaultException
	 */

	public org.example.www.paymentserviceschema.PaymentResponse confirmPayment(
			org.example.www.paymentserviceschema.PaymentDetailInput paymentDetailInput)
			throws ConfirmPaymentFaultException {
		PaymentResponse response = new PaymentResponse();
		PaymentInvoice invoice = new PaymentInvoice();
		
		boolean result= new Random().nextBoolean();
		if(!result)
		{
			ConfirmPaymentFaultException ex = new ConfirmPaymentFaultException();
			ConfirmPaymentFault msg = new ConfirmPaymentFault();
			msg.localConfirmPaymentFault ="PaymentConfirmationFault";
			msg.setConfirmPaymentFault(
					new String("Payment not complete with this information"));
			ex.setFaultMessage(msg);
			throw ex;
		}
		invoice.setCustomerid(paymentDetailInput.getPaymentDetailInput()
				.getCustomerId());
		invoice.setOrderId(paymentDetailInput.getPaymentDetailInput()
				.getOrderid());
		invoice.setPaymentinvoice("DEGUW" + new Random().nextInt());
		invoice.setPaymentStatus(result);
		response.setPaymentResponse(invoice);
		return response;
	}

}
