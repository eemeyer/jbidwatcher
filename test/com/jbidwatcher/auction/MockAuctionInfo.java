package com.jbidwatcher.auction;

import com.jbidwatcher.util.Currency;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
* User: Morgan
* Date: Sep 27, 2006
* Time: 1:22:07 AM
* To change this template use File | Settings | File Templates.
*/
class MockAuctionInfo extends AuctionInfo {
  private long truncThousands(long time) {
    return (time / 1000) * 1000;
  }

  public MockAuctionInfo() {
    setIdentifier("12345678");
    setCurBid(Currency.getCurrency("$9.99"));
    setMinBid(Currency.getCurrency("$9.99"));
    setShipping(Currency.getCurrency("$1.99"));
    setInsurance(Currency.getCurrency("$0.99"));
    setUSCur(Currency.getCurrency("$9.99"));
    setBuyNowUS(Currency.getCurrency("$19.99"));
    setInsuranceOptional(false);
    setFixedPrice(false);
    setNoThumbnail(true);
    setBuyNow(Currency.getCurrency("$19.99"));
    setEnd(new Date(truncThousands(System.currentTimeMillis() + 1000 * 60 * 60 * 24)));
    mSeller = Seller.makeSeller("cyberfox");
    mSeller.setFeedback(139);
    mSeller.setPositivePercentage(String.valueOf(Double.parseDouble("99.6")));
    setHighBidder("test-jbidwatcher-bids");
    setTitle("A test auction.");
    setNumBids(1);
    setPrivate(false);
//    setHasThumb(false);
    setItemLocation("Test County, USA");
    setPaypal(true);
    mLoadedPage = null;
  }

  public String getThumbnailURL() {
    return null;
  }

  public String getAlternateSiteThumbnail() {
    return null;
  }
}
