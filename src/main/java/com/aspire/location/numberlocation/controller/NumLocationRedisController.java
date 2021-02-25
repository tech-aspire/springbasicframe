/**
 * 
 */
package com.aspire.location.numberlocation.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bikeda
 *
 */
@RestController
public class NumLocationRedisController {

	@Autowired
	private StringRedisTemplate stringRedisTemplate ;
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@GetMapping("/numlocation/getvalidversion")
	private String getNumLocationVersion() {
		stringRedisTemplate.opsForValue().set("numlocation_version", "1");
		String version = stringRedisTemplate.opsForValue().get("numlocation_version");
		List<Map<String,Object>> list = jdbcTemplate.queryForList("select * from t_number_location_version");
		
		return "the value of num location valid version :" + version + ",and " + list.get(0) ;
	}
	
	
	
}
