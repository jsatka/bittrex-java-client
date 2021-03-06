package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * @author contact@elbatya.de
 */
public class MarketHistoryEntry {

    private String uuid;
    private Long id;
    private Instant timestamp;
    private BigDecimal quantity;
    private BigDecimal price;
    private BigDecimal total;
    private String fillType;
    private String orderType;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestampString) {
        this.timestamp = Instant.parse(timestampString+"Z");
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getFillType() {
        return fillType;
    }

    public void setFillType(String fillType) {
        this.fillType = fillType;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
