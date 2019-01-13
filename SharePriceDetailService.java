package com.bablo.service;

import com.bablo.repository.SharePriceRepository;

/**
 * @author anusharma
 *
 */

public class SharePriceDetailService {

    SharePriceRepository sharePriceRepository;
	
	public SharePriceDetailService(SharePriceRepository sharePriceRepository) {
		this.sharePriceRepository = sharePriceRepository;
	}

	public Double getPrice(String companyName) {
		return sharePriceRepository.getPrice(companyName);
	}

}
