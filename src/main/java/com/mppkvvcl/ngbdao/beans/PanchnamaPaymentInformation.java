package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.PanchnamaPaymentInformationInterface;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity(name = "PanchnamaPaymentInformation")
@Table(name = "panchnama_payment_information")
public class PanchnamaPaymentInformation implements PanchnamaPaymentInformationInterface {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "payment_id")
    private long paymentId;

    @Column(name = "consumer_no")
    private String consumerNo;

    @Column(name = "panchnama_no")
    private String panchnamaNo;

    @Column(name = "panchnama_date")
    private LocalDate panchnamaDate;

    @Column(name = "pay_date")
    private LocalDate payDate;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "total_payment_amount")
    private BigDecimal totalPaymentAmount;

    @Column(name = "deleted")
    private boolean deleted;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getPaymentId() {
        return paymentId;
    }

    @Override
    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }

    @Override
    public String getConsumerNo() {
        return consumerNo;
    }

    @Override
    public void setConsumerNo(String consumerNo) {
        this.consumerNo = consumerNo;
    }

    @Override
    public String getPanchnamaNo() {
        return panchnamaNo;
    }

    @Override
    public void setPanchnamaNo(String panchnamaNo) {
        this.panchnamaNo = panchnamaNo;
    }

    @Override
    public LocalDate getPanchnamaDate() {
        return panchnamaDate;
    }

    @Override
    public void setPanchnamaDate(LocalDate panchnamaDate) {
        this.panchnamaDate = panchnamaDate;
    }

    @Override
    public LocalDate getPayDate() {
        return payDate;
    }

    @Override
    public void setPayDate(LocalDate payDate) {
        this.payDate = payDate;
    }

    @Override
    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public BigDecimal getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    @Override
    public void setTotalPaymentAmount(BigDecimal totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    @Override
    public boolean isDeleted() {
        return deleted;
    }

    @Override
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "PanchnamaPaymentInformation{" +
                "id=" + id +
                ", paymentId=" + paymentId +
                ", consumerNo='" + consumerNo + '\'' +
                ", panchnamaNo='" + panchnamaNo + '\'' +
                ", panchnamaDate=" + panchnamaDate +
                ", payDate=" + payDate +
                ", amount=" + amount +
                ", totalPaymentAmount=" + totalPaymentAmount +
                ", deleted=" + deleted +
                '}';
    }
}
