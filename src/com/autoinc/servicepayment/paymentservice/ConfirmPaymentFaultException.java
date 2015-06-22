
/**
 * ConfirmPaymentFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.autoinc.servicepayment.paymentservice;

public class ConfirmPaymentFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1434901030354L;
    
    private com.autoinc.servicepayment.paymentservice.ConfirmPaymentFault faultMessage;

    
        public ConfirmPaymentFaultException() {
            super("ConfirmPaymentFaultException");
        }

        public ConfirmPaymentFaultException(java.lang.String s) {
           super(s);
        }

        public ConfirmPaymentFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ConfirmPaymentFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.autoinc.servicepayment.paymentservice.ConfirmPaymentFault msg){
       faultMessage = msg;
    }
    
    public com.autoinc.servicepayment.paymentservice.ConfirmPaymentFault getFaultMessage(){
       return faultMessage;
    }
}
    