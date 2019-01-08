package com.qfedu.convert;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Converter 接口中，第一个参数表示要处理的数据类型，第二个参数表示要转换的数据的类型
public class CustomerDateConvert implements Converter<String , Date>{
	SimpleDateFormat[]  formats=new SimpleDateFormat[]{
			new SimpleDateFormat("yyyy-MM-dd"),
			new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
	};
	@Override
	public Date convert(String source) {
		// TODO Auto-generated method stub
		if (source==null||source.trim().isEmpty()) {
			return null;
		}
		
		for (SimpleDateFormat sdf : formats) {
			try {
				
				 
				return	sdf.parse(source);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				continue;
			}
			
		}
		
		return null;
		
	}

}
