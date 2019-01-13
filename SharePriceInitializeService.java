/**
 * 
 */
package com.bablo.service;

import com.bablo.repository.SharePriceRepository;

/**
 * @author anusharma
 *
 */
public class SharePriceInitializeService {
	
    SharePriceRepository sharePriceRepository; // instance variable
    
	public SharePriceInitializeService(SharePriceRepository sharePriceRepository) {
       this.sharePriceRepository = sharePriceRepository;
	}
	
	public void setPrice() {
		sharePriceRepository.setPrice();
	}
	
	

}
