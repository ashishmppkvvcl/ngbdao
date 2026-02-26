package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public interface ConsumerConnectionMeterInformationInterface extends Serializable {

    public long getId();

    public void setId(long id);

    public String getConsumerNo();

    public void setConsumerNo(String consumerNo);

    public String getMeterIdentifier();

    public void setMeterIdentifier(String meterIdentifier);

    public BigDecimal getStartRead();

    public void setStartRead(BigDecimal startRead);

    public boolean getHasCTR();

    public void setHasCTR(boolean hasCTR);

    public LocalDate getMeterInstallationDate();

    public void setMeterInstallationDate(LocalDate meterInstallationDate);

    public String getMeterInstallerName();

    public void setMeterInstallerName(String meterInstallerName);

    public String getMeterInstallerDesignation();

    public void setMeterInstallerDesignation(String meterInstallerDesignation);

    public boolean getHasModem();

    public void setHasModem(boolean hasModem);

    public LocalDateTime getCreatedOn();

    public void setCreatedOn(LocalDateTime createdOn);

    public String getCreatedBy();

    public void setCreatedBy(String createdBy);

    public LocalDateTime getUpdatedOn();

    public void setUpdatedOn(LocalDateTime updatedOn);

    public String getUpdatedBy();

    public void setUpdatedBy(String updatedBy);
}
