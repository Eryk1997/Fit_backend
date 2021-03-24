package main.java.fit.configuration.authentication;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class RestAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
                                        AuthenticationException exception) throws IOException {

        String json = "{ \"success\": \"false\"}";
        JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
        PrintWriter out = response.getWriter();
        out.print(jsonObject);
        out.flush();
    }
}
