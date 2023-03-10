package com.coding.task.quantcast.cookiefilter.processor;

import com.coding.task.quantcast.cookiefilter.parser.CommandLineInput;
import java.util.Map;

/**
 * Interface for filtering the most active cookies
 */
public interface CookieProcessor {

  Map<String, Long> mostActiveCookies(CommandLineInput commandLineInput) throws Exception;
}
