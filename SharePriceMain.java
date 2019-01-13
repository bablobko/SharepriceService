/**
 * 
 */
package com.bablo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.bablo.repository.SharePriceRepository;
import com.bablo.service.SharePriceDetailService;
import com.bablo.service.SharePriceInitializeService;

/**
 * @author anusharma
 *
 */
public class SharePriceMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<String, Double> sharePriceRepo = new HashMap<>();
		
		SharePriceRepository sharePriceRepository = new SharePriceRepository(sharePriceRepo);
		
		SharePriceInitializeService sharePriceInitializeService = new SharePriceInitializeService(sharePriceRepository);
		sharePriceInitializeService.setPrice();

		SharePriceDetailService sharePriceDetailService = new SharePriceDetailService(sharePriceRepository);
		System.out.println("Which companies share price you want to know!!");
		Scanner scan = new Scanner(System.in);
		
		String companyName = scan.next();
		
		System.out.println("Please tell me the price of the shares of company " + companyName + " " + sharePriceDetailService.getPrice(companyName));
		scan.close();
	}

}
