package com.ischoolbar.programmer.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 菜品分类后台信息管理控制器
 * @author ashikotakeshi
 *
 */
@RequestMapping("/admin/food_category")
@Controller
public class FoodCategory {

	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public ModelAndView list(ModelAndView model) {
		model.setViewName("food_category/list");
		return model;
	}
}
