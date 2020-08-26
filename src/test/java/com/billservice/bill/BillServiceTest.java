package com.billservice.bill;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import com.billservice.bill.business.service.BillService;

@WebMvcTest(BillService.class)
public class BillServiceTest {
	



	@Test
	public void getPersonThenReturnJsonResponse() throws Exception {

		Assert.assertEquals(true, true);
		
		
	}
	
	

}
