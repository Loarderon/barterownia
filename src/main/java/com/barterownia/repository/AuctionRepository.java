package com.barterownia.repository;

import com.barterownia.model.Auction;
import com.barterownia.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AuctionRepository extends JpaRepository<Auction, Long> {

    List<Auction> findAllByItem_Category_TableName(String categoryName);

    List<Auction> findAllByUser_Id(long userId);

    List<Auction> findAllByTitleContaining(String title);

    List<Auction> findAllByIsAcceptedIsFalse();
}