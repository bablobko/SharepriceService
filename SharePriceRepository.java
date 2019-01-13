/**
 * 
 */
package com.bablo.repository;

import java.util.HashMap;
import java.util.Map;


/**
 * @author anusharma
 *
 */
public class SharePriceRepository {
	
	Map<String, Double> sharePriceRepo;
	
	
	
	public SharePriceRepository(Map<String, Double> sharePriceRepo) {
		super();
		this.sharePriceRepo = sharePriceRepo;
		
		System.out.println("The repository got created!!");
	}

	public void setPrice() {
		System.out.println("Entering the setPrice method of the sharePriceRepo.");
		sharePriceRepo.put("Tata Steel", 2034.12);
		sharePriceRepo.put("SAIL", 1200.23);
		sharePriceRepo.put("CIL", 1342.34);
		sharePriceRepo.put("TISCO", 3124.56);
	}

	public Double getPrice(String companyName) {

		if(sharePriceRepo.containsKey(companyName))
		  return sharePriceRepo.get(companyName);
		else
		  return 0.0;	
	}

}
