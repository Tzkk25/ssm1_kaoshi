package utils;

import org.apache.commons.lang.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class CorsFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpServletRequest request = (HttpServletRequest) req;
        request.setCharacterEncoding("utf-8");
        // ��ʹ��*���Զ������������������Я��CookieʱʧЧ
        String origin = request.getHeader("Origin");
        if(StringUtils.isNotBlank(origin)) {
            response.setHeader("Access-Control-Allow-Origin", origin);
        }
        // ����Ӧ�����Զ���ͷ
        String headers = request.getHeader("Access-Control-Request-Headers");
        if(StringUtils.isNotBlank(headers)) {
            response.setHeader("Access-Control-Allow-Headers", headers);
            response.setHeader("Access-Control-Expose-Headers", headers);
        }
        // �����������󷽷�����
        response.setHeader("Access-Control-Allow-Methods", "*");
        // Ԥ�����OPTIONS������ʱ�䣬��λ����
        response.setHeader("Access-Control-Max-Age", "3600");
        // ��ȷ��ɿͻ��˷���Cookie��������ɾ���ֶμ���
        response.setHeader("Access-Control-Allow-Credentials", "true");
        chain.doFilter(request, response);
    }

    public void init(FilterConfig config) throws ServletException {

    }
}