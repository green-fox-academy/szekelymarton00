package com.greenfox.frontend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.Charset;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = FrontendApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class RestAppTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void testDoubling() throws Exception {
    mockMvc.perform(get("/doubling?input=4"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.result", is(8)));
  }
  @Test
  public void testDoublingError() throws Exception {
    mockMvc.perform(get("/doubling"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.error", is("Please provide an Input")));
  }
  @Test
  public void testGreeterNoInputError() throws Exception {
    mockMvc.perform(get("/greeter?name="))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.error", is("Please provide a Name")));
  }
  @Test
  public void testGreeterCorrectInput() throws Exception {
    mockMvc.perform(get("/greeter?name=petike&title=student"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.welcome_message", is("Oh, hi there petike , my dear student!")));
  }
  @Test
  public void testAppendCorrectInput() throws Exception {
    mockMvc.perform(get("/appenda/kuty"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.appendable", is("kutya")));
  }
  @Test
  public void testDoUntilCorrectInput() throws Exception {
    mockMvc.perform(post("/dountil/sum")
        .contentType(MediaType.APPLICATION_JSON)
        .content("{\n"
            + "  \"until\": 15\n"
            + "}"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.result", is(120)));
  }
  @Test
  public void arraysTest() throws Exception {
    mockMvc.perform(post("/arrays/")
        .contentType(MediaType.APPLICATION_JSON)
        .content("{\n"
            + "  \"what\": \"sum\",\n"
            + "  \"numbers\": [1, 2, 5, 10]\n"
            + "}"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.result", is(18)));
  }

}
