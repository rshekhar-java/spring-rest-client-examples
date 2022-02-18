package com.rs.springframework.api.domain;

import javax.smartcardio.Card;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * created by rs 2/17/2022.
 */
public class Billing implements Serializable {

    private Card card;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6577338081290507077L;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
