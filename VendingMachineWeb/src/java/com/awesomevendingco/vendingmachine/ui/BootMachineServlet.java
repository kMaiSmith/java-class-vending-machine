package com.awesomevendingco.vendingmachine.ui;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.awesomevendingco.vendingmachine.machine.VendingMachine;

public class BootMachineServlet extends HelpfulServlet {

	private static final long serialVersionUID = -4913081238525533316L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        VendingMachine machine = (VendingMachine) context.getBean("machine");

        setApplicationScope(getServletContext(), "machine", machine);

        forwardToPage(request, response, "/machine.jsp");
    }

}
