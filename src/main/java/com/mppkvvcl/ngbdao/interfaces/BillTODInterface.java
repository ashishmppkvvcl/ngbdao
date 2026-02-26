package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.math.BigDecimal;

public interface BillTODInterface extends Serializable {

    long getBillId();

    void setBillId(long billId);

    BigDecimal getTod1();

    void setTod1(BigDecimal tod1);

    BigDecimal getTod2();

    void setTod2(BigDecimal tod2);

    BigDecimal getTod3();

    void setTod3(BigDecimal tod3);

    BigDecimal getTod4();

    void setTod4(BigDecimal tod4);
}
