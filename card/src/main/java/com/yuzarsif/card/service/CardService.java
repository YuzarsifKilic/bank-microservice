package com.yuzarsif.card.service;

import com.yuzarsif.card.dto.CardDto;

public interface CardService {

    void createCard(String mobileNumber);

    CardDto fetchCard(String mobileNumber);

    boolean updateCard(CardDto cardsDto);

    boolean deleteCard(String mobileNumber);
}
