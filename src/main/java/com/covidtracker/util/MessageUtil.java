package com.covidtracker.util;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MessageUtil {

	public Map<String, String> getMessage(String message) {
		Map<String, String> result = new HashMap<>();
		if (message.equals("update_success")) {
			result.put("message", "Update success");
			result.put("alert", "success");
		} else if (message.equals("insert_success")) {
			result.put("message", "Insert success");
			result.put("alert", "success");
		} else if (message.equals("delete_success")) {
			result.put("message", "Delete success");
			result.put("alert", "success");
		} else if (message.equals("error_system")) {
			result.put("message", "Error system");
			result.put("alert", "danger");
		}else if (message.equals("existed_account")) {
			result.put("message", "Username already exists");
			result.put("alert", "danger");
		}else if (message.equals("existed_email")) {
			result.put("message", "Email already exists");
			result.put("alert", "danger");
		}else if (message.equals("success_poor")) {
			result.put("message", "Success! We will contact you later");
			result.put("alert", "success");
		}else if (message.equals("success_poor2")) {
			result.put("message", "Success! We need to check your information for assistance");
			result.put("alert", "success");
		}
		return result;
	}
}
