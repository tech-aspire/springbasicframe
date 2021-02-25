/**
 * 
 */
package com.aspire.location.numberlocation.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bikeda
 *
 */
@RestController
public class JDBCController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@ResponseBody
	@GetMapping("/numlocation/version/query")
	public Map<String, Object> getNumVersion(){
		List<Map<String,Object>> list = jdbcTemplate.queryForList("select * from t_number_location_version");
		return list.get(0);
	}
}
